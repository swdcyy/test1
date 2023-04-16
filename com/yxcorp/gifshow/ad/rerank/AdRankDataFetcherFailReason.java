package com.yxcorp.gifshow.ad.rerank.AdRankDataFetcherFailReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AdRankDataFetcherFailReason extends Enum	// class@0017c3
{
    public static final AdRankDataFetcherFailReason[] $VALUES;
    public static final AdRankDataFetcherFailReason FAILED_BY_AD_AVOID;
    public static final AdRankDataFetcherFailReason FAILED_BY_AVOID_TYPE;
    public static final AdRankDataFetcherFailReason FAILED_BY_FIXED_POS_AD;
    public static final AdRankDataFetcherFailReason FAILED_BY_STOCK_NOT_ENOUGH;
    public static final AdRankDataFetcherFailReason FAILED_BY_TOP;

    static {
       AdRankDataFetcherFailReason uAdRankDataF1;
       AdRankDataFetcherFailReason[] uAdRankDataF = new AdRankDataFetcherFailReason[]{uAdRankDataF1,uAdRankDataF1,uAdRankDataF1,uAdRankDataF1,uAdRankDataF1};
       uAdRankDataF1 = new AdRankDataFetcherFailReason("FAILED_BY_TOP", 0);
       AdRankDataFetcherFailReason.FAILED_BY_TOP = uAdRankDataF1;
       uAdRankDataF1 = new AdRankDataFetcherFailReason("FAILED_BY_AD_AVOID", 1);
       AdRankDataFetcherFailReason.FAILED_BY_AD_AVOID = uAdRankDataF1;
       uAdRankDataF1 = new AdRankDataFetcherFailReason("FAILED_BY_STOCK_NOT_ENOUGH", 2);
       AdRankDataFetcherFailReason.FAILED_BY_STOCK_NOT_ENOUGH = uAdRankDataF1;
       uAdRankDataF1 = new AdRankDataFetcherFailReason("FAILED_BY_FIXED_POS_AD", 3);
       AdRankDataFetcherFailReason.FAILED_BY_FIXED_POS_AD = uAdRankDataF1;
       uAdRankDataF1 = new AdRankDataFetcherFailReason("FAILED_BY_AVOID_TYPE", 4);
       AdRankDataFetcherFailReason.FAILED_BY_AVOID_TYPE = uAdRankDataF1;
       AdRankDataFetcherFailReason.$VALUES = uAdRankDataF;
    }
    public void AdRankDataFetcherFailReason(String p0,int p1){
       super(p0, p1);
    }
    public static AdRankDataFetcherFailReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AdRankDataFetcherFailReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AdRankDataFetcherFailReason.class, p0);
    }
    public static AdRankDataFetcherFailReason[] values(){
       Object obj = PatchProxy.apply(null, null, AdRankDataFetcherFailReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AdRankDataFetcherFailReason.$VALUES.clone();
    }
}
