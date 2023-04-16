package i56.b;
import erd.g;
import com.kwai.framework.abtest.ABTestInitModule;
import java.lang.Object;
import eda.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wu8.p;
import com.kwai.framework.model.user.QCurrentUser;

public final class b implements g	// class@00179f
{
    public final ABTestInitModule b;

    public void b(ABTestInitModule p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, ABTestInitModule.class, "10")) {
       }else {
          p.d().i(QCurrentUser.ME.getId());
       }
       return;
    }
}
