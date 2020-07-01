package First;

//import java.util.Scanner;

public class Item {
	private String mName;
	private int mItemCode;
	private int mItemCount;
	private long mGUID;
	
	//private Scanner input = new Scanner(System.in);
	
	public Item(String name, int itemCode, long guid, int itemCount) {
		mName = name;
		mItemCode = itemCode;
		mGUID = guid;
		mItemCount = itemCount;
	}
	
	public static Item createItem(String name, int itemCode, long guid, int itemCount) {
		return new Item(name, itemCode, guid, itemCount);
	}
	
	/*public void ItemUse() {
		this.mItemCode = input.nextInt();
		System.out.println(mItemCode + "번째 아이템을 사용하셨습니다.");
	}*/
}
