package com.kwai.live.gzone.promotion.i;
import erd.g;
import com.kwai.live.gzone.promotion.f;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oq5.a;
import x67.j;
import aq5.d;
import fq5.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import lnc.a1;
import x61.c;
import lp3.c;
import lp3.i;
import com.yxcorp.gifshow.widget.popup.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import com.kwai.library.widget.popup.bubble.a$c;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.c$b;
import s67.g0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;

public class i implements g	// class@000dc5
{
    public final f b;

    public void i(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else if(this.b.W8() && !this.b.s.H2()){
          p0 = this.b;
          if (p0.B == null && (!PatchProxy.applyVoid(null, p0, f.class, "22") && !p0.S8())) {
             f n = p0.N;
             if (n == null || (!n.R4() && !p0.J.A0().r2(AudienceBizRelation.BOTTOM_BAR_TIP))) {
                String str = a1.p(R.string.arg_RES_7f101403);
                int[] ointArray = p0.K.a(c.class).T0(4002, 2);
                if (ointArray != null) {
                   a uoa = new a(p0.getActivity());
                   uoa.K0(KwaiBubbleOption.g);
                   uoa.n0(ointArray[0], ointArray[1]);
                   uoa.F0(str);
                   uoa.P(1);
                   uoa.A(0);
                   uoa.T(3000);
                   uoa.M(new g0(p0, str));
                   p0.A = p.o(uoa);
                }
             }
          }
       }
       return;
    }
}
