package fia.o;
import fia.f;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xl8.b;
import kotlin.jvm.internal.a;

public final class o extends f	// class@002931
{

    public void o(){
       super();
    }
    public t Y8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f obj = PatchProxy.apply(null, this, o.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, this, f.class, "4");
       if (obj != patchProxyRe) {
       }else {
          obj = this.q;
          if (obj == null) {
             a.S("mPymiTipsShowResponseObservableData");
          }
       }
       t ot = obj.b();
       a.o(ot, "mPymiTipsShowResponseObservableData.observe\(\)");
       return ot;
    }
}
