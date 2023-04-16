package mg.c0;
import erd.g;
import f55.g;
import java.lang.Object;
import java.lang.String;
import og.l;
import java.lang.StringBuilder;
import q87.c;
import java.util.HashMap;
import java.lang.Integer;
import kotlin.jvm.internal.a;

public final class c0 implements g	// class@0025d5
{
    public final g b;

    public void c0(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object[] objArray = new Object[0];
       l.D().w("JsGrowthBridgeFuns", "processCurrentDraftFile\(\) zip="+p0, objArray);
       HashMap hashMap = new HashMap();
       hashMap.put("result", Integer.valueOf(1));
       a.o(p0, "it");
       hashMap.put("uploadKey", p0);
       p0 = this.b;
       if (p0 != null) {
          p0.onSuccess(hashMap);
       }
       return;
    }
}
