package com.yxcorp.gifshow.share.operation.b$b;
import io.reactivex.g;
import uo7.k;
import com.kwai.sharelib.model.PainterModel;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ap7.a;
import oic.l2;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.graphics.Bitmap;
import brd.g;
import au6.e;
import java.lang.StringBuilder;
import java.lang.Throwable;

public final class b$b implements g	// class@001c04
{
    public final k b;
    public final PainterModel c;

    public void b$b(k p0,PainterModel p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       Bitmap uBitmap;
       e a;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       a uoa = this.b.e();
       if (uoa == null) {
          uoa = l2.a(this.b, this.c);
       }
       Class uClass = null;
       if (uoa != null) {
          Application uApplication = a.b();
          a.o(uApplication, "AppEnv.getAppContext\(\)");
          uBitmap = uoa.n(uApplication, this.c);
       }else {
          uBitmap = uClass;
       }
       if (uBitmap != null) {
          p0.onNext(uBitmap);
          p0.onComplete();
       }else {
          a = e.a;
          StringBuilder str = "save painter failed, posterBitmap is null forwardPoster: ";
          if (uoa != null) {
             uClass = uoa.getClass();
          }
          e.b(a, null, str+uClass+" configuration:"+this.b+" painterModel:"+this.c, null, 5, null);
          p0.onError(new Throwable("no posterBitmap"));
       }
       return;
    }
}
