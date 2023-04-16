package ed.j;
import android.util.SparseIntArray;
import ed.w;
import java.lang.Runtime;
import java.lang.Math;

public class j	// class@001531
{
    public static final SparseIntArray a;

    static {
       j.a = new SparseIntArray(0);
    }
    public static w a(){
       int i = (int)Math.min(Runtime.getRuntime().maxMemory(), 0x7fffffff);
       i = (i > 0x1000000)? (i / 4) * 3: i / 2;
       return new w(0, i, j.a);
    }
}
