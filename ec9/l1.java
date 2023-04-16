package ec9.l1;
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
import crd.b;
import lnc.b9;
import ac9.j;
import sa6.b;
import cc9.b;
import com.yxcorp.gifshow.camera.record.assistant.viewmodel.StartDiscernDelegate$run$1$1;
import msd.l;
import cc9.g;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import brd.t;
import t45.d;
import brd.z;
import ec9.j1;
import ec9.k1;
import erd.g;

public final class l1 extends k	// class@002185
{
    public b b;
    public final j c;

    public void l1(b1 p0,j p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.c = p1;
    }
    public void c(a p0){
       Object obj = this;
       b obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, l1.class, "1")) {
       }else {
          a.p(obj1, "action");
          b9.a(obj.b);
          obj.c.u0().D();
          obj1 = this.a().j();
          b uob = obj1;
          g og = obj1.o(StartDiscernDelegate$run$1$1.INSTANCE);
          obj1 = b.a(uob, false, false, false, true, false, false, null, og, false, false, false, false, null, false, false, false, false, 0x1ff77, null);
          this.a().h(obj1);
          obj.b = obj.c.u0().z().observeOn(d.a).subscribe(new j1(obj), k1.b);
       }
       return;
    }
}
