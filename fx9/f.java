package fx9.f;
import erd.g;
import fx9.i;
import java.lang.Object;
import nk9.m;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class f implements g	// class@002371
{
    public final i b;

    public void f(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, i.class, "10")) {
       }else {
          tb.w = true;
          tb.P8();
       }
       return;
    }
}
