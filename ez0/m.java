package ez0.m;
import erd.g;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.k;
import java.lang.Object;
import eda.l;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import ad5.b;
import ad5.a;
import mk1.f;

public final class m implements g	// class@002252
{
    public final k b;

    public void m(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, k.class, "3")) {
       }else {
          d.a(0x630bc993).d1().l();
          tb.P8();
          tb.M.clear();
       }
       return;
    }
}
