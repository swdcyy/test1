package d76.d;
import erd.g;
import com.kwai.framework.initmodule.AzerothInitModule;
import java.lang.Object;
import eda.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.middleware.azeroth.Azeroth2;
import com.kwai.middleware.azeroth.AzerothAccount;

public final class d implements g	// class@001475
{
    public final AzerothInitModule b;

    public void d(AzerothInitModule p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, AzerothInitModule.class, "4")) {
       }else if(p0.a != null){
          Azeroth2.B.s("on_logout", null);
       }
       return;
    }
}
