package ec9.r0;
import erd.g;
import ec9.v0;
import cc9.q;
import ac9.g;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ec9.b1;
import ec9.k;
import sa6.b;
import java.util.List;
import com.yxcorp.gifshow.camera.record.assistant.model.MagicAssistantTemplate;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import kotlin.jvm.internal.a;
import o4b.a0;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.util.HashMap;
import com.yxcorp.gifshow.util.rx.RxBus;
import j4b.a;

public final class r0 implements g	// class@002194
{
    public final v0 b;
    public final q c;
    public final g d;

    public void r0(v0 p0,q p1,g p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r0.class, "1")) {
       }else {
          q oq = this.b.a().j();
          g og = oq.f().get(this.c.b());
          if (og instanceof MagicAssistantTemplate && a.g(og.getMagicFace(), this.d.getMagicFace())) {
             a.o(p0, "it");
             if (p0.booleanValue()) {
                MagicEmoji$MagicFace magicFace = og.getMagicFace();
                a.m(magicFace);
                a0.f().b(magicFace.mId, og.isCollection());
             }
          }
          this.b.a().h(q.a(oq, null, 0, 0, null, false, false, oq.j(), false, 191, null));
          a.o(p0, "it");
          if (p0.booleanValue()) {
             RxBus.f.b(new a(this.d.getMagicFace(), oq.j()));
          }
       }
       return;
    }
}
