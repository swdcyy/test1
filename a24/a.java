package a24.a;
import java.lang.String;
import java.lang.Object;
import com.kwai.sdk.switchconfig.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;

public class a	// class@00001a
{
    public boolean a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public String l;

    public void a(String p0){
       super();
       this.l = p0;
       this.a = a.t().d("enableLiveAnchorLogSwitch", false);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       if (this.b - null <= 0) {
          return;
       }
       this.j = SystemClock.elapsedRealtime() - this.b;
       return;
    }
}
