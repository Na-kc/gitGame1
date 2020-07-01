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
		
		initItems();
	}
	
	private void initItems() {
		mItemManager.createItem(ItemDef.AXE,1);
		mItemManager.createItem(ItemDef.PANTS,1);
		mItemManager.createItem(ItemDef.HEALING_POTION,3);
	}
	public boolean getItems(int itemCode, int itemCount) {
		mItems.add(mItemManager.createItem(itemCode, itemCount));
		return true;
	}
	
	public boolean removeItem(long guid) {
		return true;
	}
}
