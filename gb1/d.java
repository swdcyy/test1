package gb1.d;
import eb1.a;
import gb1.g;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eb1.e;
import db1.b;
import bb1.b;
import wkd.b;
import rfc.a;
import com.kwai.framework.model.user.UserInfo;
import brd.t;
import cjd.e;
import erd.o;
import gb1.e;
import gb1.f;
import erd.g;
import crd.b;

public final class d implements a	// class@002455
{
    public final g a;

    public void d(g p0){
       this.a = p0;
    }
    public final void run(){
       d ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, ta, g.class, "4")) {
       }else {
          b uob = ta.b.b();
          String str = uob.a();
          ta.c(b.a(0x4a533fa).a(str, uob.f().mId, objArray, objArray).map(new e()).subscribe(new e(ta), new f(ta)));
       }
       return;
    }
}
