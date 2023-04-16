package j9a.e;
import io5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import j9a.d;
import uw9.c;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class e implements a	// class@00298d
{

    public void e(){
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return d.c();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       d.d();
       return;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return d.a();
    }
    public void d(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "2")) {
          return;
       }
       d uod = d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uod, "10")) {
          SharedPreferences$Editor uEditor = c.a.edit();
          uEditor.putBoolean("closeSwitchNetSetting", p0);
          g.a(uEditor);
       }
       return;
    }
}
