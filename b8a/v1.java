package b8a.v1;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.util.Objects;
import tkd.b;
import tkd.d;
import cm5.a;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import cm5.c;

public final class v1 implements IMediaPlayer$OnInfoListener	// class@00040d
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void v1(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       v1 tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == 0x2775) {
          d.a(0x5f78d73).Mp(tb.x.getPhotoId());
          if (tb.n9() && tb.R == null) {
             tb.Y = true;
             tb.F9();
          }
       }
       return false;
    }
}
