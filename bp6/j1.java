package bp6.j1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.internal.v;
import java.lang.String;
import java.lang.Object;
import com.kwai.imsdk.internal.client.i;
import java.lang.Boolean;

public final class j1 implements Callable	// class@00052c
{
    public final v b;
    public final String c;
    public final int d;
    public final boolean e;

    public void j1(v p0,String p1,int p2,boolean p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object call(){
       i.t(this.b.a).i(this.c, this.d, this.e);
       return Boolean.TRUE;
    }
}
