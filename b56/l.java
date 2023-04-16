package b56.l;
import com.kwai.video.player.IMediaPlayer$OnBufferingUpdateListener;
import com.kwai.feed.player.ui.KwaiXfControlPanel;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import android.widget.ProgressBar;
import b56.z;
import sc6.d;
import b56.f0;

public final class l implements IMediaPlayer$OnBufferingUpdateListener	// class@00040b
{
    public final KwaiXfControlPanel a;

    public void l(KwaiXfControlPanel p0){
       this.a = p0;
    }
    public final void onBufferingUpdate(IMediaPlayer p0,int p1){
       l ta = this.a;
       Objects.requireNonNull(ta);
       long l = (long)p1;
       if (!PatchProxy.isSupport(KwaiXfControlPanel.class) || (!PatchProxy.applyVoidOneRefs(Long.valueOf(l), ta, KwaiXfControlPanel.class, "103") && ta.k != null)) {
          KwaiXfControlPanel u1 = ta.u1;
          if (u1 != null) {
             u1.setSecondaryProgress(z.a(l, 100, u1.getMax()));
          }
          d uod = ta.f.c();
          uod.a(z.a(l, 100, uod.e()));
       }
       return;
    }
}
