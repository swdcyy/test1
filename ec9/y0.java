package ec9.y0;
import ec9.k;
import ec9.b1;
import ec9.j;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import cc9.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.b;
import cc9.b;
import ac9.j;
import java.util.List;
import java.util.Collection;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import cc9.g;
import crd.b;
import lnc.b9;
import brd.t;
import brd.w;
import t45.d;
import brd.z;
import ec9.w0;
import ec9.x0;
import erd.g;

public final class y0 extends k	// class@0021a3
{
    public b b;
    public final j c;

    public void y0(b1 p0,j p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.c = p1;
    }
    public void c(a p0){
       t ot;
       String str;
       z a;
       Object obj = this;
       t obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, y0.class, "1")) {
       }else {
          a.p(obj1, "action");
          b uob = this.a().j();
          int i = 0;
          if (obj.c.u0().E().isEmpty() ^ 1) {
             Object[] objArray = new Object[i];
             a.D().A("CameraAssistant", "need download model", objArray);
             this.a().h(b.a(uob, false, false, false, false, true, false, null, null, false, false, false, false, false, false, false, false, false, 0x1ffef, null));
          }else if(obj1.b() != null){
             i = 1;
          }
          b b1 uob1 = this.a();
          AssistantResponse uAssistantRe = (i)? uob.b(): null;
          int i1 = i ^ 0x01;
          uob1 = uob;
          uob1.h(b.a(uob, 0, i1, false, i1, false, false, uAssistantRe, null, false, false, false, false, false, false, false, false, false, 0x1ffa1, null));
          b9.a(obj.b);
          if (obj1.d != null) {
             this.a().h(b.a(uob1, false, false, false, false, false, false, null, null, false, false, false, false, false, false, false, false, false, 0x1fff5, null));
          }else if(obj1.b() == null){
             ot = t.empty();
             str = "Observable\n          .empty<AssistantResponse>\(\)";
          }else {
             ot = t.just(obj1.b());
             str = "Observable.just\(action.silentResponse\)";
          }
          a.o(ot, str);
          a = d.a;
          obj1 = ot.switchIfEmpty(obj.c.u0().I(obj1.b, obj1.c)).subscribeOn(a).observeOn(a);
          obj.b = obj1.subscribe(new w0(obj), new x0(obj));
       }
       return;
    }
}
