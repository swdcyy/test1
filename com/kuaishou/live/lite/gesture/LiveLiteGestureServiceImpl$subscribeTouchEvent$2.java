package com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$subscribeTouchEvent$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.view.View;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View$OnTouchListener;

public final class LiveLiteGestureServiceImpl$subscribeTouchEvent$2 extends Lambda implements a	// class@00098c
{
    public final View $view;

    public void LiveLiteGestureServiceImpl$subscribeTouchEvent$2(View p0){
       this.$view = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGestureServiceImpl$subscribeTouchEvent$2.class, "1")) {
          return;
       }
       this.$view.setOnTouchListener(null);
       return;
    }
}
