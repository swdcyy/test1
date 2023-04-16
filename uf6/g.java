package uf6.g;
import erd.g;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import java.lang.Object;
import eda.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import com.kwai.framework.model.user.QCurrentUser;

public final class g implements g	// class@0025e3
{
    public final SwitchConfigInitModule b;

    public void g(SwitchConfigInitModule p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, SwitchConfigInitModule.class, "4")) {
       }else {
          a.t().x(QCurrentUser.ME.getId());
       }
       return;
    }
}
