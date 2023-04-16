package b58.c;
import erd.a;
import b58.p;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b58.p$b;
import b58.p$a;

public final class c implements a	// class@0002fd
{
    public final p b;

    public void c(p p0){
       this.b = p0;
    }
    public final void run(){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, p.class, "5")) {
       }else {
          p.a(new p$b("success", tb.a, "", null));
       }
       return;
    }
}
