package ekd.z0$b;
import java.lang.ThreadLocal;
import ekd.z0;
import java.lang.Object;
import java.lang.StringBuilder;

public class z0$b extends ThreadLocal	// class@001573
{
    public final z0 a;

    public void z0$b(z0 p0){
       this.a = p0;
       super();
    }
    public Object initialValue(){
       return new StringBuilder(this.a.b);
    }
}
