package co2.u0;
import co2.r;
import com.kuaishou.live.core.voiceparty.s;
import java.lang.Object;
import co2.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import m91.b;
import t02.a0;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService$DisableSlidePlayFunction;
import v12.f;
import d92.f$b;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMicSeatsReadyResponse$VoicePartyUserInitialState;
import ht2.a;

public class u0 implements r	// class@0005b1
{
    public final s b;

    public void u0(s p0){
       this.b = p0;
       super();
    }
    public void a(){
       q.d(this);
    }
    public void b0(int p0,boolean p1){
       q.a(this, p0, p1);
    }
    public void c(int p0){
       u0 ou0 = u0.class;
       if (PatchProxy.isSupport(ou0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ou0, "2")) {
          return;
       }
       this.b.R.N().yj(AudienceBizRelation.VOICE_PARTY_GUEST);
       this.b.R.L2.b(LiveSlidePlayService$DisableSlidePlayFunction.VOICE_PARTY_GUEST, true, true);
       this.b.R.N.a(true, true);
       return;
    }
    public void n(int p0,LiveVoicePartyMicSeatsReadyResponse$VoicePartyUserInitialState p1,a p2){
       if (PatchProxy.isSupport(u0.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, u0.class, "1")) {
          return;
       }
       this.b.R.N().Pj(AudienceBizRelation.VOICE_PARTY_GUEST);
       this.b.R.L2.Q3(LiveSlidePlayService$DisableSlidePlayFunction.VOICE_PARTY_GUEST, false);
       this.b.R.N.a(false, true);
       return;
    }
}
