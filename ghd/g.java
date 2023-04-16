package ghd.g;
import erd.g;
import qyb.a;
import java.lang.Object;
import njd.a;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.plugin.setting.utils.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import bda.a$b;
import java.lang.String;
import lnc.a1;
import bda.a;

public final class g implements g	// class@000f2e
{
    public final int b;
    public final a c;

    public void g(int p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       boolean b;
       g tb = this.b;
       g tc = this.c;
       QCurrentUser.ME.startEdit().setFollowListVisibilityOption(b.a(tb)).commitChanges();
       if (tc != null) {
          tc.a(b.a(tb));
       }
       String str = "authorizeFanList";
       b = true;
       if (QCurrentUser.ME.getFollowListVisibilityOption() != b) {
          a$b uob = new a$b();
          uob.e(a1.p(R.string.arg_RES_7f1046e4));
          uob.d(b);
          uob.c(b);
          uob.b(str);
          RxBus.f.b(uob.a());
       }else {
          a$b uob1 = new a$b();
          uob1.e(a1.p(R.string.turn_on));
          uob1.c(false);
          uob1.b(str);
          RxBus.f.b(uob1.a());
       }
       return;
    }
}
