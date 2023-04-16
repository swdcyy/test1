package afd.g$a;
import t99.y;
import afd.g;
import java.lang.Object;
import t99.x;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayerState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.template.bigcard.state.a;

public class g$a implements y	// class@000025
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public void a(int p0,int p1,int p2){
       x.d(this, p0, p1, p2);
    }
    public void c(int p0,int p1,int p2){
       x.j(this, p0, p1, p2);
    }
    public void onAnchorEndLive(){
       x.a(this);
    }
    public void onAudioStart(){
       x.b(this);
    }
    public void onCachedPlayerResumePlay(){
       x.c(this);
    }
    public void onPlayTimeFinished(){
       x.e(this);
    }
    public void onPlayerCached(){
       x.f(this);
    }
    public void onPlayerRetrieved(){
       x.g(this);
    }
    public void onRenderStop(){
       x.h(this);
    }
    public void onSeiInfo(byte[] p0,int p1,int p2){
       x.i(this, p0, p1, p2);
    }
    public void onVideoSizeChangedWithType(int p0,int p1,int p2){
       x.k(this, p0, p1, p2);
    }
    public void onVideoStart(){
       x.l(this);
    }
    public void onVideoStateChange(LiveAutoPlayerState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       this.b.X8(p0);
       if (p0 == LiveAutoPlayerState.PLAYING) {
          g$a tb = this.b;
          tb.V8(tb.t.c());
       }
       return;
    }
}
