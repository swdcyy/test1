package com.yxcorp.gifshow.follow.stagger.experiment.HomeFollowExperimentUtils$mFollowCoverAspectRatio$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.feature.api.social.followStagger.model.FollowCoverAspectRatio;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import iia.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;

public final class HomeFollowExperimentUtils$mFollowCoverAspectRatio$2 extends Lambda implements a	// class@001181
{
    public static final HomeFollowExperimentUtils$mFollowCoverAspectRatio$2 INSTANCE;

    static {
       HomeFollowExperimentUtils$mFollowCoverAspectRatio$2.INSTANCE = new HomeFollowExperimentUtils$mFollowCoverAspectRatio$2();
    }
    public void HomeFollowExperimentUtils$mFollowCoverAspectRatio$2(){
       super(0);
    }
    public final FollowCoverAspectRatio invoke(){
       Object[] objArray = null;
       FollowCoverAspectRatio obj = PatchProxy.apply(objArray, this, HomeFollowExperimentUtils$mFollowCoverAspectRatio$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = FollowCoverAspectRatio.class;
       String str = a.a.getString("followPageCoverOptimize", "");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       if (objArray == null) {
          objArray = new FollowCoverAspectRatio();
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
