package com.yxcorp.login.userlogin.presenter.phoneverify.a;
import com.kwai.library.widget.edittext.VerificationCodeView$c;
import com.yxcorp.login.userlogin.presenter.phoneverify.c;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import im8.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import java.util.HashMap;
import com.yxcorp.login.loginaction.LoginHelper;
import com.yxcorp.login.userlogin.presenter.phoneverify.PhoneVerifyCodeViewPresenter$4;
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
import p2d.b;
import com.yxcorp.login.userlogin.presenter.phoneverify.d;
import erd.g;
import crd.b;

public final class a implements VerificationCodeView$c	// class@001bcd
{
    public final c a;

    public void a(c p0){
       this.a = p0;
    }
    public final void b(String p0){
       a ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, c.class, "9")) {
       }else {
          n.C(ta.getActivity());
          String str = "";
          if (!TextUtils.x(ta.s.get())) {
             str = (TextUtils.x(ta.r.get()))? ta.s.get(): (ta.s.get()).replace(ta.r.get(), str);
          }
       label_0054 :
          if (!ta.w.get().booleanValue()) {
             ta.W8(null, p0);
          }else {
             HashMap hashMap = new HashMap();
             hashMap.put("mobileCountryCode", ta.r.get());
             hashMap.put("mobile", LoginHelper.b(str));
             if (ta.v.get().booleanValue()) {
                hashMap.put("mobileCode", p0);
                d.a(new PhoneVerifyCodeViewPresenter$4(ta, hashMap, p0, str));
             }else {
                hashMap.put("verifyCode", p0);
                ProgressFragment progressFrag = new ProgressFragment();
                progressFrag.Jh(ta.n8(R.string.arg_RES_7f103667));
                progressFrag.show(ta.getActivity().getSupportFragmentManager(), "runner");
                b.a(0x5cfaafff).b0(hashMap).map(new e()).subscribe(new b(ta, progressFrag, p0, str), new d(ta, progressFrag));
             }
          }
       }
       return;
    }
}
