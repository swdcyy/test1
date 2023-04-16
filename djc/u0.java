package djc.u0;
import djc.t;
import java.lang.Object;
import com.google.gson.JsonObject;
import androidx.fragment.app.KwaiDialogFragment;
import mhc.q;
import djc.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.google.gson.JsonElement;
import ekd.k0;
import java.lang.CharSequence;
import djc.t0;
import djc.s0;
import androidx.fragment.app.Fragment;

public final class u0 implements t	// class@002224
{

    public void u0(){
       super();
    }
    public w a(JsonObject p0,KwaiDialogFragment p1,q p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, u0.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "extParam");
       a.p(p1, "fragment");
       JsonElement jsonElement = k0.e(p0, "shareAwardGuide");
       w ow = null;
       if (jsonElement != null) {
          jsonElement = jsonElement.r();
          String str = k0.h(jsonElement, "icon", "");
          a.o(str, "JsonUtils.optString\(shareAwardParams, \"icon\", \"\"\)");
          String str1 = k0.h(jsonElement, "text", "");
          a.o(str1, "JsonUtils.optString\(shareAwardParams, \"text\", \"\"\)");
          String str2 = k0.h(jsonElement, "jumpUrl", "");
          a.o(str2, "JsonUtils.optString\(shar¡­ardParams, \"jumpUrl\", \"\"\)");
          int i = 1;
          int i1 = (!str.length())? 1: 0;
          if (!i1) {
             i1 = (!str1.length())? 1: 0;
             if (!i1) {
                if (str2.length()) {
                   i = 0;
                }
                if (!i) {
                   ow = new t0(p1, new s0(str, str1, str2));
                }
             }
          }
       }
    label_007a :
       return ow;
    }
}
