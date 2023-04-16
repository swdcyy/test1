package com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$b;
import android.view.View$OnTouchListener;
import android.view.GestureDetector;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class LiveLiteGestureServiceImpl$b implements View$OnTouchListener	// class@00098b
{
    public final GestureDetector b;
    public final boolean c;

    public void LiveLiteGestureServiceImpl$b(GestureDetector p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, LiveLiteGestureServiceImpl$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       this.b.onTouchEvent(p1);
       return this.c;
    }
}
