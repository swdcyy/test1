package nfd.a0$b;
import vfd.a;
import java.lang.Object;
import com.facebook.drawee.generic.RoundingParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import lnc.a1;

public class a0$b implements a	// class@001d83
{

    public void a0$b(){
       super();
    }
    public void a(RoundingParams p0,boolean p1){
       a0$b uob = a0$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (p1) {
          p0.j(a1.a(R.color.arg_RES_7f060751), (float)a1.e(0x3fc00000));
          p0.p((float)a1.e(3.00f));
       }else {
          p0.j(a1.a(R.color.arg_RES_7f062033), 0);
          p0.p(0);
       }
       return;
    }
}
