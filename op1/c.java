package op1.c;
import dp1.b;
import xp5.i;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k2b.e0;
import com.google.gson.JsonObject;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;

public final class c implements b	// class@003550
{
    public final i a;
    public final Map b;

    public void c(i p0,Map p1){
       a.p(p0, "logPackageService");
       a.p(p1, "interactBizParam");
       super();
       this.a = p0;
       this.b = p1;
    }
    public ClientContent$LiveStreamPackage a(){
       ClientContent$LiveStreamPackage obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.a();
       a.o(obj, "logPackageService.liveStreamPackage");
       return obj;
    }
    public e0 i(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getPage();
    }
    public JsonObject j(){
       return null;
    }
    public JsonObject k(){
       JsonObject obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       Iterator iterator = this.b.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          obj.c0(key, uEntry.getValue());
       }
       return obj;
    }
    public ClientContent$LiveVoicePartyPackageV2 y(){
       return null;
    }
}
