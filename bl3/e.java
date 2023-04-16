package bl3.e;
import erd.g;
import bl3.i;
import java.lang.Object;
import osb.a;
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

public final class e implements g	// class@0003e9
{
    public final i b;

    public void e(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, i.class, "18")) {
       }else if(!tb.isSelected()){
          tb.I.i(LivePreviewLogTag.LIVE_PREVIEW_PLAYER, "handleRedPackageTaskEvent", "open", Boolean.valueOf(p0.a));
          if (p0.a != null) {
             tb.a9(LiveStopReason.SLIDE_AWAY);
          }else {
             tb.W8();
          }
       }
       return;
    }
}
