package com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$Meta;
import java.lang.Enum;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MerchantHomePerfRepository$Meta extends Enum	// class@0016be
{
    public final Object defaultValue;
    public final String key;
    public static final MerchantHomePerfRepository$Meta[] $VALUES;
    public static final MerchantHomePerfRepository$Meta AX2C;
    public static final MerchantHomePerfRepository$Meta CACHE_TYPE;
    public static final MerchantHomePerfRepository$Meta FEED_VIEW_TYPE;
    public static final MerchantHomePerfRepository$Meta PREDICTION;
    public static final MerchantHomePerfRepository$Meta PREDICTION_PRIORITY;
    public static final MerchantHomePerfRepository$Meta PREDICTION_TO_PRELOAD;
    public static final MerchantHomePerfRepository$Meta PRELOAD_TYPE;
    public static final MerchantHomePerfRepository$Meta PRE_BUILT_CONNECTION;
    public static final MerchantHomePerfRepository$Meta SIDE_BAR_SHOW_REAL_TIME;
    public static final MerchantHomePerfRepository$Meta VIEW_PRELOAD;

    static {
       MerchantHomePerfRepository$Meta[] metaArray = new MerchantHomePerfRepository$Meta[10];
       Integer integer = Integer.valueOf(0);
       MerchantHomePerfRepository$Meta meta = new MerchantHomePerfRepository$Meta("AX2C", 0, "ax2c", integer);
       MerchantHomePerfRepository$Meta.AX2C = meta;
       metaArray[0] = meta;
       meta = new MerchantHomePerfRepository$Meta("VIEW_PRELOAD", 1, "viewPreload", integer);
       MerchantHomePerfRepository$Meta.VIEW_PRELOAD = meta;
       metaArray[1] = meta;
       meta = new MerchantHomePerfRepository$Meta("PRELOAD_TYPE", 2, "preloadType", integer);
       MerchantHomePerfRepository$Meta.PRELOAD_TYPE = meta;
       metaArray[2] = meta;
       meta = new MerchantHomePerfRepository$Meta("CACHE_TYPE", 3, "cacheType", integer);
       MerchantHomePerfRepository$Meta.CACHE_TYPE = meta;
       metaArray[3] = meta;
       meta = new MerchantHomePerfRepository$Meta("FEED_VIEW_TYPE", 4, "feedViewType", Integer.valueOf(1));
       MerchantHomePerfRepository$Meta.FEED_VIEW_TYPE = meta;
       metaArray[4] = meta;
       Boolean fALSE = Boolean.FALSE;
       meta = new MerchantHomePerfRepository$Meta("PRE_BUILT_CONNECTION", 5, "preConnection", fALSE);
       MerchantHomePerfRepository$Meta.PRE_BUILT_CONNECTION = meta;
       metaArray[5] = meta;
       meta = new MerchantHomePerfRepository$Meta("SIDE_BAR_SHOW_REAL_TIME", 6, "sideBarShowRealTime", integer);
       MerchantHomePerfRepository$Meta.SIDE_BAR_SHOW_REAL_TIME = meta;
       metaArray[6] = meta;
       meta = new MerchantHomePerfRepository$Meta("PREDICTION", 7, "prediction", fALSE);
       MerchantHomePerfRepository$Meta.PREDICTION = meta;
       metaArray[7] = meta;
       meta = new MerchantHomePerfRepository$Meta("PREDICTION_TO_PRELOAD", 8, "predictionToPreload", fALSE);
       MerchantHomePerfRepository$Meta.PREDICTION_TO_PRELOAD = meta;
       metaArray[8] = meta;
       meta = new MerchantHomePerfRepository$Meta("PREDICTION_PRIORITY", 9, "predictionPriority", integer);
       MerchantHomePerfRepository$Meta.PREDICTION_PRIORITY = meta;
       metaArray[9] = meta;
       MerchantHomePerfRepository$Meta.$VALUES = metaArray;
    }
    public void MerchantHomePerfRepository$Meta(String p0,int p1,String p2,Object p3){
       super(p0, p1);
       this.key = p2;
       this.defaultValue = p3;
    }
    public static MerchantHomePerfRepository$Meta valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MerchantHomePerfRepository$Meta.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MerchantHomePerfRepository$Meta.class, p0);
    }
    public static MerchantHomePerfRepository$Meta[] values(){
       Object obj = PatchProxy.apply(null, null, MerchantHomePerfRepository$Meta.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MerchantHomePerfRepository$Meta.$VALUES.clone();
    }
    public final Object getDefaultValue(){
       return this.defaultValue;
    }
    public final String getKey(){
       return this.key;
    }
}
