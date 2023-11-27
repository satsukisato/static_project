package practice;

public class PracticeSwitch {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 4, 5, 3, 2, 1, 2, 5, 1 };

		for (int num : numbers) {
			String job = "";
			
			switch (num) {
			case 1:
				job = "勇者";
				break;
			case 2:
				job = "バトルマスター";
				break;
			case 3:
				job = "パラディン";
				break;
			case 4:
				job = "海賊";
				break;
			case 5:
				job = "魔法剣士";
				break;
			default:
				job = "なし";
				break;
			}
			System.out.println(num + ":" + job);
		}
	}

}
