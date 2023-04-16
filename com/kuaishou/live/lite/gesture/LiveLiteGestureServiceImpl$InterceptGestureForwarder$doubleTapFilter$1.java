package com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$InterceptGestureForwarder$doubleTapFilter$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LiveLiteGestureServiceImpl$InterceptGestureForwarder$doubleTapFilter$1 extends Lambda implements l	// class@000984
{
    public static final LiveLiteGestureServiceImpl$InterceptGestureForwarder$doubleTapFilter$1 INSTANCE;

    static {
       LiveLiteGestureServiceImpl$InterceptGestureForwarder$doubleTapFilter$1.INSTANCE = new LiveLiteGestureServiceImpl$InterceptGestureForwarder$doubleTapFilter$1();
    }
    public void LiveLiteGestureServiceImpl$InterceptGestureForwarder$doubleTapFilter$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteGestureServiceImpl$InterceptGestureForwarder$doubleTapFilter$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       return false;
    }
}
