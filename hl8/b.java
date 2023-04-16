package hl8.b;
import hl8.a;
import fl8.c;
import el8.d;
import java.lang.String;
import java.lang.Object;
import dl8.a;

public final class b extends a	// class@0025a2
{
    public final c a;
    public String b;

    public void b(c p0){
       super();
       this.a = p0;
    }
    public void c(d p0,boolean p1){
       b tb = this.b;
       if (tb == null || (!tb.equals(this.a.g()) && p1)) {
          if (p0.a().a()) {
             return;
          }else {
             this.a.remove(this.b);
          }
       }
       return;
    }
    public void d(d p0){
       this.b = this.a.g();
    }
}
