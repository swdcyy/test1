package ga.t0;
import ka.b;
import ga.v0;
import java.util.List;
import java.lang.Object;
import com.contrarywind.view.WheelView;
import aa.b;
import ia.a;
import ea.b;

public class t0 implements b	// class@002086
{
    public final List b;
    public final List c;
    public final v0 d;

    public void t0(v0 p0,List p1,List p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void b(int p0){
       int i2;
       t0 td1;
       v0 l;
       v0 m;
       t0 td = this.d;
       int i = p0 + td.j;
       td.p = i;
       p0 = td.c.getCurrentItem();
       td = this.d;
       v0 j = td.j;
       v0 k = td.k;
       int i1 = 1;
       if (j == k) {
          td.c.setAdapter(new b(td.l, td.m));
          i2 = this.d.c.getAdapter().getItemsCount() - i1;
          if (p0 > i2) {
             p0 = this.d.c.getAdapter().getItemsCount() - i1;
             i2 = this.d.c;
             i2.setCurrentItem(p0);
          }
          td1 = this.d;
          l = td1.l;
          i1 = p0 + l;
          m = td1.m;
          if (l == m) {
             td1.d(i, i1, td1.n, td1.o, this.b, this.c);
          }else if(i1 == l){
             td1.d(i, i1, td1.n, 31, this.b, this.c);
          }else if(i1 == m){
             td1.d(i, i1, 1, td1.o, this.b, this.c);
          }else {
             td1.d(i, i1, 1, 31, this.b, this.c);
          }
       }else {
          int i3 = 12;
          if (i == j) {
             td.c.setAdapter(new b(td.l, i3));
             i2 = this.d.c.getAdapter().getItemsCount() - i1;
             if (p0 > i2) {
                p0 = this.d.c.getAdapter().getItemsCount() - i1;
                l = this.d.c;
                l.setCurrentItem(p0);
             }
             td1 = this.d;
             l = td1.l;
             i1 = p0 + l;
             if (i1 == l) {
                td1.d(i, i1, td1.n, 31, this.b, this.c);
             }else {
                td1.d(i, i1, 1, 31, this.b, this.c);
             }
          }else if(i == k){
             td.c.setAdapter(new b(i1, td.m));
             l = this.d.c.getAdapter().getItemsCount() - i1;
             if (p0 > l) {
                p0 = this.d.c.getAdapter().getItemsCount() - i1;
                l = this.d.c;
                l.setCurrentItem(p0);
             }
             i1 = i1 + p0;
             td1 = this.d;
             if (i1 == td1.m) {
                td1.d(i, i1, 1, td1.o, this.b, this.c);
             }else {
                td1.d(i, i1, 1, 31, this.b, this.c);
             }
          }else {
             l = new b(i1, i3);
             td.c.setAdapter(l);
             td1 = this.d;
             td1.d(i, (i1 + td1.c.getCurrentItem()), 1, 31, this.b, this.c);
          }
       }
       m = this.d.x;
       if (m != null) {
          m.a();
       }
       return;
    }
}
