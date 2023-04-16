package com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$a;
import android.view.GestureDetector;
import com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$InterceptGestureForwarder;
import android.view.GestureDetector$OnGestureListener;
import android.view.View;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService$a;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$subscribeTouchEvent$3;
import msd.l;
import com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$b;
import android.view.View$OnTouchListener;
import ud3.g;
import com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$subscribeTouchEvent$2;
import msd.a;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService$b;
import java.util.Objects;
import wa1.i;

public final class LiveLiteGestureServiceImpl implements LiveLiteGestureService	// class@000992
{
    public final LiveLiteGestureServiceImpl$a a;
    public final GestureDetector b;
    public final Context c;

    public void LiveLiteGestureServiceImpl(Context p0){
       a.p(p0, "context");
       super();
       this.c = p0;
       LiveLiteGestureServiceImpl$a uoa = new LiveLiteGestureServiceImpl$a();
       this.a = uoa;
       this.b = new GestureDetector(p0, new LiveLiteGestureServiceImpl$InterceptGestureForwarder(uoa));
    }
    public b a(View p0,boolean p1,LiveLiteGestureService$a p2){
       if (PatchProxy.isSupport(LiveLiteGestureServiceImpl.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, LiveLiteGestureServiceImpl.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "view");
       a.p(p2, "listener");
       return this.b(p0, p1, new LiveLiteGestureServiceImpl$subscribeTouchEvent$3(p2));
    }
    public b b(View p0,boolean p1,l p2){
       LiveLiteGestureServiceImpl$InterceptGestureForwarder obj;
       if (PatchProxy.isSupport(LiveLiteGestureServiceImpl.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, LiveLiteGestureServiceImpl.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "view");
       a.p(p2, "block");
       obj = new LiveLiteGestureServiceImpl$InterceptGestureForwarder(this.a);
       p2.invoke(obj);
       GestureDetector gestureDetec = new GestureDetector(this.c, obj);
       p0.setOnTouchListener(new LiveLiteGestureServiceImpl$b(gestureDetec, p1));
       return new g(new LiveLiteGestureServiceImpl$subscribeTouchEvent$2(p0));
    }
    public void c(LiveLiteGestureService$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGestureServiceImpl.class, "4")) {
          return;
       }
       String str = "listener";
       a.p(p0, str);
       LiveLiteGestureServiceImpl ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, LiveLiteGestureServiceImpl$a.class, "2")) {
          a.p(p0, str);
          ta.a.remove(p0);
       }
       return;
    }
    public void d(LiveLiteGestureService$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGestureServiceImpl.class, "3")) {
          return;
       }
       String str = "listener";
       a.p(p0, str);
       LiveLiteGestureServiceImpl ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, LiveLiteGestureServiceImpl$a.class, "1")) {
          a.p(p0, str);
          ta.a.add(p0);
       }
       return;
    }
}
