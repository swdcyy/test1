package com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mReturnFollowAutoRefreshStrategy$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Integer;

public final class FollowConfigUtil$mReturnFollowAutoRefreshStrategy$2 extends Lambda implements a	// class@0010b3
{
    public static final FollowConfigUtil$mReturnFollowAutoRefreshStrategy$2 INSTANCE;

    static {
       FollowConfigUtil$mReturnFollowAutoRefreshStrategy$2.INSTANCE = new FollowConfigUtil$mReturnFollowAutoRefreshStrategy$2();
    }
    public void FollowConfigUtil$mReturnFollowAutoRefreshStrategy$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, FollowConfigUtil$mReturnFollowAutoRefreshStrategy$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("returnFollowAutoRefreshStrategy", 0);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
