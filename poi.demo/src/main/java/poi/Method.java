package poi;

public class Method {
	
	public static void main(String[] args) {
		String inPath = "D:/project/�ĵ���/project-docs/3_��Ŀ��������/50_�����ܱ�/2019/201903/20190308";// �ļ���ַ
		String ouPath = "C:/Users/lizhe/Desktop/�ű�ִ��.xls";// ݔ����ַ
		Controller c =new Controller();
		try {
			c.method_A(inPath, ouPath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
