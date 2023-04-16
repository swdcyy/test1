package me9.l$d;
import erd.o;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import kotlin.jvm.internal.a;
import fg6.a;
import com.google.gson.Gson;

public final class l$d implements o	// class@002ffe
{
    public static final l$d b;

    static {
       l$d.b = new l$d();
    }
    public void l$d(){
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l$d.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          obj = a.a.h(p0, JsonObject.class);
       }
       return obj;
    }
}
