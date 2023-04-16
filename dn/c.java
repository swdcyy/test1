package dn.c;
import dn.b;
import java.lang.Object;
import dn.a;
import brd.y;
import brd.t;

public final class c extends b	// class@0014d3
{
    public final b b;
    public boolean c;
    public a d;

    public void c(b p0){
       super();
       this.b = p0;
    }
    public void accept(Object p0){
       c td;
       _monitor_enter(this);
       int i = 0;
       int i1 = 1;
       if (this.c != null) {
          td = this.d;
          if (td == null) {
             td = new a(4);
             this.d = td;
          }
          a a = td.a;
          a d = td.d;
          if (d == a) {
             Object[] objArray = new Object[(a + 1)];
             td.c[a] = objArray;
             td.c = objArray;
          }else {
             i = d;
          }
          td.c[i] = p0;
          td.d = i + i1;
          _monitor_exit(this);
          return;
       }else {
          this.c = i1;
          _monitor_exit(this);
          this.b.accept(p0);
          _monitor_enter(this);
          p0 = this.d;
          while (p0 != null) {
             this.d = null;
             _monitor_exit(this);
             td = this.b;
             a b = p0.b;
             p0 = p0.a;
             while (b != null) {
                for (int i2 = 0; i2 < p0; i2 = i2 + 1) {
                   object oobject = b[i2];
                   if (oobject == null) {
                      break ;
                   }else {
                      td.accept(oobject);
                   }
                }
                b = b[p0];
             }
          }
          this.c = i;
          _monitor_exit(this);
          return;
       }
    }
    public boolean b(){
       return this.b.b();
    }
    public void subscribeActual(y p0){
       this.b.subscribe(p0);
    }
}
