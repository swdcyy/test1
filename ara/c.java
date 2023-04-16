package ara.c;
import erd.g;
import com.yxcorp.gifshow.growth.uninstall.UninstallAppDetainmentInitModule;
import java.lang.Object;
import zca.p;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wh5.c;
import com.yxcorp.gifshow.growth.uninstall.a;
import java.lang.Runnable;
import ekd.k1;

public final class c implements g	// class@0002c8
{
    public final UninstallAppDetainmentInitModule b;

    public void c(UninstallAppDetainmentInitModule p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, UninstallAppDetainmentInitModule.class, "4")) {
       }else if(!c.b()){
          k1.r(a.b, 3000);
       }
       return;
    }
}
