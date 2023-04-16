package ck2.h;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kuaishou.live.core.show.statistics.logreporter.LiveLogReporterBasePresenter;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerState;
import java.util.Objects;
import k2b.j0;

public final class h implements LivePlayerStateChangeListener	// class@00054b
{
    public final LiveLogReporterBasePresenter b;

    public void h(LiveLogReporterBasePresenter p0){
       this.b = p0;
    }
    public final void onStateChange(LivePlayerState p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == LivePlayerState.PLAYING) {
          tb.q.b2(1);
       }
       return;
    }
}
