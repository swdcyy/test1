package com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$subscribeTouchEvent$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService$a;
import java.lang.Object;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService$c;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$subscribeTouchEvent$3$1;
import com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$subscribeTouchEvent$3$2;
import com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$subscribeTouchEvent$3$3;
import com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$subscribeTouchEvent$3$4;

public final class LiveLiteGestureServiceImpl$subscribeTouchEvent$3 extends Lambda implements l	// class@000991
{
    public final LiveLiteGestureService$a $listener;

    public void LiveLiteGestureServiceImpl$subscribeTouchEvent$3(LiveLiteGestureService$a p0){
       this.$listener = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveLiteGestureService$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGestureServiceImpl$subscribeTouchEvent$3.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.b(new LiveLiteGestureServiceImpl$subscribeTouchEvent$3$1(this));
       p0.a(new LiveLiteGestureServiceImpl$subscribeTouchEvent$3$2(this));
       p0.d(new LiveLiteGestureServiceImpl$subscribeTouchEvent$3$3(this));
       p0.c(new LiveLiteGestureServiceImpl$subscribeTouchEvent$3$4(this));
       return;
    }
}
