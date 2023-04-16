package ata.b;
import zq6.u;
import ata.a;
import java.lang.Object;
import co5.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.kcube.TabViewInfo$TabIcon;

public final class b implements u	// class@0002f5
{
    public final a a;

    public void b(a p0){
       this.a = p0;
       super();
    }
    public void onChange(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else if(p0.c != null){
          this.a.b(p0.a);
       }else {
          this.a.b(null);
       }
       return;
    }
}
