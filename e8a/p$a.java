package e8a.p$a;
import d6a.a;
import e8a.p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class p$a extends a	// class@0020c8
{
    public final p b;

    public void p$a(p p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, p$a.class, "2")) {
          return;
       }
       this.b.r = false;
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, p$a.class, "1")) {
          return;
       }
       this.b.r = true;
       return;
    }
}
