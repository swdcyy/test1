package com.yxcorp.gifshow.follow.common.degrade.FollowDegradeUtil$mDoubleLiveDegradeStrategy$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import pga.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import nsd.u;
import java.lang.reflect.Type;

public final class FollowDegradeUtil$mDoubleLiveDegradeStrategy$2 extends Lambda implements a	// class@00103a
{
    public static final FollowDegradeUtil$mDoubleLiveDegradeStrategy$2 INSTANCE;

    static {
       FollowDegradeUtil$mDoubleLiveDegradeStrategy$2.INSTANCE = new FollowDegradeUtil$mDoubleLiveDegradeStrategy$2();
    }
    public void FollowDegradeUtil$mDoubleLiveDegradeStrategy$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, FollowDegradeUtil$mDoubleLiveDegradeStrategy$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a uoa = new a(false, null, null, null, 15, null);
       return a.t().getValue("followDoubleLivePlayDegradeStrategy", a.class, v9);
    }
}
