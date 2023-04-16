package a00.c;
import a00.c$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.commercial.tach.exception.WrapLinkedHashMap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import java.util.Collection;
import java.util.Map;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;
import o56.c;
import o56.a;

public final class c	// class@00000a
{
    public final Map a;
    public static final c b;
    public static final c$a c;

    static {
       c.c = new c$a(null);
       c.b = new c();
    }
    public void c(){
       super();
       this.a = new WrapLinkedHashMap();
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a.q(this.a.values());
       a.o(obj, "Gsons.KWAI_GSON.toJson\(mDatas.values\)");
       return obj;
    }
}
