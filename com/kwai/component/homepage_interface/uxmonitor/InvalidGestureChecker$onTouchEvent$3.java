package com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker$onTouchEvent$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;
import android.view.MotionEvent;
import java.lang.Object;
import tb5.c;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.view.Window;
import android.app.Activity;
import tb5.k;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.ref.WeakReference;
import java.lang.Runnable;
import ekd.k1;

public final class InvalidGestureChecker$onTouchEvent$3 extends Lambda implements l	// class@00097d
{
    public final MotionEvent $event;
    public final InvalidGestureChecker this$0;

    public void InvalidGestureChecker$onTouchEvent$3(InvalidGestureChecker p0,MotionEvent p1){
       this.this$0 = p0;
       this.$event = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(c p0){
       k c;
       Object[] objArray2;
       Field declaredFiel;
       c uoc = c.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, InvalidGestureChecker$onTouchEvent$3.class, str)) {
          return;
       }
       a.p(p0, "it");
       InvalidGestureChecker$onTouchEvent$3 t$event = this.$event;
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoidOneRefs(t$event, p0, uoc, "5")) {
          a.p(t$event, "event");
          p0.c = t$event.getRawX();
          p0.d = t$event.getRawY();
       }
       if (p0.g != null) {
          t$event = this.this$0;
          Objects.requireNonNull(t$event);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          Object[] objArray = null;
          Object[] objArray1 = PatchProxy.apply(objArray, t$event, InvalidGestureChecker.class, "2");
          if (objArray1 != patchProxyRe) {
          }else {
             try{
                Window window = t$event.f.getWindow();
                a.o(window, "mActivity.window");
                View decorView = window.getDecorView();
                a.o(decorView, "mActivity.window.decorView");
                c = k.c;
                Objects.requireNonNull(c);
                objArray2 = PatchProxy.applyOneRefs(decorView, c, k.class, str);
                if (objArray2 == patchProxyRe) {
                   if (k.a == null) {
                      declaredFiel = ViewGroup.class.getDeclaredField("mFirstTouchTarget");
                      k.a = declaredFiel;
                      if (declaredFiel != null) {
                         declaredFiel.setAccessible(true);
                      }
                   }
                   declaredFiel = k.a;
                   a.m(declaredFiel);
                   objArray2 = objArray;
                   for (Field obj = declaredFiel.get(decorView); obj != null; obj = obj.get(objArray2)) {
                      if (k.b == null) {
                         declaredFiel = obj.getClass().getField("child");
                         k.b = declaredFiel;
                         if (declaredFiel != null) {
                            declaredFiel.setAccessible(true);
                         }
                      }
                      declaredFiel = k.b;
                      a.m(declaredFiel);
                      objArray2 = declaredFiel.get(obj);
                      if (objArray2 instanceof ViewGroup) {
                         obj = k.a;
                         a.m(obj);
                      }
                   }
                }
             }catch(java.lang.Exception e0){
                objArray2 = objArray;
             }
             if (objArray2 instanceof View) {
                objArray = objArray2;
             }
             objArray1 = objArray;
          }
          if (!PatchProxy.applyVoidOneRefs(objArray1, p0, uoc, "6") && objArray1 != null) {
             p0.h = new WeakReference(objArray1);
          }
       }
    label_00d6 :
       k1.r(this.this$0.c, 1000);
       return;
    }
}
