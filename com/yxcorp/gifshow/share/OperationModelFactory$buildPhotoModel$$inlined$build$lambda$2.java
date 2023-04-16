package com.yxcorp.gifshow.share.OperationModelFactory$buildPhotoModel$$inlined$build$lambda$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.model.feed.BaseFeed;
import brd.t;
import java.lang.String;
import mhc.x;
import com.yxcorp.gifshow.model.SharePlatformData;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.OperationModelFactory$buildPhotoModel$$inlined$build$lambda$2$1;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import com.yxcorp.gifshow.share.OperationModelFactory;
import com.yxcorp.gifshow.share.OperationModelFactory$buildPhotoModel$$inlined$build$lambda$2$2;

public final class OperationModelFactory$buildPhotoModel$$inlined$build$lambda$2 extends Lambda implements l	// class@001b65
{
    public final boolean $collate$inlined;
    public final t $fetcher$inlined;
    public final boolean $forceForward$inlined;
    public final String $guidePlatform$inlined;
    public final boolean $isLongPressShare$inlined;
    public final BaseFeed $photo$inlined;
    public final int $source$inlined;

    public void OperationModelFactory$buildPhotoModel$$inlined$build$lambda$2(BaseFeed p0,int p1,boolean p2,t p3,boolean p4,String p5,boolean p6){
       this.$photo$inlined = p0;
       this.$source$inlined = p1;
       this.$collate$inlined = p2;
       this.$fetcher$inlined = p3;
       this.$isLongPressShare$inlined = p4;
       this.$guidePlatform$inlined = p5;
       this.$forceForward$inlined = p6;
       super(1);
    }
    public final SharePlatformData invoke(x p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, OperationModelFactory$buildPhotoModel$$inlined$build$lambda$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "forward");
       PatchProxy.onMethodExit(OperationModelFactory$buildPhotoModel$$inlined$build$lambda$2.class, "1");
       return OperationModelFactory.i(new OperationModelFactory$buildPhotoModel$$inlined$build$lambda$2$2(OperationModelFactory.h(p0, new OperationModelFactory$buildPhotoModel$$inlined$build$lambda$2$1(this, p0))));
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
