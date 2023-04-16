package c77.f;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.util.HashMap;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import c77.f$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import java.util.Set;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import c77.i;

public class f extends PresenterV2 implements g	// class@0004fc
{
    public Map p;
    public Map q;
    public Set r;
    public Map s;
    public Set t;
    public Map u;
    public l v;
    public static final SharedPreferences w;

    static {
       f.w = b.b("DefaultPreferenceHelper");
    }
    public void f(){
       super();
       this.p = new HashMap();
       this.q = new ArrayMap();
       this.r = new ArraySet();
       this.s = new ArrayMap();
       this.t = new ArraySet();
       this.u = new ArrayMap();
       this.v = new f$a(this);
    }
    public void E8(){
       PatchProxy.applyVoid(null, this, f.class, "1");
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.p.clear();
       this.s.clear();
       this.u.clear();
       this.r.clear();
       this.q.clear();
       return;
    }
    public String P8(String p0,long p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, uof, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return "gzone_"+p0+p1;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f.class, new i());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
}
