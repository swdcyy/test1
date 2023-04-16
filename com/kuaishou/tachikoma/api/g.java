package com.kuaishou.tachikoma.api.g;
import java.lang.Object;
import com.tkruntime.v8.V8ObjectProxy;
import tw4.t;
import android.os.Looper;
import com.tachikoma.core.component.view.TKViewBackgroundDrawable;
import yp8.b;
import lg.i;
import com.tachikoma.core.bridge.TachikomaGlobalObject;
import aq8.j;
import dx4.a;
import cx4.c;
import gx4.f$a;
import com.tachikoma.core.bridge.d;
import gx4.e;
import com.tkruntime.v8.V8Object;
import gx4.f;
import com.tachikoma.core.component.view.TKView;
import com.tachikoma.core.component.e;
import eq8.a;
import com.tachikoma.core.component.text.TKText;
import android.os.Build$VERSION;
import com.tachikoma.component.imageview.TKImageView;
import com.tachikoma.core.component.input.TKInput;
import com.tachikoma.core.component.button.TKButton;
import com.tachikoma.component.imageview.TKAnimatedImage;
import com.tachikoma.component.imageview.TKImage;
import com.tachikoma.plugin.TKLottieImageView;
import hp8.e;
import com.tachikoma.core.component.text.richtext.RichTextHelper;
import bx4.h;
import java.lang.String;
import zp8.a;
import java.util.Objects;
import tw4.b0;
import java.lang.Throwable;
import wp8.a;
import java.lang.Runnable;
import iq8.x;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import aq8.g;
import aq8.h;
import android.content.Context;
import android.view.ViewGroup;
import fx4.b;
import brd.a0;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalStateException;
import com.tachikoma.core.bridge.a$b;
import com.tachikoma.core.bridge.a;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import tw4.d0;
import java.util.concurrent.Callable;
import tw4.z;
import erd.g;
import io.reactivex.android.schedulers.a;
import tw4.a0;
import com.tachikoma.core.utility.SingleReleaseOnDispose;
import tw4.y;
import brd.e0;
import ird.a;
import no8.e;
import tw4.a;
import com.tkruntime.v8.V8Trace;
import com.kuaishou.tachikoma.api.f;
import java.lang.CharSequence;
import cq8.b;
import com.tkruntime.v8.V8;

public class g	// class@000f85
{
    public Application a;
    public static final g b;
    public static boolean c;
    public static boolean d;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public static g b(){
       return g.b;
    }
    public static void d(V8ObjectProxy p0,t p1){
       if (Looper.myLooper() == null) {
          Looper.prepare();
       }
       TKViewBackgroundDrawable.preLoad();
       b.a();
       b.b(0, "10");
       TachikomaGlobalObject.preLoad();
       j.b().d();
       a.e();
       if (p0 != null) {
          f uof = new f$a(p1.e(), p0).a();
          a.d(new TKView(uof));
          a.d(new TKText(uof));
          int sDK_INT = Build$VERSION.SDK_INT;
          if (sDK_INT <= 29) {
             a.d(new TKImageView(uof));
          }
          if (sDK_INT != 27 && (sDK_INT != 30 && sDK_INT != 25)) {
             a.d(new TKInput(uof));
          }
       label_0065 :
          if (sDK_INT > 25) {
             a.d(new TKButton(uof));
          }
          TKAnimatedImage tKAnimatedIm = new TKAnimatedImage(uof);
          TKImage tKImage = new TKImage(uof);
          TKLottieImageView tKLottieImag = new TKLottieImageView(uof);
          e.c().h();
          h.D = true;
       }else {
          a.c("preLoad: tkContext is not valid");
       }
       Objects.requireNonNull(p1);
       b0 uob0 = new b0(p1);
       x.f(uob0);
       return;
    }
    public static void g(String[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, g.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, g.class, "1")) {
          h.f(p0);
       }
       return;
    }
    public a0 a(String p0,Context p1,boolean p2,String p3,ViewGroup p4,b p5){
       IllegalStateException obj;
       object oobject = p5;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,p4,oobject};
          obj = PatchProxy.apply(objArray, this, og, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       if (!this.c()) {
          obj = new IllegalStateException("tk has been not init.");
          if (oobject != null) {
             oobject.onError(obj);
          }
          return a0.s(obj);
       }else {
          a$b uob = a.a(p2, p3);
          d0 uod0 = new d0(p5, p4, p1, p2, uob, p3, p0);
          return a.i(new SingleReleaseOnDispose(a0.y(v11).T(b.b(a.b(p2, uob))).r(new z(oobject)).G(a.c()).p(new a0(oobject)), new y(oobject)));
       }
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.b().e();
    }
    public t e(Context p0,boolean p1,String p2,ViewGroup p3){
       if (PatchProxy.isSupport(g.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), p2, p3, this, g.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!this.c()) {
          return null;
       }else {
          return new t(e.b().h(p0, p1, a.a(p1, p2), p3, p2));
       }
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, g.class, "6")) {
          return;
       }
       if (a.c.booleanValue()) {
          V8Trace.traceLog("TachikomaApi", "preLoad");
       }
       boolean b = true;
       a$b uob = a.a(b, "");
       a.b(b, uob).execute(new f(uob));
       if (!g.d) {
          g.d = b;
          String[] stringArray = g.e().c();
          String[] stringArray1 = new String[stringArray.length];
          String[] stringArray2 = new String[stringArray.length];
          String[] stringArray3 = new String[stringArray.length];
          int i = 0;
          while (i < stringArray.length) {
             object oobject = stringArray[i];
             stringArray2[i] = stringArray[i];
             if (oobject.endsWith("_stub")) {
                oobject = oobject.replace("_stub", "");
             }
             b uob1 = g.e().d(oobject);
             if (uob1 == null) {
                stringArray1[i] = null;
             }else {
                stringArray1[i] = uob1.l();
                stringArray3[i] = uob1.i();
             }
             i = i + 1;
          }
          V8.injectProps(stringArray2, stringArray1, stringArray3);
       }
       return;
    }
}
