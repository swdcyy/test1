package hf9.c;
import java.util.LinkedHashSet;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k2b.e0;
import kotlin.jvm.internal.a;
import lnc.a1;
import java.lang.Long;
import if9.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import k2b.u1;

public final class c	// class@00263e
{
    public static final LinkedHashSet a;
    public static Integer b;
    public static Long c;
    public static a d;
    public static final c e;

    static {
       c.e = new c();
       c.a = new LinkedHashSet();
    }
    public void c(){
       super();
    }
    public final String a(Integer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.intValue() == 1) {
          return "MAGICFACE";
       }
       return "";
    }
    public final void b(e0 p0){
       Long c;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       a.p(p0, "page");
       Integer b = c.b;
       if (b == null || (c.c != null && c.d != null)) {
          a.m(b);
          a d = c.d;
          a.m(d);
          c = c.c;
          a.m(c);
          this.c(b.intValue(), d, p0, 9, Long.valueOf((a1.k() - c.longValue())));
          c.b = null;
          c.c = null;
          c.d = null;
       }
    label_0049 :
       return;
    }
    public final void c(int p0,a p1,e0 p2,int p3,Long p4){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uoc, "8")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AI_RECORD_LOADING_TEMPLATE";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("ai_record_type", this.a(Integer.valueOf(p1.c())));
       jsonObject.c0("ai_record_id", p1.a());
       jsonObject.c0("ai_record_name", p1.b());
       jsonObject.a0("ai_record_index", Integer.valueOf(p0));
       uElementPack.params = jsonObject.toString();
       h$b uob = h$b.e(p3, "AI_RECORD_LOADING_TEMPLATE");
       uob.k(uElementPack);
       if (p4 != null) {
          ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
          resultPackag.timeCost = p4.longValue();
          a.o(uob, "builder");
          uob.q(resultPackag);
       }
       u1.p0("", p2, uob);
       return;
    }
}
