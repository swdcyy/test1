package as2.a;
import yx2.i;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import com.kuaishou.live.core.voiceparty.b;
import lp3.e;
import t02.a0;
import q92.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import as2.b;
import as2.a$a;
import hp2.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import r92.b;

public final class a extends i	// class@0002b6
{
    public b d;
    public boolean e;
    public final b f;
    public final a$a g;
    public final a h;
    public final b i;
    public final e j;
    public final a0 k;
    public final a l;

    public void a(a p0,b p1,e p2,a0 p3,a p4){
       a.p(p0, "voicePartyManager");
       a.p(p1, "micSeatDispatcher");
       a.p(p2, "serviceManager");
       a.p(p3, "livePlayCallerContext");
       a.p(p4, "liveAudienceFollowGuideCardService");
       super();
       this.h = p0;
       this.i = p1;
       this.j = p2;
       this.k = p3;
       this.l = p4;
       this.f = new b(p1, p2, p3);
       a$a uoa = new a$a(this);
       this.g = uoa;
       p0.a(uoa);
    }
    public void N(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.h.l(this.g);
       if (this.e != null) {
          this.l.a(this.f);
       }
       return;
    }
}
