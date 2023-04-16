package j89.g$a;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.yxcorp.gifshow.w;
import java.lang.StringBuilder;
import android.os.SystemClock;

public final class g$a implements Runnable	// class@0027ac
{
    public final String b;

    public void g$a(String p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "1")) {
          return;
       }
       b.a(-1343064608).U(this.b+"_begin", SystemClock.elapsedRealtime());
       return;
    }
}
