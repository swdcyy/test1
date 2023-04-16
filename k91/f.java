package k91.f;
import k91.b;
import java.lang.Object;
import java.lang.String;
import q00.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import k91.a;

public class f implements b	// class@002ce4
{

    public void f(){
       super();
    }
    public String a(){
       return "TRADITION";
    }
    public void b(b p0,boolean p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uof, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p1) {
          p0.r();
       }else {
          p0.B();
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public void release(){
       a.a(this);
    }
}
