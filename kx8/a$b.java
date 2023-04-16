package kx8.a$b;
import java.lang.Object;
import kx8.a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.SystemClock;

public class a$b	// class@002c36
{
    public String a;
    public long b;
    public long c;
    public boolean d;

    public void a$b(){
       super();
    }
    public void a$b(a$a p0){
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.c) {
          return false;
       }
       this.c = SystemClock.elapsedRealtime();
       return true;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b) {
          return false;
       }
       this.b = SystemClock.elapsedRealtime();
       return true;
    }
    public boolean c(String p0){
       if (this.a != null) {
          return false;
       }
       this.a = p0;
       return true;
    }
}
