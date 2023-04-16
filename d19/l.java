package d19.l;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.yxcorp.gifshow.ad.detail.presenter.player.j;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import android.view.View;

public final class l implements IMediaPlayer$OnInfoListener	// class@002032
{
    public final j b;

    public void l(j p0){
       this.b = p0;
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       j z = this.b.z;
       if (z != null) {
          z.setVisibility(8);
       }
       return false;
    }
}
