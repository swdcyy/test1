package com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$GestureDispatcher$onSingleTapConfirmed$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.view.MotionEvent;
import java.lang.Object;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService$b;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveLiteGestureServiceImpl$GestureDispatcher$onSingleTapConfirmed$1 extends Lambda implements l	// class@000983
{
    public final MotionEvent $event;

    public void LiveLiteGestureServiceImpl$GestureDispatcher$onSingleTapConfirmed$1(MotionEvent p0){
       this.$event = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveLiteGestureService$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGestureServiceImpl$GestureDispatcher$onSingleTapConfirmed$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.a(this.$event);
       return;
    }
}
