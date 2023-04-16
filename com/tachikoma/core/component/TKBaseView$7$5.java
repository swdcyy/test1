package com.tachikoma.core.component.TKBaseView$7$5;
import java.util.HashMap;
import com.tachikoma.core.component.e$d;
import android.view.MotionEvent;
import iq8.n;
import java.lang.Integer;
import java.lang.Object;

public class TKBaseView$7$5 extends HashMap	// class@000d54
{
    public final e$d this$1;
    public final MotionEvent val$e1;
    public final MotionEvent val$e2;
    public final float val$velocityX;
    public final float val$velocityY;

    public void TKBaseView$7$5(e$d p0,MotionEvent p1,MotionEvent p2,float p3,float p4){
       this.this$1 = p0;
       this.val$e1 = p1;
       this.val$e2 = p2;
       this.val$velocityX = p3;
       this.val$velocityY = p4;
       super();
       this.put("beginX", Integer.valueOf(n.e(p1.getX())));
       this.put("beginY", Integer.valueOf(n.e(p1.getY())));
       this.put("endX", Integer.valueOf(n.e(p2.getX())));
       this.put("endY", Integer.valueOf(n.e(p2.getY())));
       this.put("velocityX", Integer.valueOf(n.e(p3)));
       this.put("velocityY", Integer.valueOf(n.e(p4)));
    }
}
