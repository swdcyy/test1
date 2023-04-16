package dx2.n;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterPanelFragment;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Class;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.voiceparty.theater.tube.tab.VoicePartyTheaterTubeTabFragment;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import kotlin.jvm.internal.a;

public class n extends b	// class@0025d9
{
    public final VoicePartyTheaterPanelFragment d;

    public void n(VoicePartyTheaterPanelFragment p0,PagerSlidingTabStrip$d p1,Class p2,Bundle p3){
       this.d = p0;
       super(p1, p2, p3);
    }
    public void d(int p0,Fragment p1){
       n on = n.class;
       if (!PatchProxy.isSupport(on) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, on, "1")) {
          VoicePartyTheaterPanelFragment c = this.d.C;
          Objects.requireNonNull(p1);
          if (!PatchProxy.applyVoidOneRefs(c, p1, VoicePartyTheaterTubeTabFragment.class, "7")) {
             a.p(c, "callback");
             p1.l = c;
          }
       }
       return;
    }
}
