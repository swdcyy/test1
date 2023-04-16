package com.yxcorp.gifshow.prettify.beauty.m$d;
import com.yxcorp.gifshow.prettify.beauty.r$b;
import com.yxcorp.gifshow.prettify.beauty.m;
import java.lang.Object;
import q0c.m0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import n0c.b;
import p0c.a;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import xyb.a;
import w46.b;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.prettify.beauty.h;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import q0c.y0;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.feature.post.api.componet.prettify.beauty.RecoBeautifyConfig;
import xf6.g;
import q0c.z0;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.utility.TextUtils;
import com.google.gson.JsonElement;
import java.lang.System;

public class m$d implements r$b	// class@001112
{
    public final m a;

    public void m$d(m p0){
       this.a = p0;
       super();
    }
    public void m$d(m p0,m0 p1){
       super(p0);
    }
    public void g0(float p0){
       m$d uod = m$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uod, "5")) {
          return;
       }
       m x = this.a.x;
       if (x != null && x.u() != null) {
          this.a.x.u().d(p0);
       }
       return;
    }
    public void h0(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$d.class, "1")) {
          return;
       }
       String str = "BeautifyPresenter";
       int i = 0;
       if (p0 == null) {
          Object[] objArray = new Object[i];
          a.D().t(str, "SelectBeautyCategoryItem, config is null", objArray);
          return;
       }else {
          BeautifyConfig mId = p0.mId;
          boolean b = 1000;
          if (mId == b || mId == 999) {
             Object[] objArray1 = new Object[i];
             a.D().w(str, "switch version : "+p0.mId, objArray1);
             this.a.Y8(p0);
             if (p0.mId == b) {
                i = true;
             }
             m k = this.a.K;
             h oh = h.class;
             if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(i), k, null, oh, "30")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "SWITCH_VERSION_BUTTON";
                i3 oi3 = i3.f();
                String str1 = (i)? "new": "old";
                oi3.d("version_type", str1);
                uElementPack.params = oi3.e();
                u1.L("", k, 1, uElementPack, null);
             }
             return;
          }else {
             this.a.P8(p0);
             if (this.a.x.u() != null) {
                this.a.x.u().a(3);
             }
             return;
          }
       }
    }
    public void i0(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$d.class, "2")) {
          return;
       }
       if (this.a.R8(p0)) {
          a uoa = a.D();
          StringBuilder str = "reSelectBeautyCategoryItem, config is";
          String str1 = (p0 != null)? p0.toString(): "null";
          Object[] objArray = new Object[0];
          uoa.w("BeautifyPresenter", str+str1, objArray);
          return;
       }else {
          this.a.a9(p0, true);
          k1.r(new y0(this, p0), 10);
          this.a.V8();
          return;
       }
    }
    public void j0(RecoBeautifyConfig p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(m$d.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, m$d.class, "3")) {
          return;
       }
       if (p0 == null) {
          Object[] objArray = new Object[0];
          a.D().t("BeautifyPresenter", "SelectBeautyCategoryItem, config is null", objArray);
          return;
       }else {
          this.a.P8(p0);
          if (g.f()) {
             this.a.k9();
          }
          k1.r(new z0(this, p0, p2), 10);
          m k = this.a.K;
          BeautifyConfig currentConfi = p0.getCurrentConfig();
          if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(k, currentConfi, Boolean.valueOf(p1), null, h.class, "37")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             String str = "AI_BEAUTY";
             uElementPack.action2 = str;
             JsonObject jsonObject = new JsonObject();
             if (!p1) {
                str = "CHANGE";
             }
             jsonObject.c0("button_action", str);
             if (currentConfi != null) {
                jsonObject.a0("suit_id", Integer.valueOf(currentConfi.mId));
                jsonObject.c0("suit_name", TextUtils.k(currentConfi.mLoggerName));
             }
             uElementPack.params = jsonObject.toString();
             u1.L("", k, 1, uElementPack, null);
          }
          return;
       }
    }
    public void o(boolean p0){
       m$d uod = m$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "6")) {
          return;
       }
       uod = this.a;
       if (uod.V - -1) {
          m x = uod.x;
          if (x != null && x.u() != null) {
             this.a.x.u().c(3);
          }
          long l = k1.t(this.a.V);
          m k = this.a.K;
          int i = (p0)? 7: 8;
          h.m(l, k, i);
          i.V = -1;
       }
       return;
    }
    public void t(boolean p0){
       m$d uod = m$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "4")) {
          return;
       }
       this.a.V = System.currentTimeMillis();
       m x = this.a.x;
       if (x != null && x.u() != null) {
          this.a.x.u().b(3, p0);
       }
       return;
    }
    public void v(){
       if (PatchProxy.applyVoid(null, this, m$d.class, "7")) {
          return;
       }
       m$d ta = this.a;
       if (ta.V - -1) {
          m x = ta.x;
          if (x != null && x.u() != null) {
             this.a.x.u().c(3);
          }
          h.m(k1.t(this.a.V), this.a.K, 9);
          this.a.V = -1;
       }
       return;
    }
}
