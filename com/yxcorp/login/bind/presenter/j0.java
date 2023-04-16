package com.yxcorp.login.bind.presenter.j0;
import android.view.View$OnClickListener;
import com.yxcorp.login.bind.presenter.l0;
import java.lang.Object;
import android.view.View;
import android.widget.EditText;
import android.text.Editable;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import im8.f;
import java.lang.Boolean;
import com.yxcorp.login.util.o;
import java.lang.CharSequence;
import oe6.a;
import java.util.HashMap;
import com.yxcorp.login.loginaction.LoginHelper;
import com.yxcorp.login.bind.presenter.VerifyConfirmButtonPresenter$3;
import java.util.Map;
import com.kwai.framework.accountsecurity.d$a;
import java.util.concurrent.Future;
import com.kwai.framework.accountsecurity.d;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import wkd.b;
import m1d.a;
import brd.t;
import cjd.e;
import erd.o;
import e1d.z0;
import com.yxcorp.login.bind.presenter.n0;
import erd.g;
import crd.b;

public final class j0 implements View$OnClickListener	// class@001a7d
{
    public final l0 b;

    public void j0(l0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       j0 tb = this.b;
       String str = TextUtils.G(tb.r).toString();
       if (PatchProxy.applyVoidOneRefs(str, tb, l0.class, "6")) {
       }else {
          n.C(tb.getActivity());
          String str1 = o.b(tb.w.get().booleanValue(), tb.v.get(), tb.q);
          if (!TextUtils.x(str1)) {
             if (!TextUtils.x(tb.u.get())) {
                str1 = str1.replace(tb.u.get(), "");
             }
          }else {
             str1 = a.f();
          }
          if (!tb.y.get().booleanValue()) {
             tb.S8(null, str);
          }else {
             HashMap hashMap = new HashMap();
             hashMap.put("mobileCountryCode", TextUtils.I(tb.u.get()));
             hashMap.put("mobile", LoginHelper.b(str1));
             if (tb.z.get().booleanValue()) {
                hashMap.put("mobileCode", str);
                d.a(new VerifyConfirmButtonPresenter$3(tb, hashMap, str, str1));
             }else {
                ProgressFragment progressFrag = new ProgressFragment();
                progressFrag.Jh(tb.n8(R.string.arg_RES_7f103667));
                progressFrag.show(tb.getActivity().getSupportFragmentManager(), "runner");
                hashMap.put("verifyCode", str);
                b.a(0x5cfaafff).b0(hashMap).map(new e()).subscribe(new z0(tb, progressFrag, str, str1), new n0(tb, progressFrag));
             }
          }
       }
       return;
    }
}
