package ga.u0;
import ka.b;
import ga.v0;
import java.util.List;
import java.lang.Object;
import com.contrarywind.view.WheelView;
import ea.b;

public class u0 implements b	// class@002088
{
    public final List b;
    public final List c;
    public final v0 d;

    public void u0(v0 p0,List p1,List p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void b(int p0){
       int i1;
       int i = p0 + 1;
       u0 td = this.d;
       v0 j = td.j;
       v0 k = td.k;
       if (j == k) {
          j = td.l;
          i1 = (i + j) - 1;
          k = td.m;
          if (j == k) {
             td.d(td.p, i1, td.n, td.o, this.b, this.c);
          }else if(j == i1){
             td.d(td.p, i1, td.n, 31, this.b, this.c);
          }else if(k == i1){
             td.d(td.p, i1, 1, td.o, this.b, this.c);
          }else {
             td.d(td.p, i1, 1, 31, this.b, this.c);
          }
       }else {
          v0 p = td.p;
          if (p == j) {
             j = td.l;
             i1 = (i + j) - 1;
             if (i1 == j) {
                td.d(p, i1, td.n, 31, this.b, this.c);
             }else {
                td.d(p, i1, 1, 31, this.b, this.c);
             }
          }else if(p == k){
             if (i == td.m) {
                td.d(p, (td.c.getCurrentItem() + 1), 1, this.d.o, this.b, this.c);
             }else {
                td.d(p, (td.c.getCurrentItem() + 1), 1, 31, this.b, this.c);
             }
          }else {
             k = td;
             k.d(p, i, 1, 31, this.b, this.c);
          }
       }
       j = this.d.x;
       if (j != null) {
          j.a();
       }
       return;
    }
}
