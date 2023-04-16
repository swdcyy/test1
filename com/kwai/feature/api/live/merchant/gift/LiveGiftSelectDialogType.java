package com.kwai.feature.api.live.merchant.gift.LiveGiftSelectDialogType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveGiftSelectDialogType extends Enum	// class@000fdb
{
    public static final LiveGiftSelectDialogType[] $VALUES;
    public static final LiveGiftSelectDialogType MERCHANT_SANDEAPY;
    public static final LiveGiftSelectDialogType WISH_LIST;

    static {
       LiveGiftSelectDialogType liveGiftSele = new LiveGiftSelectDialogType("WISH_LIST", 0);
       LiveGiftSelectDialogType.WISH_LIST = liveGiftSele;
       LiveGiftSelectDialogType liveGiftSele1 = new LiveGiftSelectDialogType("MERCHANT_SANDEAPY", 1);
       LiveGiftSelectDialogType.MERCHANT_SANDEAPY = liveGiftSele1;
       LiveGiftSelectDialogType[] liveGiftSele2 = new LiveGiftSelectDialogType[]{liveGiftSele,liveGiftSele1};
       LiveGiftSelectDialogType.$VALUES = liveGiftSele2;
    }
    public void LiveGiftSelectDialogType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveGiftSelectDialogType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGiftSelectDialogType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGiftSelectDialogType.class, p0);
    }
    public static LiveGiftSelectDialogType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGiftSelectDialogType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGiftSelectDialogType.$VALUES.clone();
    }
}
