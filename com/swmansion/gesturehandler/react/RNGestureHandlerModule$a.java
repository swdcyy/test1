package com.swmansion.gesturehandler.react.RNGestureHandlerModule$a;
import fn8.i;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import java.lang.Object;
import fn8.b;
import android.view.MotionEvent;

public class RNGestureHandlerModule$a implements i	// class@000c83
{
    public final RNGestureHandlerModule a;

    public void RNGestureHandlerModule$a(RNGestureHandlerModule p0){
       this.a = p0;
       super();
    }
    public void a(b p0,int p1,int p2){
       this.a.onStateChange(p0, p1, p2);
    }
    public void onTouchEvent(b p0,MotionEvent p1){
       this.a.onTouchEvent(p0, p1);
    }
}
