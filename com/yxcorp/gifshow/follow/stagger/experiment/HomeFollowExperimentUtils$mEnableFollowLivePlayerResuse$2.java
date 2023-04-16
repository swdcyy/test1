package com.yxcorp.gifshow.follow.stagger.experiment.HomeFollowExperimentUtils$mEnableFollowLivePlayerResuse$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.SystemUtil;
import android.os.Build$VERSION;
import xf6.l;
import com.kwai.sdk.switchconfig.a;

public final class HomeFollowExperimentUtils$mEnableFollowLivePlayerResuse$2 extends Lambda implements a	// class@001180
{
    public static final HomeFollowExperimentUtils$mEnableFollowLivePlayerResuse$2 INSTANCE;

    static {
       HomeFollowExperimentUtils$mEnableFollowLivePlayerResuse$2.INSTANCE = new HomeFollowExperimentUtils$mEnableFollowLivePlayerResuse$2();
    }
    public void HomeFollowExperimentUtils$mEnableFollowLivePlayerResuse$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HomeFollowExperimentUtils$mEnableFollowLivePlayerResuse$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (Build$VERSION.SDK_INT == 26) {
          return b;
       }
       if (l.c("ENABLE_FOLLOW_LIVE_PLAYER_RESUSE", b) || a.t().d("enableFollowLivePlayerResuse", b)) {
          b = true;
       }
       return b;
    }
}
