package com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mFollowSizerOptStrategy$2;
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

public final class FollowConfigUtil$mFollowSizerOptStrategy$2 extends Lambda implements a	// class@0010b1
{
    public static final FollowConfigUtil$mFollowSizerOptStrategy$2 INSTANCE;

    static {
       FollowConfigUtil$mFollowSizerOptStrategy$2.INSTANCE = new FollowConfigUtil$mFollowSizerOptStrategy$2();
    }
    public void FollowConfigUtil$mFollowSizerOptStrategy$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, FollowConfigUtil$mFollowSizerOptStrategy$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("followSizerOptStrategy", 0);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
