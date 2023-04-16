package com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mEnableFollowPreloadShowBeforeNetwork$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class FollowConfigUtil$mEnableFollowPreloadShowBeforeNetwork$2 extends Lambda implements a	// class@0010a7
{
    public static final FollowConfigUtil$mEnableFollowPreloadShowBeforeNetwork$2 INSTANCE;

    static {
       FollowConfigUtil$mEnableFollowPreloadShowBeforeNetwork$2.INSTANCE = new FollowConfigUtil$mEnableFollowPreloadShowBeforeNetwork$2();
    }
    public void FollowConfigUtil$mEnableFollowPreloadShowBeforeNetwork$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, FollowConfigUtil$mEnableFollowPreloadShowBeforeNetwork$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableFollowPreloadShowBeforeNetwork", false);
    }
}
