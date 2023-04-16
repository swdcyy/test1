package ga.l$c;
import java.lang.Runnable;
import ga.l;
import java.lang.Object;
import ca.a;
import android.view.View;
import android.view.ViewGroup;
import ea.c;

public class l$c implements Runnable	// class@002071
{
    public final l b;

    public void l$c(l p0){
       this.b = p0;
       super();
    }
    public void run(){
       l$c tb = this.b;
       tb.f.Q.removeView(tb.d);
       tb = this.b;
       tb.l = false;
       tb.i = false;
       l g = tb.g;
       if (g != null) {
          g.a(tb);
       }
       return;
    }
}
