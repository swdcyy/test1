package fb2.g;
import fb2.i;
import java.lang.Object;
import fb2.h;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import pm8.a;
import android.content.SharedPreferences;

public class g implements i	// class@002926
{
    public static final int c;

    public void g(){
       super();
    }
    public void a(){
       h.f(this);
    }
    public long b(){
       return h.a(this);
    }
    public void c(){
       h.g(this);
    }
    public boolean d(){
       return h.i(this);
    }
    public String e(){
       return h.c(this);
    }
    public boolean f(){
       Object obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (a.a.getBoolean("liveSlideReplaceListBottomGuideDisabled", false) ^ 0x01);
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       a.B1(true);
       return;
    }
    public String h(){
       return h.d(this);
    }
    public long i(){
       return h.b(this);
    }
}
