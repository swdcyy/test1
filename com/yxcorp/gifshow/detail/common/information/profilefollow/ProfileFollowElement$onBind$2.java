package com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement$onBind$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class ProfileFollowElement$onBind$2 extends FunctionReferenceImpl implements l	// class@001439
{
    public static final ProfileFollowElement$onBind$2 INSTANCE;

    static {
       ProfileFollowElement$onBind$2.INSTANCE = new ProfileFollowElement$onBind$2();
    }
    public void ProfileFollowElement$onBind$2(){
       super(1, User.class, "isFollowingOrFollowRequesting", "isFollowingOrFollowRequesting\(\)Z", 0);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileFollowElement$onBind$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "p1");
       return p0.isFollowingOrFollowRequesting();
    }
}
