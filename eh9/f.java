package eh9.f;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.tab.c;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import pi9.n;

public final class f implements Runnable	// class@00214d
{
    public final c b;
    public final boolean c;

    public void f(c p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       f tb = this.b;
       n.a(tb.h, this.c, tb.p, null);
    }
}
