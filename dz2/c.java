package dz2.c;
import dz2.c$a;
import java.lang.Object;
import java.util.HashMap;
import o56.a;
import java.util.Map;
import pkd.a;
import android.os.Build;
import android.os.Build$VERSION;
import java.lang.String;
import com.yxcorp.gifshow.util.resource.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class c	// class@0025ee
{
    public final Map a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final c$a i;

    public void c(c$a p0){
       super();
       HashMap hashMap = new HashMap();
       this.a = hashMap;
       this.b = "platform";
       this.c = "product";
       this.d = "appVersion";
       this.e = "model";
       this.f = "osVersion";
       this.g = "isAnchor";
       this.h = "cpu";
       hashMap.put("platform", a.A);
       hashMap.put("product", a.x);
       hashMap.put("appVersion", a.e);
       hashMap.put("model", Build.BOARD);
       hashMap.put("osVersion", String.valueOf(Build$VERSION.SDK_INT));
       hashMap.put("cpu", p.b());
       this.i = p0;
    }
    public Map a(){
       c uoc = c.class;
       Object obj = PatchProxy.apply(null, this, uoc, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = String.valueOf(this.i.e());
       if (!PatchProxy.applyVoidTwoRefs("isAnchor", str, this, uoc, "2")) {
          this.a.put("isAnchor", str);
       }
       return this.a;
    }
}
