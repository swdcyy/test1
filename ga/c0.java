package ga.c0;
import ka.b;
import ga.d0;
import java.util.List;
import java.lang.Object;
import com.contrarywind.view.WheelView;
import ea.b;

public class c0 implements b	// class@002059
{
    public final List b;
    public final List c;
    public final d0 d;

    public void c0(d0 p0,List p1,List p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void b(int p0){
       int i1;
       int i = p0 + 1;
       c0 td = this.d;
       d0 j = td.j;
       d0 k = td.k;
       if (j == k) {
          j = td.l;
          i1 = (i + j) - 1;
          k = td.m;
          if (j == k) {
             td.m(td.p, i1, td.n, td.o, this.b, this.c);
          }else if(j == i1){
             td.m(td.p, i1, td.n, 31, this.b, this.c);
          }else if(k == i1){
             td.m(td.p, i1, 1, td.o, this.b, this.c);
          }else {
             td.m(td.p, i1, 1, 31, this.b, this.c);
          }
       }else {
          d0 p = td.p;
          if (p == j) {
             j = td.l;
             i1 = (i + j) - 1;
             if (i1 == j) {
                td.m(p, i1, td.n, 31, this.b, this.c);
             }else {
                td.m(p, i1, 1, 31, this.b, this.c);
             }
          }else if(p == k){
             if (i == td.m) {
                td.m(p, (td.c.getCurrentItem() + 1), 1, this.d.o, this.b, this.c);
             }else {
                td.m(p, (td.c.getCurrentItem() + 1), 1, 31, this.b, this.c);
             }
          }else {
             td.m(p, i, 1, 31, this.b, this.c);
          }
       }
       j = this.d.B;
       if (j != null) {
          j.a();
       }
       return;
    }
}
