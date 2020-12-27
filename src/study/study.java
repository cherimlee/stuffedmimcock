package study;

public class study {

	public static void main(String[] args) {
		int i = 3;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		System.out.println(i++);
		System.out.println(++i);
		System.out.println(i);
        //(i++)일 경우 괄호 안에서 연산이 진행되지 않고 끝나고 다음 연산에 적용
		//(++i)일 경우 괄호 안에서 바로 진행
	}

}
