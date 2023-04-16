package j89.m;
import java.lang.String;
import com.yxcorp.gifshow.apm.e;
import ok.x;
import com.google.common.base.Suppliers;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Long;
import android.system.OsConstants;
import android.system.Os;
import java.lang.StringBuilder;
import android.os.Process;
import ukd.a;
import java.lang.Boolean;
import java.util.Arrays;
import k2b.u1;
import java.lang.Throwable;
import android.util.Log;
import android.os.Build$VERSION;

public class m	// class@0027b6
{
    public static final String[] a;
    public static final long[] b;
    public static final int[] c;
    public static final x d;

    static {
       String[] stringArray = new String[7];
       m.a = stringArray;
       long[] olongArray = new long[7];
       m.b = olongArray;
       m.c = new int[23]{32,4640,32,32,32,32,32,32,32,8224,32,8224,32,8224,8224,32,32,32,32,32,32,8224,8224};
       m.d = Suppliers.a(e.b);
    }
    public void m(){
       super();
    }
    public static long a(){
       Object obj = PatchProxy.apply(null, null, m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return m.d.get().longValue();
    }
    public static Long b(){
       float[] uofloatArray;
       long l = 19;
       long l1 = 0x7fffffff;
       long l2 = 1000 / Os.sysconf(OsConstants._SC_CLK_TCK);
       long[] b = m.b;
       Object[] objArray = new Object[]{"/proc/"+Process.myPid()+"/stat",m.c,m.a,b,uofloatArray};
       uofloatArray = new float[0];
       if (a.b("android.os.Process", "readProcFile", objArray).booleanValue()) {
          l1 = b[5] * l2;
       }else {
          u1.R("get_premain_no_result", "premain jiffy mill "+l2+", procStats "+Arrays.toString(b)+", clk tck "+Os.sysconf(OsConstants._SC_CLK_TCK), l);
       }
       l2 = (Build$VERSION.SDK_INT >= 24)? Process.getStartElapsedRealtime(): l1;
       if (l2 - l1 < 0 || (l2 - l1) - 3000 > 0) {
          l1 = l2 - 150;
       }
       return Long.valueOf(l1);
    }
}
