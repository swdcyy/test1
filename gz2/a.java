package gz2.a;
import gz2.h;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGiftEffectLocalRenderTextureView;
import dz2.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import android.os.SystemClock;

public class a extends h	// class@002bd4
{
    public long q;
    public final long r;
    public static final List s;

    static {
       a.s = LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectFrameRateLimitLocalRenderer");
    }
    public void a(LiveGiftEffectLocalRenderTextureView p0,int p1,long p2,c p3){
       super(p0, p1, p3);
       b.P(a.s, "[init]frameRate:"+p2);
       long l = 0;
       if (p2 - l <= 0) {
       }else {
          l = 1000 / p2;
       }
       this.r = l;
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       if (!this.r) {
          super.j();
          return;
       }else {
          long l = System.currentTimeMillis() - this.q;
          a tr = this.r;
          if (l - tr < 0 && l >= 0) {
             SystemClock.sleep((tr - l));
          }
          this.q = System.currentTimeMillis();
          super.j();
          return;
       }
    }
}
