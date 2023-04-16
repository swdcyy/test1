package ey2.e;
import java.lang.Runnable;
import ey2.d$b;
import java.lang.Object;
import ey2.d;
import android.animation.ObjectAnimator;

public final class e implements Runnable	// class@002816
{
    public final d$b b;

    public void e(d$b p0){
       this.b = p0;
    }
    public final void run(){
       d p = this.b.a.p;
       if (p != null) {
          p.start();
       }
       return;
    }
}
