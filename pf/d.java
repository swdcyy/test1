package pf.d;
import java.lang.Object;
import android.graphics.Shader$TileMode;
import xb.t$b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import pf.h;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;

public class d	// class@00291e
{

    public void d(){
       super();
    }
    public static Shader$TileMode a(){
       return Shader$TileMode.CLAMP;
    }
    public static t$b b(){
       return t$b.i;
    }
    public static t$b c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (("contain").equals(p0)) {
          return t$b.e;
       }
       if (("cover").equals(p0)) {
          return t$b.i;
       }
       if (("stretch").equals(p0)) {
          return t$b.a;
       }
       if (("center").equals(p0)) {
          return t$b.h;
       }
       if (("repeat").equals(p0)) {
          return h.l;
       }
       if (p0 == null) {
          return d.b();
       }
       throw new JSApplicationIllegalArgumentException("Invalid resize mode: \'"+p0+"\'");
    }
    public static Shader$TileMode d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!("contain").equals(p0) && (!("cover").equals(p0) && (!("stretch").equals(p0) && (("center").equals(p0) || ("backgroundImage").equals(p0))))) {
          return Shader$TileMode.CLAMP;
       }
       if (("repeat").equals(p0)) {
          return Shader$TileMode.REPEAT;
       }
       if (p0 == null) {
          return d.a();
       }
       throw new JSApplicationIllegalArgumentException("Invalid resize mode: \'"+p0+"\'");
    }
}
