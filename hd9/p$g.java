package hd9.p$g;
import com.kwai.video.player.IMediaPlayer$OnBufferingUpdateListener;
import hd9.p;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.followshoot.f;
import com.yxcorp.gifshow.camera.record.followshoot.f$a;

public final class p$g implements IMediaPlayer$OnBufferingUpdateListener	// class@002626
{
    public final p a;

    public void p$g(p p0){
       this.a = p0;
       super();
    }
    public final void onBufferingUpdate(IMediaPlayer p0,int p1){
       p$g og = p$g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, og, "1")) {
          return;
       }
       p$g ta = this.a;
       p h = ta.h;
       if (h != null) {
          h.a(ta, p1);
       }
       return;
    }
}
