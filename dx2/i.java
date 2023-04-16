package dx2.i;
import msd.l;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterPanelFragment;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import vy1.a;
import lnc.a1;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import android.view.ViewOutlineProvider;

public final class i implements l	// class@0025d4
{
    public final VoicePartyTheaterPanelFragment b;

    public void i(VoicePartyTheaterPanelFragment p0){
       this.b = p0;
    }
    public final Object invoke(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       a uoa = new a((float)a1.e(16.00f), 0, tb.s.getTop(), tb.s.getWidth(), (tb.s.getBottom() + a1.e(16.00f)));
       p0.setOutlineProvider(v1);
       p0.setClipToOutline(true);
       return null;
    }
}
