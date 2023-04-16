package az0.e;
import mq5.h;
import com.kuaishou.live.audience.component.gift.gift.b;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.gift.i;
import bm1.b;
import ik1.f0;

public final class e implements h	// class@0002d3
{
    public final b b;

    public void e(b p0){
       this.b = p0;
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, b.class, "5")) {
       }else {
          tb.D.a();
          i v = tb.v;
          if (v != null) {
             v.a();
          }
       }
       return;
    }
}
