package bpa.b$a;
import sn.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonElement;
import com.google.gson.c;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;
import wkd.b;
import goa.d;
import java.lang.NullPointerException;
import cra.w;
import java.lang.Throwable;
import q87.c;

public final class b$a extends b	// class@000418
{

    public void b$a(){
       super("bindInviteCode");
    }
    public void a(){
       String str;
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       try{
          JsonElement obj = this.d();
          if (obj != null) {
             obj = c.d(obj);
             a.o(obj, "JsonParser.parseString\(params as String\)");
             JsonObject jsonObject = obj.r();
             try{
                JsonElement jsonElement = jsonObject.e0("traceDetail");
                a.o(jsonElement, "jsonObject[\"traceDetail\"]");
                str = jsonElement.w();
             }catch(java.lang.Exception e0){
                str = "";
             }
             JsonElement jsonElement1 = e0.e0("inviteCode");
             a.o(jsonElement1, "jsonObject.get\(\"inviteCode\"\)");
             obj = e0.e0("sourceType");
             a.o(obj, "jsonObject.get\(\"sourceType\"\)");
             b.a(0x56d4a121).a(jsonElement1.w(), obj.p(), str);
          }else {
             throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
          }
       }catch(java.lang.Exception e0){
          w.C().e("KBubbleTkBridge", "bindInviteCode error", e0);
       }
       return;
    }
}
