package com.yxcorp.gifshow.homepage.serchcard.ItemState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ItemState extends Enum	// class@0017f6
{
    public static final ItemState[] $VALUES;
    public static final ItemState left;
    public static final ItemState right;
    public static final ItemState row;
    public static final ItemState unKnow;

    static {
       ItemState itemState = new ItemState("unKnow", 0);
       ItemState.unKnow = itemState;
       ItemState itemState1 = new ItemState("left", 1);
       ItemState.left = itemState1;
       ItemState itemState2 = new ItemState("right", 2);
       ItemState.right = itemState2;
       ItemState itemState3 = new ItemState("row", 3);
       ItemState.row = itemState3;
       ItemState[] itemStateArr = new ItemState[]{itemState,itemState1,itemState2,itemState3};
       ItemState.$VALUES = itemStateArr;
    }
    public void ItemState(String p0,int p1){
       super(p0, p1);
    }
    public static ItemState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ItemState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ItemState.class, p0);
    }
    public static ItemState[] values(){
       Object obj = PatchProxy.apply(null, null, ItemState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ItemState.$VALUES.clone();
    }
}
