package com.yxcorp.login.bind.presenter.q;
import android.view.View$OnClickListener;
import com.yxcorp.login.bind.presenter.s;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import h3b.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.widget.popup.a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import com.kwai.library.widget.popup.bubble.a$c;
import java.lang.CharSequence;
import lnc.a1;
import com.kwai.library.widget.popup.common.c$b;
import e1d.x;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import c1d.b;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.login.bind.presenter.r;
import com.kwai.framework.accountsecurity.d$a;
import java.util.concurrent.Future;
import com.kwai.framework.accountsecurity.d;

public final class q implements View$OnClickListener	// class@001a99
{
    public final s b;

    public void q(s p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       q tb = this.b;
       Objects.requireNonNull(tb);
       s os = s.class;
       Object obj = PatchProxy.apply(null, tb, os, "8");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!a.b()){
          if (!PatchProxy.applyVoid(null, tb, os, "7")) {
             if (tb.t == null) {
                a uoa = new a(tb.getActivity());
                uoa.K0(KwaiBubbleOption.e);
                uoa.o0(tb.u);
                uoa.q0(1);
                uoa.F0(tb.getActivity().getString(R.string.arg_RES_7f1003ab));
                uoa.p0(a1.e(10.00f));
                uoa.T(2000);
                uoa.P(1);
                uoa.z(1);
                uoa.A(b);
                uoa.v(1);
                uoa.K(new x(tb));
                tb.t = uoa;
             }
             p.n(tb.t);
          }
       }else {
          b = true;
       }
       if (b) {
          b.b("ONE_CLICK_BIND_CLICK", 1, null);
          b.a("ONE_CLICK_BIND_CLICK", null);
          if (tb.s == null) {
             tb.s = new ProgressFragment();
          }
          tb.s.Cb(tb.getActivity().getSupportFragmentManager(), "");
          if (!PatchProxy.applyVoid(null, tb, os, "4")) {
             d.a(new r(tb));
          }
       }
       return;
    }
}
