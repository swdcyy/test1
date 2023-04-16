package ec9.v0;
import ec9.k;
import ec9.b1;
import ec9.f1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import cc9.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.b;
import cc9.q;
import java.util.List;
import java.util.Collection;
import ekd.q;
import crd.b;
import ac9.g;
import com.yxcorp.gifshow.camera.record.assistant.model.MagicAssistantTemplate;
import java.util.HashMap;
import ac9.j;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import brd.t;
import t45.d;
import brd.z;
import ec9.r0;
import ec9.s0;
import erd.g;
import com.yxcorp.gifshow.camera.record.assistant.model.MusicAssistantTemplate;
import com.kuaishou.android.model.music.Music;
import ec9.t0;
import ec9.u0;

public final class v0 extends k	// class@00219c
{
    public b b;
    public final f1 c;

    public void v0(b1 p0,f1 p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.c = p1;
    }
    public void c(a p0){
       Object obj3;
       boolean b1;
       Object obj = this;
       q obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, v0.class, "1")) {
       }else {
          a.p(obj1, "action");
          obj1 = this.a().j();
          if (q.f(obj1.f()) || (obj1.b() >= 0 && obj1.b() < obj1.f().size())) {
             v0 b = obj.b;
             if (b != null && !b.isDisposed()) {
                b = obj.b;
                if (b != null) {
                   b.dispose();
                }
             }
             Object obj2 = obj1.f().get(obj1.b());
             if (obj2 instanceof MagicAssistantTemplate) {
                obj3 = obj2;
                b1 = obj3.isCollection();
                obj3.setCollection((b1 ^ 0x01));
                boolean b2 = b1;
                this.a().h(q.a(obj1, null, 0, 0, null, false, false, obj3.isCollection(), false, 191, 0));
                obj.b = obj.c.u0().C(obj3.getMagicFace(), obj3.isCollection()).observeOn(d.a).subscribe(new r0(obj, obj1, obj2), new s0(obj, obj2, b2));
             }else if(obj2 instanceof MusicAssistantTemplate){
                obj3 = obj2;
                b1 = obj3.isCollection();
                obj3.setCollection((b1 ^ 0x01));
                this.a().h(q.a(obj1, null, 0, 0, null, false, false, obj3.isCollection(), false, 191, 0));
                obj.b = obj.c.u0().F(obj3.getMusic(), obj3.isCollection()).observeOn(d.a).subscribe(new t0(obj), new u0(obj, obj2, b1));
             }
          }
       }
       return;
    }
}
