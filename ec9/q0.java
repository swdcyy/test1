package ec9.q0;
import ec9.k;
import ec9.b1;
import ec9.f1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import cc9.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.b;
import cc9.q;
import java.util.List;
import ac9.g;
import com.yxcorp.gifshow.camera.record.assistant.model.MusicAssistantTemplate;
import java.util.HashMap;

public final class q0 extends k	// class@002192
{
    public final f1 b;

    public void q0(b1 p0,f1 p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.b = p1;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q0.class, "1")) {
       }else {
          a.p(p0, "action");
          b uob = this.a().j();
          if (p0.b() >= 0 && p0.b() < uob.f().size()) {
             g og = uob.f().get(p0.b());
             if (og instanceof MusicAssistantTemplate) {
                og.setCollection((og.isCollection() ^ 0x01));
                this.a().h(q.a(uob, null, 0, 0, null, false, false, (og.isCollection() ^ 0x01), false, 191, null));
             }
          }
       }
       return;
    }
}
