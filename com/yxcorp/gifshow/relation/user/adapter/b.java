package com.yxcorp.gifshow.relation.user.adapter.b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.user.adapter.c$a;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u07.t$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.user.adapter.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.yxcorp.utility.TextUtils;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import bcc.c;
import u07.u;
import bcc.d;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public final class b implements View$OnClickListener	// class@0019ea
{
    public final c$a b;

    public void b(c$a p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, c$a.class, "5")) {
       }else {
          t$a uoa = new t$a(tb.getActivity());
          c$a q = tb.q;
          if (!PatchProxy.applyVoidTwoRefs(q, uoa, objArray, c.class, "12")) {
             new ClientEvent$UrlPackage().page = 86;
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "DELETE_OR_BLOCK_TOAST";
             i3 oi3 = i3.f();
             oi3.d("type", "delete");
             uElementPack.params = oi3.e();
             uElementPack.index = q.mPosition + 1;
             uElementPack.status = 0;
             uElementPack.type = 1;
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
             userPackage.identity = TextUtils.I(q.mId);
             userPackage.index = q.mPosition + 1;
             uContentPack.userPackage = userPackage;
             u1.D0("id_2447272", null, 1, uElementPack, uContentPack, null);
          }
          uoa.y0(R.string.arg_RES_7f10427a);
          uoa.S0(R.string.arg_RES_7f1007e2);
          uoa.Q0(R.string.cancel);
          uoa.u0(new c(tb));
          uoa.t0(new d(tb));
          f.e(uoa).Y(PopupInterface.a);
          tb.r.u1();
       }
       return;
    }
}
