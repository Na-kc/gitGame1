package First;

import java.util.ArrayList;
import java.util.List;

public class Character {
	private String mName;
	private int mLevel;
	private List<Item> mItems;
	private List<Skill> mSkills;
	
	private ItemManager mItemManager;
	private SkillManager mSkillManager;
	
	private long mGUID;
	
	public Character(String name, long guid) {
		mName = name;
		mLevel = 1;
		mItems = new ArrayList<Item>();
		mSkills = new ArrayList<Skill>();
		mGUID = guid;
		
		mItemManager = new ItemManager();
		mSkillManager = new SkillManager();
		
		initItems();
		initSkills();
	}
	
	private void initItems() {
		getItem(ItemDef.AXE,1);
		getItem(ItemDef.PANTS,1);
		getItem(ItemDef.HEALING_POTION,3);
	}
	private void initSkills() {
		getSkill(SkillDef.SWING,3);
		getSkill(SkillDef.PUNCH,2);
		getSkill(SkillDef.KICK,5);
	}
	
	public boolean getItem(int itemCode, int itemCount) {
		mItems.add(mItemManager.createItem(itemCode, itemCount));
		return true;
	}
	
	public boolean removeItem(long guid) {
		return true;
	}
	public boolean getSkill(int SkillCode, int Cowndown) {
		mSkills.add(mSkillManager.createSkill(SkillCode, Cowndown));
		return true;
	}
	
	public boolean removeSkill(long guid) {
		return true;
	}
}
