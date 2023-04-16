package me9.q$f;
import erd.o;
import me9.q$b;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.util.List;
import java.util.Collection;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;

public final class q$f implements o	// class@003011
{
    public final q$b b;

    public void q$f(q$b p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       JsonObject jsonObject = PatchProxy.applyOneRefs(p0, this, q$f.class, "1");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          jsonObject = new JsonObject();
          int i = 1;
          if (p0.intValue() == 100) {
             String str = this.b.b();
             q$f uof = (str == null || !str.length())? 1: null;
             if (!uof) {
                jsonObject.c0("fileKey", this.b.b());
             }
          }
          jsonObject.a0("progress", p0);
          p0 = this.b.a();
          if (p0 != null && !p0.isEmpty()) {
             i = 0;
          }
          if (!i) {
             jsonObject.G("url", a.a.x(this.b.a()));
          }
       }
       return jsonObject;
    }
}
