package com.tachikoma.core.component.TKBaseView$7$1;
import java.util.HashMap;
import com.tachikoma.core.component.e$d;
import android.view.MotionEvent;
import iq8.n;
import java.lang.Integer;
import java.lang.Object;

public class TKBaseView$7$1 extends HashMap	// class@000d50
{
    public final e$d this$1;
    public final MotionEvent val$e;

    public void TKBaseView$7$1(e$d p0,MotionEvent p1){
       this.this$1 = p0;
       this.val$e = p1;
       super();
       this.put("x", Integer.valueOf(n.e(p1.getX())));
       this.put("y", Integer.valueOf(n.e(p1.getY())));
       this.put("rawX", Integer.valueOf(n.e(p1.getRawX())));
       this.put("rawY", Integer.valueOf(n.e(p1.getRawY())));
    }
}
