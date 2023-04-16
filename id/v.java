package id.v;
import id.e;
import id.w$a;
import android.util.Pair;
import java.util.List;
import id.d;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArraySet;
import id.w;
import com.facebook.imagepipeline.common.Priority;
import id.i;

public class v extends e	// class@0021cd
{
    public final Pair a;
    public final w$a b;

    public void v(w$a p0,Pair p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       d.a(this.b.j());
    }
    public void b(){
       d.s(this.b.l());
    }
    public void c(){
       w$a f;
       List list1;
       List list2;
       v tb = this.b;
       _monitor_enter(tb);
       boolean b = this.b.b.remove(this.a);
       List list = null;
       if (b) {
          if (this.b.b.isEmpty()) {
             f = this.b.f;
             list1 = list;
          }else {
             list1 = this.b.l();
             list2 = this.b.j();
             f = list;
             list = this.b.k();
          label_0039 :
             _monitor_exit(tb);
             d.r(list);
             d.s(list1);
             d.a(list2);
             if (f != null) {
                if (this.b.h.mKeepCancelledFetchAsLowPriority != null && !f.p()) {
                   d.s(f.u(Priority.LOW));
                }else {
                   f.t();
                }
             }
             if (b) {
                this.a.first.b();
             }
             return;
          }
       }else {
          f = list;
          list1 = f;
       }
       list2 = list1;
       goto label_0039 ;
    }
    public void d(){
       d.r(this.b.k());
    }
}
