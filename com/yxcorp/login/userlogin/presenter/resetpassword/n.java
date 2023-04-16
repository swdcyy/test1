package com.yxcorp.login.userlogin.presenter.resetpassword.n;
import com.yxcorp.login.userlogin.presenter.resetpassword.p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import com.yxcorp.login.userlogin.presenter.resetpassword.n$a;
import android.view.View;
import android.text.TextWatcher;
import ekd.m1;
import r2d.p;
import android.view.View$OnClickListener;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.login.userlogin.fragment.ResetPsdFragment;
import android.widget.EditText;
import android.text.Editable;
import oe6.e;
import oe6.a;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.login.helper.c;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import java.util.HashMap;
import com.yxcorp.login.loginaction.LoginHelper;
import wkd.b;
import m1d.a;
import java.util.Map;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import com.yxcorp.login.userlogin.presenter.resetpassword.l;
import com.yxcorp.login.userlogin.presenter.resetpassword.m;
import erd.g;
import crd.b;
import java.lang.Boolean;
import com.kwai.feature.api.social.login.model.LoginParams;

public class n extends p	// class@001be6
{
    public EditText q;
    public TextView r;
    public f s;
    public LoginParams t;
    public View u;

    public void n(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, n.class, "3")) {
          return;
       }
       super.E8();
       this.s.get();
       m1.e(this.q, new n$a(this), R.id.name_et);
       this.u.setOnClickListener(new p(this));
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, n.class, "4")) {
          return;
       }
       String str = TextUtils.H(this.r).toString();
       ResetPsdFragment.jh(str, R.string.arg_RES_7f1008f1);
       String str1 = TextUtils.G(this.q).toString();
       ResetPsdFragment.jh(str1, R.string.arg_RES_7f103be4);
       if (!TextUtils.x(str1)) {
          e.r0("");
          a.T(str);
          a.U(str1);
       }
       ProgressFragment progressFrag = new ProgressFragment();
       progressFrag.Jh(this.n8(R.string.arg_RES_7f103667));
       if (this.getActivity() != null && this.getActivity() instanceof GifshowActivity) {
          progressFrag.show(this.getActivity().getSupportFragmentManager(), "runner");
       }
       t ot = PatchProxy.applyTwoRefs(str, str1, new c(), c.class, "2");
       if (ot != PatchProxyResult.class) {
       }else {
          HashMap hashMap = new HashMap();
          hashMap.put("mobileCountryCode", str);
          hashMap.put("mobile", LoginHelper.b(str1));
          ot = b.a(0x5cfaafff).j0(hashMap).map(new e()).subscribeOn(d.c);
       }
       this.X7(ot.subscribe(new l(this, progressFrag, str, str1), new m(this, progressFrag, str, str1)));
       return;
    }
    public boolean R8(){
       Object obj = PatchProxy.apply(null, this, n.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (TextUtils.G(this.q).length() > 0)? true: false;
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.q = m1.f(p0, 0x7f0a2d15);
       this.u = m1.f(p0, 0x7f0a0744);
       this.r = m1.f(p0, 0x7f0a09b7);
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(n.class, null);
       return objectsByTag;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.t = this.r8("LOGIN_PAGE_PARAMS");
       this.s = this.x8("KEY_AFTER_EDIT_TEXT_CHANGED_INVOKER");
       return;
    }
}
