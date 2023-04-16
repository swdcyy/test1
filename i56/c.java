package i56.c;
import erd.g;
import com.kwai.framework.abtest.ABTestInitModule;
import java.lang.Object;
import eda.l;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wu8.p;
import com.kwai.framework.model.user.QCurrentUser;

public final class c implements g	// class@0017a0
{
    public final ABTestInitModule b;

    public void c(ABTestInitModule p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, ABTestInitModule.class, "11")) {
       }else {
          p.d().i(QCurrentUser.ME.getId());
       }
       return;
    }
}
