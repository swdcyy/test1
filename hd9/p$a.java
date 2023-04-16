package hd9.p$a;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import hd9.p;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.followshoot.f;
import com.yxcorp.gifshow.camera.record.followshoot.f$e;

public final class p$a implements IMediaPlayer$OnPreparedListener	// class@002620
{
    public final p b;

    public void p$a(p p0){
       this.b = p0;
       super();
    }
    public final void onPrepared(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$a.class, "1")) {
          return;
       }
       p$a tb = this.b;
       p d = tb.d;
       if (d != null) {
          d.a(tb);
       }
       return;
    }
}
