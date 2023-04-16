package mg.f2;
import java.lang.Runnable;
import f55.g;
import java.lang.Object;
import og.l;
import java.lang.String;
import q87.c;
import mg.v;
import crd.b;
import r16.d;
import java.lang.Class;
import lnc.x6;
import lnc.y6;
import android.os.Bundle;
import brd.t;
import t45.d;
import brd.z;
import mg.c0;
import mg.d0;
import erd.g;

public final class f2 implements Runnable	// class@0025fa
{
    public final g b;

    public void f2(g p0){
       this.b = p0;
    }
    public final void run(){
       f2 tb = this.b;
       int i = 0;
       Object[] objArray = new Object[i];
       l.D().w("JsGrowthBridgeFuns", "processCurrentDraftFile\(\) ", objArray);
       b b = v.b;
       if (b != null) {
          b.dispose();
       }
       d uod = y6.r(d.class);
       if (uod == null) {
          Object[] objArray1 = new Object[i];
          l.D().A("JsGrowthBridgeFuns", "processCurrentDraftFile\(\) download plugin failed", objArray1);
          if (tb != null) {
             tb.a(0x4e21, "download plugin failed", null);
          }
       }else {
          v.b = uod.D10().observeOn(d.a).subscribe(new c0(tb), new d0(tb));
       }
       return;
    }
}
