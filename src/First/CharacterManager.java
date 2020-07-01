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
		mNameMap.put(Server.CHEOLSU, "Cheol-su");
		mNameMap.put(Server.YEONGHUI, "Yeong-hui");
		mNameMap.put(Server.MINSU, "Min-su");
		
	}

	
	public long getGuid() {
		mCurrentGUID += 1;
		return mCurrentGUID;
	}

	public Character createCharacter(String name) {
		Object characterNameObj = mNameMap.get(name);
		if (characterNameObj.equals(name)) {
			System.out.println("�̸� �ߺ�");
			return null;
		}
		else {
			System.out.println(characterNameObj + " ĳ���� ����");
			return Character.createCharacter((String)characterNameObj, getGuid());
		}
	}
}
