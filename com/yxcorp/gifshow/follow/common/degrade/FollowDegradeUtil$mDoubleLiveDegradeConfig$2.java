package com.yxcorp.gifshow.follow.common.degrade.FollowDegradeUtil$mDoubleLiveDegradeConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.follow.common.degrade.creator.DoubleLiveDegradeConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.util.Map;
import nsd.u;
import java.lang.reflect.Type;

public final class FollowDegradeUtil$mDoubleLiveDegradeConfig$2 extends Lambda implements a	// class@001039
{
    public static final FollowDegradeUtil$mDoubleLiveDegradeConfig$2 INSTANCE;

    static {
       FollowDegradeUtil$mDoubleLiveDegradeConfig$2.INSTANCE = new FollowDegradeUtil$mDoubleLiveDegradeConfig$2();
    }
    public void FollowDegradeUtil$mDoubleLiveDegradeConfig$2(){
       super(0);
    }
    public final DoubleLiveDegradeConfig invoke(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, FollowDegradeUtil$mDoubleLiveDegradeConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("followDoubleLivePlayDegradeConfig", DoubleLiveDegradeConfig.class, new DoubleLiveDegradeConfig(0, objArray, 3, objArray));
    }
    public Object invoke(){
       return this.invoke();
    }
}
