package bl3.i$b;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$b;
import bl3.i;
import java.lang.Object;
import rj3.a;
import t99.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import im8.f;
import jl3.b;
import wkd.b;
import gb5.a;
import hn5.n;
import hn5.m;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Throwable;

public class i$b implements LiveAutoPlay$b	// class@0003ee
{
    public final i a;

    public void i$b(i p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       c.e(this, p0);
    }
    public void onAnchorEndLive(){
       if (PatchProxy.applyVoid(null, this, i$b.class, "3")) {
          return;
       }
       this.a.H.set(Boolean.TRUE);
       this.a.G.b(1);
       int i = 0x8708467;
       b.a(i).log("live video first error");
       if (m.a().FG(this.a.D)) {
          i$b ta = this.a;
          b.a(i).l(ta.D, 1, ta.C, null);
       }
       return;
    }
    public void onAudioStart(){
       if (PatchProxy.applyVoid(null, this, i$b.class, "2")) {
          return;
       }
       if (m.a().FG(this.a.D)) {
          b.a(0x8708467).s();
       }
       return;
    }
    public void onPlayerCached(){
       this.a.P = true;
    }
    public void onPlayerRetrieved(){
       c.d(this);
    }
    public void onRenderStop(){
       c.f(this);
    }
    public void onVideoStart(){
       if (PatchProxy.applyVoid(null, this, i$b.class, "1")) {
          return;
       }
       this.a.H.set(Boolean.FALSE);
       this.a.G.b(2);
       int i = 0x8708467;
       b.a(i).log("live video first frame");
       if (m.a().FG(this.a.D)) {
          i$b ta = this.a;
          b.a(i).n(ta.D, true, ta.C);
       }
       return;
    }
}
