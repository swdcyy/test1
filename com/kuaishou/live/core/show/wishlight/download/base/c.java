package com.kuaishou.live.core.show.wishlight.download.base.c;
import io.reactivex.g;
import com.kuaishou.live.core.show.wishlight.download.base.e;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.facebook.imagepipeline.request.ImageRequest;
import s0d.f;
import s0d.a;
import s0d.e;
import android.app.Application;
import o56.a;
import en2.d;
import com.yxcorp.image.fresco.wrapper.a;
import m0d.b;
import com.yxcorp.image.fresco.wrapper.b;
import android.content.Context;
import com.yxcorp.image.fresco.wrapper.a$g;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.image.callercontext.a;
import kb.c;
import com.yxcorp.image.fresco.wrapper.a$e;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import android.os.AsyncTask;
import kb.e;
import java.util.concurrent.Executor;
import m0d.e;

public final class c implements g	// class@0012a5
{
    public final e b;
    public final CDNUrl[] c;
    public final String d;
    public final AtomicReference e;

    public void c(e p0,CDNUrl[] p1,String p2,AtomicReference p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void subscribe(v p0){
       f obj1;
       e uoe1;
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       c te = this.e;
       Objects.requireNonNull(tb);
       e uoe = PatchProxy.applyOneRefs(tc, tb, e.class, "3");
       if (uoe != PatchProxyResult.class) {
       }else {
          obj1 = f.x().r(tc).o(tb.e, tb.f);
          if (tb.c == null) {
             obj1.b();
          }
          if (tb.d == null) {
             obj1.a();
          }
          uoe = obj1.v();
       }
       Object obj = uoe;
       Application uApplication = a.b();
       d uod = new d(p0);
       p0 = PatchProxy.applyFourRefs(uApplication, obj, td, uod, null, a.class, "17");
       if (p0 != PatchProxyResult.class) {
       }else {
          b uob = new b(uApplication, td, uod);
          obj1 = PatchProxy.applyTwoRefs(obj, uob, null, a.class, "4");
          if (obj1 != PatchProxyResult.class) {
             uoe1 = obj1;
          }else {
             tb = Fresco.getImagePipeline().fetchDecodedImage(obj, ImageSource.UNKNOWN.newCallerContext());
             tb.f(new a$e(uob), AsyncTask.THREAD_POOL_EXECUTOR);
             uoe1 = new e(tb);
          }
       }
       te.set(p0);
       return;
    }
}
