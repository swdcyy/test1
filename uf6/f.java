package uf6.f;
import erd.g;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import java.lang.Object;
import eda.l;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import com.kwai.framework.model.user.QCurrentUser;

public final class f implements g	// class@0025e2
{
    public final SwitchConfigInitModule b;

    public void f(SwitchConfigInitModule p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, SwitchConfigInitModule.class, "3")) {
       }else {
          a.t().x(QCurrentUser.ME.getId());
       }
       return;
    }
}
