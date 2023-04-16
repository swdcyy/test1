package ec9.u;
import ec9.k;
import ec9.b1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import cc9.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.b;
import cc9.b;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import cc9.g;

public final class u extends k	// class@00219b
{

    public void u(b1 p0){
       a.p(p0, "provider");
       super(p0);
    }
    public void c(a p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, u.class, "1")) {
       }else {
          a.p(obj, "action");
          b uob = this.a().j();
          if (uob.l() != obj.b()) {
             this.a().h(b.a(uob, false, false, false, false, false, false, null, null, false, false, false, obj.b(), false, false, false, false, false, 0x1f7ff, null));
          }
       }
       return;
    }
}
