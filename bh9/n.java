package bh9.n;
import erd.g;
import bh9.r;
import java.lang.Object;
import zb9.q;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.BitSet;

public final class n implements g	// class@0004a3
{
    public final r b;

    public void n(r p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, r.class, "8")) {
       }else if(p0.a != null){
          tb.t.set(6);
          tb.h2(true);
       }else {
          tb.t.clear(6);
          tb.l2();
       }
       return;
    }
}
