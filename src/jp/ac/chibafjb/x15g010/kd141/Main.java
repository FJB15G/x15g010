package jp.ac.chibafjb.x15g010.kd141;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sin =new Scanner(System.in);
		System.out.print("整数を入力してください。--->");
		int count = sin.nextInt();
		sin.close();
		
		System.out.println("あなたの入力した数は"+count+"です。");

	}

}
