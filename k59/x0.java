package k59.x0;
import p49.a;
import com.google.gson.JsonObject;
import java.lang.Object;
import q35.c$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import q35.b;
import q35.d;

public final class x0 implements a	// class@002b31
{
    public final JsonObject a;

    public void x0(JsonObject p0){
       this.a = p0;
       super();
    }
    public final void a(c$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x0.class, "1")) {
          return;
       }
       p0.d(BusinessType.CONVERSION);
       p0.i(b.o);
       p0.h("ad_landing_page_auto_jump");
       p0.f(this.a);
       return;
    }
}
