package ata.g;
import zq6.u;
import ata.d;
import java.lang.Object;
import co5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tra.b;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.framework.model.kcube.TabViewInfo$TabLottie;

public final class g implements u	// class@0002ff
{
    public final d a;

    public void g(d p0){
       this.a = p0;
       super();
    }
    public void onChange(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          b.C().w("TabLottieViewHelper", "bindData "+p0.b, objArray);
          if (p0.b != null) {
             this.a.c(p0.a);
          }else {
             this.a.h();
          }
       }
       return;
    }
}
