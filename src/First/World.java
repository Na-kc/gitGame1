package First;

import java.util.HashMap;
import java.util.Scanner;

public class World {
	private CharacterManager CM = new CharacterManager();
	private Scanner input = new Scanner(System.in);
	public World(){
		System.out.print("�̸��� �Է����ּ��� : ");
		String mName = input.nextLine();
		CM.createCharacter(mName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new World();
		
	}

}
