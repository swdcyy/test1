package al9.h;
import erd.o;
import java.lang.Object;
import java.lang.Long;
import al9.j;
import android.os.SystemClock;

public final class h implements o	// class@0000ef
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final Object apply(Object p0){
       return Long.valueOf((SystemClock.elapsedRealtime() - p0.longValue()));
    }
}
