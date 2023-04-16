package com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteBottomBarService$BottomBarType extends Enum	// class@001eb0
{
    public final int id;
    public final String logName;
    public static final LiveLiteBottomBarService$BottomBarType[] $VALUES;
    public static final LiveLiteBottomBarService$BottomBarType AVATAR;
    public static final LiveLiteBottomBarService$BottomBarType COMMENT;
    public static final LiveLiteBottomBarService$BottomBarType GIFT;
    public static final LiveLiteBottomBarService$BottomBarType GUIDE_GIFT;
    public static final LiveLiteBottomBarService$BottomBarType HOUSE;
    public static final LiveLiteBottomBarService$BottomBarType MERCHANT_YELLOW_CART;
    public static final LiveLiteBottomBarService$BottomBarType POPULARITY;
    public static final LiveLiteBottomBarService$BottomBarType RECRUIT;
    public static final LiveLiteBottomBarService$BottomBarType SHRINK;
    public static final LiveLiteBottomBarService$BottomBarType SOCIAL;
    public static final LiveLiteBottomBarService$BottomBarType VICE_GUIDE_GIFT;

    static {
       LiveLiteBottomBarService$BottomBarType[] uBottomBarTy = new LiveLiteBottomBarService$BottomBarType[11];
       LiveLiteBottomBarService$BottomBarType uBottomBarTy1 = new LiveLiteBottomBarService$BottomBarType("COMMENT", 0, 1, "COMMENT_BOX");
       LiveLiteBottomBarService$BottomBarType.COMMENT = uBottomBarTy1;
       uBottomBarTy[0] = uBottomBarTy1;
       uBottomBarTy1 = new LiveLiteBottomBarService$BottomBarType("RECRUIT", 1, 3, "RECRUIT");
       LiveLiteBottomBarService$BottomBarType.RECRUIT = uBottomBarTy1;
       uBottomBarTy[1] = uBottomBarTy1;
       uBottomBarTy1 = new LiveLiteBottomBarService$BottomBarType("HOUSE", 2, 11, "HOUSE");
       LiveLiteBottomBarService$BottomBarType.HOUSE = uBottomBarTy1;
       uBottomBarTy[2] = uBottomBarTy1;
       LiveLiteBottomBarService$BottomBarType uBottomBarTy2 = new LiveLiteBottomBarService$BottomBarType("MERCHANT_YELLOW_CART", 3, 2, "SHOPPING_CAR");
       LiveLiteBottomBarService$BottomBarType.MERCHANT_YELLOW_CART = uBottomBarTy2;
       uBottomBarTy[3] = uBottomBarTy2;
       uBottomBarTy2 = new LiveLiteBottomBarService$BottomBarType("GUIDE_GIFT", 4, 5, "QUICK_GIFT");
       LiveLiteBottomBarService$BottomBarType.GUIDE_GIFT = uBottomBarTy2;
       uBottomBarTy[4] = uBottomBarTy2;
       uBottomBarTy2 = new LiveLiteBottomBarService$BottomBarType("GIFT", 5, 4, "GIFT");
       LiveLiteBottomBarService$BottomBarType.GIFT = uBottomBarTy2;
       uBottomBarTy[5] = uBottomBarTy2;
       uBottomBarTy2 = new LiveLiteBottomBarService$BottomBarType("AVATAR", 6, 6, "AVATAR");
       LiveLiteBottomBarService$BottomBarType.AVATAR = uBottomBarTy2;
       uBottomBarTy[6] = uBottomBarTy2;
       uBottomBarTy2 = new LiveLiteBottomBarService$BottomBarType("SHRINK", 7, 7, "SIDE_SHOW");
       LiveLiteBottomBarService$BottomBarType.SHRINK = uBottomBarTy2;
       uBottomBarTy[7] = uBottomBarTy2;
       uBottomBarTy2 = new LiveLiteBottomBarService$BottomBarType("SOCIAL", 8, 8, "SOCIAL");
       LiveLiteBottomBarService$BottomBarType.SOCIAL = uBottomBarTy2;
       uBottomBarTy[8] = uBottomBarTy2;
       uBottomBarTy2 = new LiveLiteBottomBarService$BottomBarType("POPULARITY", 9, 10, "FANS_GIFT");
       LiveLiteBottomBarService$BottomBarType.POPULARITY = uBottomBarTy2;
       uBottomBarTy[9] = uBottomBarTy2;
       uBottomBarTy2 = new LiveLiteBottomBarService$BottomBarType("VICE_GUIDE_GIFT", 10, 9, "QUICK_GIFT_S");
       LiveLiteBottomBarService$BottomBarType.VICE_GUIDE_GIFT = uBottomBarTy2;
       uBottomBarTy[10] = uBottomBarTy2;
       LiveLiteBottomBarService$BottomBarType.$VALUES = uBottomBarTy;
    }
    public void LiveLiteBottomBarService$BottomBarType(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.id = p2;
       this.logName = p3;
    }
    public static LiveLiteBottomBarService$BottomBarType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteBottomBarService$BottomBarType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLiteBottomBarService$BottomBarType.class, p0);
    }
    public static LiveLiteBottomBarService$BottomBarType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLiteBottomBarService$BottomBarType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteBottomBarService$BottomBarType.$VALUES.clone();
    }
    public final int getId(){
       return this.id;
    }
    public final String getLogName(){
       return this.logName;
    }
}
