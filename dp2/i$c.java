package dp2.i$c;
import erd.g;
import dp2.i;
import msd.l;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jp2.w;
import com.google.common.base.Optional;
import dp2.j;
import q00.b;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import com.yxcorp.gifshow.model.Lyrics;
import jp2.u;
import zo2.a0;
import jp2.c;

public final class i$c implements g	// class@002575
{
    public final i b;
    public final l c;
    public final KtvMusicOrderInfo d;

    public void i$c(i p0,l p1,KtvMusicOrderInfo p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$c.class, "1")) {
       }else {
          i$c tb = this.b;
          j oj = new j(this.b.h.e(), this.b.h.d(), tb.i, tb.h, tb.k, this.d, p0.component1(), tb.l, p0.component2().orNull());
          this.c.invoke(v11);
       }
       return;
    }
}
