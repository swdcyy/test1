package com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mFollowCircleSubscribeTime$2;
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

public final class FollowConfigUtil$mFollowCircleSubscribeTime$2 extends Lambda implements a	// class@0010ac
{
    public static final FollowConfigUtil$mFollowCircleSubscribeTime$2 INSTANCE;

    static {
       FollowConfigUtil$mFollowCircleSubscribeTime$2.INSTANCE = new FollowConfigUtil$mFollowCircleSubscribeTime$2();
    }
    public void FollowConfigUtil$mFollowCircleSubscribeTime$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, FollowConfigUtil$mFollowCircleSubscribeTime$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("followCircleLiveSubscribeTime", 30);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
