package com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mDisableFollowPageLike$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class FollowConfigUtil$mDisableFollowPageLike$2 extends Lambda implements a	// class@0010a3
{
    public static final FollowConfigUtil$mDisableFollowPageLike$2 INSTANCE;

    static {
       FollowConfigUtil$mDisableFollowPageLike$2.INSTANCE = new FollowConfigUtil$mDisableFollowPageLike$2();
    }
    public void FollowConfigUtil$mDisableFollowPageLike$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, FollowConfigUtil$mDisableFollowPageLike$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("disableFollowPageLike", false);
    }
}
