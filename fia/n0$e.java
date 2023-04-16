package fia.n0$e;
import erd.g;
import fia.n0;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;

public final class n0$e implements g	// class@00292a
{
    public final n0 b;

    public void n0$e(n0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       n0$e uoe = n0$e.class;
       if (PatchProxy.isSupport(uoe) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uoe, "1") && (b && this.b.s9()))) {
          this.b.o9();
       }
    label_002a :
       return;
    }
}
