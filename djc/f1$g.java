package djc.f1$g;
import android.view.View$OnClickListener;
import djc.f1;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import px6.b;
import mx6.a;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import android.widget.ImageView;

public final class f1$g implements View$OnClickListener	// class@0021f0
{
    public final f1 b;

    public void f1$g(f1 p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       IWaynePlayer player;
       if (PatchProxy.applyVoidOneRefs(p0, this, f1$g.class, "1")) {
          return;
       }
       this.b.f();
       this.b.e();
       a uoa = this.b.b().getPlayerKitContext().e(a.class);
       if (uoa != null) {
          player = uoa.getPlayer();
          if (player != null) {
             player.play();
          }
       }
       this.b.i.setVisibility(4);
       this.b.j.setVisibility(4);
       this.b.c().setVisibility(4);
       this.b.a().setVisibility(4);
       player.k = false;
       return;
    }
}
