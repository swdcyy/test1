package ara.d;
import erd.g;
import com.yxcorp.gifshow.growth.uninstall.UninstallAppDetainmentInitModule;
import java.lang.Object;
import eda.l;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ara.e;

public final class d implements g	// class@0002c9
{
    public final UninstallAppDetainmentInitModule b;

    public void d(UninstallAppDetainmentInitModule p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, UninstallAppDetainmentInitModule.class, "5")) {
       }else {
          e.b();
       }
       return;
    }
}
