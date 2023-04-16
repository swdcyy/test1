package djc.g0;
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
import djc.h0;
import djc.f0;

public final class g0 implements t	// class@0021f3
{

    public void g0(){
       super();
    }
    public w a(JsonObject p0,KwaiDialogFragment p1,q p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, g0.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "extParam");
       a.p(p1, "fragment");
       JsonElement jsonElement = k0.e(p0, "fans2share");
       w ow = null;
       if (jsonElement != null) {
          jsonElement = jsonElement.r();
          String str = k0.h(jsonElement, "bannerTextLeft", "");
          String str1 = k0.h(jsonElement, "bannerTextRight", "");
          f0 uof0 = null;
          int i = (str == null || !str.length())? 1: 0;
          if (!i) {
             if (str1 == null || !str1.length()) {
                uof0 = 1;
             }
             if (!uof0) {
                ow = new h0(new f0(str, str1));
             }
          }
       }
    label_005e :
       return ow;
    }
}
