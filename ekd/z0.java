package ekd.z0;
import ekd.z0$a;
import java.lang.Object;
import ekd.z0$b;
import java.lang.StringBuilder;
import java.lang.ThreadLocal;

public class z0	// class@001574
{
    public ThreadLocal a;
    public int b;
    public static ThreadLocal c;

    static {
       z0.c = new z0$a();
    }
    public void z0(){
       super(512);
    }
    public void z0(int p0){
       super();
       this.a = new z0$b(this);
       this.b = p0;
    }
    public static StringBuilder b(){
       StringBuilder str = z0.c.get();
       str.setLength(0);
       return str;
    }
    public StringBuilder a(){
       StringBuilder str = this.a.get();
       str.setLength(0);
       return str;
    }
}
