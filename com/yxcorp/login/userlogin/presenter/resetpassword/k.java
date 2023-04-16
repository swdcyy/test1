package com.yxcorp.login.userlogin.presenter.resetpassword.k;
import com.yxcorp.login.userlogin.presenter.resetpassword.p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
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
import com.yxcorp.login.loginaction.LoginHelper;
import l1d.c;
import erd.o;
import t45.d;
import brd.z;
import com.yxcorp.login.userlogin.presenter.resetpassword.i;
import com.yxcorp.login.userlogin.presenter.resetpassword.j;
import erd.g;
import crd.b;
import java.lang.Boolean;
import android.view.View;
import ekd.m1;
import java.util.Map;
import com.kwai.feature.api.social.login.model.LoginParams;

public class k extends p	// class@001be2
{
    public EditText q;
    public EditText r;
    public TextView s;
    public LoginParams t;

    public void k(){
       super();
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       String str = TextUtils.H(this.s).toString();
       ResetPsdFragment.jh(str, R.string.arg_RES_7f1008f1);
       String str1 = TextUtils.G(this.q).toString();
       ResetPsdFragment.jh(str1, R.string.arg_RES_7f103be4);
       String str2 = TextUtils.G(this.r).toString();
       ResetPsdFragment.jh(str2, R.string.arg_RES_7f105015);
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
       c uoc = new c();
       t ot = PatchProxy.applyThreeRefs(str, str1, str2, uoc, c.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = uoc.a.d().flatMap(new c(uoc, str, str1, str2)).subscribeOn(d.c);
       }
       this.X7(ot.subscribe(new i(this, progressFrag), new j(this, progressFrag)));
       return;
    }
    public boolean R8(){
       Object obj = PatchProxy.apply(null, this, k.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (TextUtils.G(this.q).length() > 0 && TextUtils.G(this.r).length() > 0)? true: false;
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.q = m1.f(p0, 0x7f0a2d15);
       this.r = m1.f(p0, 0x7f0a43cc);
       this.s = m1.f(p0, 0x7f0a09b7);
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(k.class, null);
       return objectsByTag;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.t = this.r8("LOGIN_PAGE_PARAMS");
       return;
    }
}
