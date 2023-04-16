package le9.a;
import erd.g;
import le9.d;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicRequest;
import java.lang.Object;
import com.google.gson.JsonObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import le9.h;
import fg6.a;
import ne9.c;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;

public final class a implements g	// class@002db9
{
    public final d b;
    public final MagicRequest c;

    public void a(d p0,MagicRequest p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else if(p0 != null){
          p0 = a.a.q(new c(this.c.getRequestType(), this.c.getSeqId(), p0));
          a.o(p0, "Gsons.KWAI_GSON.toJson\(\n¡­          \)\n            \)");
          this.b.a().b(p0);
       }
       return;
    }
}
