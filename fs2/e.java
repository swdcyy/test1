package fs2.e;
import yx2.h;
import co2.f2;
import qu2.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.util.HandyLogEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import yx2.d;
import lnc.i3;
import qrd.l1;

public final class e extends h	// class@0029ac
{

    public void e(f2 p0,a p1){
       a.p(p0, "voicePartyContext");
       a.p(p1, "liveBasicContext");
       super(p0, p1);
    }
    public final void f(HandyLogEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       a.p(p0, "event");
       d uod = this.e("VOICE_PARTY_KTV_ANCHOR_SING_MODE_VIDEO");
       i3 oi3 = i3.f();
       oi3.d("btn_type", "VIDEO_MODE");
       String str = oi3.e();
       a.o(str, "JsonStringBuilder.newIns¡­Builder\)\n        .build\(\)");
       uod.a(str);
       uod.e(p0);
       return;
    }
    public final void g(HandyLogEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       a.p(p0, "event");
       d uod = this.e("VOICE_PARTY_KTV_ANCHOR_SING_MODE_VIDEO");
       i3 oi3 = i3.f();
       oi3.d("btn_type", "FLIP_CAMERA");
       String str = oi3.e();
       a.o(str, "JsonStringBuilder.newIns¡­Builder\)\n        .build\(\)");
       uod.a(str);
       uod.e(p0);
       return;
    }
}
