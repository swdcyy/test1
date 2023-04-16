package c09.d;
import a59.e;
import a59.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import org.json.JSONObject;
import a59.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import fg6.a;
import com.google.gson.Gson;

public final class d extends e	// class@0004b8
{
    public f b;

    public void d(f p0){
       a.p(p0, "tkBridgeContext");
       super();
       this.b = p0;
    }
    public String a(){
       return "getPlayEndInfo";
    }
    public Object c(JSONObject p0,a p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "data");
       PhotoAdvertisement photoAdverti = k.B(this.b.e());
       if (photoAdverti != null) {
          PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
          if (adData != null) {
             adData = adData.mPlayEndInfo;
             if (adData != null) {
                String str = a.a.q(adData);
                a.o(str, "Gsons.KWAI_GSON.toJson\(it\)");
                return str;
             }
          }
       }
       return "";
    }
}
