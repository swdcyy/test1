package ltd.x;
import java.lang.Object;
import ltd.d;
import java.lang.String;
import java.lang.StringBuilder;
import ftd.o0;

public abstract class x	// class@001e1d
{

    public void x(){
       super();
    }
    public abstract d a();
    public final boolean b(x p0){
       d uod = this.a();
       boolean b = false;
       if (uod != null) {
          d uod1 = p0.a();
          if (uod1 != null && uod.f() - uod1.f() < 0) {
             b = true;
          }
       }
       return b;
    }
    public abstract Object c(Object p0);
    public String toString(){
       return o0.a(this)+'@'+o0.b(this);
    }
}
