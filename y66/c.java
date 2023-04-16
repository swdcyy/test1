package y66.c;
import e0d.d$b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import k2b.u1;

public class c implements d$b	// class@002845
{

    public void c(){
       super();
    }
    public void reportCustomEvent(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       u1.R(p0, p1, 21);
       return;
    }
}
