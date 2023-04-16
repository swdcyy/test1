package bh9.l;
import erd.g;
import bh9.r;
import java.lang.Object;
import xg9.k;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.BitSet;

public final class l implements g	// class@0004a1
{
    public final r b;

    public void l(r p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, r.class, "6")) {
       }else if(p0.a != null){
          tb.t.set(3);
          tb.h2(true);
       }else {
          tb.t.clear(3);
          tb.l2();
       }
       return;
    }
}
