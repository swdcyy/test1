package ki0.c$a;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.SystemClock;

public final class c$a	// class@002d3d
{

    public void c$a(){
       super();
    }
    public void c$a(u p0){
       super();
    }
    public final long a(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return SystemClock.uptimeMillis();
    }
}
