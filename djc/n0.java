package djc.n0;
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
import djc.o0;
import djc.m0;

public final class n0 implements t	// class@00220a
{

    public void n0(){
       super();
    }
    public w a(JsonObject p0,KwaiDialogFragment p1,q p2){
       JsonElement obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, n0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "extParam");
       a.p(p1, "fragment");
       obj = k0.e(p0, "jsCustomBanner");
       w ow = null;
       if (obj != null) {
          JsonObject jsonObject = obj.r();
          double d = k0.d(jsonObject, "aspectRatio", 0);
          String str = "imageUrl";
          String str1 = k0.h(jsonObject, str, "");
          String str2 = "imageBytes";
          String str3 = k0.h(jsonObject, str2, "");
          String str4 = k0.h(jsonObject, "actionUrl", "");
          boolean b = true;
          boolean b1 = k0.c(jsonObject, "hideClicked", b);
          int i = (str3 == null || !str3.length())? 1: 0;
          if (i) {
             if (str1 != null && str1.length()) {
                b = false;
             }
             if (!b) {
             label_006e :
                a.o(str3, str2);
                a.o(str1, str);
                a.o(str4, "actionUrl");
                m0 om0 = new m0(str3, str1, str4, d, b1, p2, p1);
                ow = new o0(i);
             }
          }else {
             goto label_006e ;
          }
       }
       return ow;
    }
}
