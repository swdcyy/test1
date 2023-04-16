package com.kuaishou.merchant.transaction.purchase.presenter.a0$d;
import com.kuaishou.merchant.transaction.purchase.presenter.a0$g;
import com.kuaishou.merchant.transaction.purchase.presenter.a0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import u07.t$a;
import com.kuaishou.merchant.transaction.purchase.model.FollowingInfo;
import java.lang.CharSequence;
import um4.p0;
import u07.u;
import um4.q0;
import um4.o0;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import um4.r0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import em4.m;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class a0$d implements a0$g	// class@000960
{
    public final a0 a;

    public void a0$d(a0 p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a0$d.class, "1")) {
          return;
       }
       a0$d ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, a0.class, "7")) {
          if (ta.y == null) {
             ta.S8(true);
          }else if(ta.getActivity() instanceof GifshowActivity){
             t$a uoa = new t$a(ta.getActivity());
             a0 r = ta.r;
             FollowingInfo mCancelReten = (r != null)? r.mCancelRetentionMsg: "";
             uoa.z0(mCancelReten);
             uoa.S0(R.string.arg_RES_7f1033c7);
             uoa.Q0(R.string.arg_RES_7f103410);
             uoa.u0(new p0(ta));
             uoa.t0(new q0(ta));
             uoa.J(new o0(ta));
             uoa = f.e(uoa);
             uoa.p();
             ta.x = uoa.Y(new r0(ta));
             if (ta.z == null) {
                boolean b = ta.P8();
                m om = m.class;
                if (!PatchProxy.isSupport(om) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), objArray, om, "18")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "FOCUS_SHOP_CANCEL_POP";
                   i3 oi3 = i3.f();
                   oi3.c("is_focus_default", Integer.valueOf(b));
                   uElementPack.params = oi3.e();
                   u1.u0(4, uElementPack, new ClientContent$ContentPackage());
                }
                ta.z = true;
             }
          }
       }
       return;
    }
}
