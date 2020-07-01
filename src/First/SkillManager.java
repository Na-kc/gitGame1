package First;

import java.util.HashMap;

public class SkillManager {
	private long mCurrentGUID = 2000000000L;
	
	private HashMap mSkillMap = new HashMap();
	
	public SkillManager() {
		initSkills();
	}
	private void initSkills() {
		mSkillMap.put(SkillDef.SWING, "Swing");
		mSkillMap.put(SkillDef.PUNCH,"Punch");
		mSkillMap.put(SkillDef.KICK,"kick");
		
	}
	
	public long getGuid() {
		mCurrentGUID += 1;
		return mCurrentGUID;
	}

	public Skill createSkill(int SkillCode, int CoolDown) {
		Object itemNameObj = mSkillMap.get(SkillCode);
		if (itemNameObj == null)
			return null;
		
		return Skill.createSkill((String)itemNameObj, SkillCode, getGuid(), CoolDown);
	}
}
