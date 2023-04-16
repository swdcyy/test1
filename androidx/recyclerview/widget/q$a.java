package androidx.recyclerview.widget.q$a;
import androidx.recyclerview.widget.RecyclerView$i;
import androidx.recyclerview.widget.q;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.q$b;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy;
import z1.h;

public class q$a extends RecyclerView$i	// class@00092d
{
    public final q a;

    public void q$a(q p0){
       this.a = p0;
       super();
    }
    public void g(){
       q$a ta = this.a;
       ta.e = ta.c.getItemCount();
       ta = this.a;
       ta.d.g(ta);
    }
    public void h(int p0,int p1){
       q$a ta = this.a;
       ta.d.c(ta, p0, p1, null);
    }
    public void i(int p0,int p1,Object p2){
       q$a ta = this.a;
       ta.d.c(ta, p0, p1, p2);
    }
    public void j(int p0,int p1){
       q$a ta = this.a;
       ta.e = ta.e + p1;
       ta.d.f(ta, p0, p1);
       q$a ta1 = this.a;
       if (ta1.e > null && ta1.c.g0() == RecyclerView$Adapter$StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
          ta1 = this.a;
          ta1.d.b(ta1);
       }
       return;
    }
    public void k(int p0,int p1,int p2){
       int i = 1;
       if (p2 == i) {
       }else {
          i = false;
       }
       h.b(i, "moving more than 1 item is not supported in RecyclerView");
       q$a ta = this.a;
       ta.d.a(ta, p0, p1);
       return;
    }
    public void l(int p0,int p1){
       q$a ta = this.a;
       ta.e = ta.e - p1;
       ta.d.e(ta, p0, p1);
       q$a ta1 = this.a;
       if (ta1.e < 1 && ta1.c.g0() == RecyclerView$Adapter$StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
          ta1 = this.a;
          ta1.d.b(ta1);
       }
       return;
    }
    public void m(){
       q$a ta = this.a;
       ta.d.b(ta);
    }
}
