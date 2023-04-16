package mg.t;
import erd.g;
import f55.g;
import java.lang.Object;
import android.util.Pair;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class t implements g	// class@002666
{
    public final g b;

    public void t(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       HashMap hashMap = new HashMap();
       hashMap.put("result", Integer.valueOf(1));
       p0 = p0.second;
       a.o(p0, "it.second");
       hashMap.put("size", p0);
       p0 = this.b;
       if (p0 != null) {
          p0.onSuccess(hashMap);
       }
       return;
    }
}
