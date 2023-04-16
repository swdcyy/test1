package djc.f1$c;
import com.kwai.video.wayne.player.listeners.OnWayneErrorListener;
import djc.f1;
import java.lang.Object;
import com.kwai.video.wayne.player.main.RetryInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import djc.f1$c$a;
import java.lang.Runnable;
import android.widget.FrameLayout;

public final class f1$c implements OnWayneErrorListener	// class@0021ec
{
    public final f1 b;

    public void f1$c(f1 p0){
       this.b = p0;
       super();
    }
    public final void onWayneError(RetryInfo p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f1$c.class, "1")) {
          return;
       }
       this.b.b().post(new f1$c$a(this));
       PatchProxy.onMethodExit(f1$c.class, "1");
       return;
    }
}
