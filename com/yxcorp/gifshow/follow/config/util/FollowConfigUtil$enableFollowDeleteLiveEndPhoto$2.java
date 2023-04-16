package com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$enableFollowDeleteLiveEndPhoto$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class FollowConfigUtil$enableFollowDeleteLiveEndPhoto$2 extends Lambda implements a	// class@00109d
{
    public static final FollowConfigUtil$enableFollowDeleteLiveEndPhoto$2 INSTANCE;

    static {
       FollowConfigUtil$enableFollowDeleteLiveEndPhoto$2.INSTANCE = new FollowConfigUtil$enableFollowDeleteLiveEndPhoto$2();
    }
    public void FollowConfigUtil$enableFollowDeleteLiveEndPhoto$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, FollowConfigUtil$enableFollowDeleteLiveEndPhoto$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("followDeleteLiveEndPhoto", false);
    }
}
