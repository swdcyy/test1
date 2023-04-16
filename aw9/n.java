package aw9.n;
import erd.g;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.view.MotionEvent;
import java.lang.Object;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;

public final class n implements g	// class@0002d2
{
    public final DecorationContainerView b;
    public final MotionEvent c;

    public void n(DecorationContainerView p0,MotionEvent p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       p0.k(this.b.k, this.c);
    }
}
