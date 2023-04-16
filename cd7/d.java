package cd7.d;
import erd.o;
import java.lang.String;
import java.lang.Object;
import java.io.File;
import com.yxcorp.gifshow.util.u0;
import qkd.b;

public final class d implements o	// class@000534
{
    public final String b;

    public void d(String p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       d tb = this.b;
       u0.i(p0, tb);
       b.l0(p0);
       return new File(tb);
    }
}
