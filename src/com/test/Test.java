package com.test;

import java.util.Scanner;

/**
 * 定义一个一维数组存储10个学生的成绩，再定义一个二维数组存储这10个学生的6门课的成绩
 * 功能：按名字查询某位同学成绩；查询某个科目不及格的人数及学生名单
 * @author zhifengfei
 *
 */
public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] name = {"王刚", "刘洪", "张山", "董一凡", "李可", "洪涛", 
				"刘江涛", "段康宁", "沈大力", "和平"};	//在声明数组的同时初始化数组
		double[][] grade = {
				{50, 60, 70, 80, 90, 10},
				{40, 90, 80, 60, 40, 70},
				{60, 80, 70, 60, 40, 90},
				{50, 60, 70, 80, 90, 10},
				{60, 80, 70, 60, 40, 90},
				{60, 70, 80, 90, 70, 70},
				{60, 80, 70, 60, 40, 90},
				{60, 80, 70, 60, 40, 90},
				{60, 80, 70, 60, 40, 90},
				{60, 45.5, 70, 60, 40, 10}
		};
		System.out.println("输入要查询成绩的学生名字：");
		String choice = input.nextLine();
		for(int i = 0; i < 10; i++) {
			if(name[i].equals(choice)) {
				System.out.println("学生" + name[i] + "的成绩如下：");
				System.out.println("C程序设计：" + grade[i][0] + "\t物理：" + grade[i][1] +
						"\t英语：" + grade[i][2] + "\t高的数学：" + grade[i][3] +
						"\t体育：" +grade[i][4] + "\t政治：" + grade[i][5] + "\n");
				break;
			}
		}
		System.out.println("====================================");
		System.out.println("输入查询不及格人数的科目序号\n");
		System.out.println("1、C程序设计 2、物理 3、英语 4、高等数学 5、体育 6、政治");
		int ch = input.nextInt();
		int time = 0;
		System.out.println("不及格的名单为：");
		for(int i=0; i<10; i++) {
			if(grade[i][ch-1]<60) {
				time++;
				System.out.println(name[i]);
			}
		}
		System.out.println("该科目不及格人数为：" + time);
		input.close();
	}

}
