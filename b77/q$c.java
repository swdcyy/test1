package b77.q$c;
import b77.j;
import b77.q;
import java.lang.Object;
import mrd.c;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import brd.y;

public class q$c implements j	// class@0003ea
{
    public final q a;

    public void q$c(q p0){
       this.a = p0;
       super();
    }
    public c a(){
       return this.a.p;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$c.class, "1")) {
          return;
       }
       if (TextUtils.x(p0)) {
          p0 = "";
       }
       this.a.p.onNext(p0);
       return;
    }
}
