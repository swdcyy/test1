package me9.m$e;
import erd.o;
import me9.m;
import ne9.b;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import kotlin.jvm.internal.a;
import j8c.a;
import q87.c;
import fg6.a;
import ne9.e;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.util.concurrent.ConcurrentHashMap;
import me9.m$c;
import com.google.gson.JsonElement;
import com.google.gson.Gson;

public final class m$e implements o	// class@003005
{
    public final m b;
    public final b c;

    public void m$e(m p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       JsonObject jsonObject = PatchProxy.applyOneRefs(p0, this, m$e.class, "1");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          Object[] objArray = new Object[0];
          a.D().w("MagicRequestStatusHandler", "get data from file", objArray);
          p0 = a.a;
          JsonObject jsonObject1 = this.b.c.get(this.c.b().mId);
          JsonObject jsonObject2 = ((this.b.d.a()).equals(this.c.b().mId))? this.b.d.b(): null;
          if (jsonObject2 == null) {
             jsonObject2 = new JsonObject();
          }
          p0 = p0.x(new e(jsonObject1, jsonObject2));
          a.o(p0, "Gsons.KWAI_GSON.toJsonTr¡­                        \)");
          jsonObject = p0.r();
       }
       return jsonObject;
    }
}
