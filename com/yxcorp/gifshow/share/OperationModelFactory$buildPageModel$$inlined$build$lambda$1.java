package com.yxcorp.gifshow.share.OperationModelFactory$buildPageModel$$inlined$build$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import brd.t;
import java.io.File;
import java.lang.String;
import java.util.List;
import mhc.x;
import com.yxcorp.gifshow.model.SharePlatformData;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.OperationModelFactory$buildPageModel$$inlined$build$lambda$1$1;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import com.yxcorp.gifshow.share.OperationModelFactory;
import com.yxcorp.gifshow.share.OperationModelFactory$buildPageModel$$inlined$build$lambda$1$2;

public final class OperationModelFactory$buildPageModel$$inlined$build$lambda$1 extends Lambda implements l	// class@001b60
{
    public final l $ccFunc$inlined;
    public final File $coverFile$inlined;
    public final String $coverUrl$inlined;
    public final t $dataFetcher$inlined;
    public final String $localShareUrl$inlined;
    public final List $platforms$inlined;
    public final String $siteName$inlined;
    public final String $subtitle$inlined;
    public final String $title$inlined;

    public void OperationModelFactory$buildPageModel$$inlined$build$lambda$1(t p0,File p1,String p2,String p3,String p4,String p5,String p6,List p7,l p8){
       this.$dataFetcher$inlined = p0;
       this.$coverFile$inlined = p1;
       this.$title$inlined = p2;
       this.$subtitle$inlined = p3;
       this.$coverUrl$inlined = p4;
       this.$localShareUrl$inlined = p5;
       this.$siteName$inlined = p6;
       this.$platforms$inlined = p7;
       this.$ccFunc$inlined = p8;
       super(1);
    }
    public final SharePlatformData invoke(x p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, OperationModelFactory$buildPageModel$$inlined$build$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "forward");
       PatchProxy.onMethodExit(OperationModelFactory$buildPageModel$$inlined$build$lambda$1.class, "1");
       return OperationModelFactory.i(new OperationModelFactory$buildPageModel$$inlined$build$lambda$1$2(OperationModelFactory.h(p0, new OperationModelFactory$buildPageModel$$inlined$build$lambda$1$1(this, p0))));
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
