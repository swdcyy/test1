package hd9.p$e;
import com.kwai.video.player.IMediaPlayer$OnSeekCompleteListener;
import hd9.p;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.followshoot.f$g;

public final class p$e implements IMediaPlayer$OnSeekCompleteListener	// class@002624
{
    public final p a;

    public void p$e(p p0){
       this.a = p0;
       super();
    }
    public final void onSeekComplete(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$e.class, "1")) {
          return;
       }
       p f = this.a.f;
       if (f != null) {
          f.onSeekComplete();
       }
       return;
    }
}
