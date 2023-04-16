package ec9.q;
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
import com.yxcorp.gifshow.camera.record.assistant.model.MusicAssistantTemplate;
import cc9.p;
import com.kuaishou.android.model.music.Music;
import android.content.Intent;
import java.util.HashMap;
import java.lang.Integer;
import cc9.h;
import java.util.Map;

public final class q extends k	// class@002193
{

    public void q(b1 p0){
       a.p(p0, "provider");
       super(p0);
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
       }else {
          a.p(p0, "action");
          b uob = this.a().j();
          g og = uob.f().get(p0.b());
          if (og instanceof MusicAssistantTemplate) {
             Music music = og.getMusic();
             a.m(music);
             p op = new p(music, -1, null, og.isPartitionItem());
             h oh = uob.i().get(Integer.valueOf(p0.b()));
             if (oh != null && (!oh instanceof p || (a.g(oh.b().mId, op.b().mId) ^ 0x01))) {
                uob.i().put(Integer.valueOf(p0.b()), op);
             }
             this.a().h(q.a(uob, null, 0, 0, null, false, false, false, false, 255, null));
          }
       }
       return;
    }
}
