package lf9.d;
import lf9.b;
import lf9.m;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import kf9.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.b;
import kf9.f;
import java.util.List;
import if9.a;
import if9.c;
import kf9.e;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.HashMap;
import java.lang.Integer;
import java.util.Map;

public final class d extends b	// class@002dce
{

    public void d(m p0){
       a.p(p0, "provider");
       super(p0);
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          a.p(p0, "action");
          b uob = this.a().j();
          a uoa = uob.f().get(p0.b());
          if (uoa instanceof c) {
             c magicFace = uoa.magicFace;
             a.m(magicFace);
             uob.g().put(Integer.valueOf(p0.b()), new e(magicFace, -1, 0, uoa.a));
             this.a().h(f.a(uob, null, 0, 0, null, false, false, 63, null));
          }
       }
       return;
    }
}
