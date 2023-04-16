package bya.a$a;
import com.kwai.video.wayne.player.listeners.OnWayneErrorListener;
import bya.a;
import java.lang.Object;
import com.kwai.video.wayne.player.main.RetryInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.video.player.IMediaPlayer;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;

public class a$a implements OnWayneErrorListener	// class@000488
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void onWayneError(RetryInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a$a tb = this.b;
       tb.f.onError(tb.a.getKernelPlayer(), p0.getWhat(), p0.getExtra());
       return;
    }
}
