package com.yxcorp.gifshow.share.OperationModelFactory$buildPageModel$$inlined$build$lambda$1$2;
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

public final class OperationModelFactory$buildPageModel$$inlined$build$lambda$1$2 extends Lambda implements l	// class@001b5f
{
    public final SharePlatformData$ShareConfig $config;

    public void OperationModelFactory$buildPageModel$$inlined$build$lambda$1$2(SharePlatformData$ShareConfig p0){
       this.$config = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(SharePlatformData p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, OperationModelFactory$buildPageModel$$inlined$build$lambda$1$2.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.mShareConfig = this.$config;
       PatchProxy.onMethodExit(OperationModelFactory$buildPageModel$$inlined$build$lambda$1$2.class, "1");
       return;
    }
}
