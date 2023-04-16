package androidx.fragment.app.f$b;
import java.lang.Runnable;
import java.lang.Object;
import k2.f;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import androidx.fragment.app.f;
import java.util.Collection;

public final class f$b implements Runnable	// class@0007ab
{
    public final Object b;
    public final f c;
    public final View d;
    public final Fragment e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final Object i;

    public void f$b(Object p0,f p1,View p2,Fragment p3,ArrayList p4,ArrayList p5,ArrayList p6,Object p7){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       super();
    }
    public void run(){
       f$b tb = this.b;
       if (tb != null) {
          this.c.p(tb, this.d);
          this.g.addAll(f.k(this.c, this.b, this.e, this.f, this.d));
       }
       if (this.h != null) {
          if (this.i != null) {
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(this.d);
             this.c.q(this.i, this.h, uArrayList);
          }
          this.h.clear();
          this.h.add(this.d);
       }
       return;
    }
}
