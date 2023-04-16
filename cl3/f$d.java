package cl3.f$d;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$b;
import cl3.f;
import java.lang.Object;
import rj3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rj3.d;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import android.content.Context;
import t99.c;
import android.view.ViewGroup;

public class f$d implements LiveAutoPlay$b	// class@000592
{
    public final f a;

    public void f$d(f p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$d.class, "2")) {
          return;
       }
       if (this.a.t != null) {
          return;
       }
       LivePlayTextureView livePlayText = null;
       if (p0 != null && p0.d() != null) {
          livePlayText = p0.d().a();
       }
       if (livePlayText == null) {
          livePlayText = new LivePlayTextureView(this.a.i);
       }
       this.a.e(livePlayText);
       return;
    }
    public void onAnchorEndLive(){
       c.a(this);
    }
    public void onAudioStart(){
       c.b(this);
    }
    public void onPlayerCached(){
       c.c(this);
    }
    public void onPlayerRetrieved(){
       c.d(this);
    }
    public void onRenderStop(){
       c.f(this);
    }
    public void onVideoStart(){
       if (PatchProxy.applyVoid(null, this, f$d.class, "1")) {
          return;
       }
       this.a.e.setVisibility(0);
       return;
    }
}
