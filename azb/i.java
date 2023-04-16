package azb.i;
import erd.o;
import java.lang.String;
import java.util.List;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Object;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import azb.a;
import azb.b;
import azb.m;
import java.util.Objects;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import brd.t;

public final class i implements o	// class@000374
{
    public final String b;
    public final List c;
    public final UploadInfo d;

    public void i(String p0,List p1,UploadInfo p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       m b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = PatchProxy.applyOneRefs(p0, this, i.class, "1");
       if (ot != patchProxyRe) {
       }else {
          a.p(p0, "param");
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          i tb = this.b;
          if (tb == null) {
             tb = "";
          }
          linkedHashMa.put("photoId", tb);
          linkedHashMa.putAll(p0);
          linkedHashMa.remove("poi");
          p0 = b.a();
          tb = this.c;
          b = m.b;
          i td = this.d;
          Objects.requireNonNull(b);
          String str = PatchProxy.applyOneRefs(td, b, m.class, "3");
          if (str != patchProxyRe) {
          }else if(td.mUsedPostFeatures == null){
             str = null;
          }else {
             JsonObject jsonObject = new JsonObject();
             jsonObject.G("functions", td.mUsedPostFeatures);
             str = jsonObject.toString();
          }
          ot = p0.b(tb, str, linkedHashMa);
       }
       return ot;
    }
}
