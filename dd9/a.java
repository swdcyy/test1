package dd9.a;
import com.kwai.video.player.IMediaPlayer$OnSeekCompleteListener;
import dd9.g;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import com.kwai.video.player.KsMediaPlayer;
import com.yxcorp.gifshow.camera.record.base.d;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import com.kwai.video.player.AbstractMediaPlayer;

public final class a implements IMediaPlayer$OnSeekCompleteListener	// class@001f0b
{
    public final g a;

    public void a(g p0){
       this.a = p0;
    }
    public final void onSeekComplete(IMediaPlayer p0){
       a ta = this.a;
       boolean b = true;
       ta.G = b;
       if (!ta.r.isPlaying()) {
          if (ta.J > null) {
             ta.d.b().y();
          }
          ta.r.start();
          ta.z = b;
       }
       ta.r.setOnSeekCompleteListener(null);
       return;
    }
}
