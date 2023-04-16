package cea.c;
import erd.g;
import cea.f;
import java.lang.Object;
import g50.i;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e50.g;

public final class c implements g	// class@0004e8
{
    public final f b;

    public void c(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, f.class, "5")) {
       }else if(p0 == null){
          tb.r.j(p0.a());
          tb.P8();
       }
       return;
    }
}
