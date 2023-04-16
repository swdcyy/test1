package bl4.i;
import java.lang.Runnable;
import bl4.j$a;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.utility.TextUtils;
import cl4.a;
import al4.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import java.lang.CharSequence;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.e0;
import k2b.u1;

public final class i implements Runnable	// class@000394
{
    public final j$a b;
    public final int c;
    public final String d;

    public void i(j$a p0,int p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       i tb = this.b;
       i tc = this.c;
       Objects.requireNonNull(tb);
       String str = TextUtils.k(this.d);
       a d = tb.a.d;
       if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(tc), str, d, null, e.class, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PRE_PAY_RESULT";
          i3 oi3 = i3.f();
          oi3.c("result_status", Integer.valueOf(tc));
          if (!TextUtils.x(str)) {
             oi3.d("order_id", str);
          }
          uElementPack.params = oi3.e();
          h$b uob = h$b.e(7, "PRE_PAY_RESULT");
          uob.k(uElementPack);
          uob.h(new ClientContent$ContentPackage());
          uob.u(e.a("", d));
          u1.p0("", null, uob);
       }
       return;
    }
}
