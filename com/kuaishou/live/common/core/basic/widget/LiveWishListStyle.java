package com.kuaishou.live.common.core.basic.widget.LiveWishListStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveWishListStyle extends Enum	// class@000f2e
{
    public static final LiveWishListStyle[] $VALUES;
    public static final LiveWishListStyle GIFT;
    public static final LiveWishListStyle RANK;

    static {
       LiveWishListStyle liveWishList = new LiveWishListStyle("GIFT", 0);
       LiveWishListStyle.GIFT = liveWishList;
       LiveWishListStyle liveWishList1 = new LiveWishListStyle("RANK", 1);
       LiveWishListStyle.RANK = liveWishList1;
       LiveWishListStyle[] liveWishList2 = new LiveWishListStyle[]{liveWishList,liveWishList1};
       LiveWishListStyle.$VALUES = liveWishList2;
    }
    public void LiveWishListStyle(String p0,int p1){
       super(p0, p1);
    }
    public static LiveWishListStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveWishListStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveWishListStyle.class, p0);
    }
    public static LiveWishListStyle[] values(){
       Object obj = PatchProxy.apply(null, null, LiveWishListStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveWishListStyle.$VALUES.clone();
    }
}
