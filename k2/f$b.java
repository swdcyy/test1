package k2.f$b;
import java.lang.Runnable;
import k2.f;
import java.util.ArrayList;
import java.util.Map;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import a2.i0;

public class f$b implements Runnable	// class@002461
{
    public final ArrayList b;
    public final Map c;
    public final f d;

    public void f$b(f p0,ArrayList p1,Map p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       int i = this.b.size();
       int i1 = 0;
       while (i1 < i) {
          View view = this.b.get(i1);
          String str = i0.L(view);
          if (str != null) {
             i0.N0(view, f.i(this.c, str));
          }
          i1 = i1 + 1;
       }
       return;
    }
}
