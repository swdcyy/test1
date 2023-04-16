package lf9.f;
import io.reactivex.g;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import brd.g;
import z3b.a0;
import z3b.f;
import lf9.f$a;
import com.yxcorp.gifshow.model.MagicBaseConfig;

public final class f implements g	// class@002dd2
{
    public final MagicEmoji$MagicFace b;

    public void f(MagicEmoji$MagicFace p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       p0.onNext(Integer.valueOf(0));
       f[] uofArray = new f[]{new f$a(p0)};
       a0.o().a("record", "inner_resource", this.b, uofArray);
       return;
    }
}
