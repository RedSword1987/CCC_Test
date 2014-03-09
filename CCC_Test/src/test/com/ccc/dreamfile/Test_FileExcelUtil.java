package test.com.ccc.dreamfile;

import java.util.ArrayList;
import java.util.List;

import com.ccc.dreamfile.excel.FileExcelBean;
import com.ccc.dreamfile.excel.FileExcelCell;
import com.ccc.dreamfile.excel.FileExcelRow;
import com.ccc.dreamfile.excel.FileExcelSheet;
import com.ccc.dreamfile.excel.FileExcelUtil;

/**
 * @author RedSword
 * @date 2014年3月8日 下午11:06:12
 */

public class Test_FileExcelUtil {
	public static void main(String[] args) {
		// 创建excel文件
		{
			// 创建单行的cell
			FileExcelCell fileexcelcell = new FileExcelCell("内容");
			List<FileExcelCell> listCell = new ArrayList<FileExcelCell>();
			listCell.add(fileexcelcell);
			// 一行添加多个cell
			FileExcelRow fileexcelrow = new FileExcelRow();
			fileexcelrow.setList(listCell);
			List<FileExcelRow> listRow = new ArrayList<FileExcelRow>();
			listRow.add(fileexcelrow);

			// sheet
			FileExcelSheet fileexcelsheet = new FileExcelSheet("sheet1", listRow);
			List<FileExcelSheet> listSheet = new ArrayList<FileExcelSheet>();
			listSheet.add(fileexcelsheet);
			// bean初始化
			FileExcelBean fileexcelbean = new FileExcelBean();
			fileexcelbean.setSheets(listSheet);
			FileExcelUtil.writeFile(fileexcelbean, "d:/1.xls");
		}

		System.out.println("转换Excel文件(后面的接口对象参数可以为null):");
		List<List<String[]>> list = FileExcelUtil.convertListListStringArray("d:/1.xls", null);
		for (List<String[]> sheet : list) {
			for (String[] row : sheet) {
				for (String cell : row) {
					System.out.println(cell);
				}
			}
		}

	}

}
