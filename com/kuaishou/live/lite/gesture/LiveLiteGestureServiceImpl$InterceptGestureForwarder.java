package com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$InterceptGestureForwarder;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService$c;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$InterceptGestureForwarder$longPressFilter$1;
import com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$InterceptGestureForwarder$singleTapFilter$1;
import com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$InterceptGestureForwarder$singleTapConfirmedFilter$1;
import com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$InterceptGestureForwarder$doubleTapFilter$1;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$GestureDispatcher$onDoubleTap$1;
import e93.f;
import com.kuaishou.live.lite.gesture.a;
import java.lang.Runnable;
import com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$GestureDispatcher$onLongPress$1;
import com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$GestureDispatcher$onSingleTapConfirmed$1;

public final class LiveLiteGestureServiceImpl$InterceptGestureForwarder extends GestureDetector$SimpleOnGestureListener implements LiveLiteGestureService$c	// class@000988
{
    public l b;
    public l c;
    public l d;
    public l e;
    public final LiveLiteGestureServiceImpl$a f;

    public void LiveLiteGestureServiceImpl$InterceptGestureForwarder(LiveLiteGestureServiceImpl$a p0){
       a.p(p0, "dispatcher");
       super();
       this.f = p0;
       this.b = LiveLiteGestureServiceImpl$InterceptGestureForwarder$longPressFilter$1.INSTANCE;
       this.c = LiveLiteGestureServiceImpl$InterceptGestureForwarder$singleTapFilter$1.INSTANCE;
       this.d = LiveLiteGestureServiceImpl$InterceptGestureForwarder$singleTapConfirmedFilter$1.INSTANCE;
       this.e = LiveLiteGestureServiceImpl$InterceptGestureForwarder$doubleTapFilter$1.INSTANCE;
    }
    public void a(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGestureServiceImpl$InterceptGestureForwarder.class, "7")) {
          return;
       }
       a.p(p0, "handler");
       this.d = p0;
       return;
    }
    public void b(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGestureServiceImpl$InterceptGestureForwarder.class, "6")) {
          return;
       }
       a.p(p0, "handler");
       this.c = p0;
       return;
    }
    public void c(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGestureServiceImpl$InterceptGestureForwarder.class, "5")) {
          return;
       }
       a.p(p0, "handler");
       this.b = p0;
       return;
    }
    public void d(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGestureServiceImpl$InterceptGestureForwarder.class, "8")) {
          return;
       }
       a.p(p0, "handler");
       this.e = p0;
       return;
    }
    public boolean onDoubleTap(MotionEvent p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveLiteGestureServiceImpl$InterceptGestureForwarder obj = PatchProxy.applyOneRefs(p0, this, LiveLiteGestureServiceImpl$InterceptGestureForwarder.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       obj = this.f;
       LiveLiteGestureServiceImpl$InterceptGestureForwarder te = this.e;
       Objects.requireNonNull(obj);
       LiveLiteGestureServiceImpl$a uoa = LiveLiteGestureServiceImpl$a.class;
       Object obj1 = PatchProxy.applyTwoRefs(p0, te, obj, uoa, "5");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a.p(p0, "event");
          a.p(te, "filter");
          if (!te.invoke(p0).booleanValue()) {
             obj.a(new LiveLiteGestureServiceImpl$GestureDispatcher$onDoubleTap$1(p0));
             if (!PatchProxy.applyVoid(null, obj, uoa, "9")) {
                obj.b = true;
                f.g(obj);
                f.k("Gesture.refreshContinuityLikeMode", new a(obj), obj, 1000);
             }
          }
          b = true;
       }
       return b;
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGestureServiceImpl$InterceptGestureForwarder.class, "4")) {
          return;
       }
       a.p(p0, "e");
       LiveLiteGestureServiceImpl$InterceptGestureForwarder tf = this.f;
       LiveLiteGestureServiceImpl$InterceptGestureForwarder tb = this.b;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoidTwoRefs(p0, tb, tf, LiveLiteGestureServiceImpl$a.class, "6")) {
          a.p(p0, "event");
          a.p(tb, "filter");
          if (!tb.invoke(p0).booleanValue()) {
             tf.a(new LiveLiteGestureServiceImpl$GestureDispatcher$onLongPress$1(p0));
          }
       }
       return;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveLiteGestureServiceImpl$InterceptGestureForwarder obj = PatchProxy.applyOneRefs(p0, this, LiveLiteGestureServiceImpl$InterceptGestureForwarder.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       obj = this.f;
       LiveLiteGestureServiceImpl$InterceptGestureForwarder td = this.d;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyTwoRefs(p0, td, obj, LiveLiteGestureServiceImpl$a.class, "4");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a.p(p0, "event");
          a.p(td, "filter");
          if (obj.b == null && !td.invoke(p0).booleanValue()) {
             obj.a(new LiveLiteGestureServiceImpl$GestureDispatcher$onSingleTapConfirmed$1(p0));
          }
          b = true;
       }
       return b;
    }
    public boolean onSingleTapUp(MotionEvent p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveLiteGestureServiceImpl$InterceptGestureForwarder obj = PatchProxy.applyOneRefs(p0, this, LiveLiteGestureServiceImpl$InterceptGestureForwarder.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       obj = this.f;
       LiveLiteGestureServiceImpl$InterceptGestureForwarder tc = this.c;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyTwoRefs(p0, tc, obj, LiveLiteGestureServiceImpl$a.class, "3");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a.p(p0, "event");
          a.p(tc, "filter");
          b = (obj.b != null)? false: tc.invoke(p0).booleanValue();
       }
       return b;
    }
}
