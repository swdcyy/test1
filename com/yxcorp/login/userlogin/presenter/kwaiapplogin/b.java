package com.yxcorp.login.userlogin.presenter.kwaiapplogin.b;
import g2d.c0;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import k2b.e0;
import com.kwai.feature.api.social.login.model.LoginParams;
import o1d.h;
import com.yxcorp.login.util.f;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Boolean;
import brd.y;
import com.kwai.library.widget.popup.common.c;
import h3b.a;
import x45.b$a;
import java.util.Map;
import b3d.v;
import x45.b;
import u45.b;
import com.yxcorp.login.userlogin.presenter.kwaiapplogin.b$a;
import u45.a;
import android.view.View;
import ekd.m1;
import android.widget.Button;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import lnc.a1;
import java.lang.CharSequence;
import j2d.g;
import android.view.View$OnClickListener;
import mrd.c;

public class b extends c0	// class@001bc3
{
    public LoginParams s;
    public Button t;
    public c u;
    public c v;
    public c w;
    public c x;

    public void b(){
       super();
    }
    public final void Y8(int p0,String p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "7")) {
          return;
       }
       h.a(null, p0, p1, 8, null, this.s);
       if (f.i(p0)) {
          return;
       }
       this.getActivity().setResult(-1);
       b tx = this.x;
       if (tx != null) {
          tx.onNext(Boolean.TRUE);
       }
       this.u.o();
       return;
    }
    public void Z8(LoginUserResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       h.a(p0, 0, "", 7, null, this.s);
       if (p0 == null) {
          this.getActivity().setResult(-1);
          this.getActivity().finish();
          return;
       }else {
          a.p(14);
          b tw = this.w;
          if (tw != null) {
             tw.onNext(p0);
          }else if(tw != null){
             tw.onNext(new LoginUserResponse());
          }
          return;
       }
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b$a uoa = new b$a();
       uoa.f("nebula_app");
       uoa.b("code");
       uoa.d(1);
       String[] stringArray = new String[]{"nebula_app"};
       uoa.e(stringArray);
       uoa.c(v.a());
       b uob = uoa.a();
       b.b().d(this.getActivity(), uob, new b$a(this));
       return;
    }
    public void doBindView(View p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "2")) {
          return;
       }
       super.doBindView(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, uob, "3")) {
          this.t = m1.f(p0, 0x7f0a0548);
          if (v.e(0, null, null, null)) {
             this.t.setText(a1.p(R.string.arg_RES_7f101bf1));
          }else {
             this.t.setText(a1.p(R.string.arg_RES_7f103a92));
          }
          this.t.setOnClickListener(new g(this));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.j8();
       this.s = this.t8("LOGIN_PAGE_PARAMS");
       this.u = this.t8("POPUP");
       this.v = this.t8("KEY_ONE_KEY_LOGIN_BTN_CLICK");
       this.w = this.t8("KEY_LOGIN_SUCCESS");
       this.x = this.t8("KEY_LOGIN_FAIL");
       return;
    }
}
