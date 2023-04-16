package com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mDisableFeatureFollowGuideFrequency$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xf6.l;

public final class FollowConfigUtil$mDisableFeatureFollowGuideFrequency$2 extends Lambda implements a	// class@0010a2
{
    public static final FollowConfigUtil$mDisableFeatureFollowGuideFrequency$2 INSTANCE;

    static {
       FollowConfigUtil$mDisableFeatureFollowGuideFrequency$2.INSTANCE = new FollowConfigUtil$mDisableFeatureFollowGuideFrequency$2();
    }
    public void FollowConfigUtil$mDisableFeatureFollowGuideFrequency$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, FollowConfigUtil$mDisableFeatureFollowGuideFrequency$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return l.c("IGNORE_FEATURE_FOLLOW_GUIDE_FREQUENCY", false);
    }
}
