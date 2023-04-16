package com.yxcorp.login.bind.presenter.u;
import android.view.View$OnClickListener;
import com.yxcorp.login.bind.presenter.w;
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
import com.kwai.library.widget.popup.common.c$b;
import e1d.d0;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import c1d.b;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.login.bind.presenter.v;
import com.kwai.framework.accountsecurity.d$a;
import java.util.concurrent.Future;
import com.kwai.framework.accountsecurity.d;

public final class u implements View$OnClickListener	// class@001a9f
{
    public final w b;

    public void u(w p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       u tb = this.b;
       Objects.requireNonNull(tb);
       w ow = w.class;
       Object obj = PatchProxy.apply(null, tb, ow, "9");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!a.b()){
          if (!PatchProxy.applyVoid(null, tb, ow, "8")) {
             if (tb.s == null) {
                a uoa = new a(tb.getActivity());
                uoa.K0(KwaiBubbleOption.e);
                uoa.o0(tb.t);
                uoa.q0(1);
                uoa.F0(tb.getActivity().getString(R.string.arg_RES_7f1003ab));
                uoa.T(2000);
                uoa.P(1);
                uoa.z(1);
                uoa.A(b);
                uoa.v(1);
                uoa.K(new d0(tb));
                tb.s = uoa;
             }
             p.n(tb.s);
          }
       }else {
          b = true;
       }
       if (b) {
          b.b("ONE_CLICK_BIND", 1, null);
          b.a("ONE_CLICK_BIND", null);
          if (tb.r == null) {
             tb.r = new ProgressFragment();
          }
          tb.r.Cb(tb.getActivity().getSupportFragmentManager(), "");
          if (!PatchProxy.applyVoid(null, tb, ow, "4")) {
             d.a(new v(tb));
          }
       }
       return;
    }
}
