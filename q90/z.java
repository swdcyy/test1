package q90.z;
import com.kwai.feature.post.api.magic.webp.vm.MagicBaseWebpVM;
import mrd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import w36.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import t90.t;
import u80.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class z extends MagicBaseWebpVM	// class@0029b3
{
    public final a e;

    public void z(){
       super();
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<Boolean>\(\)");
       this.e = uoa;
    }
    public void i0(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "3")) {
          return;
       }
       a.p(p0, "magicWebpData");
       super.i0(p0);
       if (p0.b() > 0 && this.p0()) {
          this.n0();
       }
       return;
    }
    public Map q0(){
       Object[] objArray = null;
       Type obj = PatchProxy.apply(objArray, this, z.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = t.b;
       String str = a.a.getString("kuaishan_tab_webp_show_count_map", "{}");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
    public void s0(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "2")) {
          return;
       }
       a.p(p0, "map");
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("kuaishan_tab_webp_show_count_map", b.e(p0));
       g.a(uEditor);
       return;
    }
    public final a t0(){
       return this.e;
    }
}
