package com.yxcorp.gifshow.share.OperationModelFactory$buildPhotoModel$$inlined$build$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.model.feed.BaseFeed;
import brd.t;
import java.lang.String;
import mhc.x;
import com.yxcorp.gifshow.model.SharePlatformData;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.OperationModelFactory;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import com.yxcorp.gifshow.share.OperationModelFactory$createCoursePayPhotoConfig$1;
import com.yxcorp.gifshow.share.OperationModelFactory$createCoursePayPhotoConfig$2;
import com.yxcorp.gifshow.share.OperationModelFactory$buildPhotoModel$$inlined$build$lambda$1$1;

public final class OperationModelFactory$buildPhotoModel$$inlined$build$lambda$1 extends Lambda implements l	// class@001b62
{
    public final boolean $collate$inlined;
    public final t $fetcher$inlined;
    public final boolean $forceForward$inlined;
    public final String $guidePlatform$inlined;
    public final boolean $isLongPressShare$inlined;
    public final BaseFeed $photo$inlined;
    public final int $source$inlined;

    public void OperationModelFactory$buildPhotoModel$$inlined$build$lambda$1(BaseFeed p0,int p1,boolean p2,t p3,boolean p4,String p5,boolean p6){
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
       SharePlatformData$ShareConfig shareConfig1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       OperationModelFactory$buildPhotoModel$$inlined$build$lambda$1 obj = PatchProxy.applyOneRefsWithListener(p0, this, OperationModelFactory$buildPhotoModel$$inlined$build$lambda$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "forward");
       obj = this.$photo$inlined;
       SharePlatformData$ShareConfig shareConfig = PatchProxy.applyTwoRefs(obj, p0, null, OperationModelFactory.class, "8");
       if (shareConfig != patchProxyRe) {
       }else if(a.g(p0.v(), "message") ^ 0x01){
          shareConfig1 = OperationModelFactory.h(p0, new OperationModelFactory$createCoursePayPhotoConfig$1(p0, obj));
       }else {
          shareConfig1 = OperationModelFactory.h(p0, new OperationModelFactory$createCoursePayPhotoConfig$2(obj, p0));
       }
       shareConfig = shareConfig1;
       PatchProxy.onMethodExit(OperationModelFactory$buildPhotoModel$$inlined$build$lambda$1.class, "1");
       return OperationModelFactory.i(new OperationModelFactory$buildPhotoModel$$inlined$build$lambda$1$1(shareConfig));
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
