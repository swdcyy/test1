package com.yxcorp.login.userlogin.fragment.d;
import im8.g;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.g;
import android.content.Context;
import com.kwai.feature.api.social.login.model.LoginParams;
import ou5.a;
import n3d.a;
import b3d.f0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mrd.a;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import o2d.v;
import j2d.o;
import com.yxcorp.login.userlogin.presenter.kwaiapplogin.b;
import n2d.d;
import v2d.h;
import k2d.q;
import g2d.c;
import im8.c;
import com.yxcorp.login.userlogin.fragment.c;
import erd.g;
import crd.b;
import brd.t;
import y1d.z;
import y1d.a0;
import y1d.b0;
import y1d.c0;
import w1d.j;
import o1d.n;
import y1d.n0;
import java.util.Map;
import java.util.HashMap;

public class d extends g implements g	// class@001b4e
{
    public LoginParams g;
    public c h;
    public c i;
    public c j;
    public c k;
    public c l;
    public c m;
    public c n;
    public c o;
    public PresenterV2 p;
    public Context q;
    public c r;
    public a s;
    public a t;
    public b u;
    public boolean v;

    public void d(Context p0,LoginParams p1,a p2,a p3){
       super();
       this.v = f0.a.a();
       this.q = p0;
       this.s = p2;
       this.g = p1;
       this.t = p3;
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
       }else {
          this.h = a.g();
          this.i = a.g();
          this.l = a.g();
          this.j = a.g();
          this.k = a.g();
          this.m = a.g();
          this.n = a.g();
          this.o = a.g();
       }
       return;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "6")) {
          return;
       }
       d ts = this.s;
       if (ts != null) {
          ts.onDismiss();
       }
       return;
    }
    public View c(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, d.class, "3");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       int i = (this.v != null)? 0x7f0d0738: 0x7f0d0737;
       View view = a.g(p1, i, p2, false);
       this.r = p0;
       PresenterV2 presenterV2 = new PresenterV2();
       this.p = presenterV2;
       presenterV2.U7(new v());
       this.p.U7(new o());
       b uob = new b();
       this.u = uob;
       this.p.U7(uob);
       this.p.U7(new d("KWAI_ACCOUNT_LOGIN_POPUP_BUTTON", this.t));
       this.p.U7(new h("KWAI_ACCOUNT_LOGIN_POPUP", this.t));
       this.p.U7(new q(false, "KWAI_ACCOUNT_LOGIN_POPUP"));
       if (this.v != null) {
          this.p.U7(new c(this.g, false));
       }
       this.p.f(view);
       Object[] objArray = new Object[]{this,new c("POPUP", p0)};
       int i1 = 1;
       this.p.i(objArray);
       d tr = this.r;
       if (!PatchProxy.applyVoidOneRefs(tr, this, d.class, "4")) {
          this.m.subscribe(new c(this));
          this.h.subscribe(new z(this, tr));
          this.i.subscribe(new a0(this, tr));
          this.j.subscribe(new b0(this, tr));
          this.k.subscribe(new c0(this, tr));
       }
       tr = this.s;
       if (tr != null) {
          tr.onShow();
       }
       this.d(false);
       this.e(i1);
       j.d("KWAI_ACCOUNT_LOGIN_POPUP", this.g);
       n.b("KWAI_ACCOUNT_LOGIN_POPUP", this.g);
       return view;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d.class, new n0());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
}
