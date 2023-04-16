package gs2.m;
import erd.g;
import gs2.i;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.music.m$a;
import qu2.a;
import hp2.e;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import jp2.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import com.kuaishou.live.core.voiceparty.music.m;
import gs2.k;
import gs2.l;
import java.lang.Runnable;
import ok.h;

public final class m implements g	// class@002b9d
{
    public final i b;

    public void m(i p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
       }else {
          this.b.n.d(true);
          this.b.n.c(new m$a(this.b.k.getLiveStreamId(), this.b.l.f().g0(), this.b.m.e().d(), p0), k.b, l.b);
       }
       return;
    }
}
