package com.kwai.sharelib.tools.image.processor.b;
import uo7.s;
import java.lang.Object;
import zo7.c;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.collections.ArraysKt___ArraysKt;
import com.kwai.sharelib.tools.image.processor.a;
import io.reactivex.i;
import brd.a0;
import android.net.Uri;
import com.kwai.sharelib.KsShareApi;
import android.app.Application;
import android.content.Context;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.target.Target;

public final class b implements s	// class@001702
{

    public void b(){
       super();
    }
    public Bitmap a(c p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Bitmap obj = PatchProxy.applyOneRefs(p0, this, uob, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "image");
       p0 = p0.b;
       a.o(p0, "image.imageUrls");
       String str = ArraysKt___ArraysKt.Ib(p0);
       obj = null;
       if (str != null) {
          Object obj1 = PatchProxy.applyOneRefs(str, this, uob, "3");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             a0 uoa0 = a0.k(new a(str));
             try{
                a.o(uoa0, "Single.create { emitter:бн\n        }\n      }\)\n    }");
                obj = uoa0.e();
             }catch(java.lang.Exception e0){
             }
          }
       }
       return obj;
    }
    public Uri b(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "image");
       p0 = p0.b;
       a.o(p0, "image.imageUrls");
       String str = ArraysKt___ArraysKt.Ib(p0);
       if (str != null) {
          Glide.with(KsShareApi.s.k()).load(str).diskCacheStrategy(DiskCacheStrategy.DATA).preload();
       }
       return null;
    }
}
