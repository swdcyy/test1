package gb1.m;
import eb1.a;
import gb1.s;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eb1.e;
import db1.b;
import bb1.b;
import com.kwai.framework.model.user.UserInfo;
import lnc.a1;
import gb1.o;

public final class m implements a	// class@002475
{
    public final s a;

    public void m(s p0){
       this.a = p0;
    }
    public final void run(){
       m ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, s.class, "5")) {
       }else {
          b uob = ta.b.b();
          UserInfo userInfo = uob.f();
          String str = uob.c();
          ta.h(a1.r(R.string.arg_RES_7f101ffa, uob.h()), new o(ta, str, userInfo));
       }
       return;
    }
}
