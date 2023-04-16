package kd9.j;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView$a;
import com.yxcorp.gifshow.camera.record.frame.c;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import java.lang.Object;
import java.util.Objects;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import kd9.q;
import android.view.ViewTreeObserver$OnPreDrawListener;

public final class j implements AnimCameraView$a	// class@002c58
{
    public final c a;
    public final AnimCameraView b;
    public final int c;

    public void j(c p0,AnimCameraView p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void a(){
       j ta = this.a;
       j tb = this.b;
       Objects.requireNonNull(ta);
       tb.getViewTreeObserver().addOnPreDrawListener(new q(ta, tb, this.c));
    }
}
