package oo1.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.SystemClock;
import java.lang.Math;

public class a	// class@00354d
{
    public String a;
    public long b;
    public long c;

    public void a(){
       super();
       this.b = -1;
       this.c = -1;
    }
    public String a(){
       return this.a;
    }
    public long b(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return Math.max((SystemClock.elapsedRealtime() - this.b), 0);
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.a = p0;
       this.b = SystemClock.elapsedRealtime();
       return;
    }
}
