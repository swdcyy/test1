package com.facebook.react.uimanager.a;
import com.facebook.react.ReactRootView;
import gf.d;
import java.lang.Object;
import com.facebook.react.uimanager.a$a;
import com.facebook.react.uimanager.a$b;
import java.lang.ref.WeakReference;
import gf.e;
import gf.b;
import gf.c;
import com.facebook.react.uimanager.UIManagerModule;
import od.a;
import com.facebook.react.uimanager.f;
import com.facebook.react.uimanager.f$b;
import com.facebook.react.uimanager.j;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.System;
import ze.x;
import android.graphics.Rect;
import gf.h;
import com.facebook.react.a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.NativeModule;
import android.view.MotionEvent;

public class a	// class@001338
{
    public final d a;
    public final WeakReference b;
    public final int c;
    public final e d;
    public final b e;
    public final c f;
    public boolean g;
    public int h;
    public f$b i;
    public j$x j;

    public void a(ReactRootView p0,d p1,int p2){
       super();
       this.g = false;
       this.i = new a$a(this);
       this.j = new a$b(this);
       this.h = p2;
       this.a = p1;
       this.b = new WeakReference(p0);
       this.c = p0.getRootViewTag();
       this.d = new e();
       this.e = new b();
       this.f = new c();
       UIManagerModule uIManagerMod = this.b();
       a.c(uIManagerMod);
       uIManagerMod.getUIImplementation().a(this.i);
       j oj = uIManagerMod.getUIImplementation().k();
       a tj = this.j;
       Objects.requireNonNull(oj);
       j oj1 = j.class;
       if (PatchProxy.applyVoidOneRefs(tj, oj, oj1, "2")) {
       }else if(!PatchProxy.applyVoid(null, oj, oj1, "5") && oj.z == null){
          oj.z = new CopyOnWriteArraySet();
       }
       oj.z.add(tj);
       return;
    }
    public static long c(){
       Object obj = PatchProxy.apply(null, null, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return System.currentTimeMillis();
    }
    public static Rect d(x p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Rect(p0.getAbsoluteX(), p0.getAbsoluteY(), (p0.getAbsoluteX() + p0.getScreenWidth()), (p0.getAbsoluteY() + p0.getScreenHeight()));
    }
    public static Rect e(h p0){
       h a;
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a = p0.a;
       h b = p0.b;
       return new Rect(a, b, (p0.c + a), (p0.d + b));
    }
    public boolean a(){
       return this.g;
    }
    public UIManagerModule b(){
       Object[] objArray = null;
       ReactRootView obj = PatchProxy.apply(objArray, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.get();
       a reactInstanc = (obj != null)? obj.getReactInstanceManager(): objArray;
       if (reactInstanc != null && reactInstanc.t()) {
          return reactInstanc.n().getNativeModule(UIManagerModule.class);
       }else {
          return objArray;
       }
    }
    public void onInputEvent(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       if (this.f.b(a.c())) {
          this.g = true;
       }
       return;
    }
    public void onTouchEvent(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       if (this.f.b(a.c())) {
          this.g = true;
       }
       return;
    }
}
