package dta.o;
import erd.g;
import com.yxcorp.gifshow.homepage.kcube.presenter.a;
import java.lang.Object;
import eda.l;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tra.b;
import q87.c;
import com.kwai.framework.model.user.QCurrentUser;
import hn5.i0;
import lr6.a;

public final class o implements g	// class@002546
{
    public final a b;

    public void o(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, a.class, "13")) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          b.C().w("KCubeActionBarPres", "loginEvent", objArray);
          if (!QCurrentUser.ME.isLogined()) {
             Object[] objArray1 = new Object[i];
             b.C().w("KCubeActionBarPres", "loginEvent , login = false", objArray1);
             i0.b("LoginSdkError", "loginEvent");
          }
          tb.C.E();
          tb.C.s();
       }
       return;
    }
}
