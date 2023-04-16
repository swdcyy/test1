package g72.i;
import java.lang.Runnable;
import g72.j$a;
import java.lang.Object;
import g72.j;
import android.animation.ObjectAnimator;

public final class i implements Runnable	// class@002a86
{
    public final j$a b;

    public void i(j$a p0){
       this.b = p0;
    }
    public final void run(){
       j v = this.b.a.v;
       if (v != null) {
          v.start();
       }
       return;
    }
}
