package com.kuaishou.live.core.voiceparty.playway.shared.viewbinder.KwaiImageViewBinderKt$bindAvatar$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import zu2.b;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.playway.shared.viewbinder.KwaiImageViewBinderKt;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.facebook.imagepipeline.request.ImageRequest$CacheChoice;
import jd.c;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.d;
import kotlin.collections.ArraysKt___ArraysKt;

public final class KwaiImageViewBinderKt$bindAvatar$2 extends Lambda implements l	// class@00188c
{
    public static final KwaiImageViewBinderKt$bindAvatar$2 INSTANCE;

    static {
       KwaiImageViewBinderKt$bindAvatar$2.INSTANCE = new KwaiImageViewBinderKt$bindAvatar$2();
    }
    public void KwaiImageViewBinderKt$bindAvatar$2(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final List invoke(b p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       List obj = PatchProxy.applyOneRefs(p0, this, KwaiImageViewBinderKt$bindAvatar$2.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       a.m(p0);
       obj = PatchProxy.applyOneRefs(p0, null, KwaiImageViewBinderKt.class, str);
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "$this$toRequest");
          ImageRequest[] imageRequest = d.e(p0.b(), p0.a(), HeadImageSize.MIDDLE, ImageRequest$CacheChoice.SMALL, null);
          a.o(imageRequest, "ImageRequestFactory.buil¡­SMALL,\n        null\n    \)");
          obj = ArraysKt___ArraysKt.uy(imageRequest);
       }
       return obj;
    }
}
