package djc.f1$b;
import com.kwai.video.wayne.player.listeners.OnPlayerLoadingChangedListener;
import djc.f1;
import java.lang.Object;
import com.kwai.video.wayne.player.main.LoadingType;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import djc.f1$b$a;
import java.lang.Runnable;
import android.widget.FrameLayout;

public final class f1$b implements OnPlayerLoadingChangedListener	// class@0021ea
{
    public final f1 b;

    public void f1$b(f1 p0){
       this.b = p0;
       super();
    }
    public final void onChanged(boolean p0,LoadingType p1){
       if (PatchProxy.isSupport2(f1$b.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(Boolean.valueOf(p0), p1, this, f1$b.class, "1")) {
          return;
       }
       if (this.b.k != null) {
          PatchProxy.onMethodExit(f1$b.class, "1");
          return;
       }else {
          StringBuilder str = "isLoading:"+p0+" loadingType:"+p1;
          this.b.b().post(new f1$b$a(this, p0));
          PatchProxy.onMethodExit(f1$b.class, "1");
          return;
       }
    }
}
