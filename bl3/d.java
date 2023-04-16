package bl3.d;
import erd.g;
import bl3.i;
import java.lang.Object;
import ujc.e;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.preview.log.LivePreviewLogTag;
import java.lang.Integer;
import pp.c;
import pp.d;

public final class d implements g	// class@0003e8
{
    public final i b;

    public void d(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, i.class, "17")) {
       }else {
          tb.I.i(LivePreviewLogTag.LIVE_PREVIEW_PLAYER, "onHomeSplashStateEvent", "state", Integer.valueOf(p0.a));
          p0 = p0.a;
          if (p0 == 5 || p0 == 4) {
             tb.W8();
          }
       }
       return;
    }
}
