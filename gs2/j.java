package gs2.j;
import erd.o;
import gs2.i;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMusicInfoResponse;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import java.util.Objects;
import brd.t;
import gs2.h;
import io.reactivex.g;

public final class j implements o	// class@002b9a
{
    public final i b;

    public void j(i p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j obj = PatchProxy.applyOneRefs(p0, this, j.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = this.b;
          a.m(p0);
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.applyOneRefs(p0, obj, i.class, "4");
          obj = (obj1 != patchProxyRe)? obj1: t.create(new h(obj, p0));
       }
       return obj;
    }
}
