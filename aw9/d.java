package aw9.d;
import erd.g;
import android.view.MotionEvent;
import java.lang.Object;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;

public final class d implements g	// class@0002c8
{
    public final MotionEvent b;
    public final MotionEvent c;
    public final float d;
    public final float e;

    public void d(MotionEvent p0,MotionEvent p1,float p2,float p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       p0.q(this.b, this.c, this.d, this.e);
    }
}
