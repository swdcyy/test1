package com.yxcorp.gifshow.prettify.beauty.d;
import l0c.f;
import s0c.d;
import o0c.d;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import ng9.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import com.yxcorp.gifshow.prettify.beauty.d$a;
import com.yxcorp.gifshow.prettify.beauty.d$b;
import lnc.s6;
import java.util.List;
import q0c.a;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Object;
import boc.b;
import java.lang.String;
import java.lang.Integer;
import java.util.Map;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import q0c.i;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import u0c.a;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import h16.n;
import com.yxcorp.gifshow.prettify.beauty.d$c;
import java.lang.Enum;
import u0c.d;
import com.yxcorp.gifshow.prettify.beauty.a0;
import q0c.i2;
import tkd.b;
import tkd.d;
import os5.g;
import n0c.a;
import r0c.h;
import java.util.Objects;
import kotlin.jvm.internal.a;
import r0c.i;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.util.resource.p;
import java.lang.StringBuilder;
import q0c.e;
import java.lang.Runnable;
import ekd.k1;
import t16.a;
import com.yxcorp.gifshow.util.resource.n;
import lm6.g;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import com.kwai.camerasdk.models.Business;
import com.yxcorp.gifshow.camerasdk.q;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem;
import android.view.View;
import bn8.a;
import lnc.i3;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import e17.i;
import java.lang.Boolean;
import w46.b;
import k2b.e0;
import com.yxcorp.gifshow.prettify.beauty.h;
import com.kwai.feature.post.api.componet.prettify.beauty.RecoBeautifyConfig;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import java.io.File;
import sq.a;
import og9.a;
import q0c.h;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import q0c.n;
import com.yxcorp.gifshow.prettify.beauty.c;
import erd.g;
import crd.b;
import q0c.o2;
import o0c.f;
import xi9.b;
import be9.a;
import com.kuaishou.android.post.funnel.PostFunnelManager;
import com.kuaishou.android.post.funnel.PostFunnelManager$a;
import v46.b;
import com.yxcorp.gifshow.camera.record.log.CameraFunnel$funnelBeauty$1$1;
import msd.l;
import r0c.f;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import lnc.p7;
import oe6.e;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import android.content.Context;
import os5.i;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.prettify.widget.PrettifyTextSwitcherView;
import xyb.a;
import l0c.p0;
import com.kwai.feature.post.api.componet.prettify.PrettyGuideInfo;
import p0c.h;
import p0c.d;
import p0c.a;
import q0c.y1;
import l0c.c;
import os5.a;
import s0c.a;
import k1b.a;
import t0c.g;
import z0c.k0;
import k1c.c;
import java.util.Set;
import k1c.a;
import k1c.b;
import q16.a$a;
import q0c.j;
import eoc.f;
import h16.a;
import q0c.m;
import h16.h;
import q0c.k;
import h16.i;
import q0c.l;
import q0c.a0;
import com.yxcorp.gifshow.prettify.beauty.b;
import q0c.o;
import java.util.concurrent.Future;
import t45.c;
import o0c.c;
import q0c.g;
import lnc.b9;
import android.os.Bundle;
import java.lang.System;
import java.util.Map$Entry;
import oc9.w;
import java.lang.Long;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.util.PostUtils;
import android.content.Intent;
import com.yxcorp.gifshow.prettify.beauty.data.BeautyDataHelper;
import q0c.f;
import boc.e;
import com.yxcorp.gifshow.util.resource.Category;
import q0c.p;
import ge9.a;

public class d extends d implements f, d, d	// class@0010ff
{
    public boolean A;
    public b B;
    public b C;
    public i D;
    public g E;
    public String F;
    public final List n;
    public final List o;
    public final List p;
    public c q;
    public long r;
    public PrettifyTextSwitcherView s;
    public h t;
    public a u;
    public a0 v;
    public final Set w;
    public final Set x;
    public long y;
    public final Map z;

    public void d(CameraPageType p0,b p1,c p2){
       super(p0, p1);
       ArrayList uArrayList = new ArrayList();
       this.n = uArrayList;
       ArrayList uArrayList1 = new ArrayList();
       this.o = uArrayList1;
       ArrayList uArrayList2 = new ArrayList();
       this.p = uArrayList2;
       this.w = new HashSet();
       this.x = new HashSet();
       this.y = -1;
       this.z = new HashMap();
       this.A = false;
       this.C = null;
       this.D = new d$a(this);
       this.E = new d$b(this);
       this.q = p2;
       if (s6.f()) {
          uArrayList1.addAll(a.d());
          uArrayList2.addAll(a.e());
          uArrayList.addAll(uArrayList1);
          uArrayList.addAll(uArrayList2);
       }else {
          uArrayList.addAll(a.c());
          uArrayList1.addAll(a.c());
       }
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          uArrayList1 = iterator.next();
          d tz = this.z;
          String resourceName = uArrayList1.getResourceName();
          int i = (uArrayList1.f())? 0: -1;
          tz.put(resourceName, Integer.valueOf(i));
       }
       this.d.n(BeautifyConfig.class, new i(this));
       d uod = PatchProxy.apply(null, this, d.class, "21");
       if (uod != PatchProxyResult.class) {
       }else {
          switch (d$c.a[this.c.ordinal()]){
              case 1:
              case 2:
                uod = d.a(0x3652a147).pH();
                break;
              case 3:
              case 5:
              case 4:
                uod = new i2();
                break;
              case 6:
              case 7:
                uod = new a0();
                break;
              default:
                uod = new d();
          }
       }
       this.u = new a(uod);
       h oh = this.d.c(a.class).b();
       this.t = oh;
       oh.f(this.u);
       d tt = this.t;
       uod = this.E;
       Objects.requireNonNull(tt);
       if (!PatchProxy.applyVoidOneRefs(uod, tt, h.class, "2")) {
          a.p(uod, "listener");
          tt.c.add(uod);
       }
       this.t.g(this.D);
       return;
    }
    public static void f2(d p0){
       Object[] objArray;
       int i = 0;
       if (p0.A()) {
          objArray = new Object[i];
          a.D().w("BeautifyController", "isResourceExist true.", objArray);
          p0.v2(i);
       }else if(p0.p2() != null){
          objArray = new Object[i];
          a.D().w("BeautifyController", "lastConfig isn\'t null, auto download resource", objArray);
          Iterator iterator = p0.z().iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             if (!p.h(uob)) {
                Object[] objArray1 = new Object[i];
                a.D().w("BeautifyController", "need download "+uob, objArray1);
                k1.o(new e(p0));
                n.o(uob, new a("record", "inner_resource"));
             }else {
                Object[] objArray2 = new Object[i];
                a.D().w("BeautifyController", "don\'t need download "+uob, objArray2);
             }
          }
       }else {
          Object[] objArray3 = new Object[i];
          a.D().w("BeautifyController", "lastConfig is null", objArray3);
       }
       return;
    }
    public static void g2(d p0,g p1){
       Object[] objArray1;
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, d.class, "16")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().s("BeautifyController", "handlePhotoCapturedEvent", objArray);
          if (p1.e != TakePictureType.LIVE_ENTRY || p0.c != CameraPageType.LIVE_COVER) {
             objArray1 = new Object[0];
             a.D().s("BeautifyController", "handlePhotoCapturedEvent page is invalid", objArray1);
          }else if(!p0.C0()){
             objArray1 = new Object[0];
             a.D().s("BeautifyController", "handlePhotoCapturedEvent is not featureSelected", objArray1);
          }else {
             p0.h.f0(Business.kLivePreview);
             p0.h.h0(0);
             BeautifyConfig uBeautifyCon = p0.p2();
             if (BeautyFilterItem.getFilterValue(uBeautifyCon, 99) > 0) {
                BeautyFilterItem.setFilterValue(uBeautifyCon, 99.00f, 0);
                BeautyFilterItem.setFilterValue(uBeautifyCon, 0, 0);
             }
             p0.z2(uBeautifyCon);
          }
       }
       return;
    }
    public static void h2(d p0,View p1){
       Object[] objArray1;
       Object[] objArray3;
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, d.class, "53")) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().w("BeautifyController", "switchBeautyStatus", objArray);
          d h = p0.h;
          if (h == null || !h.M()) {
             objArray1 = new Object[i];
             a.D().w("BeautifyController", "camera is not open", objArray1);
          }else {
             boolean b = a.i();
             int i1 = 406;
             i3 oi3 = i3.f();
             String str = (b)? "CHECKED": "UNCHECKED";
             oi3.d("status", str);
             String str1 = oi3.e();
             if (!PatchProxy.isSupport(CameraLogger.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(i1), "prettify_aggregation", str1, null, CameraLogger.class, "22")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action = i1;
                uElementPack.name = "prettify_aggregation";
                if (str1 != null) {
                   uElementPack.params = str1;
                }
                u1.B(new ClickMetaData().setType(true).setElementPackage(uElementPack));
             }
             i1 = 0x7f11066a;
             if (b) {
                a.p(i);
                Object[] objArray2 = new Object[i];
                a.D().w("BeautifyController", "打开美颜", objArray2);
                i.a(i1, R.string.arg_RES_7f1049b2);
                BeautifyConfig uBeautifyCon = p0.p2();
                if (uBeautifyCon != null) {
                   objArray3 = new Object[i];
                   a.D().w("BeautifyController", "use BeautifyConfig "+uBeautifyCon.mId, objArray3);
                   p0.t.e(uBeautifyCon);
                   p0.l2();
                }else {
                   objArray1 = new Object[i];
                   a.D().w("BeautifyController", "BeautifyConfig is null", objArray1);
                }
             }else {
                objArray3 = new Object[i];
                a.D().w("BeautifyController", "关闭美颜", objArray3);
                i.a(i1, R.string.arg_RES_7f1049b1);
                a.p(true);
                p0.t.e(new BeautifyConfig());
             }
          }
       }
       return;
    }
    public static void i2(d p0,BeautifyConfig p1,Boolean p2){
       Objects.requireNonNull(p0);
       int i = 0;
       if (!p2.booleanValue()) {
          Object[] objArray = new Object[i];
          a.D().t("BeautifyController", "restoreLastBeautifyConfig not ready", objArray);
       }else {
          p0.p2();
          Object[] objArray1 = new Object[i];
          a.D().w("BeautifyController", "restoreLastBeautifyConfig setBeautify "+p1, objArray1);
          h.i(p0.e, p1);
          p0.z2(p1);
          p0.B2(p1);
       }
       return;
    }
    private BeautifyConfig p2(){
       BeautifyConfig obj = PatchProxy.apply(null, this, d.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a(this.u.e()).f();
       if (obj instanceof RecoBeautifyConfig) {
          obj = obj.getCurrentConfig();
       }
       return obj;
    }
    public static boolean u2(){
       Object obj = PatchProxy.apply(null, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return true;
    }
    public boolean A(){
       Iterator obj = PatchProxy.apply(null, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.z().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return new File(MagicEmojiResourceHelper.d()).exists();
          }
          if (!p.h(obj.next())) {
             break ;
          }
       }
       return false;
    }
    public final void A2(boolean p0){
       Object[] objArray1;
       BeautifyConfig uBeautifyCon1;
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "27")) {
          return;
       }
       String str = "mBeautifyConfig != null";
       if (s6.f()) {
          if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "28")) {
             Object[] objArray = new Object[0];
             a.D().w("BeautifyController", "restoreLastBeautifyConfigV2", objArray);
             if (this.C()) {
                objArray1 = new Object[0];
                a.D().A("BeautifyController", "beautify disabled", objArray1);
             }else {
                BeautifyConfig uBeautifyCon = this.o2();
                if (!p0 && (uBeautifyCon != null && this.g != null)) {
                   objArray1 = new Object[0];
                   a.D().A("BeautifyController", str, objArray1);
                   h.i(this.e, uBeautifyCon);
                   this.z2(uBeautifyCon);
                }else if(this.c == CameraPageType.LIVE_COVER){
                   if (!this.s2()) {
                      objArray1 = new Object[0];
                      a.D().t("BeautifyController", "all the resources are not exist.", objArray1);
                   }
                }else {
                   Iterator obj = PatchProxy.apply(null, this, uod, "23");
                   if (obj != PatchProxyResult.class) {
                      obj = obj.booleanValue();
                   }else {
                      obj = this.n2().iterator();
                      while (true) {
                         if (obj.hasNext()) {
                            if (p.h(obj.next())) {
                               obj = true;
                            }
                         }else {
                            obj = false;
                         }
                      }
                   }
                   if (!obj) {
                      objArray1 = new Object[0];
                      a.D().t("BeautifyController", "all the resources are not exist.", objArray1);
                   }
                }
                objArray1 = new Object[0];
                a.D().E("BeautifyController", "[beautify][keypath][data] ", "did receive data", objArray1);
                uBeautifyCon1 = this.p2();
                Object[] objArray2 = new Object[0];
                a.D().w("BeautifyController", "restoreLastBeautifyConfigV2 setBeautify "+uBeautifyCon1, objArray2);
                h.i(this.e, uBeautifyCon1);
                this.z2(uBeautifyCon1);
                this.B2(uBeautifyCon1);
                uod = this.q;
                if (uod != null) {
                   uod.d0();
                }
                if (!a.c() && (uBeautifyCon1 != null && uBeautifyCon1.mId == -1)) {
                   this.d.m(new a());
                }
             }
          }
          return;
       }else {
          Object[] objArray3 = new Object[0];
          a.D().w("BeautifyController", "restoreLastBeautifyConfig", objArray3);
          if (this.C()) {
             objArray1 = new Object[0];
             a.D().A("BeautifyController", "beautify disabled", objArray1);
             return;
          }else {
             BeautifyConfig uBeautifyCon2 = this.o2();
             if (!p0 && (uBeautifyCon2 != null && this.g != null)) {
                objArray3 = new Object[0];
                a.D().A("BeautifyController", str, objArray3);
                h.i(this.e, uBeautifyCon2);
                this.z2(uBeautifyCon2);
                return;
             }else if(!this.s2()){
                objArray1 = new Object[0];
                a.D().t("BeautifyController", "all the resources are not exist.", objArray1);
                return;
             }else {
                objArray1 = new Object[0];
                a.D().E("BeautifyController", "[beautify][keypath][data] ", "did receive data", objArray1);
                uBeautifyCon1 = this.p2();
                this.Y1(t.fromCallable(new h(this, uBeautifyCon1)).subscribeOn(d.c).observeOn(d.a).subscribe(new n(this, uBeautifyCon1), c.b));
                uod = this.q;
                if (uod != null) {
                   uod.d0();
                }
                if (!a.c() && (uBeautifyCon1 != null && uBeautifyCon1.mId == -1)) {
                   this.d.m(new a());
                }
             label_01b0 :
                return;
             }
          }
       }
    }
    public void B0(BeautifyConfig p0,BeautyFilterItem p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "37")) {
          return;
       }
       if (p1.getItemId() == -1 || p1.getItemId() == -2) {
          this.k2(p0);
       }
       h.q(p0, p1, o2.b(), null);
       d tg = this.g;
       if (tg != null) {
          tg.Y(p1.getLoggerName());
       }
       return;
    }
    public final void B2(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "24")) {
          return;
       }
       this.y2(p0);
       if (p0 != null) {
          a a = a.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(p0, a, a.class, "2")) {
             PostFunnelManager.j.a().d().l(CameraFunnel$funnelBeauty$1$1.INSTANCE);
          }
       }
       return;
    }
    public boolean C(){
       Object obj = PatchProxy.apply(null, this, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.t.b().e();
    }
    public boolean C0(){
       Object obj = PatchProxy.apply(null, this, d.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.C() && (this.o2() != null && this.o2().mId != -1))? true: false;
       return b;
    }
    public void F(BeautifyConfig p0,BeautyFilterItem p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "39")) {
          return;
       }
       d tg = this.g;
       if (tg != null) {
          tg.Y(p1.getLoggerName());
       }
       return;
    }
    public void J(){
    }
    public void L3(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "7")) {
          return;
       }
       if (p0 != null) {
          p7.b(p0.e, this.o2(), this.F, this.r2());
       }
       return;
    }
    public void M3(){
       if (PatchProxy.applyVoid(null, this, d.class, "46")) {
          return;
       }
       if (!e.o()) {
          e.e0(true);
       }
       return;
    }
    public void W5(){
       if (PatchProxy.applyVoid(null, this, d.class, "43")) {
          return;
       }
       RxBus.f.b(new PanelShowEvent(this.c, PanelShowEvent$PanelType.BEAUTIFY, this.e, true));
       return;
    }
    public void Z0(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "34")) {
          return;
       }
       BeautifyConfig mId = p0.mId;
       int i = 0;
       if (mId == 1000 || mId == 999) {
          Object[] objArray = new Object[i];
          a.D().w("BeautifyController", "switch version : "+p0.mId, objArray);
          RxBus.f.b(new p0());
          return;
       }else {
          this.k2(p0);
          f uof = null;
          mId = (p0.mId == null)? uof: p0;
          h.t(mId, i, o2.b(), uof);
          if (this.c == CameraPageType.LIVE_COVER && p0.mId == 20) {
             String[] stringArray = d.a(-1129985913).Pw(p0.mId);
             if (this.s != null && (stringArray != null && (stringArray.length >= 2 && (!TextUtils.x(stringArray[i]) && !TextUtils.x(stringArray[1]))))) {
                this.s.f(stringArray[i], stringArray[1], 1);
             }
          }
       label_0068 :
          return;
       }
    }
    public boolean a0(PrettyGuideInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0.d() != 2 && p0.d() != b) {
          b = false;
       }
       return b;
    }
    public void b1(BeautifyConfig p0,boolean p1){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, d.class, "38")) {
          return;
       }
       if (p1) {
          d tg = this.g;
          if (tg != null) {
             tg.Y("category_smartBeauty");
          }
       }
       return;
    }
    public void c0(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "14")) {
          return;
       }
       p0.g().c().add(Integer.valueOf(0));
       p0.a().R(this.o2());
       p0.a().O(this);
       CameraPageType lIVE_COVER = CameraPageType.LIVE_COVER;
       String str = "5";
       int i = 2;
       if (this.c == lIVE_COVER) {
          p0.a().B(y1.h().e());
          p0.a().M(d.a(0x1d75a40d).n7());
          p0.a().D(a.b());
          p0.a().Q(a.d());
          p0.a().H(true);
          p0.a().T(i);
          p0.a().W(true);
          p0.a().A(this.z());
       }else {
          p0.a().B(y1.h().f());
          p0.a().F(true);
          p0.a().M(this.u.e());
          p0.a().U(true);
          a uoa = p0.a();
          if (!o2.b()) {
             i = 1;
          }
          uoa.T(i);
          p0.a().D = new g(this.q.p1());
          if (s6.f()) {
             p0.a().A(this.n2());
             uoa = p0.a();
             d tp = this.p;
             Objects.requireNonNull(uoa);
             if (!PatchProxy.applyVoidOneRefs(tp, uoa, a.class, str)) {
                a.p(tp, "<set-?>");
                uoa.H = tp;
             }
          }else {
             p0.a().A(this.z());
          }
       }
       p0.a().N(this);
       if (p0.f() != null) {
          c uoc = p0.f();
          Set set = this.t.b().b();
          Objects.requireNonNull(uoc);
          if (!PatchProxy.applyVoidOneRefs(set, uoc, c.class, str)) {
             a.p(set, "disableBeautyItemList");
             uoc.b.clear();
             uoc.b.addAll(set);
          }
          p0.f().b(true, new a(this.t.b().c(), this.t.b().d()));
       }
       d tc = this.c;
       if (tc != lIVE_COVER && tc != CameraPageType.LIVE) {
          p0.a().G(true);
          p0.a().C(R.layout.arg_RES_7f0d0a71);
          p0.a().P(R.layout.arg_RES_7f0d0a73);
          p0.a().K(R.layout.arg_RES_7f0d0a75);
          p0.a().E(R.layout.arg_RES_7f0d119a);
          p0.a().X(true);
          p0.a().I(true);
          p0.a().H(true);
       }
       return;
    }
    public void de(a$a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "6")) {
          return;
       }
       this.F = p7.a(this.o2());
       return;
    }
    public void f5(){
       if (PatchProxy.applyVoid(null, this, d.class, "48")) {
          return;
       }
       RxBus.f.b(new PanelShowEvent(this.c, PanelShowEvent$PanelType.BEAUTIFY, this.e, false));
       d tg = this.g;
       if (tg != null) {
          tg.C0(true);
       }
       return;
    }
    public void f6(){
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       super.k(p0);
       this.s = p0.findViewById(0x7f0a31c0);
       this.Y1(f.a(g.class, new j(this)));
       this.Y1(f.a(a.class, new m(this)));
       this.Y1(f.a(h.class, new k(this)));
       this.Y1(f.a(i.class, new l(this)));
       this.v = new a0(this.h);
       d tc = this.c;
       if (tc == CameraPageType.TIE_TIE || tc == CameraPageType.WHATS_UP) {
          this.b2(new b(this));
       }
       return;
    }
    public void k2(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "42")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("BeautifyController", "saveBeautyConfig "+p0, objArray);
       this.t.e(p0);
       this.B2(p0);
       return;
    }
    public final void l2(){
       if (PatchProxy.applyVoid(null, this, d.class, "33")) {
          return;
       }
       c.k(new o(this));
       return;
    }
    public final boolean m2(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       BeautifyConfig obj = PatchProxy.apply(null, this, uod, "30");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (o2.b()) {
          obj = this.o2();
          if (obj != null && obj.mId != 30) {
             if (this.c == CameraPageType.LIVE_COVER) {
                return this.A();
             }else {
                Object obj1 = PatchProxy.apply(null, this, uod, "9");
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                }else {
                   Iterator iterator = this.n2().iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         if (!p.h(iterator.next())) {
                            b = false;
                            break ;
                         }
                      }else {
                         b = new File(MagicEmojiResourceHelper.d()).exists();
                         break ;
                      }
                   }
                }
                return b;
             }
          }
       }
       return true;
    }
    public final List n2(){
       return this.o;
    }
    public void n4(){
       c.f(this);
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       super.nb(p0);
       Object[] objArray = new Object[0];
       a.D().w("BeautifyController", "setDeformJsonPath v4", objArray);
       this.b2(new g(this));
       return;
    }
    public BeautifyConfig o2(){
       Object obj = PatchProxy.apply(null, this, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.b().a();
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, d.class, "50")) {
          return;
       }
       super.onDestroy();
       this.v2(true);
       b9.a(this.C);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, d.class, "49")) {
          return;
       }
       super.onDestroyView();
       d tv = this.v;
       if (tv != null) {
          tv.a(false);
       }
       tv = this.g;
       if (tv != null) {
          tv.C0(true);
       }
       return;
    }
    public void p0(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "40")) {
          return;
       }
       this.k2(p0);
       return;
    }
    public void q0(BeautifyConfig p0,BeautifyConfig p1,BeautyFilterItem p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "41")) {
          return;
       }
       h.r(p0, p1, p2, this.e);
       return;
    }
    public void q4(View p0,Bundle p1){
       c.j(this, p0, p1);
    }
    public List r2(){
       Object obj = PatchProxy.apply(null, this, d.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList();
    }
    public final boolean s2(){
       Iterator obj = PatchProxy.apply(null, this, d.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.z().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          if (p.h(obj.next())) {
             break ;
          }
       }
       return true;
    }
    public final void t2(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       String str = MagicEmojiResourceHelper.d();
       this.g.b0(str);
       this.h.Q0("beautyDeformJson", str);
       str = MagicEmojiResourceHelper.c();
       this.g.q0(str);
       this.h.Q0("beautyAIDeformJson", str);
       this.h.L();
       return;
    }
    public void u3(){
       if (PatchProxy.applyVoid(null, this, d.class, "47")) {
          return;
       }
       h.n((System.currentTimeMillis() - this.r));
       return;
    }
    public final void v2(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "52")) {
          return;
       }
       if (this.A != null) {
          return;
       }
       if (!this.y - -1) {
          return;
       }
       Iterator iterator = this.z.entrySet().iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (iterator.next().getValue().intValue() == -1) {
                uod = null;
             }
          }else {
             uod = 1;
          }
          if (!p0 && !uod) {
             return;
          }else {
             uod = this.z;
             long l = System.currentTimeMillis() - this.y;
             String taskId = this.d.b().getTaskId();
             if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidFourRefs(uod, Long.valueOf(l), Boolean.valueOf(p0), taskId, null, h.class, "43")) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.a0("cost", Long.valueOf(l));
                int i = (p0)? 2: 1;
                jsonObject.a0("reportReason", Integer.valueOf(i));
                jsonObject.c0("taskId", taskId);
                JsonObject jsonObject1 = new JsonObject();
                iterator = uod.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   String key = uEntry.getKey();
                   jsonObject1.a0(key, uEntry.getValue());
                }
                jsonObject.G("modelList", jsonObject1);
                PostUtils.x("BEAUTY_RESOURCE_DOWNLOADED", jsonObject.toString());
             }
             break ;
          }
       }
       this.y = -1;
       this.A = true;
       return;
    }
    public void v6(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "44")) {
          return;
       }
       if (!p0) {
          RxBus.f.b(new PanelShowEvent(this.c, PanelShowEvent$PanelType.BEAUTIFY, this.e, true));
       }
       return;
    }
    public void w0(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "35")) {
          return;
       }
       if (p0.mId == null) {
          p0 = null;
       }
       h.s(p0, true, null);
       d tg = this.g;
       if (tg != null) {
          tg.C0(false);
       }
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       super.w1(p0);
       BeautyDataHelper.d.i(this.c.name());
       Object[] objArray = new Object[0];
       a.D().w("BeautifyController", "当前页面是："+this.c.name(), objArray);
       if (this.w2()) {
          this.b2(new f(this));
       }
       return;
    }
    public boolean w2(){
       d tc = this.c;
       boolean b = (tc == CameraPageType.WHATS_UP || tc == CameraPageType.TIE_TIE)? true: false;
       return b;
    }
    public void x1(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "36")) {
          return;
       }
       h.o(p0, null);
       d tg = this.g;
       if (tg != null) {
          tg.C0(true);
       }
       return;
    }
    public void x5(){
    }
    public void y(b p0){
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "11")) {
          return;
       }
       if (!this.n.contains(p0)) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("BeautifyController", p0.getResourceName()+" download finish", objArray);
       if (p0 == e.c) {
          this.t2();
       }else if(p0 != Category.MAGIC_YCNN_SKIN_COLOR_DETECTION_V2 && (p0 != e.B && (p0 != e.l && (p0 == e.M || p0 == e.L)))){
          this.h.e0();
       }
       if (!this.h.isRecording()) {
          if (this.A()) {
             k1.o(new p(this));
          }
          if (this.m2()) {
             objArray1 = new Object[0];
             a.D().w("BeautifyController", "restoreLastBeautifyConfig after download resource", objArray1);
             this.A2(0);
          }else {
             objArray1 = new Object[0];
             a.D().w("BeautifyController", "restoreLastBeautifyConfig wait for all resource", objArray1);
          }
       }else {
          objArray1 = new Object[0];
          a.D().w("BeautifyController", "don\'t restoreLastBeautifyConfig when recording", objArray1);
       }
       this.z.put(p0.getResourceName(), Integer.valueOf(1));
       this.v2(0);
       return;
    }
    public void y2(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "25")) {
          return;
       }
       boolean b = true;
       int i = (this.C0() && (p0 != null && p0.isEfficacious()))? 1: 0;
       int i1 = (this.t.b().c() || this.t.b().d())? 1: 0;
       d td = this.d;
       d tc = this.c;
       if (!i && !i1) {
          b = false;
       }
       td.m(new a(tc, b));
       return;
    }
    public void y6(){
       if (PatchProxy.applyVoid(null, this, d.class, "45")) {
          return;
       }
       this.r = System.currentTimeMillis();
       return;
    }
    public List z(){
       return this.n;
    }
    public void z2(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "26")) {
          return;
       }
       this.t.d(p0);
       return;
    }
}
