package ec9.h0;
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
import j8c.a;
import q87.c;
import java.util.HashMap;
import java.util.List;
import ac9.j;

public final class h0 extends k	// class@002178
{
    public final f1 b;

    public void h0(b1 p0,f1 p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.b = p1;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0.class, "1")) {
       }else {
          a.p(p0, "action");
          b uob = this.a().j();
          if (p0.b() != uob.b()) {
             Object[] objArray = new Object[0];
             a.D().A("CameraAssistant", "ClickMagicDelegate, action.index != listState.currentSelectPosition", objArray);
          }else if(uob.g()){
             this.a().h(q.a(uob, null, 0, 0, null, false, false, false, false, 223, null));
          }
          this.b.u0().y();
       }
       return;
    }
}
