package com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$enablePreloadFollowPage$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xf6.l;

public final class FollowConfigUtil$enablePreloadFollowPage$2 extends Lambda implements a	// class@00109f
{
    public static final FollowConfigUtil$enablePreloadFollowPage$2 INSTANCE;

    static {
       FollowConfigUtil$enablePreloadFollowPage$2.INSTANCE = new FollowConfigUtil$enablePreloadFollowPage$2();
    }
    public void FollowConfigUtil$enablePreloadFollowPage$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, FollowConfigUtil$enablePreloadFollowPage$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (l.c("enablePreloadFollowPage", false)) {
          return true;
       }
       return false;
    }
}
