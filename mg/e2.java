package mg.e2;
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
import mg.t;
import mg.u;
import erd.g;

public final class e2 implements Runnable	// class@0025f4
{
    public final g b;

    public void e2(g p0){
       this.b = p0;
    }
    public final void run(){
       e2 tb = this.b;
       int i = 0;
       Object[] objArray = new Object[i];
       l.D().w("JsGrowthBridgeFuns", "getCurrentDraftFileSize\(\) ", objArray);
       b a = v.a;
       if (a != null) {
          a.dispose();
       }
       d uod = y6.r(d.class);
       if (uod == null) {
          Object[] objArray1 = new Object[i];
          l.D().A("JsGrowthBridgeFuns", "getCurrentDraftFileSize\(\) download plugin failed", objArray1);
          if (tb != null) {
             tb.a(0x4e21, "download plugin failed", null);
          }
       }else {
          v.a = uod.EF().observeOn(d.a).subscribe(new t(tb), new u(tb));
       }
       return;
    }
}
