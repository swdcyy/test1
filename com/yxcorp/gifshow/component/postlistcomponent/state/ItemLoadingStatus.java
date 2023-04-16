package com.yxcorp.gifshow.component.postlistcomponent.state.ItemLoadingStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ItemLoadingStatus extends Enum	// class@0011c5
{
    public static final ItemLoadingStatus[] $VALUES;
    public static final ItemLoadingStatus IDLE;
    public static final ItemLoadingStatus ITEM_LOADING;
    public static final ItemLoadingStatus ITEM_LOADING_FAILED;
    public static final ItemLoadingStatus ITEM_LOADING_FINISH;

    static {
       ItemLoadingStatus itemLoadingS1;
       ItemLoadingStatus[] itemLoadingS = new ItemLoadingStatus[]{itemLoadingS1,itemLoadingS1,itemLoadingS1,itemLoadingS1};
       itemLoadingS1 = new ItemLoadingStatus("IDLE", 0);
       ItemLoadingStatus.IDLE = itemLoadingS1;
       itemLoadingS1 = new ItemLoadingStatus("ITEM_LOADING", 1);
       ItemLoadingStatus.ITEM_LOADING = itemLoadingS1;
       itemLoadingS1 = new ItemLoadingStatus("ITEM_LOADING_FAILED", 2);
       ItemLoadingStatus.ITEM_LOADING_FAILED = itemLoadingS1;
       itemLoadingS1 = new ItemLoadingStatus("ITEM_LOADING_FINISH", 3);
       ItemLoadingStatus.ITEM_LOADING_FINISH = itemLoadingS1;
       ItemLoadingStatus.$VALUES = itemLoadingS;
    }
    public void ItemLoadingStatus(String p0,int p1){
       super(p0, p1);
    }
    public static ItemLoadingStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ItemLoadingStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ItemLoadingStatus.class, p0);
    }
    public static ItemLoadingStatus[] values(){
       Object obj = PatchProxy.apply(null, null, ItemLoadingStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ItemLoadingStatus.$VALUES.clone();
    }
}
