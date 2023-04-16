package bh9.m;
import erd.g;
import bh9.r;
import java.lang.Object;
import kd9.e0;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.BitSet;

public final class m implements g	// class@0004a2
{
    public final r b;

    public void m(r p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, r.class, "7")) {
       }else if(p0.a != null){
          tb.t.set(2);
          tb.h2(true);
       }else {
          tb.t.clear(2);
          tb.l2();
       }
       return;
    }
}
