package ec9.z0;
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
import ec9.i;
import crd.b;
import lnc.b9;
import sa6.b;
import cc9.b;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import cc9.g;

public final class z0 extends k	// class@0021a6
{
    public final j b;

    public void z0(b1 p0,j p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.b = p1;
    }
    public void c(a p0){
       Object obj = this;
       i obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, z0.class, "1")) {
       }else {
          a.p(obj1, "action");
          obj1 = obj.b.t0().b(10);
          if (obj1 != null && !PatchProxy.applyVoid(null, obj1, i.class, "2")) {
             b9.a(obj1.b);
          }
          this.a().h(b.a(this.a().j(), false, false, false, false, false, false, null, null, false, false, false, false, false, false, false, false, false, 0x1fcff, null));
       }
       return;
    }
}
