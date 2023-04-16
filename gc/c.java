package gc.c;
import gc.a;
import java.lang.Object;
import gc.b;
import ec.a;
import dc.a;
import dc.d;
import cb.a;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;

public class c implements a	// class@002098
{
    public final int a;
    public static final Class b;

    static {
       c.b = c.class;
    }
    public void c(){
       super(3);
    }
    public void c(int p0){
       super();
       this.a = p0;
    }
    public void a(b p0,a p1,a p2,int p3){
       int i = 1;
       while (true) {
          if (i > this.a) {
             return;
          }
          int i1 = p3 + i;
          i1 = i1 % p2.getFrameCount();
          if (a.l(2)) {
             a.o(c.b, "Preparing frame %d, last drawn: %d", Integer.valueOf(i1), Integer.valueOf(p3));
          }
          if (!p0.prepareFrame(p1, p2, i1)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return;
    }
}
