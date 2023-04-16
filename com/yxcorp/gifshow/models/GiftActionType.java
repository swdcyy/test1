package com.yxcorp.gifshow.models.GiftActionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GiftActionType extends Enum	// class@001fbc
{
    public static final GiftActionType[] $VALUES;
    public static final GiftActionType DEFAULT_ANIMATION;
    public static final GiftActionType NO_ACTION;

    static {
       GiftActionType giftActionTy = new GiftActionType("NO_ACTION", 0);
       GiftActionType.NO_ACTION = giftActionTy;
       GiftActionType giftActionTy1 = new GiftActionType("DEFAULT_ANIMATION", 1);
       GiftActionType.DEFAULT_ANIMATION = giftActionTy1;
       GiftActionType[] giftActionTy2 = new GiftActionType[]{giftActionTy,giftActionTy1};
       GiftActionType.$VALUES = giftActionTy2;
    }
    public void GiftActionType(String p0,int p1){
       super(p0, p1);
    }
    public static GiftActionType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GiftActionType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GiftActionType.class, p0);
    }
    public static GiftActionType[] values(){
       Object obj = PatchProxy.apply(null, null, GiftActionType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GiftActionType.$VALUES.clone();
    }
}
