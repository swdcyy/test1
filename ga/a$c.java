package ga.a$c;
import java.lang.Runnable;
import ga.a;
import java.lang.Object;
import ca.b;
import android.view.View;
import android.view.ViewGroup;
import ea.c;

public class a$c implements Runnable	// class@002052
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       a$c tb = this.b;
       tb.f.O.removeView(tb.d);
       tb = this.b;
       tb.k = false;
       tb.h = false;
       a g = tb.g;
       if (g != null) {
          g.a(tb);
       }
       return;
    }
}
