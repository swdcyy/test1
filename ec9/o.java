package ec9.o;
import ec9.k;
import ec9.b1;
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
import com.yxcorp.gifshow.camera.record.assistant.model.MagicAssistantTemplate;
import cc9.n;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.HashMap;
import java.lang.Integer;
import cc9.h;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.util.Map;

public final class o extends k	// class@00218f
{

    public void o(b1 p0){
       a.p(p0, "provider");
       super(p0);
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
       }else {
          a.p(p0, "action");
          b uob = this.a().j();
          g og = uob.f().get(p0.b());
          if (og instanceof MagicAssistantTemplate) {
             MagicEmoji$MagicFace magicFace = og.getMagicFace();
             a.m(magicFace);
             n on = new n(magicFace, -1, 0, og.isPartitionItem());
             h oh = uob.i().get(Integer.valueOf(p0.b()));
             if (oh != null && (!oh instanceof n || (a.g(oh.c().mId, on.c().mId) ^ 0x01))) {
                uob.i().put(Integer.valueOf(p0.b()), on);
             }
             this.a().h(q.a(uob, null, 0, 0, null, false, false, false, false, 255, null));
          }
       }
       return;
    }
}
