package cl3.f$c;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$c;
import cl3.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.common.core.basic.player.AdaptPlayViewReason;
import com.kuaishou.live.preview.log.LivePreviewLogTag;
import pp.c;
import pp.d;
import cl3.n;

public class f$c implements LiveAutoPlay$c	// class@000591
{
    public final f a;

    public void f$c(f p0){
       this.a = p0;
       super();
    }
    public void onVideoSizeChanged(int p0,int p1){
    }
    public void onVideoSizeChangedWithType(int p0,int p1,int p2){
       if (PatchProxy.isSupport(f$c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, f$c.class, "1")) {
          return;
       }
       f$c ta = this.a;
       if (ta.p > null && ta.q > null) {
          ta.h(p0, p1, AdaptPlayViewReason.DEFAULT);
       }else {
          ta.k.h(LivePreviewLogTag.LIVE_PREVIEW_PLAYER, "resize texture view failed, try to resize after content view attached");
       }
       this.a.o = new n(p0, p1, p2);
       return;
    }
}
