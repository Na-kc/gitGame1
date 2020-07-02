package First;

import java.util.HashMap;

public class ItemManager {
	private long mCurrentGUID = 1000000000L;
	
	private HashMap mItemMap = new HashMap();
	
	public ItemManager() {
		initItems();
	}
	private void initItems() {
		mItemMap.put(ItemDef.AXE, "Axe");
		mItemMap.put(ItemDef.PANTS,"Pants");
		mItemMap.put(ItemDef.SHIRT,"Shirt");
		mItemMap.put(ItemDef.HEALING_POTION,"Healing_Potion");
		
	}
	
	public long getGuid() {
		mCurrentGUID += 1;
		return mCurrentGUID;
	}

	public Item createItem(int itemCode, int itemCount) {
		Object itemNameObj = mItemMap.get(itemCode);
		if (itemNameObj == null)
			return null;
		
		return Item.createItem((String)itemNameObj, itemCode, getGuid(), itemCount);
	}

}
