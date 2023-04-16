package hd9.p$b;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import hd9.p;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.followshoot.f;
import com.yxcorp.gifshow.camera.record.followshoot.f$b;

public final class p$b implements IMediaPlayer$OnCompletionListener	// class@002621
{
    public final p b;

    public void p$b(p p0){
       this.b = p0;
       super();
    }
    public final void onCompletion(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$b.class, "1")) {
          return;
       }
       p$b tb = this.b;
       p b = tb.b;
       if (b != null) {
          b.a(tb);
       }
       return;
    }
}
