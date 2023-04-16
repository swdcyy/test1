package mg.j0;
import erd.g;
import f55.g;
import java.lang.Object;
import java.lang.Boolean;
import og.l;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.lang.Integer;
import android.os.Bundle;

public final class j0 implements g	// class@002610
{
    public final g b;

    public void j0(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object[] objArray = new Object[0];
       l.D().w("JsGrowthBridgeFuns", "uploadCurrentDraftFile\(\)  success="+p0, objArray);
       a.o(p0, "success");
       if (p0.booleanValue()) {
          p0 = new HashMap();
          p0.put("result", Integer.valueOf(1));
          j0 tb = this.b;
          if (tb != null) {
             tb.onSuccess(p0);
          }
       }else {
          p0 = this.b;
          if (p0 != null) {
             p0.a(412, "something wrong", null);
          }
       }
       return;
    }
}
