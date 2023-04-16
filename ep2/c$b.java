package ep2.c$b;
import erd.g;
import ep2.c;
import msd.l;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jp2.w;
import com.google.common.base.Optional;
import ep2.d;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import com.yxcorp.gifshow.model.Lyrics;

public final class c$b implements g	// class@0027ad
{
    public final c b;
    public final l c;

    public void c$b(c p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
       }else {
          this.c.invoke(new d(this.b.e.d(), p0.component1(), p0.component2().orNull()));
       }
       return;
    }
}
