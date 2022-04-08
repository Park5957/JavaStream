package streamPK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Stream01 { 

	public static void main(String[] args) {

		String[] arr = new String[] { "a", "b", "c" }; //배열생성
		Stream<String> stream = Arrays.stream(arr); // 스트림 처리용 변수리스트 생성
		
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
					//arr 리스트중 index번호로 지정된 범위만 스트림 처리용변수 리스트로 지정(리스트명,이상,미만)
		stream.forEach(a -> System.out.print(a + ",")); //forEach로 지정스트림변수 출력
														//(변수 마다 출력(변수+",")로
		System.out.println();
		streamOfArrayPart.forEach(a -> System.out.print(a+","));
		
//		
//		ArrayList<String> k = new ArrayList<String>(); 
//		stream.forEach(a -> k.add(a));
//		System.out.println(k);
		
		System.out.println();

		List<Student> studentList = Arrays.asList( //자료형 제네릭으로 Student를 지정
	            new Student("aaa", 10),
	            new Student("bbb", 20),
	            new Student("xxx", 30)
	        );
			
	        Stream<Student> stream2 = studentList.stream(); // 어레이 관련 리스트일시 스트림 선업방법
	        stream2.forEach(s -> System.out.println("이름 : "+ s.getName()+"\n점수 : "+s.getScore()));
	        
	     ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	     Stream<Integer> Stream3 = arr2.stream();
	     Stream3.forEach(a -> System.out.println(a + "임"));
	     
	     
	}
}


class Student {
    private String name;
    private int score;
	
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() { return name; }
    public int getScore() { return score; }
}

