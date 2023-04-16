package me9.l$e;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.Number;

public final class l$e implements o	// class@002fff
{
    public static final l$e b;

    static {
       l$e.b = new l$e();
    }
    public void l$e(){
       super();
    }
    public Object apply(Object p0){
       JsonObject jsonObject = PatchProxy.applyOneRefs(p0, this, l$e.class, "1");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          jsonObject = new JsonObject();
          jsonObject.a0("code", Integer.valueOf(1));
          jsonObject.c0("message", p0.getMessage());
       }
       return jsonObject;
    }
}
