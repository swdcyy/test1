package bp2.b;
import lf3.g;
import bp2.c;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkOpMicSeats;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import co2.f2;
import kotlin.jvm.internal.a;
import pp.c;
import hp2.b;
import java.lang.StringBuilder;
import qu2.a;
import com.kuaishou.android.live.log.b;
import rr2.k;
import zo2.c;
import hp2.f;
import ip2.a;
import lf3.f;

public final class b implements g	// class@000426
{
    public final c b;

    public void b(c p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else if(a.g(p0.voicePartyId, this.b.e.y()) ^ 0x01){
          b.j0(b.a(), "invalid Long Connection message SC_LIVE_VOICE_PARTY_PK_OP_MIC_SEATS, "+"liveStreamId: "+this.b.d.getLiveStreamId()+" voicePartyId: "+this.b.e.y()+10+p0);
       }else if(!k.j(p0)){
          b.B(b.a(), "onReceive SCLiveVoicePartyPkOpMicSeats empty micList ");
       }else {
          a.o(p0, "it");
          this.b.d(new c(p0));
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
