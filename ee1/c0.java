package ee1.c0;
import z1.a;
import java.lang.Object;
import wv4.d1;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import wv4.a;
import tv4.a;

public final class c0 implements a	// class@0020fe
{
    public final long a;

    public void c0(long p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       c0 ta = this.a;
       Objects.requireNonNull(p0);
       d1 uod1 = d1.class;
       if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Long.valueOf(ta), p0, uod1, "8")) {
          p0.a.h0(ta);
       }
       return;
    }
}
