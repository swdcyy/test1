package b8a.w1;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;

public final class w1 implements IMediaPlayer$OnPreparedListener	// class@000411
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void w1(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final void onPrepared(IMediaPlayer p0){
       w1 tb = this.b;
       if (tb.n9()) {
          tb.F9();
       }
       return;
    }
}
