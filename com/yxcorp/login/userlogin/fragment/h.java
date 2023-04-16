package com.yxcorp.login.userlogin.fragment.h;
import im8.g;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.g;
import android.content.Context;
import android.os.Bundle;
import ou5.a;
import n3d.a;
import b3d.f0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mrd.a;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import o2d.v;
import o2d.r;
import k2d.q;
import o2d.t;
import e2d.s1;
import g2d.c;
import im8.c;
import com.yxcorp.login.userlogin.fragment.g;
import erd.g;
import crd.b;
import brd.t;
import y1d.c3;
import y1d.d3;
import w1d.j;
import o1d.n;
import y1d.n3;
import java.util.Map;
import java.util.HashMap;

public class h extends g implements g	// class@001b54
{
    public LoginParams g;
    public c h;
    public c i;
    public c j;
    public c k;
    public c l;
    public c m;
    public c n;
    public PresenterV2 o;
    public int p;
    public Bundle q;
    public Context r;
    public c s;
    public a t;
    public a u;
    public t v;
    public boolean w;

    public void h(Context p0,Bundle p1,a p2,a p3){
       super();
       this.w = f0.a.a();
       this.q = p1;
       this.r = p0;
       this.t = p2;
       this.u = p3;
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
       }else {
          this.h = a.g();
          this.i = a.g();
          this.j = a.g();
          this.k = a.g();
          this.l = a.g();
          this.m = a.g();
          this.n = a.g();
       }
       LoginParams$a uoa = new LoginParams$a();
       h tq = this.q;
       if (tq != null) {
          int intx = tq.getInt("SOURCE_LOGIN", 0);
          this.p = intx;
          uoa.c(intx);
          uoa.b(this.q.getString("SOURCE_EXTRA_INFO", ""));
       }
       uoa.f(LoginParams.getStartPage());
       uoa.g(LoginParams.generateLoginSessionId());
       this.g = uoa.a();
       return;
    }
    public static h f(Context p0,Bundle p1,a p2,a p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h(p0, p1, p2, p3);
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "3")) {
          return;
       }
       h tt = this.t;
       if (tt != null) {
          tt.onDismiss();
       }
       return;
    }
    public View c(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       int this;
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, h.class, "2");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       this.s = p0;
       int i = (this.w != null)? 0x7f0d1111: 0x7f0d1110;
       View view = a.g(p1, i, p2, false);
       PresenterV2 presenterV2 = new PresenterV2();
       this.o = presenterV2;
       presenterV2.U7(new v());
       this.o.U7(new r());
       this.o.U7(new q(true, "IPHONE_QUICK_LOGIN_OR_SIGN_UP_POPUP"));
       String str = "IPHONE_QUICK_LOGIN_OR_SIGN_UP_BUTTON";
       t ot = new t(str);
       this.v = ot;
       this.o.U7(ot);
       this = 2;
       this.o.U7(new s1(this, str));
       if (this.w != null) {
          this.o.U7(new c(this.g, false));
       }
       this.o.f(view);
       Object[] objArray = new Object[this];
       objArray[0] = this;
       objArray[1] = new c("POPUP", p0);
       this.o.i(objArray);
       this.k.subscribe(new g(this));
       this.l.subscribe(new c3(p0));
       this.h.subscribe(new d3(p0));
       h tt = this.t;
       if (tt != null) {
          tt.onShow();
       }
       this.d(false);
       this.e(true);
       j.d("IPHONE_QUICK_LOGIN_OR_SIGN_UP_POPUP", this.g);
       n.b("IPHONE_QUICK_LOGIN_OR_SIGN_UP_POPUP", this.g);
       return view;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n3();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, h.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(h.class, new n3());
       }else {
          obj.put(h.class, null);
       }
       return obj;
    }
}
