package com.kwai.tokenshare.KwaiTokenInitModule;
import com.kwai.tokenshare.b$b;
import com.kwai.framework.init.a;
import com.kwai.tokenshare.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import j4d.b;
import com.yxcorp.utility.Log;
import crd.b;
import lnc.b9;
import com.kwai.tokenshare.b;
import java.lang.StringBuilder;
import bu7.v;
import java.lang.Runnable;
import ekd.s1;
import b76.a;
import bu7.w;
import com.kwai.framework.init.e;
import com.kwai.tokenshare.KwaiTokenInitModule$a;
import t7c.e;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wa5.e;
import bu7.i;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.yxcorp.plugin.kwaitoken.KwaiToken;
import com.kwai.tokenshare.c;
import com.kwai.tokenshare.f;
import java.util.ArrayList;
import wkd.b;
import j80.c;
import java.io.File;
import com.yxcorp.plugin.kwaitoken.j;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.plugin.kwaitoken.k;
import java.util.Collection;
import o56.c;
import xf6.h;
import l4d.a;
import fjd.b;
import jb6.d;
import com.yxcorp.retrofit.idc.models.Host;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import m4d.d;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.n;
import brd.t;
import t45.d;
import brd.z;
import bu7.u;
import erd.g;
import eda.v;
import bu7.p;
import zca.p;
import bu7.t;
import e06.b;
import bu7.s;
import ujc.e;
import bu7.q;
import bxb.b;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import bu7.r;
import tjc.c;
import m4d.f;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import java.util.List;
import androidx.fragment.app.FragmentActivity;
import lu5.c;
import tkd.b;
import tkd.d;
import ku5.a;
import ju5.g;
import java.lang.Throwable;
import lc5.b;
import com.google.gson.JsonObject;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShareLaunchPackage;
import zk.g;
import com.google.gson.JsonElement;
import java.lang.Exception;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$FirstLaunchEvent;
import com.yxcorp.gifshow.log.model.CommonParams;
import k2b.u1;
import com.yxcorp.gifshow.log.h;
import com.yxcorp.plugin.kwaitoken.model.BaseDialogInfo;
import bu7.i0;
import com.yxcorp.plugin.kwaitoken.model.CustomDialogInfo;
import ckc.b;
import com.yxcorp.plugin.kwaitoken.model.JumpDirectDialogInfo;
import android.widget.Toast;
import apd.i;
import apd.c;
import apd.b;
import kzc.d;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.plugin.kwaitoken.model.TachTemplateDialogInfo;
import so7.b;
import so7.c;
import apd.f;
import apd.h;
import so7.a;
import to7.b;
import apd.g;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import apd.d;
import com.kwai.tokenshare.KwaiTokenCustomPopUpDialog;
import e17.i;
import nf6.i;
import android.net.Uri;
import ekd.w0;
import android.content.Intent;
import ekd.k0;
import bu7.g0;
import bu7.h0;

public class KwaiTokenInitModule extends a implements b$b	// class@001916
{
    public b A;
    public b q;
    public b r;
    public b s;
    public b t;
    public long u;
    public b v;
    public b w;
    public b x;
    public b y;
    public a z;
    public static boolean B = false;
    public static boolean C = true;
    public static boolean D;
    public static boolean E;
    public static boolean F;
    public static boolean G;
    public static boolean H;
    public static boolean I;
    public static boolean J;
    public static boolean K;
    public static boolean L;
    public static boolean M;

    public void KwaiTokenInitModule(){
       super();
       this.z = new a();
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiTokenInitModule.class, "20")) {
          return;
       }
       if (KwaiTokenInitModule.B && this.q != null) {
          if (a.t().d("enableOnlineParseToken", false)) {
             this.q.L1();
             Log.g("KwaiTokenInitModule", "callback 执行无限口令剪切板读取");
          }else {
             this.q.M1();
             Log.g("KwaiTokenInitModule", "callback 执行非无限口令剪切板读取");
          }
       }
       return;
    }
    public int f0(){
       return 13;
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, KwaiTokenInitModule.class, "3")) {
          return;
       }
       b9.a(this.v);
       b9.a(this.s);
       b9.a(this.w);
       b9.a(this.A);
       b9.a(this.x);
       b9.a(this.y);
       KwaiTokenInitModule.D = false;
       KwaiTokenInitModule.H = false;
       KwaiTokenInitModule.I = false;
       KwaiTokenInitModule.J = false;
       KwaiTokenInitModule.K = false;
       KwaiTokenInitModule tq = this.q;
       if (tq != null) {
          tq.K1();
       }
       tq = this.r;
       if (tq != null) {
          tq.a();
       }
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, KwaiTokenInitModule.class, "1")) {
          return;
       }
       boolean b = a.t().d("kwaiTokenAsyncInit", false);
       Log.g("KwaiTokenInitModule", "kwaiTokenAsyncInit="+b);
       if (b) {
          s1.d(new v(this));
       }else {
          this.n0();
       }
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiTokenInitModule.class, "4")) {
          return;
       }
       KwaiTokenInitModule.L = true;
       if (KwaiTokenInitModule.I || KwaiTokenInitModule.J) {
          e.g(new w(this), "KwaiTokenInitModule");
       }
       KwaiTokenInitModule$a uoa = new KwaiTokenInitModule$a(this);
       if (!PatchProxy.applyVoidOneRefs(uoa, null, e.class, "1")) {
          e.a.add(uoa);
       }
       return;
    }
    public boolean l0(){
       Object obj = PatchProxy.apply(null, this, KwaiTokenInitModule.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (e.f() && a.t().d("shareSDKEnablePasteBoardSetting", b)) {
          b = true;
       }
       return b;
    }
    public void n(){
    }
    public final void n0(){
       z a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KwaiTokenInitModule.class, "2")) {
          return;
       }
       boolean b = false;
       boolean b1 = true;
       if (!PatchProxy.applyVoid(objArray, this, KwaiTokenInitModule.class, "11") && !KwaiTokenInitModule.B) {
          KwaiTokenInitModule.B = b1;
          if (!DateUtils.H(i.a())) {
             KwaiTokenInitModule.E = b1;
          }
          SharedPreferences$Editor uEditor = i.a.edit();
          uEditor.putLong("firstColdStartTimeMs", System.currentTimeMillis());
          g.a(uEditor);
          this.q = KwaiToken.k();
          c uoc = new c(this);
          f uof = new f(this);
          ArrayList uArrayList = new ArrayList(b1);
          File uFile = b.a(-1504323719).o();
          if (uFile != null) {
             uArrayList.add(uFile.getPath());
          }
          j oj = new j(a.b());
          oj.g = uof;
          oj.a = a.x;
          oj.b = a.A;
          k.e = "share";
          oj.c = a.t().a("readAlbumQRCodeCount", 3);
          if (uArrayList.size() > 0) {
             oj.f.addAll(uArrayList);
          }
          oj.h = a.t().d("shareTokenParseRelayRealTimeStartUp", b1);
          oj.d = a.t().a("shareTokenMaxLength", 1000);
          if (a.a().c()) {
             if (h.p()) {
                a.b = b;
             }
             Host host = d.a().c("zhongtai");
             if (host != null && !TextUtils.x(host.toString())) {
                a.a = host.toString();
             }
          }
       label_00e2 :
          this.q.G1(a.b(), uoc, oj);
          b9.a(this.t);
          this.t = RxBus.f.f(n.class).observeOn(d.a).subscribe(new u(this));
       }
       RxBus f = RxBus.f;
       a = d.a;
       this.v = f.f(v.class).observeOn(a).subscribe(new p(this));
       this.s = f.f(p.class).observeOn(a).subscribe(new t(this));
       this.w = f.f(b.class).observeOn(a).subscribe(new s(this));
       t ot = f.f(e.class).observeOn(a);
       this.A = ot.subscribe(new q(this));
       this.y = f.g(b.class, RxBus$ThreadMode.MAIN).subscribe(new r(this));
       boolean b2 = b.a(-1608526086).S();
       String str = "KwaiTokenInitModule";
       Log.g(str, "onForeground hasSplash:"+b2);
       if (b2) {
          KwaiTokenInitModule.H = b1;
       }else if(this.q != null){
          if (a.t().d("enableOnlineParseToken", b)) {
             this.q.L1();
             Log.g(str, "onForeground 执行无限口令剪切板读取");
          }else {
             this.q.M1();
             Log.g(str, "onForeground 执行非无限口令剪切板读取");
          }
          this.q.A1();
          this.q.I1(null, "downloadVideo", true, true, null);
       }
       return;
    }
    public boolean o0(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Activity obj = PatchProxy.apply(null, this, KwaiTokenInitModule.class, "13");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = ActivityContext.g().e();
       List list = ActivityContext.g().c();
       boolean b = true;
       if (list != null && (list.size() > 0 && (obj != null && (!obj.isFinishing() && obj instanceof FragmentActivity)))) {
          Object obj1 = PatchProxy.apply(null, this, KwaiTokenInitModule.class, "14");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(c.d() && d.a(0x3e3feef5).RY()){
             b1 = true;
          }else {
             b1 = false;
          }
          if (!b1 && !d.a(0x6ea0c3d0).N20()) {
          label_0076 :
             return b;
          }
       }
    label_0075 :
       b = false;
       goto label_0076 ;
    }
    public void onEventMainThread(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiTokenInitModule.class, "8")) {
          return;
       }
       StringBuilder str = "onEventMainThread 收到HomeSplashStateEvent state is finish:";
       String str1 = 4;
       int i = 1;
       int i1 = 0;
       boolean b = (p0.a == str1)? true: false;
       str = str+b+" mIsInterruptedBySplash:"+KwaiTokenInitModule.H+" null != mKwaiToken:";
       b = (this.q != null)? true: false;
       String str2 = "KwaiTokenInitModule";
       Log.g(str2, str+b+" mIsKwaiTokenInit:"+KwaiTokenInitModule.B);
       if (KwaiTokenInitModule.B && (this.q != null && (KwaiTokenInitModule.H && p0.a == str1))) {
          Object[] objArray = new Object[i];
          objArray[i1] = str2;
          String[] stringArray = new String[]{"kwai_token"};
          b.h(b.b(null, "receive HomeSplashStateEvent and run task", null, objArray), stringArray);
          this.q.K1();
          if (a.t().d("enableOnlineParseToken", i1)) {
             this.q.L1();
             Log.g(str2, "onEventMainThread 执行无限口令剪切板读取");
          }else {
             this.q.M1();
             Log.g(str2, "onEventMainThread 执行非无限口令剪切板读取");
          }
          this.q.A1();
          this.q.I1(null, "downloadVideo", true, true, null);
       }
    label_00a8 :
       return;
    }
    public void onQrCodeInitCompleteEvent(v p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiTokenInitModule.class, "9")) {
          return;
       }
       if (KwaiTokenInitModule.B && this.q != null) {
          String str = "kwai_token";
          String str1 = "KwaiTokenInitModule";
          if (KwaiTokenInitModule.I) {
             KwaiTokenInitModule.I = false;
             this.q.A1();
             objArray = new Object[]{str1};
             String[] stringArray = new String[]{str};
             b.h(b.b(null, "receive QrCodeInitCompleteEvent and run album task", null, objArray), stringArray);
          }
          if (KwaiTokenInitModule.J) {
             KwaiTokenInitModule.J = false;
             this.q.I1(null, "downloadVideo", true, true, null);
             objArray = new Object[]{str1};
             String[] stringArray1 = new String[]{str};
             b.h(b.b(null, "receive QrCodeInitCompleteEvent and run downLoad video task", null, objArray), stringArray1);
          }
       }
    label_0058 :
       return;
    }
    public void p0(String p0,String p1,String p2,JsonObject p3){
       ClientEvent$FirstLaunchEvent uFirstLaunch;
       CommonParams uCommonParam;
       String str = "source_share_user_id";
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, KwaiTokenInitModule.class, "18")) {
          return;
       }
       ClientEvent$ShareLaunchPackage shareLaunchP = new ClientEvent$ShareLaunchPackage();
       shareLaunchP.shareId = TextUtils.k(p1);
       shareLaunchP.token = TextUtils.k(p2);
       if (("KWAIXIAODIAN_LOTTERY").equals(p0) && p3 != null) {
          try{
             JsonObject jsonObject = new JsonObject();
             if (p3.s0("ecom_task_id")) {
                jsonObject.c0("ecom_task_id", TextUtils.k(p3.r0("ecom_task_id").w()));
             }
             if (p3.s0(str)) {
                jsonObject.c0(str, TextUtils.k(p3.r0(str).w()));
             }
             shareLaunchP.extraInfo = jsonObject.toString();
          }catch(java.lang.Exception e11){
             e11.printStackTrace();
          }
       }
    }
    public boolean q0(){
       Object obj = PatchProxy.apply(null, this, KwaiTokenInitModule.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (KwaiTokenInitModule.C) {
          return b;
       }
       if (KwaiTokenInitModule.M) {
          return false;
       }
       KwaiTokenInitModule.M = b;
       if (!c.e() || !d.a(0x3e3feef5).UN()) {
          b = false;
       }
       KwaiTokenInitModule.C = b;
       KwaiTokenInitModule.M = false;
       return KwaiTokenInitModule.C;
    }
    public void r0(BaseDialogInfo p0,d p1,FragmentActivity p2){
       String str1;
       object oobject;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KwaiTokenInitModule.class, "12")) {
          return;
       }
       String str = null;
       boolean b = (p0 != null && (p0.mShowType == 107 && p0 instanceof CustomDialogInfo))? true: false;
       int i = 50;
       boolean b1 = 105;
       if (b || i0.d(p0)) {
          i0 oi0 = i0.class;
          if (!PatchProxy.applyVoidTwoRefs(p2, p0, null, oi0, "4")) {
             if (!KwaiTokenCustomPopUpDialog.d(p0) && !i0.d(p0)) {
                i.a(R.style.arg_RES_7f110668, 0x7f101c3e);
             }else if(p0 != null && (p0.mShowType == b1 && p0 instanceof JumpDirectDialogInfo)){
                str1 = 1;
             }else {
                str1 = null;
             }
             if (str1) {
                if (!PatchProxy.applyVoidTwoRefs(p2, p0, null, oi0, "5") && i0.a(p0.mOriginSubBiz)) {
                   Intent intent = b.a(0x66dce92a).a(a.B, w0.f(p0.mDialogKwaiUrl));
                   if (intent != null && p2 != null) {
                      p2.startActivity(intent);
                   }
                }
             }else if(KwaiTokenCustomPopUpDialog.d(p0)){
                oi0 = PatchProxy.applyOneRefs(p0, null, KwaiTokenCustomPopUpDialog.class, "3");
                if (oi0 != PatchProxyResult.class) {
                   str = oi0.booleanValue();
                }else {
                   BaseDialogInfo mExtParams = p0.mExtParams;
                   if (mExtParams != null) {
                      str = TextUtils.x(k0.h(mExtParams, "dialogType", null)) ^ 0x01;
                   }
                }
                if (str) {
                label_018a :
                   KwaiTokenCustomPopUpDialog kwaiTokenCus = new KwaiTokenCustomPopUpDialog();
                   kwaiTokenCus.b = p0;
                   kwaiTokenCus.e = new g0();
                   d uod = new d(p2);
                   uod.Z0(i);
                   uod.L(kwaiTokenCus);
                   uod.v(true);
                   uod.Y(new h0());
                }
             }else {
                goto label_018a ;
             }
          }
       }else {
          b uob = b.b();
          if (p1 != null && p0 != null) {
             if (p0.mShowType == b1 && p0 instanceof JumpDirectDialogInfo) {
                p1.f(p0.mDialogKwaiUrl);
             }else if(p2 == null || p2.isFinishing()){
                BaseDialogInfo mShowType = p0.mShowType;
                i oi = 109;
                i oi1 = (mShowType >= 100 && mShowType <= oi)? 1: null;
                if (!oi1) {
                   Toast.makeText(p2.getApplicationContext(), R.string.arg_RES_7f104d4c, str).show();
                }else {
                   oi1 = new i();
                   oi1.c = p0;
                   oi1.g = p1;
                   oi1.i = uob;
                   oi1.h = p2;
                   oi1.f = new c(p0);
                   oi1.e = new b(p0);
                   p1 = new d(oi1.h);
                   p1.Z0(i);
                   p1.L(oi1);
                   p1.v(true);
                   i c = oi1.c;
                   if (c.mShowType == oi) {
                      if (c instanceof TachTemplateDialogInfo) {
                         String i1 = "";
                         if (!TextUtils.x(c.mTachTemplateId)) {
                            String[] stringArray = (c.mTachTemplateId).split("\\|");
                            i1 = stringArray[str];
                            oobject = stringArray[1];
                         }else {
                            oobject = i1;
                         }
                         if (!TextUtils.x(i1) && !TextUtils.x(oobject)) {
                            b uob1 = oi1.i.a(i1);
                            oi1.j = uob1;
                            if (uob1 != null) {
                               uob1.a(oi1.h, "", new f(oi1), oobject, new h(oi1, p1));
                            }
                         }
                      }
                   }else {
                      p1.Y(new g(oi1));
                   }
                   d.onTokenDialogShowEvent(p0);
                }
             }
          }
       }
    label_01ae :
       return;
    }
}
