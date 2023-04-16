package az9.w;
import erd.g;
import az9.i0;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import az9.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import kotlin.jvm.internal.a;
import mm5.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.danmaku.DanmakuSwitchUtil;
import xx9.a;
import k2b.e0;

public final class w implements g	// class@00033d
{
    public final i0 b;

    public void w(i0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       w tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = p0.booleanValue();
       i0 u = tb.u;
       i0 x = tb.x;
       p0 = tb.B;
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(Boolean.valueOf(b), u, x, p0, null, a.class, "7")) {
          a.p(u, "photo");
          a.p(x, "fragment");
          a.p(p0, "screenCleanStatusCombination");
          c.a.b(x, u, DanmakuSwitchUtil.b(u), b, p0.c());
       }
       return;
    }
}
