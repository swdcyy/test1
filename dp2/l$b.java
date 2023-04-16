package dp2.l$b;
import erd.g;
import dp2.l;
import msd.l;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jp2.w;
import com.google.common.base.Optional;
import dp2.m;
import q00.b;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import jp2.c;
import com.yxcorp.gifshow.model.Lyrics;
import jp2.u;

public final class l$b implements g	// class@00257c
{
    public final l b;
    public final l c;
    public final KtvMusicOrderInfo d;

    public void l$b(l p0,l p1,KtvMusicOrderInfo p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$b.class, "1")) {
       }else {
          l$b tb = this.b;
          c uoc = tb.c();
          m om = new m(this.b.d.e(), this.b.d.d(), tb.e, uoc, this.d, p0.component1(), p0.component2().orNull());
          this.c.invoke(v9);
       }
       return;
    }
}
