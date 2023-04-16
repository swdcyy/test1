package com.yxcorp.gifshow.share.OperationModelFactory$buildProfileModel$$inlined$build$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.model.user.User;
import java.lang.String;
import mhc.x;
import com.yxcorp.gifshow.model.SharePlatformData;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.OperationModelFactory$buildProfileModel$$inlined$build$lambda$1$1;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import com.yxcorp.gifshow.share.OperationModelFactory;
import com.yxcorp.gifshow.share.OperationModelFactory$buildProfileModel$$inlined$build$lambda$1$2;

public final class OperationModelFactory$buildProfileModel$$inlined$build$lambda$1 extends Lambda implements l	// class@001b68
{
    public final String $bigHeadUrl$inlined;
    public final User $user$inlined;

    public void OperationModelFactory$buildProfileModel$$inlined$build$lambda$1(User p0,String p1){
       this.$user$inlined = p0;
       this.$bigHeadUrl$inlined = p1;
       super(1);
    }
    public final SharePlatformData invoke(x p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, OperationModelFactory$buildProfileModel$$inlined$build$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "forward");
       PatchProxy.onMethodExit(OperationModelFactory$buildProfileModel$$inlined$build$lambda$1.class, "1");
       return OperationModelFactory.i(new OperationModelFactory$buildProfileModel$$inlined$build$lambda$1$2(OperationModelFactory.h(p0, new OperationModelFactory$buildProfileModel$$inlined$build$lambda$1$1(this, p0))));
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
