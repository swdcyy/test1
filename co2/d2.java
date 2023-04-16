package co2.d2;
import vq5.b;
import java.lang.String;
import co2.e2;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import kotlin.jvm.internal.a;

public final class d2 implements b	// class@000581
{
    public final String a;
    public final e2 b;

    public void d2(String p0,e2 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public boolean a(){
       return a.a(this);
    }
    public final void b(Uri p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d2.class, "1")) {
          return;
       }
       List list = this.b.b.get(this.a);
       if (list == null) {
          list = new ArrayList();
       }
       a.o(p0, "uri");
       list.add(p0);
       this.b.b.put(this.a, list);
       PatchProxy.onMethodExit(d2.class, "1");
       return;
    }
}
