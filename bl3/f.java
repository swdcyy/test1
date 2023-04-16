package bl3.f;
import erd.g;
import bl3.i;
import java.lang.Object;
import zca.s;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dk3.b;
import com.kuaishou.live.preview.log.LivePreviewLogTag;
import java.lang.Boolean;
import pp.c;
import pp.d;
import com.yxcorp.gifshow.autoplay.live.LiveStopReason;

public final class f implements g	// class@0003ea
{
    public final i b;

    public void f(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, i.class, "19")) {
       }else if(!tb.isSelected()){
          tb.I.i(LivePreviewLogTag.LIVE_PREVIEW_PLAYER, "handleSlidingPanelEvent", "open", Boolean.valueOf(p0.a));
          if (p0.a != null) {
             tb.a9(LiveStopReason.SLIDE_AWAY);
          }else {
             tb.W8();
          }
       }
       return;
    }
}
