package fda.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class b	// class@0028d0
{
    public String a;
    public long b;
    public String c;

    public void b(){
       super();
       this.a = "";
       this.c = "";
    }
    public final String a(){
       return this.a;
    }
    public final void b(long p0){
       this.b = p0;
    }
    public final void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.a = p0;
       return;
    }
}
