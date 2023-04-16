package com.yxcorp.gifshow.follow.common.degrade.FollowDegradeUtil$mEnableFollowAutoDegradeToast$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xf6.i;

public final class FollowDegradeUtil$mEnableFollowAutoDegradeToast$2 extends Lambda implements a	// class@00103b
{
    public static final FollowDegradeUtil$mEnableFollowAutoDegradeToast$2 INSTANCE;

    static {
       FollowDegradeUtil$mEnableFollowAutoDegradeToast$2.INSTANCE = new FollowDegradeUtil$mEnableFollowAutoDegradeToast$2();
    }
    public void FollowDegradeUtil$mEnableFollowAutoDegradeToast$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, FollowDegradeUtil$mEnableFollowAutoDegradeToast$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return i.i();
    }
}
