package lz0.c$c;
import com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridView$a;
import lz0.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import vg1.c;
import lz0.d;
import lz0.e;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import bk2.e;

public class c$c implements LiveGiftGridView$a	// class@003082
{
    public final c a;

    public void c$c(c p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       c$c uoc = c$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       this.a.M.d(p0, k0.b(this.a.S8(), new d(p0), e.a).or(Integer.valueOf(0)).intValue(), 0);
       return;
    }
}
