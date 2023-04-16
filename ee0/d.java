package ee0.d;
import erd.o;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.util.u0;
import qkd.b;

public final class d implements o	// class@0020f3
{
    public final File b;

    public void d(File p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       d tb = this.b;
       u0.i(p0, tb.getAbsolutePath());
       b.l0(p0);
       return tb;
    }
}
