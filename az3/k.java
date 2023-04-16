package az3.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ny3.b;
import com.kuaishou.merchant.home2.feed.model.LiveFeed;
import az3.j;
import lnc.c3$b;
import lnc.c3;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import az3.i;
import lnc.c3$a;
import android.view.View;
import ekd.m1;
import android.widget.TextView;

public class k extends PresenterV2	// class@0002e2
{
    public b p;
    public TextView q;

    public void k(){
       super();
    }
    public void E8(){
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "3")) {
          return;
       }
       if (this.p.c == null) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ok, "4")) {
          String str = c3.a(this.p.d, j.a);
          c3.c(this.q, new i((TextUtils.x(str) ^ 0x01), str));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a01ad);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.p = this.q8(b.class);
       return;
    }
}
