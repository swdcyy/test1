package kx0.e;
import erd.o;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import android.util.Pair;
import com.yxcorp.image.request.a;
import s0d.e;

public final class e implements o	// class@002e14
{
    public final String[] b;

    public void e(String[] p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       return new Pair(p0, a.u(this.b[p0.intValue()]).q());
    }
}
