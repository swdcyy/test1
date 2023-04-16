package gt2.b$a;
import co2.r;
import gt2.b;
import java.lang.Object;
import co2.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Long;
import java.lang.System;
import yt2.b;
import msd.u;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMicSeatsReadyResponse$VoicePartyUserInitialState;
import ht2.a;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMicSeatsReadyResponse$UserMicSeatLevelInfo;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMicSeatsReadyResponse$UserMicSeatLevelInfo$LevelInfo;

public final class b$a implements r	// class@002ba6
{
    public final b b;

    public void b$a(b p0){
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
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       if (this.b.P()) {
          uoa = this.b;
          uoa.m.invoke(Long.valueOf(uoa.e), Long.valueOf(System.currentTimeMillis()), Long.valueOf(this.b.l.a()), Integer.valueOf(this.b.f), Integer.valueOf(this.b.g), Integer.valueOf(this.b.d), Integer.valueOf(p0));
       }
       p0.e = 0;
       return;
    }
    public void n(int p0,LiveVoicePartyMicSeatsReadyResponse$VoicePartyUserInitialState p1,a p2){
       LiveVoicePartyMicSeatsReadyResponse$UserMicSeatLevelInfo$LevelInfo mLevel;
       if (PatchProxy.isSupport(b$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, b$a.class, "1")) {
          return;
       }
       a.p(p2, "micSeatChangedInfo");
       b$a tb = this.b;
       tb.d = p0;
       tb.e = System.currentTimeMillis();
       b$a tb1 = this.b;
       LiveVoicePartyMicSeatsReadyResponse$UserMicSeatLevelInfo userMicSeatL = p2.b();
       LiveVoicePartyMicSeatsReadyResponse$UserMicSeatLevelInfo$LevelInfo userMicSeatL1 = null;
       if (userMicSeatL != null) {
          userMicSeatL = userMicSeatL.mLevelInfo;
          if (userMicSeatL != null) {
             mLevel = userMicSeatL.mLevel;
          label_003a :
             tb1.f = mLevel;
             tb1 = this.b;
             userMicSeatL = p2.b();
             if (userMicSeatL != null) {
                userMicSeatL = userMicSeatL.mLevelInfo;
                if (userMicSeatL != null) {
                   userMicSeatL1 = userMicSeatL.mSubLevel;
                }
             }
             tb1.g = userMicSeatL1;
             return;
          }
       }
       mLevel = 0;
       goto label_003a ;
    }
}
