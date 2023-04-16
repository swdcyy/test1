package f72.b0$a;
import t99.y;
import f72.b0;
import java.lang.Object;
import t99.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayerState;

public class b0$a implements y	// class@0028c1
{
    public final b0 b;

    public void b0$a(b0 p0){
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
       if (PatchProxy.applyVoid(null, this, b0$a.class, "3")) {
          return;
       }
       this.b.V8();
       return;
    }
    public void onPlayerRetrieved(){
       if (PatchProxy.applyVoid(null, this, b0$a.class, "1")) {
          return;
       }
       this.b.S8();
       return;
    }
    public void onRenderStop(){
       if (PatchProxy.applyVoid(null, this, b0$a.class, "4")) {
          return;
       }
       this.b.V8();
       return;
    }
    public void onSeiInfo(byte[] p0,int p1,int p2){
       x.i(this, p0, p1, p2);
    }
    public void onVideoSizeChangedWithType(int p0,int p1,int p2){
       x.k(this, p0, p1, p2);
    }
    public void onVideoStart(){
       if (PatchProxy.applyVoid(null, this, b0$a.class, "2")) {
          return;
       }
       this.b.S8();
       return;
    }
    public void onVideoStateChange(LiveAutoPlayerState p0){
       x.m(this, p0);
    }
}
