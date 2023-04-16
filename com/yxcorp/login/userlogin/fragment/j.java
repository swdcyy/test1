package com.yxcorp.login.userlogin.fragment.j;
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
import o2d.r;
import k2d.q;
import o2d.t;
import e2d.s1;
import v2d.h;
import g2d.c;
import im8.c;
import com.yxcorp.login.userlogin.fragment.i;
import erd.g;
import crd.b;
import brd.t;
import y1d.p3;
import y1d.q3;
import y1d.r3;
import y1d.s3;
import w1d.j;
import o1d.n;
import y1d.d4;
import java.util.Map;
import java.util.HashMap;

public class j extends g implements g	// class@001b56
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
    public t u;
    public boolean v;

    public void j(Context p0,LoginParams p1,a p2,a p3){
       super();
       this.v = f0.a.a();
       this.q = p0;
       this.s = p2;
       this.g = p1;
       this.t = p3;
       if (PatchProxy.applyVoid(null, this, j.class, "5")) {
       }else {
          this.h = a.g();
          this.j = a.g();
          this.k = a.g();
          this.l = a.g();
          this.o = a.g();
          this.m = a.g();
          this.n = a.g();
          this.i = a.g();
       }
       return;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "4")) {
          return;
       }
       j ts = this.s;
       if (ts != null) {
          ts.onDismiss();
       }
       return;
    }
    public View c(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       int this;
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, j.class, "2");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       this.r = p0;
       int i = (this.v != null)? 0x7f0d1114: 0x7f0d1113;
       View view = a.g(p1, i, p2, false);
       PresenterV2 presenterV2 = new PresenterV2();
       this.p = presenterV2;
       presenterV2.U7(new v());
       this.p.U7(new r());
       this.p.U7(new q(true, "PHONE_QUICK_LOGIN_PAGE_POPUP"));
       t ot = new t("PHONE_QUICK_LOGIN_PAGE_POPUP_BUTTON");
       this.u = ot;
       this.p.U7(ot);
       this = 2;
       this.p.U7(new s1(this, "PHONE_QUICK_LOGIN_PAGE_POPUP_BUTTON"));
       this.p.U7(new h("PHONE_QUICK_LOGIN_PAGE_POPUP", this.t));
       if (this.v != null) {
          this.p.U7(new c(this.g, false));
       }
       this.p.f(view);
       Object[] objArray = new Object[this];
       objArray[0] = this;
       objArray[1] = new c("POPUP", p0);
       this.p.i(objArray);
       if (!PatchProxy.applyVoidOneRefs(p0, this, j.class, "3")) {
          this.k.subscribe(new i(this));
          this.h.subscribe(new p3(p0));
          this.i.subscribe(new q3(p0));
          this.m.subscribe(new r3(p0));
          this.n.subscribe(new s3(p0));
       }
       j ts = this.s;
       if (ts != null) {
          ts.onShow();
       }
       this.d(false);
       this.e(true);
       j.d("PHONE_QUICK_LOGIN_PAGE_POPUP", this.g);
       n.b("PHONE_QUICK_LOGIN_PAGE_POPUP", this.g);
       return view;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d4();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, j.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(j.class, new d4());
       }else {
          obj.put(j.class, null);
       }
       return obj;
    }
}
