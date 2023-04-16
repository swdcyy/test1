package com.yxcorp.gifshow.featured.detail.featured.pushinject.FeaturePushInjectTask$FailType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FeaturePushInjectTask$FailType extends Enum	// class@000f8c
{
    public String mType;
    public static final FeaturePushInjectTask$FailType[] $VALUES;
    public static final FeaturePushInjectTask$FailType FEED_REQUEST_FAIL;
    public static final FeaturePushInjectTask$FailType FORCE_IN_FAIL;
    public static final FeaturePushInjectTask$FailType PLAY_FAIL;

    static {
       FeaturePushInjectTask$FailType uFailType = new FeaturePushInjectTask$FailType("FEED_REQUEST_FAIL", 0, "FEED_REQUEST_FAIL");
       FeaturePushInjectTask$FailType.FEED_REQUEST_FAIL = uFailType;
       FeaturePushInjectTask$FailType uFailType1 = new FeaturePushInjectTask$FailType("FORCE_IN_FAIL", 1, "FORCE_IN_FAIL");
       FeaturePushInjectTask$FailType.FORCE_IN_FAIL = uFailType1;
       FeaturePushInjectTask$FailType uFailType2 = new FeaturePushInjectTask$FailType("PLAY_FAIL", 2, "PLAY_FAIL");
       FeaturePushInjectTask$FailType.PLAY_FAIL = uFailType2;
       FeaturePushInjectTask$FailType[] uFailTypeArr = new FeaturePushInjectTask$FailType[]{uFailType,uFailType1,uFailType2};
       FeaturePushInjectTask$FailType.$VALUES = uFailTypeArr;
    }
    public void FeaturePushInjectTask$FailType(String p0,int p1,String p2){
       super(p0, p1);
       this.mType = p2;
    }
    public static FeaturePushInjectTask$FailType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FeaturePushInjectTask$FailType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FeaturePushInjectTask$FailType.class, p0);
    }
    public static FeaturePushInjectTask$FailType[] values(){
       Object obj = PatchProxy.apply(null, null, FeaturePushInjectTask$FailType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FeaturePushInjectTask$FailType.$VALUES.clone();
    }
}
