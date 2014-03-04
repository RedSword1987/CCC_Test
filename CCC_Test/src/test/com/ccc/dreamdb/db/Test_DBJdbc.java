package test.com.ccc.dreamdb.db;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.ccc.dreamdb.db.DBFactory;
import com.ccc.dreamdb.db.DBJdbc;

/**
 * @author RedSword
 * @date 2014年3月4日 下午2:27:48
 */
public class Test_DBJdbc {
	public static final String insert_sql = "insert into temptable(field1,field2) values(?,?)";

	public static String getMap(Map<String, Object> map) {
		StringBuilder sBuilder = new StringBuilder();
		if (map != null) {
			for (Entry<String, Object> en : map.entrySet()) {
				sBuilder.append(en.getKey()).append(":").append(String.valueOf(en.getValue())).append("  ");
			}
		}
		return sBuilder.toString();
	}

	public static void main(String[] args) throws Exception {
		DBJdbc jdbc = DBFactory.getDBJdbc();

		if (false) {
			// 此语句就执行一次，如果表已经创建，就不需要再执行了。
			boolean issuccess = jdbc.executeBoolean("create table temptable(field1 varchar(1023),field2 varchar(1023))");
			System.out.println("创建表:" + issuccess);
		}

		// 操作类接口
		{
			// 执行sql，此方法和
			// executeBoolean一样，只是返回的不一样，如果你需要返回的修改数目，就用下面的。只需要成不成功，就用上面的
			int resultCount = jdbc.execute(insert_sql, "field1_Valie0", "field2_Valie0");
			System.out.println("执行操作结果数:" + resultCount);

			// 批量执行sql
			String[] sql_bat = { "insert into temptable(field1,field2) values('field1_Valie1','field2_Valie1')", "insert into temptable(field1,field2) values('field1_Valie2','field2_Valie2')" };
			boolean issuccess1 = jdbc.executeBatchSqls(sql_bat, false);
			System.out.println("批量执行sql:" + issuccess1);

			// 批量执行定参
			Object[][] obj_batch = { { "field1_Valie3", "field2_Valie3" }, { "field1_Valie4", "field2_Valie4" } };
			boolean issuccess2 = jdbc.executeBatchParas(insert_sql, obj_batch, false);
			System.out.println("批量执行定参:" + issuccess2);
		}

		// 查询类接口
		{
			// 查询单个bean，如果结果返回多个，只取第一个
			TempTable tempTable = jdbc.queryBean("select * from temptable where field1=?", TempTable.class, "field1_Valie0");
			System.out.println("单个Bean结果：" + tempTable.getField1() + "-" + tempTable.getField2());

			// 查询多个bean
			List<TempTable> tempTables = jdbc.queryListBean("select * from temptable where field1 like ?", TempTable.class, "%field1_Valie%");
			System.out.println("多个Bean结果：");
			for (TempTable tempTable2 : tempTables) {
				System.out.println(tempTable2.getField1() + "-" + tempTable2.getField2());
			}
			System.out.println();

			// 查询单个map，如果结果返回多个，只取第一个
			Map<String, Object> tempTableMap = jdbc.queryMap("select * from temptable where field1=?", "field1_Valie0");
			System.out.println("单个map结果：" + getMap(tempTableMap));

			// 查询多个map
			List<Map<String, Object>> tempTableMaps = jdbc.queryListMap("select * from temptable where field1 like ?", "%field1_Valie%");
			System.out.println("多个map结果：");
			for (Map<String, Object> map : tempTableMaps) {
				System.out.println(getMap(map));
			}
			System.out.println();

			// key map返回结果,场景应用： 有唯一标识的一列 对应的一行,一般以主键为key，此行为value
			Map<Object, Map<String, Object>> map = jdbc.queryKeyMap("select * from temptable where field1 like ?", "FIELD1", "%field1_Valie%");
			System.out.println("KEY/MAP结果：");
			for (Entry<Object, Map<String, Object>> en : map.entrySet()) {
				System.out.println(en.getKey() + ":         " + getMap(en.getValue()));
			}
			System.out.println();

		}

	}
}
