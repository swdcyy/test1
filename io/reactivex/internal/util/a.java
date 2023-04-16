package io.reactivex.internal.util.a;
import java.lang.Object;
import io.reactivex.internal.util.a$a;

public class a	// class@0014d3
{
    public final int a;
    public final Object[] b;
    public Object[] c;
    public int d;

    public void a(int p0){
       super();
       this.a = p0;
       p0++;
       Object[] objArray = new Object[p0];
       this.b = objArray;
       this.c = objArray;
    }
    public void a(Object p0){
       a ta = this.a;
       a td = this.d;
       if (td == ta) {
          Object[] objArray = new Object[(ta + 1)];
          this.c[ta] = objArray;
          this.c = objArray;
          td = 0;
       }
       this.c[td] = p0;
       this.d = td + 1;
       return;
    }
    public void b(a$a p0){
       a tb = this.b;
       a ta = this.a;
       while (true) {
          if (tb != null) {
             int i = 0;
             while (true) {
                if (i < ta) {
                   object oobject = tb[i];
                   if (oobject == null) {
                   label_0018 :
                      tb = tb[ta];
                   }else if(p0.test(oobject)){
                   }else {
                      i = i + 1;
                   }
                }else {
                   goto label_0018 ;
                }
             }
             return;
          }else {
             goto label_001d ;
          }
       }
       return;
    }
    public void c(Object p0){
       this.b[0] = p0;
    }
}
