package com.tachikoma.core.component.TKBaseView$8;
import java.util.HashMap;
import com.tachikoma.core.component.e;
import android.view.MotionEvent;
import iq8.n;
import java.lang.Integer;
import java.lang.Object;

public class TKBaseView$8 extends HashMap	// class@000d55
{
    public final e this$0;
    public final MotionEvent val$event;

    public void TKBaseView$8(e p0,MotionEvent p1){
       this.this$0 = p0;
       this.val$event = p1;
       super();
       this.put("x", Integer.valueOf(n.e(p1.getX())));
       this.put("y", Integer.valueOf(n.e(p1.getY())));
       this.put("rawX", Integer.valueOf(n.e(p1.getRawX())));
       this.put("rawY", Integer.valueOf(n.e(p1.getRawY())));
    }
}
