package com.yxcorp.gifshow.social.bridge.tools.ImagePreload$preloadImage$1$1$a;
import kb.b;
import asd.c;
import com.yxcorp.gifshow.social.bridge.tools.ImagePreload$preloadImage$1$1;
import kb.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import java.lang.CharSequence;
import zsd.u;
import android.util.Log;
import com.yxcorp.gifshow.social.bridge.tools.LoadImageException;
import kotlin.Result;
import qrd.j0;

public final class ImagePreload$preloadImage$1$1$a extends b	// class@001d60
{
    public final c a;
    public final ImagePreload$preloadImage$1$1 b;

    public void ImagePreload$preloadImage$1$1$a(c p0,ImagePreload$preloadImage$1$1 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onFailureImpl(c p0){
       Throwable throwable1;
       String stackTraceSt;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ImagePreload$preloadImage$1$1$a.class, "2")) {
          return;
       }
       a.p(p0, "dataSource");
       Throwable throwable = p0.e();
       LoadImageException loadImageExc = null;
       String message = (throwable != null)? throwable.getMessage(): loadImageExc;
       message = (message == null || u.S1(message))? 1: null;
       if (message) {
          throwable1 = p0.e();
          if (throwable1 != null) {
             stackTraceSt = Log.getStackTraceString(throwable1);
             if (stackTraceSt == null) {
             }
          }else {
          }
       }else {
          throwable1 = p0.e();
          if (throwable1 != null) {
             loadImageExc = throwable1.getMessage();
          }
          a.m(loadImageExc);
          stackTraceSt = loadImageExc;
       }
       a.o(stackTraceSt, "if \(dataSource.failureCa\x20\x02e.failureCause?.message!!\x00");
       ImagePreload$preloadImage$1$1 $url = this.b.$url;
       a.o($url, "url");
       this.a.resumeWith(Result.constructor-impl(j0.a(new LoadImageException(-1, $url, stackTraceSt))));
       PatchProxy.onMethodExit(ImagePreload$preloadImage$1$1$a.class, "2");
       return;
    }
    public void onNewResultImpl(c p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ImagePreload$preloadImage$1$1$a.class, "1")) {
          return;
       }
       a.p(p0, "dataSource");
       this.a.resumeWith(Result.constructor-impl(this.b.$url));
       PatchProxy.onMethodExit(ImagePreload$preloadImage$1$1$a.class, "1");
       return;
    }
}
