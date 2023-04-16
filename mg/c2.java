package mg.c2;
import java.lang.Runnable;
import f55.g;
import java.lang.Object;
import og.l;
import java.lang.String;
import q87.c;
import mg.v;
import crd.b;
import java.util.HashMap;
import java.lang.Integer;

public final class c2 implements Runnable	// class@0025d7
{
    public final g b;

    public void c2(g p0){
       this.b = p0;
    }
    public final void run(){
       c2 tb = this.b;
       Object[] objArray = new Object[0];
       l.D().w("JsGrowthBridgeFuns", "cancelCurrentDraftFileProcess\(\) ", objArray);
       b b = v.b;
       if (b != null) {
          b.dispose();
       }
       HashMap hashMap = new HashMap();
       hashMap.put("result", Integer.valueOf(1));
       if (tb != null) {
          tb.onSuccess(hashMap);
       }
       return;
    }
}
