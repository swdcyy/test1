package nfd.a0$c;
import vfd.a;
import java.lang.Object;
import com.facebook.drawee.generic.RoundingParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import lnc.a1;

public class a0$c implements a	// class@001d84
{

    public void a0$c(){
       super();
    }
    public void a(RoundingParams p0,boolean p1){
       a0$c uoc = a0$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "1")) {
          return;
       }
       if (p1) {
          p0.j(a1.a(R.color.arg_RES_7f060751), (float)a1.e(2.00f));
          p0.p((float)a1.e(3.00f));
       }else {
          p0.j(a1.a(R.color.arg_RES_7f062033), (float)a1.e(0x3f000000));
          p0.p(0);
       }
       return;
    }
}
