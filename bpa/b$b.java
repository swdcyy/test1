package bpa.b$b;
import sn.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonElement;
import com.google.gson.c;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;
import wt5.j;
import au5.b;
import java.lang.NullPointerException;

public final class b$b extends b	// class@000419
{

    public void b$b(){
       super("loginSucceedByTkBridge");
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "1")) {
          return;
       }
       try{
          JsonElement obj = this.d();
          if (obj == null) {
             throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
          }
          obj = c.d(obj);
          a.o(obj, "JsonParser.parseString\(params as String\)");
          obj = obj.r().e0("loginSource");
          a.o(obj, "jsonObject.get\(\"loginSource\"\)");
          if (a.g(obj.w(), "GrowthVideoRedPacketDialog")) {
             b.f().e(true);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
