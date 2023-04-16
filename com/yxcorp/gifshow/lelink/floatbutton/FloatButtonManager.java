package com.yxcorp.gifshow.lelink.floatbutton.FloatButtonManager;
import yza.h;
import com.yxcorp.gifshow.lelink.floatbutton.FloatButtonManager$a;
import nsd.u;
import kotlin.LazyThreadSafetyMode;
import com.yxcorp.gifshow.lelink.floatbutton.FloatButtonManager$Companion$instance$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.yxcorp.gifshow.lelink.floatbutton.FloatButtonManager$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.lelink.floatbutton.FloatWindowView;
import android.view.View;
import android.view.WindowManager;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.kwai.framework.activitycontext.ActivityContext;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import android.app.Application$ActivityLifecycleCallbacks;
import com.yxcorp.gifshow.entity.QPhoto;
import yza.f;
import android.content.Context;
import lnc.i9;
import yza.a;
import java.lang.Exception;
import com.yxcorp.gifshow.lelink.util.KLogLelink;
import com.yxcorp.gifshow.lelink.util.KLogLelink$a;
import q87.c;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;

public final class FloatButtonManager implements h	// class@001a40
{
    public QPhoto a;
    public boolean b;
    public boolean c;
    public FloatButtonManager$b d;
    public b e;
    public FloatWindowView f;
    public PresenterV2 g;
    public static final p h;
    public static final FloatButtonManager$a i;

    static {
       FloatButtonManager.i = new FloatButtonManager$a(null);
       FloatButtonManager.h = s.b(LazyThreadSafetyMode.SYNCHRONIZED, FloatButtonManager$Companion$instance$2.INSTANCE);
    }
    public void FloatButtonManager(){
       super();
       this.d = new FloatButtonManager$b(this);
    }
    public void FloatButtonManager(u p0){
       super();
       this.d = new FloatButtonManager$b(this);
    }
    public void a(){
       FloatButtonManager tg;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FloatButtonManager.class, "5")) {
          return;
       }
       if (this.b != null) {
          tg = this.g;
          if (tg != null) {
             tg.destroy();
          }
       }
       try{
          this.b = false;
          tg = this.f;
          if (tg == null || (!PatchProxy.applyVoid(objArray, tg, FloatWindowView.class, "11") && tg.o != null)) {
             tg.h.removeViewImmediate(tg);
             tg.p = objArray;
          }
       label_0034 :
          ActivityContext.k(this.d);
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          uoc.a().unregisterActivityLifecycleCallbacks(this.e);
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public void b(QPhoto p0,FloatWindowView p1,PresenterV2 p2,f p3){
       if (PatchProxy.applyVoidFourRefsWithListener(p0, p1, p2, p3, this, FloatButtonManager.class, "1")) {
          return;
       }
       a.p(p0, "photo");
       a.p(p1, "floatView");
       a.p(p2, "presenter");
       a.p(p3, "floatButtonListener");
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       if (i9.a(uoc.a())) {
          if (this.b != null) {
             this.a();
          }
          boolean b = true;
          this.b = b;
          this.a = p0;
          this.f = p1;
          this.g = p2;
          if (p2 != null) {
             p2.f(p1);
          }
          FloatButtonManager tg = this.g;
          if (tg != null) {
             Object[] objArray = new Object[b];
             objArray[0] = new a(p0, p3);
             tg.i(objArray);
          }
          ActivityContext.i(this.d);
          PatchProxy.onMethodExit(FloatButtonManager.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(FloatButtonManager.class, "1");
          throw new Exception("don\'t have floatwindow permission!!!");
       }
    }
    public final FloatWindowView c(){
       return this.f;
    }
    public final void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FloatButtonManager.class, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       KLogLelink.e.a().w("FloatButtonManager", p0, objArray);
       return;
    }
    public void hide(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FloatButtonManager.class, "4")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       this.c = false;
       FloatButtonManager tf = this.f;
       if (tf != null && !PatchProxy.applyVoid(objArray, tf, FloatWindowView.class, "9")) {
          tf.setVisibility(8);
       }
       return;
    }
    public void show(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FloatButtonManager.class, "3")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       this.c = true;
       FloatButtonManager tf = this.f;
       if (tf != null && !PatchProxy.applyVoid(objArray, tf, FloatWindowView.class, "10")) {
          if (tf.o != null) {
             tf.setVisibility(0);
          }else if(PatchProxy.applyVoid(objArray, tf, FloatWindowView.class, "8") || tf.o != null){
             try{
                tf.h.addView(tf, tf.g);
                tf.o = true;
             }catch(android.view.WindowManager$BadTokenException e0){
                tf.o = false;
             }
          }
       }
    }
}
