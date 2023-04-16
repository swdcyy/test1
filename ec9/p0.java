package ec9.p0;
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
import ec9.a;
import ec9.l1;
import crd.b;
import lnc.b9;
import ac9.j;
import sa6.b;
import cc9.b;
import com.yxcorp.gifshow.camera.record.assistant.viewmodel.CloseDiscernDelegate$run$1$1;
import msd.l;
import cc9.g;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;

public final class p0 extends k	// class@002190
{
    public final j b;

    public void p0(b1 p0,j p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.b = p1;
    }
    public void c(a p0){
       Object obj = this;
       l1 obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, p0.class, "1")) {
       }else {
          a.p(obj1, "action");
          obj1 = obj.b.t0().b(4);
          if (obj1 != null && !PatchProxy.applyVoid(null, obj1, l1.class, "2")) {
             b9.a(obj1.b);
          }
          obj.b.u0().H();
          b uob = this.a().j();
          b uob1 = uob;
          g og = uob.o(CloseDiscernDelegate$run$1$1.INSTANCE);
          uob = b.a(uob1, false, false, false, false, false, false, null, og, false, false, false, false, null, false, false, false, false, 0x1ff77, null);
          this.a().h(uob);
       }
       return;
    }
}
