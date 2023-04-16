package yc.f;
import yc.d;
import yc.f$b;
import yc.f$a;
import yc.f$c;
import java.lang.Object;
import ab.e;
import java.util.List;
import java.lang.Integer;
import bd.h;
import bd.g;

public class f implements d	// class@002888
{
    public final f$c a;

    public void f(){
       super(new f$b(null));
    }
    public void f(f$c p0){
       super();
       e.d(p0);
       this.a = p0;
    }
    public int a(int p0){
       List list = this.a.a();
       if (list == null || list.isEmpty()) {
          p0++;
          return p0;
       }else {
          int i = 0;
          while (true) {
             if (i >= list.size()) {
                return Integer.MAX_VALUE;
             }
             if (list.get(i).intValue() > p0) {
                break ;
             }else {
                i = i + 1;
             }
          }
          return list.get(i).intValue();
       }
    }
    public h b(int p0){
       boolean b = (p0 >= this.a.b())? true: false;
       return g.c(p0, b, false);
    }
}
