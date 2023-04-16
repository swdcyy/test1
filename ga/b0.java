package ga.b0;
import ka.b;
import ga.d0;
import java.util.List;
import java.lang.Object;
import com.contrarywind.view.WheelView;
import aa.b;
import ia.a;
import ea.b;

public class b0 implements b	// class@002057
{
    public final List b;
    public final List c;
    public final d0 d;

    public void b0(d0 p0,List p1,List p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void b(int p0){
       b0 td1;
       d0 l;
       d0 m;
       b0 td = this.d;
       int i = p0 + td.j;
       td.p = i;
       p0 = td.c.getCurrentItem();
       td = this.d;
       d0 j = td.j;
       d0 k = td.k;
       int i1 = 1;
       if (j == k) {
          td.c.setAdapter(new b(td.l, td.m));
          if (p0 > (this.d.c.getAdapter().getItemsCount() - i1)) {
             p0 = this.d.c.getAdapter().getItemsCount() - i1;
             this.d.c.setCurrentItem(p0);
          }
          td1 = this.d;
          l = td1.l;
          i1 = p0 + l;
          m = td1.m;
          if (l == m) {
             td1.m(i, i1, td1.n, td1.o, this.b, this.c);
          }else if(i1 == l){
             td1.m(i, i1, td1.n, 31, this.b, this.c);
          }else if(i1 == m){
             td1.m(i, i1, 1, td1.o, this.b, this.c);
          }else {
             td1.m(i, i1, 1, 31, this.b, this.c);
          }
       }else {
          int i2 = 12;
          if (i == j) {
             td.c.setAdapter(new b(td.l, i2));
             if (p0 > (this.d.c.getAdapter().getItemsCount() - i1)) {
                p0 = this.d.c.getAdapter().getItemsCount() - i1;
                this.d.c.setCurrentItem(p0);
             }
             td1 = this.d;
             l = td1.l;
             i1 = p0 + l;
             if (i1 == l) {
                td1.m(i, i1, td1.n, 31, this.b, this.c);
             }else {
                td1.m(i, i1, 1, 31, this.b, this.c);
             }
          }else if(i == k){
             td.c.setAdapter(new b(i1, td.m));
             if (p0 > (this.d.c.getAdapter().getItemsCount() - i1)) {
                p0 = this.d.c.getAdapter().getItemsCount() - i1;
                this.d.c.setCurrentItem(p0);
             }
             i1 = i1 + p0;
             td1 = this.d;
             if (i1 == td1.m) {
                td1.m(i, i1, 1, td1.o, this.b, this.c);
             }else {
                td1.m(i, i1, 1, 31, this.b, this.c);
             }
          }else {
             td.c.setAdapter(new b(i1, i2));
             td1 = this.d;
             td1.m(i, (i1 + td1.c.getCurrentItem()), 1, 31, this.b, this.c);
          }
       }
       m = this.d.B;
       if (m != null) {
          m.a();
       }
       return;
    }
}
