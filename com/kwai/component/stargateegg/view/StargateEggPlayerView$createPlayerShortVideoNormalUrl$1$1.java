package com.kwai.component.stargateegg.view.StargateEggPlayerView$createPlayerShortVideoNormalUrl$1$1;
import com.kwai.video.player.misc.IMediaDataSource;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$createPlayerShortVideoNormalUrl$1;
import kotlin.jvm.internal.Ref$LongRef;
import java.io.InputStream;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$createPlayerShortVideoNormalUrl$1$1$close$1;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$createPlayerShortVideoNormalUrl$1$1$close$2;
import msd.a;
import msd.l;
import com.kwai.component.stargateegg.player.StargateEggPlayerRunSafeThread;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Long;
import java.lang.Integer;

public final class StargateEggPlayerView$createPlayerShortVideoNormalUrl$1$1 implements IMediaDataSource	// class@000b51
{
    public final StargateEggPlayerView$createPlayerShortVideoNormalUrl$1 a;
    public final Ref$LongRef b;
    public final InputStream c;

    public void StargateEggPlayerView$createPlayerShortVideoNormalUrl$1$1(StargateEggPlayerView$createPlayerShortVideoNormalUrl$1 p0,Ref$LongRef p1,InputStream p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, StargateEggPlayerView$createPlayerShortVideoNormalUrl$1$1.class, "3")) {
          return;
       }
       StargateEggPlayerRunSafeThread.b(new StargateEggPlayerView$createPlayerShortVideoNormalUrl$1$1$close$1(this), new StargateEggPlayerView$createPlayerShortVideoNormalUrl$1$1$close$2(this));
       return;
    }
    public long getSize(){
       Object obj = PatchProxy.apply(null, this, StargateEggPlayerView$createPlayerShortVideoNormalUrl$1$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (long)this.c.available();
    }
    public int readAt(long p0,byte[] p1,int p2,int p3){
       Ref$LongRef obj;
       int i;
       if (PatchProxy.isSupport(StargateEggPlayerView$createPlayerShortVideoNormalUrl$1$1.class)) {
          obj = PatchProxy.applyFourRefs(Long.valueOf(p0), p1, Integer.valueOf(p2), Integer.valueOf(p3), this, StargateEggPlayerView$createPlayerShortVideoNormalUrl$1$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p1 != null) {
          obj = this.b.element;
          if (obj - p0 < 0) {
             this.c.skip((p0 - obj));
          }else {
             this.c.reset();
             this.c.skip(p0);
          }
          this.b.element = p0;
          i = this.c.read(p1, p2, p3);
          StargateEggPlayerView$createPlayerShortVideoNormalUrl$1$1 tb = this.b;
          tb.element = tb.element + (long)i;
       }else {
          i = -1;
       }
       return i;
    }
}
