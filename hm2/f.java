package hm2.f;
import java.lang.Runnable;
import com.kuaishou.live.core.show.wealthgrade.b$b;
import java.lang.Object;
import com.kuaishou.live.core.show.wealthgrade.b;
import android.animation.ObjectAnimator;

public final class f implements Runnable	// class@002dd2
{
    public final b$b b;

    public void f(b$b p0){
       this.b = p0;
    }
    public final void run(){
       b s = this.b.a.s;
       if (s != null) {
          s.start();
       }
       return;
    }
}
