package com.yxcorp.gifshow.payment.GatewayPayInitModule;
import com.yxcorp.gifshow.payment.GatewayPayBaseInitModule;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import wkd.b;
import dwb.m;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import tm8.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import o56.a;
import eda.l;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import eda.n;
import tkd.b;
import tkd.d;
import ad5.b;
import ad5.a;
import java.lang.Boolean;
import xf6.h;
import java.lang.System;
import dwb.j;
import q87.c;
import fwb.a;
import brd.t;
import cjd.e;
import erd.o;
import dwb.k;
import erd.g;
import dwb.l;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class GatewayPayInitModule extends GatewayPayBaseInitModule	// class@000e37
{

    public void GatewayPayInitModule(){
       super();
    }
    public String n0(){
       Object obj = PatchProxy.apply(null, this, GatewayPayInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l0()) {
          return "kuaishou.api";
       }
       return "kuaishou.midground.api";
    }
    public String o0(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       m obj = PatchProxy.apply(objArray, this, GatewayPayInitModule.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.l0()) {
          return QCurrentUser.ME.getSecurityToken();
       }
       obj = b.a(0x7302e56e);
       Objects.requireNonNull(obj);
       m om = PatchProxy.apply(objArray, obj, m.class, "5");
       if (om != patchProxyRe) {
       }else if(!TextUtils.isEmpty(obj.b)){
          om = obj.b;
       }else {
          om = a.a.getString(b.d("user")+"gateway_pay_security", "");
          obj.b = om;
       }
       return om;
    }
    public String p0(){
       Object obj = PatchProxy.apply(null, this, GatewayPayInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l0()) {
          return QCurrentUser.ME.getApiServiceToken();
       }
       return b.a(0x7302e56e).a();
    }
    public String q0(){
       Object obj = PatchProxy.apply(null, this, GatewayPayInitModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return " Kwai/"+a.m;
    }
    public void r0(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GatewayPayInitModule.class, "6")) {
          return;
       }
       m om = b.a(0x7302e56e);
       Objects.requireNonNull(om);
       if (!PatchProxy.applyVoid(null, om, m.class, "3")) {
          om.a = null;
          om.b = null;
          a.b(null);
          a.a(null);
          a.c(0);
       }
       this.t0(RequestTiming.LOGIN, false);
       return;
    }
    public void s0(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GatewayPayInitModule.class, "5")) {
          return;
       }
       d.a(0x630bc993).d1().j();
       b.a(0x4c90014d).clearCache();
       return;
    }
    public void t0(RequestTiming p0,boolean p1){
       boolean b;
       boolean b1;
       if (PatchProxy.isSupport(GatewayPayInitModule.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, GatewayPayInitModule.class, "7")) {
          return;
       }
       if (QCurrentUser.ME != null && QCurrentUser.ME.isLogined()) {
          m om = b.a(0x7302e56e);
          Objects.requireNonNull(om);
          m om1 = m.class;
          if (!PatchProxy.isSupport(om1) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), om, om1, "2")) {
             if (om.c == null) {
                b = true;
                if (!p1) {
                   SharedPreferences obj = PatchProxy.apply(null, om, om1, "6");
                   if (obj != PatchProxyResult.class) {
                      b1 = obj.booleanValue();
                   }else if(TextUtils.isEmpty(om.a()) || h.u()){
                      obj = a.a;
                      long l = 0;
                      long l1 = obj.getLong("PayServiceTokenIntervalSeconds", l) * 1000;
                      if (!l1 - l) {
                         l1 = 0x1ee62800;
                      }
                      long longx = obj.getLong(b.d("user")+"last_pay_service_token_request_time", l);
                      if (longx - l && (longx + l1) - System.currentTimeMillis() > 0) {
                         b1 = false;
                      }
                   }
                label_00b2 :
                   b1 = true;
                   if (b1) {
                   label_00b6 :
                      om.c = b;
                      Object[] objArray1 = new Object[0];
                      j.C().w("KwaiPaySdk", "refresh serviceToken, force="+p1, objArray1);
                      b.a(0x1594923d).a("kuaishou.midground.api", p0).map(new e()).doOnNext(new k(om)).doOnError(new l(om)).subscribe(Functions.d(), Functions.d());
                   }
                }else {
                   goto label_00b6 ;
                }
             }
             Object[] objArray = new Object[0];
             j.C().w("KwaiPaySdk", "serviceToken is valid, just return", objArray);
          }
       }
       return;
    }
}
