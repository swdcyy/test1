package ce9.x;
import java.util.concurrent.Callable;
import java.lang.Object;
import q5b.h;

public final class x implements Callable	// class@0005d4
{
    public final byte[] b;

    public void x(byte[] p0){
       this.b = p0;
    }
    public final Object call(){
       return h.a(this.b);
    }
}
