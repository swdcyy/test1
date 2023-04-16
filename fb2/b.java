package fb2.b;
import fb2.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pm8.a;
import fb2.h;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.SharedPreferences;

public class b implements i	// class@002920
{
    public static final int c;

    public void b(){
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       a.v1(true);
       return;
    }
    public long b(){
       return h.a(this);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       a.v1(true);
       return;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (a.a.getBoolean("liveSlideCommonFullscreenGuideDisabled", false) ^ 0x01);
    }
    public String e(){
       return h.c(this);
    }
    public boolean f(){
       return h.h(this);
    }
    public void g(){
       h.e(this);
    }
    public String h(){
       return h.d(this);
    }
    public long i(){
       return h.b(this);
    }
}
