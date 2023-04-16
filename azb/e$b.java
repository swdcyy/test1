package azb.e$b;
import erd.o;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import azb.a;
import azb.b;
import azb.e;
import java.util.Objects;
import com.google.gson.JsonArray;
import java.util.Iterator;
import java.lang.Iterable;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.lang.System;
import java.lang.Integer;
import java.lang.Number;
import brd.t;
import cjd.e;
import t45.d;
import brd.z;
import azb.f;

public final class e$b implements o	// class@00036a
{
    public final int b;
    public final String c;
    public final long d;

    public void e$b(int p0,String p1,long p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       e b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = PatchProxy.applyOneRefs(p0, this, e$b.class, "1");
       if (ot != patchProxyRe) {
       }else {
          a.p(p0, "validateTasks");
          a uoa = b.a();
          e$b tb = this.b;
          e$b tc = this.c;
          b = e.b;
          Objects.requireNonNull(b);
          String str = PatchProxy.applyOneRefs(p0, b, e.class, "5");
          if (str != patchProxyRe) {
          }else {
             JsonArray jsonArray = new JsonArray();
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                JsonObject jsonObject = iterator.next();
                JsonElement jsonElement = jsonObject.e0("cacheExpireTime");
                long l = (jsonElement != null)? jsonElement.t(): -1;
                if (l - System.currentTimeMillis() > 0) {
                   JsonObject jsonObject1 = new JsonObject();
                   String str1 = "taskType";
                   JsonElement jsonElement1 = jsonObject.e0(str1);
                   if (jsonElement1 != null) {
                      jsonObject1.a0(str1, Integer.valueOf(jsonElement1.p()));
                   }
                   str1 = "version";
                   JsonElement jsonElement2 = jsonObject.e0(str1);
                   if (jsonElement2 != null) {
                      jsonObject1.a0(str1, Integer.valueOf(jsonElement2.p()));
                   }
                   jsonArray.G(jsonObject1);
                }
             }
             JsonObject jsonObject2 = new JsonObject();
             jsonObject2.G("validTaskTypes", jsonArray);
             str = jsonObject2.toString();
             a.o(str, "extraParam.toString\(\)");
          }
          z c = d.c;
          ot = uoa.a(tb, tc, str).map(new e()).observeOn(c).map(new f(this, p0)).subscribeOn(c);
       }
       return ot;
    }
}
