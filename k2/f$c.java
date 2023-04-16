package k2.f$c;
import java.lang.Runnable;
import k2.f;
import java.util.ArrayList;
import java.util.Map;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import a2.i0;

public class f$c implements Runnable	// class@002462
{
    public final ArrayList b;
    public final Map c;
    public final f d;

    public void f$c(f p0,ArrayList p1,Map p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       int i = this.b.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          View view = this.b.get(i1);
          i0.N0(view, this.c.get(i0.L(view)));
       }
       return;
    }
}
