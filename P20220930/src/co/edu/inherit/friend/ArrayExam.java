package co.edu.inherit.friend;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExam {
	public static void main(String[] args) {
		String[] flowers = new String[3];

		flowers[0] = "장미";
		flowers[1] = "해바라기";
		flowers[2] = "무궁화";
//		flowers[3] = "목련";

		// flowers2 선언.
		String[] flowers2 = new String[6];

		for (String str : flowers2) {
			if (str != null) {
				System.out.println(str);
			}
		}
		// 배열의 크기 고정 => 컬렉션(ArrayList);
		// Object 모든 클래스의 최상위 클래스.
		ArrayList flowers3 = new ArrayList(); // 크기가 10개짜리 배열
		flowers3.add("장미");
		flowers3.add("해바라기");
		flowers3.add("무궁화꽃");
//		flowers3.add(123);
		
//		for (Object str : flowers3) {
//			String result = (String) str;
//			System.out.println(result);
//		}
		// 컬렉션의 크기 : size()
		for (int i = 0; i < flowers3.size(); i++) {
			String result = (String) flowers3.get(i);
			System.out.println(result);

		}

	}
}
