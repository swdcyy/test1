package j89.j$a;
import java.lang.Object;
import j89.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.SystemClock;

public class j$a	// class@0019c7
{
    public long a;
    public long b;

    public void j$a(){
       super();
    }
    public void j$a(i p0){
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, j$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b) {
          return false;
       }
       this.b = SystemClock.elapsedRealtime();
       return true;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, j$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.a) {
          return false;
       }
       this.a = SystemClock.elapsedRealtime();
       return true;
    }
}
