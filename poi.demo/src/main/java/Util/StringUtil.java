package Util;

import org.apache.poi.ss.usermodel.Cell;

public class StringUtil {

	public static String getCellValue(Cell cell) {
		if (cell == null) {
			return "";
		}
		// �����boolean
		if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
			return String.valueOf(cell.getBooleanCellValue());
		}
		// �������������
		if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
			return String.valueOf(cell.getNumericCellValue());
		}
		// �����String����
		return String.valueOf(cell.getStringCellValue());
	}

}
