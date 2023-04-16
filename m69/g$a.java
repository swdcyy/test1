package m69.g$a;
import erd.o;
import com.yxcorp.gifshow.aicut.api.AICutMusicInfo;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.music.Music;
import brd.t;
import l69.t;
import wkd.b;
import com.yxcorp.gifshow.music.utils.a;

public final class g$a implements o	// class@002e17
{
    public final AICutMusicInfo b;

    public void g$a(AICutMusicInfo p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, g$a.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          p0 = this.b;
          p0 = (p0 == null)? t.just(new Music()): t.just(b.a(-905856758).h(t.a.b(p0)));
          ot = p0;
       }
       return ot;
    }
}
