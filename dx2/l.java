package dx2.l;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterPanelFragment;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Class;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.voiceparty.theater.tube.playlist.VoicePartyTheaterPlayListFragment;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import dx2.k;

public class l extends b	// class@0025d7
{
    public final VoicePartyTheaterPanelFragment d;

    public void l(VoicePartyTheaterPanelFragment p0,PagerSlidingTabStrip$d p1,Class p2,Bundle p3){
       this.d = p0;
       super(p1, p2, p3);
    }
    public void d(int p0,Fragment p1){
       l ol = l.class;
       if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ol, "1")) {
          p1.H = new k(this, p0);
       }
       return;
    }
}
