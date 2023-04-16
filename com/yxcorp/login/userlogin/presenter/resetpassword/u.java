package com.yxcorp.login.userlogin.presenter.resetpassword.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.EditText;
import com.yxcorp.login.userlogin.presenter.resetpassword.u$a;
import android.text.TextWatcher;
import r2d.l0;
import android.widget.TextView$OnEditorActionListener;
import r2d.j0;
import android.view.View$OnClickListener;
import android.widget.Switch;
import r2d.k0;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.text.Editable;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.login.userlogin.fragment.ResetSelectedAccountPasswordFragment;
import o1d.p;
import com.yxcorp.login.userlogin.presenter.resetpassword.u$b;
import com.yxcorp.login.util.o$a;
import com.yxcorp.login.util.o;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.CharSequence;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.login.helper.c;
import com.kwai.framework.model.user.User;
import java.util.Map;
import brd.t;
import r2d.m0;
import com.yxcorp.login.userlogin.presenter.resetpassword.u$c;
import erd.g;
import crd.b;
import android.view.View;
import ekd.m1;

public class u extends PresenterV2	// class@001bf5
{
    public View p;
    public EditText q;
    public TextView r;
    public TextView s;
    public Switch t;
    public User u;
    public Map v;
    public ResetSelectedAccountPasswordFragment w;
    public boolean x;

    public void u(){
       super();
       this.x = false;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, u.class, "3")) {
          return;
       }
       this.s.setEnabled(false);
       this.s.getLayoutParams().width = (int)((float)(n.z(a.B) - a1.e(38.00f)) * 0x3f19999a);
       this.q.setInputType(129);
       this.q.addTextChangedListener(new u$a(this));
       this.q.setOnEditorActionListener(new l0(this));
       this.s.setOnClickListener(new j0(this));
       this.q.setInputType(145);
       this.t.setChecked(true);
       this.t.setOnCheckedChangeListener(new k0(this));
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, u.class, "4")) {
          return;
       }
       String str = TextUtils.G(this.q).toString();
       GifshowActivity activity = this.getActivity();
       if (this.x == null) {
          p.a(this.w.Q3(), 1);
          o.c(activity, activity.getUrl(), str, new u$b(this));
          return;
       }else {
          this.x = false;
          ProgressFragment progressFrag = new ProgressFragment();
          progressFrag.Jh(activity.getString(R.string.arg_RES_7f103667));
          progressFrag.show(activity.getSupportFragmentManager(), "runner");
          new c().a(this.u.getId(), str, this.v).subscribe(new m0(this, progressFrag), new u$c(this, progressFrag));
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0744);
       this.q = m1.f(p0, 0x7f0a2987);
       this.r = m1.f(p0, 0x7f0a330d);
       this.s = m1.f(p0, 0x7f0a08fb);
       this.t = m1.f(p0, 0x7f0a395b);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u.class, "1")) {
          return;
       }
       this.u = this.r8("LOGIN_MULTI_SELECTED_USER_INFO");
       this.v = this.r8("LOGIN_MULTI_SELECTED_USER_TOKEN");
       this.w = this.r8("FRAGMENT");
       return;
    }
}
