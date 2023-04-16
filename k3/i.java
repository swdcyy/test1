package k3.i;
import k3.i$b$c;
import k3.i$a;
import k3.i$b$b;
import xk.d;
import androidx.lifecycle.LiveData;

public interface abstract i	// class@00247b
{
    public static final i$b$c a;
    public static final i$b$b b;

    static {
       i.a = new i$b$c(null);
       i.b = new i$b$b(null);
    }
    d getResult();
    LiveData getState();
}
