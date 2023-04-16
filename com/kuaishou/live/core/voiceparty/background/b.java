package com.kuaishou.live.core.voiceparty.background.b;
import ok.h;
import java.lang.Object;
import android.net.Uri;
import go2.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import uc.c;
import android.graphics.Bitmap$Config;
import uc.b;

public final class b implements h	// class@001349
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object apply(Object p0){
       ImageRequest imageRequest = PatchProxy.applyOneRefs(p0, null, h.class, "3");
       if (imageRequest != PatchProxyResult.class) {
       }else {
          p0 = ImageRequestBuilder.k(p0);
          c uoc = new c();
          uoc.b(Bitmap$Config.ARGB_8888);
          p0.o(uoc.a());
          imageRequest = p0.a();
       }
       return imageRequest;
    }
}
