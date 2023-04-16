package oj.i;
import nj.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nj.g;
import k2b.e0;
import nj.b;
import oj.h;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class i extends a	// class@0027d9
{

    public void i(){
       super();
    }
    public void A(){
       String str = "1";
       if (PatchProxy.applyVoid(null, this, i.class, str)) {
          return;
       }
       a ta = this.a;
       if (ta != null) {
          g a = ta.a;
          if (a != null) {
             e0 uoe0 = a.c();
             if (!PatchProxy.applyVoidOneRefs(uoe0, null, h.class, str)) {
                u1.C0("", uoe0, 1, null, null);
             }
          }
       }
       return;
    }
}
