package do2.d;
import lt.b;
import do2.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import do2.d$a;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import lt.a;
import do2.d$b;
import java.util.ArrayList;

public final class d implements b	// class@002566
{
    public final a a;
    public final Object b;

    public void d(a p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "1")) {
          return;
       }
       a.p(p0, "sessionId");
       a.p(p1, "errorMessage");
       d ta = this.a;
       ta.b = false;
       k1.p(new d$a(this, p1), ta);
       b.r(LiveVoicePartyLogTag.KTV.appendTag("VoicePartyApplauseAudienceController"), "play applause sound on error");
       return;
    }
    public void b(String p0){
       a.f(this, p0);
    }
    public void c(String p0){
       a.d(this, p0);
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       a.p(p0, "sessionId");
       p0.b = false;
       k1.p(new d$b(this), this.a);
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       a.p(p0, "sessionId");
       p0.b = false;
       return;
    }
    public void f(int p0){
       a.a(this, p0);
    }
    public void g(int p0){
       a.g(this, p0);
    }
    public void h(ArrayList p0,float p1,float p2){
       a.e(this, p0, p1, p2);
    }
    public void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       a.p(p0, "sessionId");
       p0.b = true;
       return;
    }
    public void j(int p0){
       a.b(this, p0);
    }
}
