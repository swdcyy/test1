package com.kuaishou.live.core.show.wealthgrade.privilegedetail.q;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.r;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.p;
import com.kwai.library.widget.button.SlipSwitchButton;
import brd.t;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.p$a;
import t45.d;
import brd.z;
import qm2.f0;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class q implements View$OnClickListener	// class@001281
{
    public final r b;

    public void q(r p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       q tb = this.b;
       p e = tb.s.e;
       boolean b = false;
       tb.r.setEnabled(b);
       if (tb.r.getSwitch() ^ 1) {
          t ot = e.c();
          if (ot != null) {
             tb.X7(ot.observeOn(d.a).subscribe(new f0(tb, e)));
          }else {
             tb.P8(e, 1);
          }
       }else {
          tb.P8(e, b);
       }
       return;
    }
}
