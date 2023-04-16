package co2.j;
import erd.a;
import com.kuaishou.live.core.voiceparty.h;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import lnc.u1;

public final class j implements a	// class@000595
{
    public final h b;

    public void j(h p0){
       this.b = p0;
    }
    public final void run(){
       j tb = this.b;
       Objects.requireNonNull(tb);
       b.Z(LiveVoicePartyLogTag.MIC_SEAT, "MicSeatStateChecker: stop observe network");
       u1.b(tb);
    }
}
