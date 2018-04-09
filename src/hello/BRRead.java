/**
 * 
 */
package hello;

import java.io.*;
import java.util.Scanner;

/**
 * @author ChenCao
 * @date 2018年4月9日
 */
public class BRRead{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//控制台读取字符
		//brReadChar();
		
		//从控制台读取字符串
		//brReadLine();
		
		//控制台输出
		printA();
		
		//演示InputStream 和 OutPutStream
		//fileStreamSimple();
		
		//Scanner
		//Scanner scan = new Scanner(System.in);
	}

	/**
	 * 演示InputStream 和 OutPutStream
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
//			oWrite.append((char)bWrite[x]); //按字节写入 可能会乱码
//		}
		oWrite.write("不会乱码");
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
		//字节读取
//		int size = is.available();
//		for(int i = 0; i < size; i++) {
//			System.out.println(is.read() + "  ");
//		}
		is.close();
	}

	/**
	 * 控制台输出A
	 */
	private static void printA() {
		int b;
		b = 'A';
		System.out.write(b);
		System.out.write('\n');
	}

	/**
	 * 从控制台读取字符串
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
	 * 控制台读取字符
	 * @throws IOException
	 */
	private static void brReadChar() throws IOException {
		//使用BufferedReader 在控制台读取字符
		char c;
		//使用system.in 创建 BufferedReader 装饰者
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("输入字符,按下'q'键退出.");
		//读取字符
		do {
			c = (char) br.read();
			System.out.println(c);
		} while(c != 'q');
	}

}
