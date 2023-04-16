package ec9.n0;
import ec9.k;
import ec9.b1;
import ec9.j;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import cc9.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.b;
import cc9.b;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import cc9.g;

public final class n0 extends k	// class@00218a
{

    public void n0(b1 p0,j p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
    }
    public void c(a p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, n0.class, "1")) {
       }else {
          a.p(obj, "action");
          b uob = this.a().j();
          if (!uob.e()) {
             Object[] objArray = new Object[0];
             a.D().A("CameraAssistant", "run CloseAction, but currentStatus is not close", objArray);
          }else {
             this.a().h(b.a(uob, false, false, false, false, false, false, null, null, false, false, false, false, false, false, false, false, false, 0x1fffe, null));
          }
       }
       return;
    }
}
