package First;

//import java.util.Scanner;

public class Skill {
	private String mName;
	private int mSkillCode;
	private int mCoolDown;
	private long mGUID;
	
	//private Scanner input = new Scanner(System.in);
	
	public Skill(String name, int SkillCode, long guid, int CoolDown) {
		mName = name;
		mSkillCode = SkillCode;
		mGUID = guid;
		mCoolDown = CoolDown;
	}
	
	public static Skill createSkill(String name, int SkillCode, long guid, int CoolDown){
		return new Skill(name, SkillCode, guid, CoolDown);
	}
	
	/*public void SkillUse() {
		this.mSkillCode = input.nextInt();
		System.out.println(mSkillCode + "번째 스킬을 사용하셨습니다.");
		System.out.println("재사용 시간은 " + mCoolDown + "초 남았습니다.");
	}*/
}
