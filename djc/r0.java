package djc.r0;
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
import djc.o1;

public final class r0 implements t	// class@00221c
{

    public void r0(){
       super();
    }
    public w a(JsonObject p0,KwaiDialogFragment p1,q p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, r0.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "extParam");
       a.p(p1, "fragment");
       JsonElement jsonElement = k0.e(p0, "shareKsCoinReward");
       w ow = null;
       if (jsonElement != null) {
          jsonElement = jsonElement.r();
          String str = k0.h(jsonElement, "bannerText", "");
          String str1 = k0.h(jsonElement, "buttonText", "");
          String str2 = k0.h(jsonElement, "scheme", "");
          int i = 0;
          int i1 = (str2 == null || !str2.length())? 1: 0;
          if (!i1) {
             i1 = (str == null || !str.length())? 1: 0;
             if (!i1) {
                if (str1 == null || !str1.length()) {
                   i = 1;
                }
                if (!i) {
                   ow = new o1(str, str1, str2, p1);
                }
             }
          }
       }
    label_006d :
       return ow;
    }
}
