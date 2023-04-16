package dw2.l;
import gp2.q;
import com.kuaishou.live.core.voiceparty.theater.VoicePartyTheaterAudienceController;
import java.lang.Object;
import op2.f;
import op2.j;
import op2.i;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterHalfScreenPlayControlsViewController;
import kw2.f;
import kw2.c;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager;
import iw2.a;
import vw2.a;
import kw2.e;
import jv1.b;
import oq5.b;
import gw2.a;
import ft5.b;
import qrd.l1;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterFullScreenPlayControlsViewController;
import gq5.f;
import x61.c;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import java.util.List;

public final class l implements q	// class@0025c2
{
    public ViewController b;
    public final VoicePartyTheaterAudienceController c;

    public void l(VoicePartyTheaterAudienceController p0){
       this.c = p0;
       super();
    }
    public void B(int p0,f p1){
       i.b(this, p0, p1);
    }
    public void P(f p0){
       i.d(this, p0);
    }
    public void W(){
       i.i(this);
    }
    public void e0(){
       i.j(this);
    }
    public void k(TheaterDisplayMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       a.p(p0, "displayMode");
       l tb = this.b;
       if (tb != null) {
          this.c.O2(tb);
       }
       if (p0 == TheaterDisplayMode.HALF_SCREEN) {
          TheaterHalfScreenPlayControlsViewController theaterHalfS = new TheaterHalfScreenPlayControlsViewController(this.c.v.d().a, VoicePartyTheaterAudienceController.X2(this.c), VoicePartyTheaterAudienceController.V2(this.c), VoicePartyTheaterAudienceController.W2(this.c), this.c.v.c().c(), this.c.v.c().e(), this.c.v.d().b);
          this.c.x2(R.id.voice_party_theater_audience_half_container, p0);
          this.b = p0;
       }else {
          TheaterFullScreenPlayControlsViewController theaterFullS = new TheaterFullScreenPlayControlsViewController(VoicePartyTheaterAudienceController.X2(this.c), VoicePartyTheaterAudienceController.V2(this.c), VoicePartyTheaterAudienceController.W2(this.c), this.c.v.c().c(), this.c.v.c().e(), this.c.v.d().e, this.c.v.d().d());
          this.c.x2(R.id.content_container, p0);
          this.b = p0;
       }
       return;
    }
    public void onPause(){
       i.c(this);
    }
    public void onProgress(long p0,long p1){
       i.f(this, p0, p1);
    }
    public void onResume(){
       i.h(this);
    }
    public void p(){
       i.e(this);
    }
    public void y(LiveQualityItem p0,List p1){
       i.g(this, p0, p1);
    }
}
