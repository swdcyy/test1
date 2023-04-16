package djc.f1$a;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import djc.f1;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import djc.f1$a$a;
import java.lang.Runnable;
import android.widget.FrameLayout;

public final class f1$a implements IMediaPlayer$OnCompletionListener	// class@0021e8
{
    public final f1 b;

    public void f1$a(f1 p0){
       this.b = p0;
       super();
    }
    public final void onCompletion(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f1$a.class, "1")) {
          return;
       }
       f1$a tb = this.b;
       tb.k = true;
       tb.b().post(new f1$a$a(this));
       PatchProxy.onMethodExit(f1$a.class, "1");
       return;
    }
}
