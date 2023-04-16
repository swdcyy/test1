package com.yxcorp.gifshow.homepage.menu.g;
import eb5.e;
import java.lang.Object;
import crd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import uv8.n0;
import crd.b;
import brd.t;
import tkd.b;
import tkd.d;
import hw5.e;
import vv5.l1;
import t45.d;
import brd.z;
import uv8.m0;
import com.kuaishou.live.common.core.basic.tools.h;
import erd.g;
import com.kwai.feature.api.feed.home.menu.SidebarMenuItem;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import java.lang.Boolean;
import com.yxcorp.utility.TextUtils;
import k2b.l0;
import lnc.i3;
import java.lang.Number;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import wkd.b;
import com.kwai.component.menudot.b;
import com.yxcorp.gifshow.reddot.model.RedDot;
import fg6.a;
import com.yxcorp.gifshow.reddot.model.RedDotExtParams;
import com.google.gson.Gson;
import lnc.u5;
import k9c.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import k2b.e0;
import qta.r0;
import msd.a;
import com.kwai.framework.kgi.sdk.Kgi;

public class g implements e	// class@00177a
{
    public final a a;
    public int b;

    public void g(){
       super();
       this.a = new a();
       this.b = 0;
    }
    public void a(int p0){
       b uob;
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og, "2")) {
          return;
       }
       this.b = p0;
       if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og, "10")) {
          og = this.a;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          n0 on0 = n0.class;
          if (PatchProxy.isSupport(on0)) {
             uob = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, on0, "6");
             if (uob != patchProxyRe) {
             label_0075 :
                og.c(uob);
             }
          }
          t ot = PatchProxy.apply(null, null, on0, "5");
          if (ot != patchProxyRe) {
          }else {
             ot = d.a(-854594802).b7();
          }
          uob = ot.subscribeOn(d.c).observeOn(d.a).subscribe(new m0(p0), h.b);
          goto label_0075 ;
       }
       return;
    }
    public final ClientContent$KsOrderInfoPackage b(SidebarMenuItem p0,String p1,boolean p2){
       if (PatchProxy.isSupport(g.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, g.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.c(p0.mKsOrderId, TextUtils.i(p1, p0.mRedDotKsOrderId), p2);
    }
    public final ClientContent$KsOrderInfoPackage c(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(g.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, g.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p2) {
          p0 = p1;
       }
       return l0.a(p0);
    }
    public i3 d(String p0,String p1,boolean p2,int p3,String p4){
       i3 obj;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Integer.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, og, "45");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = i3.f();
       obj.d("id", p0);
       obj.d("button_name", p1);
       obj.d("point_type", this.e(p2, p3));
       obj.c("point_num", Integer.valueOf(p3));
       obj.d("page_type", p4);
       return obj;
    }
    public final String e(boolean p0,int p1){
       String str;
       if (!p0 && p1 <= 0) {
          str = "none";
       }else if(p1 > 0){
          str = "num";
       }else {
          str = "point";
       }
       return str;
    }
    public final String f(boolean p0,int p1,int p2){
       i3 obj;
       if (PatchProxy.isSupport(g.class)) {
          obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, g.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = i3.f();
       obj.d("user_id", QCurrentUser.ME.getId());
       obj.d("user_name", QCurrentUser.ME.getName());
       String str = (TextUtils.x(QCurrentUser.ME.getText()))? "default": "intro";
       obj.d("content_type", str);
       obj.d("point_type", this.e(p0, p1));
       obj.c("point_num", Integer.valueOf(p1));
       obj.c("pendant_type", Integer.valueOf(p2));
       return obj.e();
    }
    public String g(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       RedDot redDot = b.a(0x34c80eb4).c(p0);
       if (redDot == null) {
          return null;
       }else if(TextUtils.x(redDot.mExtParams)){
          return null;
       }else {
          RedDotExtParams redDotExtPar = a.a.h(redDot.mExtParams, RedDotExtParams.class);
          if (redDotExtPar == null) {
             return null;
          }else {
             return redDotExtPar.mRedDotKsOrderId;
          }
       }
    }
    public i3 h(String p0,String p1,boolean p2,int p3,String p4){
       i3 obj;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Integer.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, og, "46");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = i3.f();
       obj.d("id", p0);
       obj.d("button_name", p1);
       obj.d("point_type", this.e(p2, p3));
       obj.c("point_num", Integer.valueOf(p3));
       obj.d("page_type", p4);
       int i = -1071465158;
       if (p3 > 0) {
          b.a(i).b(e.a());
       }else {
          b.a(i).d();
       }
       obj.d("redpoint_id", b.a(i).f());
       return obj;
    }
    public void i(int p0,String p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, og, "43")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "BANNER";
       i3 oi3 = i3.f();
       oi3.c("index", Integer.valueOf(p0));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.ksOrderInfoPackage = l0.a(p1);
       u1.u0(5, uElementPack, uContentPack);
       return;
    }
    public void j(e0 p0,String p1,int p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, g.class, "9")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MENU_BUTTON";
       uElementPack.params = this.h("3", p1, false, p2, "home").e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       boolean b = (p2 > 0)? true: false;
       uContentPack.ksOrderInfoPackage = this.c("S-C1920E8B965B", "S-B23F70962E4F", b);
       u1.L("", p0, 1, uElementPack, uContentPack);
       Kgi.c(new r0(uContentPack, uElementPack));
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.a(0);
       return;
    }
    public void l(e0 p0,String p1,int p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, g.class, "6")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MENU_BUTTON";
       uElementPack.params = this.d("2", p1, false, p2, "home").e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       boolean b = (p2 > 0)? true: false;
       uContentPack.ksOrderInfoPackage = this.c("S-5790676833BE", "S-F4367F99B36F", b);
       u1.C0("", p0, 3, uElementPack, uContentPack);
       return;
    }
}
