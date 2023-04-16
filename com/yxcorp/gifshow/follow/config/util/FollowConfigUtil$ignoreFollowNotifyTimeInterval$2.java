package com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$ignoreFollowNotifyTimeInterval$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Long;

public final class FollowConfigUtil$ignoreFollowNotifyTimeInterval$2 extends Lambda implements a	// class@0010a0
{
    public static final FollowConfigUtil$ignoreFollowNotifyTimeInterval$2 INSTANCE;

    static {
       FollowConfigUtil$ignoreFollowNotifyTimeInterval$2.INSTANCE = new FollowConfigUtil$ignoreFollowNotifyTimeInterval$2();
    }
    public void FollowConfigUtil$ignoreFollowNotifyTimeInterval$2(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, FollowConfigUtil$ignoreFollowNotifyTimeInterval$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.t().b("ignoreMyFollowNotifyTimeInterval", 0);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
