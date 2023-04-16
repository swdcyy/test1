package b8a.q0;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.l;
import java.lang.Object;
import java.lang.Float;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.widget.ScaleCleanControllerView;

public final class q0 implements g	// class@0003db
{
    public final l b;

    public void q0(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       q0 tb = this.b;
       l p = tb.p;
       if (p != null && !p.getVisibility()) {
          tb.p.setSpeed(p0.floatValue());
       }
       return;
    }
}
