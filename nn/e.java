package nn.e;
import mn.c;
import java.lang.String;
import java.lang.Object;
import mn.b;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public abstract class e implements c	// class@002a51
{
    public final String a;

    public void e(String p0){
       super();
       this.a = p0;
    }
    public abstract Object a(b p0,Object p1);
    public void b(b p0,Object p1){
       throw new IllegalArgumentException("set not supported on "+this.a);
    }
    public String toString(){
       return this.a;
    }
}
