package com.yxcorp.gifshow.share.OperationModelFactory$buildProfileModel$$inlined$build$lambda$1$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import java.lang.Object;
import com.yxcorp.gifshow.model.SharePlatformData;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class OperationModelFactory$buildProfileModel$$inlined$build$lambda$1$2 extends Lambda implements l	// class@001b67
{
    public final SharePlatformData$ShareConfig $it;

    public void OperationModelFactory$buildProfileModel$$inlined$build$lambda$1$2(SharePlatformData$ShareConfig p0){
       this.$it = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(SharePlatformData p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, OperationModelFactory$buildProfileModel$$inlined$build$lambda$1$2.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.mShareConfig = this.$it;
       PatchProxy.onMethodExit(OperationModelFactory$buildProfileModel$$inlined$build$lambda$1$2.class, "1");
       return;
    }
}