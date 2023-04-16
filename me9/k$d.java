package me9.k$d;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import kotlin.jvm.internal.a;
import j8c.a;
import w46.b;
import java.lang.Integer;
import java.lang.Number;

public final class k$d implements o	// class@002ff9
{
    public static final k$d b;

    static {
       k$d.b = new k$d();
    }
    public void k$d(){
       super();
    }
    public Object apply(Object p0){
       JsonObject jsonObject = PatchProxy.applyOneRefs(p0, this, k$d.class, "1");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          a.D().e("MagicRequestSaveImgHandler", "handleRequestError", p0);
          jsonObject = new JsonObject();
          jsonObject.a0("result", Integer.valueOf(-1));
          jsonObject.c0("errorMsg", p0.getMessage());
       }
       return jsonObject;
    }
}
