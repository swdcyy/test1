package com.yxcorp.gifshow.share.OperationModelFactory$buildQRCodeProfileModel$$inlined$build$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.model.user.User;
import mhc.x;
import com.yxcorp.gifshow.model.SharePlatformData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.OperationModelFactory$buildQRCodeProfileModel$$inlined$build$lambda$1$1;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import com.yxcorp.gifshow.share.OperationModelFactory;
import com.yxcorp.gifshow.share.OperationModelFactory$buildQRCodeProfileModel$$inlined$build$lambda$1$2;

public final class OperationModelFactory$buildQRCodeProfileModel$$inlined$build$lambda$1 extends Lambda implements l	// class@001b6b
{
    public final User $user$inlined;

    public void OperationModelFactory$buildQRCodeProfileModel$$inlined$build$lambda$1(User p0){
       this.$user$inlined = p0;
       super(1);
    }
    public final SharePlatformData invoke(x p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, OperationModelFactory$buildQRCodeProfileModel$$inlined$build$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "forward");
       PatchProxy.onMethodExit(OperationModelFactory$buildQRCodeProfileModel$$inlined$build$lambda$1.class, "1");
       return OperationModelFactory.i(new OperationModelFactory$buildQRCodeProfileModel$$inlined$build$lambda$1$2(OperationModelFactory.h(p0, new OperationModelFactory$buildQRCodeProfileModel$$inlined$build$lambda$1$1(this, p0))));
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
