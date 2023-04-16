package com.yxcorp.login.userlogin.fragment.b;
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
import i2d.d;
import o2d.c;
import i2d.c;
import e2d.s1;
import k2d.q;
import g2d.c;
import im8.c;
import com.yxcorp.login.userlogin.fragment.a;
import erd.g;
import crd.b;
import brd.t;
import y1d.i;
import y1d.j;
import w1d.j;
import o1d.n;
import y1d.u;
import java.util.Map;
import java.util.HashMap;

public class b extends g implements g	// class@001b4c
{
    public LoginParams g;
    public c h;
    public c i;
    public String j;
    public c k;
    public c l;
    public c m;
    public c n;
    public c o;
    public PresenterV2 p;
    public a q;
    public c r;
    public Context s;
    public a t;
    public c u;
    public boolean v;

    public void b(Context p0,LoginParams p1,a p2,a p3){
       super();
       this.v = f0.a.a();
       this.s = p0;
       this.q = p2;
       this.g = p1;
       this.t = p3;
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
       }else {
          this.h = a.g();
          this.i = a.g();
          this.k = a.g();
          this.l = a.g();
          this.o = a.g();
          this.m = a.g();
          this.n = a.g();
       }
       return;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       b tq = this.q;
       if (tq != null) {
          tq.onDismiss();
       }
       return;
    }
    public View c(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, b.class, "3");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       int i = (this.v != null)? 0x7f0d05b8: 0x7f0d05b7;
       View view = a.g(p1, i, p2, false);
       this.r = p0;
       PresenterV2 presenterV2 = new PresenterV2();
       this.p = presenterV2;
       presenterV2.U7(new v());
       this.p.U7(new d(false));
       this.p.U7(new c());
       c uoc = new c();
       this.u = uoc;
       this.p.U7(uoc);
       this.p.U7(new s1(3, "LAST_INFORMATION_ONE_CLICK_LOGIN_POPUP_BUTTON"));
       this.p.U7(new q(false, "LAST_INFORMATION_ONE_CLICK_LOGIN_POPUP"));
       if (this.v != null) {
          this.p.U7(new c(this.g, false));
       }
       this.p.f(view);
       Object[] objArray = new Object[]{this,new c("POPUP", p0)};
       this.p.i(objArray);
       this.l.subscribe(new a(this));
       this.o.subscribe(new i(p0));
       this.k.subscribe(new j(p0));
       b tq = this.q;
       if (tq != null) {
          tq.onShow();
       }
       this.d(false);
       this.e(1);
       j.d("LAST_INFORMATION_ONE_CLICK_LOGIN_POPUP", this.g);
       n.b("LAST_INFORMATION_ONE_CLICK_LOGIN_POPUP", this.g);
       return view;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new u();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new u());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
}
