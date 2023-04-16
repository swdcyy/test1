package com.kuaishou.android.model.feed.MerchantCardType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MerchantCardType extends Enum	// class@000b1c
{
    public static final MerchantCardType[] $VALUES;
    public static final MerchantCardType TYPE_MERCHANT_DYNAMIC;
    public static final MerchantCardType TYPE_MERCHANT_RECOMMEND_V1;
    public static final MerchantCardType TYPE_MERCHANT_RECOMMEND_V2;

    static {
       MerchantCardType merchantCard1;
       MerchantCardType[] merchantCard = new MerchantCardType[]{merchantCard1,merchantCard1,merchantCard1};
       merchantCard1 = new MerchantCardType("TYPE_MERCHANT_RECOMMEND_V1", 0);
       MerchantCardType.TYPE_MERCHANT_RECOMMEND_V1 = merchantCard1;
       merchantCard1 = new MerchantCardType("TYPE_MERCHANT_RECOMMEND_V2", 1);
       MerchantCardType.TYPE_MERCHANT_RECOMMEND_V2 = merchantCard1;
       merchantCard1 = new MerchantCardType("TYPE_MERCHANT_DYNAMIC", 2);
       MerchantCardType.TYPE_MERCHANT_DYNAMIC = merchantCard1;
       MerchantCardType.$VALUES = merchantCard;
    }
    public void MerchantCardType(String p0,int p1){
       super(p0, p1);
    }
    public static MerchantCardType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MerchantCardType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MerchantCardType.class, p0);
    }
    public static MerchantCardType[] values(){
       Object obj = PatchProxy.apply(null, null, MerchantCardType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MerchantCardType.$VALUES.clone();
    }
}
