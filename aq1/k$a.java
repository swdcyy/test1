package aq1.k$a;
import android.view.View$OnClickListener;
import aq1.k;
import zp1.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u07.t$a;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import aq1.k$a$a;
import u07.u;
import u07.t;
import u07.j;

public final class k$a implements View$OnClickListener	// class@00028d
{
    public final k b;
    public final a c;

    public void k$a(k p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "1")) {
          return;
       }
       t$a uoa = new t$a(this.b.B2());
       uoa.W0(R.string.arg_RES_7f101f17);
       uoa.S0(R.string.arg_RES_7f103a83);
       uoa.Q0(R.string.cancel);
       uoa.u0(new k$a$a(this));
       j.d(uoa);
       return;
    }
}
