package com.tachikoma.core.component.view.TKView$1;
import java.util.HashMap;
import com.tachikoma.core.component.view.TKView;
import android.view.MotionEvent;
import java.lang.Float;
import java.lang.Object;

public class TKView$1 extends HashMap	// class@000daf
{
    public final TKView this$0;
    public final MotionEvent val$ev;

    public void TKView$1(TKView p0,MotionEvent p1){
       this.this$0 = p0;
       this.val$ev = p1;
       super();
       this.put("x", Float.valueOf(p1.getX()));
       this.put("y", Float.valueOf(p1.getY()));
    }
}
