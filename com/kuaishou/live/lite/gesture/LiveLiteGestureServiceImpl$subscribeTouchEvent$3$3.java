package com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$subscribeTouchEvent$3$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$subscribeTouchEvent$3;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService$a;

public final class LiveLiteGestureServiceImpl$subscribeTouchEvent$3$3 extends Lambda implements l	// class@00098f
{
    public final LiveLiteGestureServiceImpl$subscribeTouchEvent$3 this$0;

    public void LiveLiteGestureServiceImpl$subscribeTouchEvent$3$3(LiveLiteGestureServiceImpl$subscribeTouchEvent$3 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteGestureServiceImpl$subscribeTouchEvent$3$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       return this.this$0.$listener.onDoubleTap(p0);
    }
}
