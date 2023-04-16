package com.facebook.react.modules.core.ReactChoreographer;
import java.lang.Object;
import com.facebook.react.modules.core.ReactChoreographer$c;
import com.facebook.react.modules.core.ReactChoreographer$CallbackType;
import java.util.ArrayDeque;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import od.a;
import com.facebook.react.modules.core.ReactChoreographer$b;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Objects;
import com.facebook.react.modules.core.a;
import android.view.Choreographer$FrameCallback;
import com.facebook.react.modules.core.a$a;
import android.view.Choreographer;
import com.facebook.react.modules.core.ReactChoreographer$a;
import cb.a;

public class ReactChoreographer	// class@001295
{
    public a a;
    public final ReactChoreographer$c b;
    public final Object c;
    public final ArrayDeque[] d;
    public int e;
    public boolean f;
    public static ReactChoreographer g;

    public void ReactChoreographer(){
       super();
       this.c = new Object();
       int i = 0;
       this.e = i;
       this.f = i;
       this.b = new ReactChoreographer$c(this);
       ArrayDeque[] uArrayDequeA = new ArrayDeque[ReactChoreographer$CallbackType.values().length];
       this.d = uArrayDequeA;
       ReactChoreographer td = this.d;
       while (i < td.length) {
          td[i] = new ArrayDeque();
          i = i + 1;
       }
       this.b(null);
       return;
    }
    public static ReactChoreographer a(){
       Object obj = PatchProxy.apply(null, null, ReactChoreographer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.d(ReactChoreographer.g, "ReactChoreographer needs to be initialized.");
       return ReactChoreographer.g;
    }
    public void b(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactChoreographer.class, "5")) {
          return;
       }
       UiThreadUtil.runOnUiThread(new ReactChoreographer$b(this, p0));
       return;
    }
    public void c(){
       String str = "8";
       if (PatchProxy.applyVoid(null, this, ReactChoreographer.class, str)) {
          return;
       }
       boolean b = (this.e >= null)? true: false;
       a.a(b);
       if (this.e == null && this.f != null) {
          if (this.a != null) {
             ReactChoreographer ta = this.a;
             ReactChoreographer tb = this.b;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoidOneRefs(tb, ta, a.class, "4")) {
                Choreographer$FrameCallback uFrameCallba = tb.b();
                if (!PatchProxy.applyVoidOneRefs(uFrameCallba, ta, a.class, str)) {
                   ta.b.removeFrameCallback(uFrameCallba);
                }
             }
          }
          this.f = false;
       }
       return;
    }
    public void d(ReactChoreographer$CallbackType p0,a$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactChoreographer.class, "3")) {
          return;
       }
       ReactChoreographer tc = this.c;
       _monitor_enter(tc);
       this.d[p0.getOrder()].addLast(p1);
       int i = 1;
       int i1 = this.e + i;
       this.e = i1;
       if (i1 <= 0) {
          i = false;
       }
       a.a(i);
       if (this.f == null) {
          if (this.a == null) {
             this.b(new ReactChoreographer$a(this));
          }else {
             this.e();
          }
       }
       _monitor_exit(tc);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, ReactChoreographer.class, "4")) {
          return;
       }
       this.a.b(this.b);
       this.f = true;
       return;
    }
    public void f(ReactChoreographer$CallbackType p0,a$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactChoreographer.class, "6")) {
          return;
       }
       ReactChoreographer tc = this.c;
       _monitor_enter(tc);
       if (this.d[p0.getOrder()].removeFirstOccurrence(p1)) {
          this.e = this.e - 1;
          this.c();
       }else {
          a.g("ReactNative", "Tried to remove non-existent frame callback");
       }
       _monitor_exit(tc);
       return;
    }
}
