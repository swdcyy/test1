package co2.n;
import erd.g;
import com.kuaishou.live.core.voiceparty.h;
import java.lang.Object;
import crd.b;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import lnc.u1;

public final class n implements g	// class@0005a1
{
    public final h b;

    public void n(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       b.Z(LiveVoicePartyLogTag.MIC_SEAT, "MicSeatStateChecker: start observe network");
       u1.a(tb);
    }
}
