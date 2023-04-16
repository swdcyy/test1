package com.yxcorp.login.userlogin.fragment.f;
import im8.g;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.g;
import android.content.Context;
import android.os.Bundle;
import ou5.a;
import n3d.a;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import java.lang.String;
import com.kwai.feature.api.social.login.model.LoginParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mrd.a;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import o2d.v;
import n2d.d;
import v2d.h;
import k2d.q;
import im8.c;
import y1d.w1;
import erd.g;
import crd.b;
import brd.t;
import y1d.x1;
import y1d.y1;
import w1d.j;
import o1d.n;
import y1d.g2;
import java.util.Map;
import java.util.HashMap;

public class f extends g implements g	// class@001b51
{
    public PresenterV2 g;
    public LoginParams h;
    public c i;
    public c j;
    public c k;
    public c l;
    public c m;
    public int n;
    public Bundle o;
    public Context p;
    public a q;
    public a r;
    public h s;

    public void f(Context p0,Bundle p1,a p2,a p3){
       super();
       this.o = p1;
       this.p = p0;
       this.q = p2;
       this.r = p3;
       LoginParams$a uoa = new LoginParams$a();
       f to = this.o;
       if (to != null) {
          int intx = to.getInt("SOURCE_LOGIN", 0);
          this.n = intx;
          uoa.c(intx);
          uoa.b(this.o.getString("SOURCE_EXTRA_INFO", ""));
       }
       uoa.f(LoginParams.getStartPage());
       uoa.g(LoginParams.generateLoginSessionId());
       this.h = uoa.a();
       if (!PatchProxy.applyVoid(null, this, f.class, "5")) {
          this.i = a.g();
          this.j = a.g();
          this.k = a.g();
          this.l = a.g();
          this.m = a.g();
       }
       return;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "4")) {
          return;
       }
       super.b(p0);
       f tq = this.q;
       if (tq != null) {
          tq.onDismiss();
       }
       return;
    }
    public View c(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, f.class, "2");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       View view = a.g(p1, R.layout.arg_RES_7f0d109f, p2, false);
       PresenterV2 presenterV2 = new PresenterV2();
       this.g = presenterV2;
       presenterV2.U7(new v());
       this.g.U7(new d("NO_ACCOUNT_LEAD_LOGIN_POPUP_BUTTON", this.r));
       h oh = new h("NO_ACCOUNT_LEAD_LOGIN_POPUP", this.r);
       this.s = oh;
       this.g.U7(oh);
       this.g.U7(new q(false, "NO_ACCOUNT_LEAD_LOGIN_POPUP"));
       this.g.f(view);
       Object[] objArray = new Object[]{this,new c("POPUP", p0)};
       this.g.i(objArray);
       if (!PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          this.k.subscribe(new w1(p0));
          this.l.subscribe(new x1(p0));
          this.j.subscribe(new y1(p0));
       }
       f tq = this.q;
       if (tq != null) {
          tq.onShow();
       }
       this.d(false);
       this.e(1);
       j.d("NO_ACCOUNT_LEAD_LOGIN_POPUP", this.h);
       n.b("NO_ACCOUNT_LEAD_LOGIN_POPUP", this.h);
       return view;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g2();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f.class, new g2());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
}
