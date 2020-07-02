package First;


import java.util.HashMap;

public class CharacterManager {
	private long mCurrentGUID = 3000000000L;
	
	private HashMap mNameMap = new HashMap();
	private HashMap mCharacherMap = new HashMap();
	
	public CharacterManager() {
		initNames();
	}
	private void initNames() {
		mNameMap.put(Server.HONGGILDONG, "Hong Gil-dong");
		mNameMap.put(Server.HERO, "Hero");
		mNameMap.put(Server.WARRIOR, "Warrior");
		mNameMap.put(Server.ARCHER, "Archer");
	}

	
	public long getGuid() {
		mCurrentGUID += 1;
		return mCurrentGUID;
	}
	
	public Character createCharacter(String name) {
		Object characterNameObj = mNameMap.get(name);
		if(mNameMap.containsValue(name)) {
			System.out.println("중복 이름");
			return null;
		}
		else {
			System.out.println(name + " 캐릭터 생성");
			return new Character((String)characterNameObj, getGuid());
		}
	}

}
