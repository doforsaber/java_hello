/**
 * 
 */
package hello;

import java.io.*;
import java.util.Scanner;

/**
 * @author ChenCao
 * @date 2018��4��9��
 */
public class BRRead{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//����̨��ȡ�ַ�
		//brReadChar();
		
		//�ӿ���̨��ȡ�ַ���
		//brReadLine();
		
		//����̨���
		printA();
		
		//��ʾInputStream �� OutPutStream
		//fileStreamSimple();
		
		//Scanner
		//Scanner scan = new Scanner(System.in);
	}

	/**
	 * ��ʾInputStream �� OutPutStream
	 * @throws FileNotFoundException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	private static void fileStreamSimple() throws FileNotFoundException,
			UnsupportedEncodingException, IOException {
		//byte[] bWrite = {11, 21, 3, 40, 5}; 
		OutputStream os = new FileOutputStream("F:\\workspaces\\hello\\test.txt");
		OutputStreamWriter oWrite = new OutputStreamWriter(os, "utf-8");
//		for(int x = 0; x < bWrite.length; x++) {
//			oWrite.append((char)bWrite[x]); //���ֽ�д�� ���ܻ�����
//		}
		oWrite.write("��������");
		oWrite.write("English");
		oWrite.close();
		os.close();
		
		InputStream is = new FileInputStream("F:\\workspaces\\hello\\test.txt");
		InputStreamReader reader = new InputStreamReader(is, "utf-8");
		StringBuffer sb = new StringBuffer();
		while(reader.ready()) {
			sb.append((char)reader.read());
		}
		System.out.println(sb.toString());
		reader.close();
		//�ֽڶ�ȡ
//		int size = is.available();
//		for(int i = 0; i < size; i++) {
//			System.out.println(is.read() + "  ");
//		}
		is.close();
	}

	/**
	 * ����̨���A
	 */
	private static void printA() {
		int b;
		b = 'A';
		System.out.write(b);
		System.out.write('\n');
	}

	/**
	 * �ӿ���̨��ȡ�ַ���
	 * @throws IOException
	 */
	private static void brReadLine() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Enter lines of text.");
		System.out.println("Enter 'end' to quit.");
		do {
			str = br.readLine();
			System.out.println(str);
		} while(!str.equals("end"));
	}

	/**
	 * ����̨��ȡ�ַ�
	 * @throws IOException
	 */
	private static void brReadChar() throws IOException {
		//ʹ��BufferedReader �ڿ���̨��ȡ�ַ�
		char c;
		//ʹ��system.in ���� BufferedReader װ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�����ַ�,����'q'���˳�.");
		//��ȡ�ַ�
		do {
			c = (char) br.read();
			System.out.println(c);
		} while(c != 'q');
	}

}
