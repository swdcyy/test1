package com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mFollowFeatureSnackBarGuideConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.follow.config.model.FollowFeatureSnackBarGuideConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class FollowConfigUtil$mFollowFeatureSnackBarGuideConfig$2 extends Lambda implements a	// class@0010ae
{
    public static final FollowConfigUtil$mFollowFeatureSnackBarGuideConfig$2 INSTANCE;

    static {
       FollowConfigUtil$mFollowFeatureSnackBarGuideConfig$2.INSTANCE = new FollowConfigUtil$mFollowFeatureSnackBarGuideConfig$2();
    }
    public void FollowConfigUtil$mFollowFeatureSnackBarGuideConfig$2(){
       super(0);
    }
    public final FollowFeatureSnackBarGuideConfig invoke(){
       Object obj = PatchProxy.apply(null, this, FollowConfigUtil$mFollowFeatureSnackBarGuideConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("followSnackBarGuideConfig", FollowFeatureSnackBarGuideConfig.class, null);
    }
    public Object invoke(){
       return this.invoke();
    }
}
