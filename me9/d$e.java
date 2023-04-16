package me9.d$e;
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

public final class d$e implements o	// class@002fea
{
    public static final d$e b;

    static {
       d$e.b = new d$e();
    }
    public void d$e(){
       super();
    }
    public Object apply(Object p0){
       JsonObject jsonObject = PatchProxy.applyOneRefs(p0, this, d$e.class, "1");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          jsonObject = new JsonObject();
          jsonObject.a0("progress", Integer.valueOf(-1));
          jsonObject.c0("errorMsg", p0.getMessage());
       }
       return jsonObject;
    }
}
