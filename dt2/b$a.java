package dt2.b$a;
import ct2.c$b;
import dt2.b;
import java.lang.Object;
import at2.c$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.guide.MicSeatGuideState;
import com.kuaishou.live.core.voiceparty.micseats.guide.GuideStructBizRelations;
import bt2.e;
import at2.c;

public final class b$a implements c$b	// class@002596
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public final void a(c$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       a.p(p0, "it");
       if (p0.f() == MicSeatGuideState.IDLE) {
          this.a.b.a(p0.g(), p0.e());
       }else {
          this.a.b.b(p0);
       }
       return;
    }
}
