package c5b.e$b;
import erd.o;
import java.lang.String;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import r5b.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class e$b implements o	// class@0004b8
{
    public final String b;

    public void e$b(String p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       e$b obj = PatchProxy.applyOneRefs(p0, this, e$b.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "it");
          obj = ((this.b).length() > 0)? 1: null;
          if (obj) {
             obj = this.b;
             if (!PatchProxy.applyVoidOneRefs(obj, null, e.class, "20")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "SEARCH_MAGIC_FACE";
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("query_word", obj);
                uElementPack.params = jsonObject.toString();
                u1.u(1, uElementPack, null);
             }
          }
       }
       return p0;
    }
}
