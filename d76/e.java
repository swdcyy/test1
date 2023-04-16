package d76.e;
import erd.g;
import com.kwai.framework.initmodule.AzerothInitModule;
import java.lang.Object;
import eda.l;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import e66.c;
import java.lang.NullPointerException;
import java.lang.Throwable;
import q87.c;
import com.kwai.middleware.azeroth.AzerothAccount;
import com.kwai.middleware.azeroth.Azeroth2;
import kotlin.jvm.internal.a;
import java.lang.IllegalArgumentException;

public final class e implements g	// class@001476
{
    public final AzerothInitModule b;

    public void e(AzerothInitModule p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, AzerothInitModule.class, "3")) {
       }else {
          p0 = QCurrentUser.me();
          if (p0 == null) {
             Object[] objArray = new Object[0];
             c.C().u("Azeroth on login event", new NullPointerException("The azeroth received login event but the user is null."), objArray);
          }else {
             AzerothAccount uAzerothAcco = new AzerothAccount("", "", "", "", false);
             tb.b = p0.getId();
             tb.c = p0.getPassToken();
             tb.d = p0.getApiServiceToken();
             tb.e = p0.getSecurityToken();
             tb.f = p0.isLogined() ^ 0x01;
             p0 = Azeroth2.B;
             if (p0.c() == null) {
                a.q(tb, "account");
                if (!a.g(tb, p0.c())) {
                   if (tb.a()) {
                      p0.s("on_login", tb);
                   }else {
                      p0.v(new IllegalArgumentException("The azeroth received an invalid account."));
                   }
                }
             }else if(!(p0.c().b).equals(tb.b)){
                a.q(tb, "account");
                if (!a.g(tb, p0.c())) {
                   if (tb.a()) {
                      p0.s("on_switch_account", tb);
                   }else {
                      p0.v(new IllegalArgumentException("The azeroth received an invalid account."));
                   }
                }
             }
          }
       }
       return;
    }
}
