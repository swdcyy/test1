package ata.f;
import erd.g;
import ata.d;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wq6.h;

public final class f implements g	// class@0002fe
{
    public final d b;

    public void f(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else {
          p0 = this.b;
          d.f(p0, p0.k.isSelected(), false, 2, null);
       }
       return;
    }
}
