package dta.p;
import erd.g;
import com.yxcorp.gifshow.homepage.kcube.presenter.a;
import java.lang.Object;
import eda.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tra.b;
import q87.c;
import com.kwai.framework.model.user.QCurrentUser;
import hn5.i0;
import lr6.a;

public final class p implements g	// class@002548
{
    public final a b;

    public void p(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, a.class, "14")) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          b.C().w("KCubeActionBarPres", "logoutEvent", objArray);
          if (QCurrentUser.ME.isLogined()) {
             Object[] objArray1 = new Object[i];
             b.C().w("KCubeActionBarPres", "logoutEvent , login = true", objArray1);
             i0.b("LoginSdkError", "logoutEvent");
          }
          tb.C.E();
          tb.C.s();
       }
       return;
    }
}
