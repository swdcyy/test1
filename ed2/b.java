package ed2.b;
import erd.a;
import ed2.e;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ed2.r;
import com.google.gson.JsonObject;
import java.lang.Long;
import java.lang.Number;
import java.lang.Float;
import com.google.gson.JsonElement;
import k2b.u1;

public final class b implements a	// class@0026fc
{
    public final e b;

    public void b(e p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, e.class, "8")) {
       }else {
          e s = tb.s;
          if (s != null && s.c() - null > 0) {
             long l = tb.s.c();
             long l1 = tb.s.a();
             JsonObject jsonObject = new JsonObject();
             jsonObject.a0("liveAudienceTotalFrameCount", Long.valueOf(l));
             jsonObject.a0("liveAudienceJankyFrameCount", Long.valueOf(l1));
             jsonObject.a0("liveAudienceJankyFrameRate", Float.valueOf(((float)l1 / (float)l)));
             u1.R("liveAudienceUIFpsInfo", jsonObject.toString(), 3);
          }
       }
       tb.s.f();
       return;
    }
}
