package dd9.f;
import java.lang.Runnable;
import dd9.g;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.video.player.KsMediaPlayer;
import bd9.d;

public final class f implements Runnable	// class@001f10
{
    public final g b;
    public final int c;
    public final int d;
    public final byte[] e;

    public void f(g p0,int p1,int p2,byte[] p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       f tb;
       f tc;
       f td;
       f te;
       try{
          tb = this.b;
          tc = this.c;
          td = this.d;
          te = this.e;
          Objects.requireNonNull(tb);
          if (PatchProxy.applyVoid(null, tb, g.class, "37")) {
          }else if(tb.a2()){
             tb.r.seekTo(tb.w);
          }
          if (tb.r.isPlaying()) {
             tb.r.pause();
          }
          e0.r.setVolume(0x3f800000, 0x3f800000);
       }catch(java.lang.IllegalStateException e0){
       }
          if (tb.E == null) {
             tb.t.i2(tc, td);
             tb.E = true;
          }
          tb.i2();
          tb.h2(te, tc, td);
          return;
    }
}
