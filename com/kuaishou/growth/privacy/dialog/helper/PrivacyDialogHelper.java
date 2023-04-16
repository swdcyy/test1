package com.kuaishou.growth.privacy.dialog.helper.PrivacyDialogHelper;
import java.util.ArrayList;
import com.kuaishou.growth.privacy.dialog.helper.PrivacyDialogHelper$1;
import java.lang.Object;
import u07.t$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.popup.common.c$b;
import com.kuaishou.growth.privacy.dialog.helper.g;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.kuaishou.growth.privacy.dialog.helper.j;
import android.app.Activity;
import u07.u;
import kzc.d;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import com.kuaishou.growth.privacy.dialog.helper.PrivacyDialogHelper$c;
import wf0.x;
import com.kuaishou.growth.privacy.dialog.helper.k;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import hn5.n;
import hn5.m;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import lnc.a1;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import android.text.SpannableString;
import wf0.m;
import wf0.v;
import wf0.w;
import com.kwai.library.widget.popup.common.PopupInterface$g;
import wf0.c0;
import wf0.s;
import com.kuaishou.growth.privacy.dialog.helper.l;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.component.uiconfig.visitor.VisitorModeManager$a;
import vqa.t;
import vqa.k;
import java.lang.Integer;
import zsd.u;
import vsd.d;
import nsd.m0;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import java.lang.NullPointerException;
import java.lang.Long;
import java.lang.Float;
import java.lang.Number;
import com.yxcorp.gifshow.util.rx.RxBus;
import zh5.b;
import nsd.u;
import android.app.Application;
import o56.a;
import android.text.style.ClickableSpan;
import java.lang.Exception;
import java.lang.Throwable;
import android.util.Log;
import k2b.u1;
import kzc.e;
import cg6.b;
import com.yxcorp.gifshow.widget.popup.c;
import uf0.b;
import q87.c;
import wf0.m0;
import wf0.l;
import android.content.Intent;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import com.kuaishou.growth.privacy.dialog.model.KDSPrivacyPageConfig;
import android.text.TextUtils;
import java.net.URLEncoder;
import java.lang.StringBuilder;
import android.net.Uri;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import wf0.i0;
import ekd.e0;
import ync.a;
import android.view.View$OnClickListener;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import uf0.a;
import android.content.SharedPreferences$Editor;
import oe6.g;
import yb6.d;
import java.lang.System;
import u07.t;
import com.kwai.library.widget.popup.common.c;
import tkd.b;
import tkd.d;
import ap5.a;
import o56.d;
import oe6.a;
import com.kuaishou.growth.privacy.dialog.helper.e;
import wf0.n;
import com.kuaishou.growth.privacy.dialog.helper.f;
import com.kuaishou.growth.privacy.dialog.helper.PrivacyDialogHelper$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.framework.deviceid.h;
import java.util.HashMap;
import h30.a;
import com.kuaishou.dfp.c.d;
import i30.t;
import l30.e;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import fg6.a;
import com.google.gson.Gson;
import wf0.p;
import com.kuaishou.growth.privacy.dialog.helper.h;
import wf0.z;
import wf0.d0;
import wf0.t;
import wf0.u;
import com.kuaishou.growth.privacy.dialog.helper.PrivacyDialogHelper$b;
import qe6.b;
import wf0.j;
import com.yxcorp.utility.SystemUtil;
import ayb.i;
import km8.b;
import vf0.b;
import vf0.a;
import brd.t;
import cjd.e;
import erd.o;
import wf0.g;
import wf0.h;
import erd.g;
import crd.b;
import wf0.i;
import java.lang.Runnable;
import ekd.k1;
import java.util.List;
import android.content.ComponentName;
import wf0.y;
import ayb.k;
import java.util.Collection;
import java.util.Collections;
import wf0.q;
import wf0.b0;
import wf0.a0;
import com.kuaishou.growth.privacy.dialog.helper.n;

public class PrivacyDialogHelper	// class@0008aa
{
    public static boolean a;
    public static List b;
    public static List c;
    public static KDSPrivacyPageConfig d;
    public static boolean e;
    public static Set f;
    public static boolean g;

    static {
       PrivacyDialogHelper.b = new ArrayList();
       PrivacyDialogHelper.c = new ArrayList();
       PrivacyDialogHelper.e = false;
       PrivacyDialogHelper.f = new PrivacyDialogHelper$1();
       PrivacyDialogHelper.g = false;
    }
    public void PrivacyDialogHelper(){
       super();
    }
    public static t$a a(t$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrivacyDialogHelper.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.Q(R.id.widget_popup_bottom_anim_view);
       p0.G(g.a);
       p0.O(j.a);
       return p0;
    }
    public static d b(Activity p0,u p1,u p2){
       d obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, PrivacyDialogHelper.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PrivacyDialogHelper.a(new d(p0));
       obj.Z0(56);
       obj.b1(KwaiDialogOption.d);
       obj.W0(R.string.arg_RES_7f101319);
       obj.S0(PrivacyDialogHelper.i("newer_launch"));
       obj.Q0(PrivacyDialogHelper.h("newer_launch"));
       obj.u0(new PrivacyDialogHelper$c(p0, p1));
       obj.t0(new x(p2));
       obj.L(k.b);
       boolean b = (VisitorModeManager.f() && m.a().U3(p0))? true: false;
       obj.z(b);
       obj.w(new ColorDrawable(a1.a(R.color.arg_RES_7f062050)));
       obj.S();
       return obj;
    }
    public static d c(Activity p0,u p1,u p2,u p3){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, PrivacyDialogHelper.class, "36");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PrivacyDialogHelper.a(new d(p0));
       obj.Z0(56);
       obj.b1(KwaiDialogOption.d);
       obj.W0(R.string.arg_RES_7f103e25);
       SpannableString spannableStr = PatchProxy.apply(null, null, PrivacyDialogHelper.class, "28");
       if (spannableStr != patchProxyRe) {
       }else {
          spannableStr = PrivacyDialogHelper.f("exit_visitor_style");
       }
       obj.z0(spannableStr);
       obj.S0(PrivacyDialogHelper.i("exit_visitor_style"));
       obj.Q0(PrivacyDialogHelper.h("exit_visitor_style"));
       obj.u0(new m(p0, p1));
       obj.t0(new v(p2));
       obj.s0(new w(p3));
       obj.L(new PopupInterface$g(R.layout.arg_RES_7f0d030b));
       boolean b = (VisitorModeManager.f() && m.a().U3(p0))? true: false;
       obj.z(b);
       obj.w(new ColorDrawable(a1.a(R.color.arg_RES_7f062050)));
       obj.S();
       return obj;
    }
    public static d d(Activity p0,u p1,u p2){
       d obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, PrivacyDialogHelper.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PrivacyDialogHelper.a(new d(p0));
       obj.Z0(56);
       obj.b1(KwaiDialogOption.d);
       obj.W0(R.string.arg_RES_7f103e25);
       obj.S0(R.string.arg_RES_7f103e41);
       obj.Q0(R.string.arg_RES_7f10131a);
       obj.u0(new c0(p0, p1));
       obj.t0(new s(p2));
       obj.L(l.b);
       boolean b = (VisitorModeManager.f() && m.a().U3(p0))? true: false;
       obj.z(b);
       obj.w(new ColorDrawable(a1.a(R.color.arg_RES_7f062050)));
       obj.S();
       return obj;
    }
    public static void e(Activity p0){
       Integer integer;
       int i;
       Boolean uBoolean;
       Integer integer1;
       Integer integer2;
       VisitorModeManager$a obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, PrivacyDialogHelper.class, "19")) {
          return;
       }
       if (VisitorModeManager.f()) {
          if (!m.a().U3(p0)) {
             p0.finish();
          }
          return;
       }else {
          VisitorModeManager visitorModeM = VisitorModeManager.class;
          if (!PatchProxy.applyVoid(obj, obj, visitorModeM, "7")) {
             String c = VisitorModeManager.c;
             Iterator iterator = VisitorModeManager.a.iterator();
             while (iterator.hasNext()) {
                VisitorModeManager$a uoa = iterator.next();
                if (uoa != null) {
                   uoa.b(c, "VISITOR");
                }
             }
             boolean b = true;
             if (!PatchProxy.applyVoid(obj, obj, visitorModeM, "2") && !PatchProxy.applyVoid(obj, obj, t.class, "1")) {
                try{
                   k b1 = k.b;
                   String str = "KEY_VISITOR_SHOW_BOTTOM_BAR";
                   integer = Integer.valueOf(-1);
                   if (!u.S1(str)) {
                      d uod = m0.d(integer.getClass());
                      if (a.g(uod, m0.d(Boolean.TYPE))) {
                         integer1 = (!integer instanceof Boolean)? obj: integer;
                         boolean b2 = (integer1 != null)? integer1.booleanValue(): false;
                         integer2 = Boolean.valueOf(b1.a().getBoolean(str, b2));
                      }else if(a.g(uod, m0.d(String.class))){
                         integer1 = (!integer instanceof String)? obj: integer;
                         if (integer1 == null) {
                            String str1 = "";
                         }
                         integer2 = b1.a().getString(str, integer1);
                         str = (integer2 == null || !integer2.length())? 1: null;
                         if (!str) {
                            if (integer2 != null) {
                            }else {
                               throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                            }
                         }
                      }else if(a.g(uod, m0.d(Integer.TYPE))){
                         i = b1.a().getInt(str, integer.intValue());
                         if (i != Integer.MIN_VALUE) {
                            integer = Integer.valueOf(i);
                         }
                      }else if(a.g(uod, m0.d(Long.TYPE))){
                         integer1 = (!integer instanceof Long)? obj: integer;
                         long l = (integer1 != null)? integer1.longValue(): Long.MIN_VALUE;
                         l = b1.a().getLong(str, l);
                         if (l - Long.MIN_VALUE) {
                            integer2 = Long.valueOf(l);
                         }
                      }else if(a.g(uod, m0.d(Float.TYPE))){
                         integer1 = (!integer instanceof Float)? obj: integer;
                         float f = (integer1 != null)? integer1.floatValue(): Float.MIN_VALUE;
                         float floatx = b1.a().getFloat(str, f);
                         if (floatx - 1) {
                            integer2 = Float.valueOf(floatx);
                         }
                      }
                      integer = integer2;
                   }
                }catch(java.lang.Exception e0){
                }
             label_016d :
                i = integer.intValue();
                if (i != b) {
                   uBoolean = (i != 2)? obj: Boolean.FALSE;
                }else {
                   uBoolean = Boolean.TRUE;
                }
                VisitorModeManager.g = uBoolean;
             }
             VisitorModeManager.f = false;
             VisitorModeManager.d = 2;
             VisitorModeManager.e = b;
             VisitorModeManager.j("VISITOR", false, 2, obj);
             VisitorModeManager.h.b();
             RxBus.f.b(new b(2, false, 2, obj));
             Iterator iterator1 = VisitorModeManager.a.iterator();
             while (iterator1.hasNext()) {
                obj = iterator1.next();
                if (obj != null) {
                   obj.a(c, "VISITOR");
                }
             }
          }
          return;
       }
    }
    public static SpannableString f(String p0){
       Object[] objArray;
       String str2;
       SpannableString spannableStr;
       PrivacyDialogHelper privacyDialo = PrivacyDialogHelper.class;
       Object obj = null;
       String obj1 = PatchProxy.applyOneRefs(p0, obj, privacyDialo, "29");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = a1.p(R.string.arg_RES_7f103e56);
       String str = a1.p(R.string.arg_RES_7f1017f5);
       String str1 = a1.p(R.string.arg_RES_7f1017f4);
       int i = -1;
       int i1 = 0;
       switch (p0.hashCode()){
           case 0xbb4211e5:
             if (p0.equals("newer_launch")) {
                i = 0;
             }
             break;
           case 0x8ac693f:
             if (p0.equals("exit_visitor_style")) {
                i = 1;
             }
             break;
           case 0x5120c8eb:
             if (p0.equals("visitor_want_login")) {
                i = 2;
             }
             break;
           case 0x56e1b1de:
             if (p0.equals("second_launch")) {
                i = 3;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             objArray = new Object[]{obj1,str,str1};
             str2 = a.b().getString(R.string.arg_RES_7f104698, objArray);
             break;
           case 1:
           case 2:
             objArray = new Object[]{obj1,str};
             str2 = a.b().getString(R.string.arg_RES_7f103e2a, objArray);
             break;
           case 3:
             objArray = new Object[]{obj1,str};
             str2 = a.b().getString(R.string.arg_RES_7f103e45, objArray);
             break;
           default:
             str2 = "";
       }
       try{
          spannableStr = new SpannableString(str2);
          if (PatchProxy.isSupport(privacyDialo)) {
             objArray = new Object[]{p0,spannableStr,str2,obj1,str,str1};
             if (!PatchProxy.applyVoid(objArray, obj, privacyDialo, "30")) {
             label_00c0 :
                int i2 = str2.indexOf(obj1);
                int i3 = str2.indexOf(str);
                i1 = str2.indexOf(obj1, (str.length() + i3));
                int i4 = str2.indexOf(str, (str.length() + i3));
                i = str2.indexOf(str1);
                if (i2 >= 0) {
                   spannableStr.setSpan(PrivacyDialogHelper.j(a.b(), 1, p0), i2, (obj1.length() + i2), 33);
                }
                if (i1 >= 0) {
                   spannableStr.setSpan(PrivacyDialogHelper.j(a.b(), 1, p0), i1, (obj1.length() + i1), 33);
                }
                if (i3 >= 0) {
                   spannableStr.setSpan(PrivacyDialogHelper.j(a.b(), 2, p0), i3, (str.length() + i3), 33);
                }
                if (i4 >= 0) {
                   spannableStr.setSpan(PrivacyDialogHelper.j(a.b(), 2, p0), i4, (str.length() + i4), 33);
                }
                if (i >= 0) {
                   spannableStr.setSpan(PrivacyDialogHelper.j(a.b(), 3, p0), i, (str1.length() + i), 33);
                }
             }
          }else {
             goto label_00c0 ;
          }
       }catch(java.lang.Exception e15){
          e15.printStackTrace();
          u1.R("privacy_span_error", Log.getStackTraceString(e15), 9);
       }
       return spannableStr;
    }
    public static void g(){
       if (PatchProxy.applyVoid(null, null, PrivacyDialogHelper.class, "8")) {
          return;
       }
       b.b().v(8);
       Object[] objArray = new Object[0];
       b.C().w("PrivacyDialog Overlap", "enablePopup", objArray);
       return;
    }
    public static int h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrivacyDialogHelper.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = -1;
       int i = p0.hashCode();
       if (i != -1153297947) {
          if (i != 0x8ac693f) {
             if (i == 0x5120c8eb && p0.equals("visitor_want_login")) {
                obj = 2;
             }
          }else if(!p0.equals("exit_visitor_style")){
             obj = 1;
          }
       }else if(!p0.equals("newer_launch")){
          obj = 0;
       }
       int i1 = 0x7f103e42;
       if (obj) {
          if (obj == 1) {
             i1 = 0x7f103e3a;
          }
       }else {
          i1 = 0x7f103e44;
       }
       return i1;
    }
    public static int i(String p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, null, PrivacyDialogHelper.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (("newer_launch").equals(p0)) {
          i = (m0.a())? 0x7f10002f: 0x7f103e41;
       }else {
          i = 0x7f103e43;
       }
       return i;
    }
    public static ClickableSpan j(Context p0,int p1,String p2){
       l obj;
       i0 oi0;
       KDSPrivacyPageConfig d;
       String obj1;
       Intent intent;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PrivacyDialogHelper privacyDialo = PrivacyDialogHelper.class;
       if (PatchProxy.isSupport(privacyDialo)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, PrivacyDialogHelper.class, "20");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = new l(p2);
       if (PatchProxy.isSupport(privacyDialo)) {
          oi0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), obj, null, PrivacyDialogHelper.class, "24");
          if (oi0 != patchProxyRe) {
          label_00f7 :
             return oi0;
          }
       }
       if (PatchProxy.isSupport(privacyDialo)) {
          oi0 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, privacyDialo, "23");
          if (oi0 != patchProxyRe) {
          }else {
          label_0055 :
             oi0 = WebEntryUrls.I;
             String str = "";
             if (p1 == 1) {
                d = PrivacyDialogHelper.d;
                if (d != null) {
                   d = d.privacyBundle;
                label_0062 :
                   str = d;
                }
             }else if(p1 == 2){
                oi0 = WebEntryUrls.J;
                d = PrivacyDialogHelper.d;
                if (d != null) {
                   d = d.protocolSummaryBundle;
                   goto label_0062 ;
                }
             }else if(p1 == 3){
                oi0 = WebEntryUrls.K;
                d = PrivacyDialogHelper.d;
                if (d != null) {
                   d = d.protocolListBundle;
                   goto label_0062 ;
                }
             }
             if (PatchProxy.isSupport(privacyDialo)) {
                obj1 = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), str, oi0, null, PrivacyDialogHelper.class, "22");
                if (obj1 != patchProxyRe) {
                   intent = obj1;
                }
             }
             if (PrivacyDialogHelper.d != null && !TextUtils.isEmpty(str)) {
                try{
                   StringBuilder str1 = str+"&degradeWebUrl="+URLEncoder.encode(oi0, "UTF-8");
                   obj1 = str1;
                   str1.setLength(0);
                   if (!TextUtils.isEmpty(obj1)) {
                      Intent intent1 = new Intent();
                      intent1.setData(Uri.parse(obj1));
                      intent = intent1;
                   }
                }catch(java.lang.Exception e13){
                   e13.printStackTrace();
                }catch(java.lang.Exception e13){
                   e13.printStackTrace();
                }
             label_00dd :
                intent = KwaiYodaWebViewActivity.G3(p0, oi0).k("ks://protocol").a();
             }else {
                goto label_00dd ;
             }
          }
       }else {
          goto label_0055 ;
       }
       oi0 = new i0(oi0, a.d(e0.b), obj);
       goto label_00f7 ;
    }
    public static void k(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PrivacyDialogHelper.class, "25")) {
          return;
       }
       h$b uob = h$b.e(7, "PERMISSION_POPUP_RESULT");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       if (("START").equals(p0)) {
          SharedPreferences a = a.a;
          String str = (a.getBoolean("is_first_show_privacy_dialog", true))? "TRUE": "FALSE";
          oi3.d("is_first_start", str);
          SharedPreferences$Editor uEditor = a.edit();
          uEditor.putBoolean("is_first_show_privacy_dialog", false);
          g.a(uEditor);
       }
       oi3.d("status", p0);
       oi3.c("server_time", Long.valueOf(d.a()));
       oi3.c("client_time", Long.valueOf(System.currentTimeMillis()));
       oi3.d("app_session_id", VisitorModeManager.h.d());
       uElementPack.params = oi3.e();
       uElementPack.action2 = "PERMISSION_POPUP_RESULT";
       uob.k(uElementPack);
       u1.r0(uob);
       return;
    }
    public static void l(Activity p0,boolean p1,t p2){
       if (PatchProxy.isSupport(PrivacyDialogHelper.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, null, PrivacyDialogHelper.class, "16")) {
          return;
       }
       if (p1 && m.a().U3(p0)) {
          p2.q(3);
       }else {
          PrivacyDialogHelper.e(p0);
       }
       return;
    }
    public static void m(Activity p0,boolean p1){
       PrivacyDialogHelper privacyDialo = PrivacyDialogHelper.class;
       if (PatchProxy.isSupport(privacyDialo) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, privacyDialo, "15")) {
          return;
       }
       d.a(-2061018968).bR(0, 0);
       if (!p1) {
          PrivacyDialogHelper.o(p0);
       }
       return;
    }
    public static void n(){
       if (PatchProxy.applyVoid(null, null, PrivacyDialogHelper.class, "2")) {
          return;
       }
       if (!d.d && a.o()) {
          a.a0(false);
       }
       if (a.o()) {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean("is_privacy_dialog_new_user", false);
          g.a(uEditor);
       }
       return;
    }
    public static void o(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PrivacyDialogHelper.class, "17")) {
          return;
       }
       try{
          new e().a(p0);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return;
    }
    public static void p(Activity p0){
       String obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, PrivacyDialogHelper.class, "11")) {
          return;
       }
       boolean b = VisitorModeManager.f();
       PrivacyDialogHelper.b(p0, new n(p0, b), new f(p0, b)).Z(new PrivacyDialogHelper$a());
       if (h.b(p0)) {
          HashMap hashMap = new HashMap();
          obj = PatchProxy.applyOneRefs(p0, obj, a.class, "29");
          if (obj != PatchProxyResult.class) {
          }else if(d.D(p0)){
             obj = "KWE_CLONE";
          }else {
             e uoe = t.c().j();
             obj = (uoe != null && uoe.l != null)? "KWE_FIRST": "KWE_OTHER";
          }
          hashMap.put("kdfp_inner_check_info", obj);
          hashMap.put("event_timestamp", Long.valueOf(System.currentTimeMillis()));
          b.a(0x4b316083).logCustomEvent("yunfama_inner_info", a.a.q(hashMap));
       }
       return;
    }
    public static boolean q(Activity p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PrivacyDialogHelper privacyDialo = PrivacyDialogHelper.class;
       Object obj = null;
       h obj1 = PatchProxy.applyOneRefs(p0, obj, privacyDialo, "13");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       if (p0 != null && (p0.isFinishing() || PrivacyDialogHelper.g)) {
          return false;
       }
       p op = new p(p0, VisitorModeManager.f());
       obj1 = h.b;
       z oz = new z(p0);
       d uod = PatchProxy.applyFourRefs(p0, op, obj1, oz, null, PrivacyDialogHelper.class, "35");
       if (uod != patchProxyRe) {
       }else {
          uod = PrivacyDialogHelper.a(new d(p0));
          uod.Z0(56);
          uod.b1(KwaiDialogOption.d);
          uod.W0(R.string.arg_RES_7f103e25);
          SpannableString spannableStr = PatchProxy.apply(obj, obj, privacyDialo, "27");
          if (spannableStr != patchProxyRe) {
          }else {
             spannableStr = PrivacyDialogHelper.f("visitor_want_login");
          }
          uod.z0(spannableStr);
          uod.S0(PrivacyDialogHelper.i("visitor_want_login"));
          uod.Q0(PrivacyDialogHelper.h("visitor_want_login"));
          uod.u0(new d0(p0, op));
          uod.t0(new t(obj1));
          uod.s0(new u(oz));
          uod.L(new PopupInterface$g(R.layout.arg_RES_7f0d030b));
          uod.z(true);
          uod.w(new ColorDrawable(a1.a(R.color.arg_RES_7f062050)));
       }
       uod.Y(new PrivacyDialogHelper$b());
       return true;
    }
    public static void r(){
       if (PatchProxy.applyVoid(null, null, PrivacyDialogHelper.class, "9")) {
          return;
       }
       if (!b.a()) {
          b.b().u(8);
          Object[] objArray = new Object[0];
          b.C().w("PrivacyDialog Overlap", "tryDisablePopup", objArray);
       }
       return;
    }
    public static void s(Activity p0){
       boolean b1;
       String queryParamet;
       Iterator iterator;
       j oj = j.class;
       m0 om0 = m0.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PrivacyDialogHelper privacyDialo = PrivacyDialogHelper.class;
       if (PatchProxy.applyVoidOneRefs(p0, null, privacyDialo, "3")) {
          return;
       }
       String str = "1";
       Object[] obj = PatchProxy.apply(null, null, om0, str);
       boolean b = true;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else {
          SharedPreferences obj2 = PatchProxy.apply(null, null, oj, str);
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else {
             obj2 = PatchProxy.apply(null, null, oj, "4");
             if (obj2 != patchProxyRe) {
                b1 = obj2.booleanValue();
             }else if(SystemUtil.K() && d.a(0x4f878389).qB("KEY_PRIVACY_BTN_TEXT_IGNORE_FIRST_LAUNCH", Boolean.FALSE).booleanValue()){
                obj = new Object[0];
                b.C().w("PrivacyBtnExp", "open ignore first request switch", obj);
             }else {
                obj2 = b.b("DefaultPreferenceHelper");
                if (obj2.getBoolean("KEY_FIRST_REQUEST", b)) {
                   Object[] objArray1 = new Object[0];
                   b.C().w("PrivacyBtnExp", "first request.", objArray1);
                   g.a(obj2.edit().putBoolean("KEY_FIRST_REQUEST", 0));
                }else {
                   b1 = false;
                }
             }
             b1 = true;
          }
       }
       if (b1) {
          if (!PatchProxy.isSupport(om0) || (!PatchProxy.applyVoidTwoRefs(p0, Boolean.FALSE, null, om0, "2") && (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.FALSE, null, oj, "2")))) {
             Object[] objArray = new Object[0];
             b.C().w("PrivacyBtnExp", "start try show new user privacy", objArray);
             i oi = new i(a.a().a().map(new e()).subscribe(new g(p0, 0), new h(p0, 0)), p0, 0);
             j.a = oi;
             k1.r(oi, 1000);
          }
       }else {
          Object[] obj1 = PatchProxy.applyOneRefs(p0, null, privacyDialo, "4");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(p0 != null && (p0.getIntent() != null && p0.getIntent().getData() != null)){
             Uri data = p0.getIntent().getData();
             if (data != null) {
                String host = data.getHost();
                if (!TextUtils.isEmpty(host)) {
                   if (("krn").equals(host)) {
                      queryParamet = data.getQueryParameter("componentName");
                      if (!TextUtils.isEmpty(queryParamet)) {
                         iterator = PrivacyDialogHelper.b.iterator();
                         do {
                            if (iterator.hasNext()) {
                            }else if(p0 != null && p0.getComponentName() != null){
                               queryParamet = p0.getComponentName().getClassName();
                               if (!TextUtils.isEmpty(queryParamet) && queryParamet.endsWith("KwaiYodaWebViewActivity")) {
                                  queryParamet = p0.getIntent().getStringExtra("KEY_URL");
                                  if (!TextUtils.isEmpty(queryParamet)) {
                                     if (!queryParamet.endsWith(".pdf") && !queryParamet.endsWith(".txt")) {
                                        iterator = PrivacyDialogHelper.c.iterator();
                                        do {
                                           if (iterator.hasNext()) {
                                           }
                                        } while (queryParamet.contains(iterator.next()));
                                     }
                                  }
                                  if (TextUtils.isEmpty(queryParamet) || !queryParamet.contains("public/index.html#/protocol")) {
                                  label_01ef :
                                     b = false;
                                     break ;
                                  }
                               }else {
                                  goto label_01ef ;
                               }
                            }else {
                               goto label_01ef ;
                            }
                         } while ((iterator.next()).equals(queryParamet));
                      }
                   }else if(("yodaweb").equals(host)){
                      queryParamet = data.getQueryParameter("url");
                      if (TextUtils.isEmpty(queryParamet)) {
                         goto label_01ef ;
                      }else {
                         iterator = PrivacyDialogHelper.c.iterator();
                         do {
                            if (iterator.hasNext()) {
                            }else {
                               goto label_0188 ;
                            }
                         } while (queryParamet.contains(iterator.next()));
                      }
                   }else {
                      goto label_0188 ;
                   }
                }
             }
          }else {
             goto label_0188 ;
          }
          if (b) {
             obj1 = new Object[0];
             b.C().w("PrivacyDialogHelper", "open protocol page by rn", obj1);
          }else {
             k1.r(new y(p0), 50);
          }
       }
       return;
    }
    public static void t(Activity p0,boolean p1){
       Object obj2;
       int i;
       boolean b1;
       Object obj = p0;
       PrivacyDialogHelper privacyDialo = PrivacyDialogHelper.class;
       Object obj1 = null;
       if (PatchProxy.isSupport(privacyDialo) && PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(p1), obj1, privacyDialo, "7")) {
          return;
       }
       if (obj == null) {
          PrivacyDialogHelper.g();
          return;
       }else if(PatchProxy.applyVoid(obj1, obj1, privacyDialo, "5")){
          int b = 0x280e7c21;
          try{
             KDSPrivacyPageConfig kDSPrivacyPa = a.a.h(d.a(b).an(), KDSPrivacyPageConfig.class);
             if (kDSPrivacyPa == null || kDSPrivacyPa.active != null) {
                KDSPrivacyPageConfig kDSPrivacyPa1 = new KDSPrivacyPageConfig();
                PrivacyDialogHelper.d = kDSPrivacyPa1;
                kDSPrivacyPa1.privacyBundle = "kwai://krn?bundleId=ConsumePersonProtocols&componentName=PrivacyProtocol&minBundleVersion=18";
                kDSPrivacyPa1.protocolSummaryBundle = "kwai://krn?bundleId=ConsumePersonProtocols&componentName=ProtocolPrivacyAbstractPage&minBundleVersion=18";
                kDSPrivacyPa1.protocolListBundle = "kwai://krn?bundleId=ConsumePersonProtocols&componentName=ProtocolPermissionListPage&minBundleVersion=18";
                List b2 = PrivacyDialogHelper.b;
                if (b2 == null) {
                   PrivacyDialogHelper.b = new ArrayList();
                }else {
                   b2.clear();
                }
                PrivacyDialogHelper.b.add("PrivacyProtocol");
                PrivacyDialogHelper.b.add("PersonServiceProtocol");
                PrivacyDialogHelper.b.add("PersonaliseRecoProtocol");
                PrivacyDialogHelper.b.add("ProgrammaticAdProtocol");
                PrivacyDialogHelper.b.add("SDKProtocol");
                PrivacyDialogHelper.b.add("ProtocolPrivacyAbstractPage");
                PrivacyDialogHelper.b.add("ProtocolPermissionListPage");
                b2 = PrivacyDialogHelper.c;
                if (b2 == null) {
                   PrivacyDialogHelper.c = new ArrayList();
                }else {
                   b2.clear();
                }
                String[] stringArray = new String[]{"weibo.com/signup/","weixin.qq.com/cgi-bin/","wiki.connect.qq.com/","wap.cmpassport.com/resources/","e.189.cn/sdk/agreement/","opencloud.wostore.cn/authz/","docs.open.alipay.com/","open.unionpay.com/tjweb/acproduct/","miniprogram-kyc.tencentcloudapi.com/s/h5/protocol","terms.aliyun.com/legal-agreement","eid.cn/pro/privacy","dev.mi.com/console/doc/","vivo.com.cn/about-vivo/privacy","open.oppomobile.com/wiki/doc","developer.huawei.com/consumer/cn/doc/","meizu.com/legal","data.qq.com/product/mta","privacy.qq.com/document/","lbs.qq.com/userAgreements/","lbsyun.baidu.com/index","lbs.amap.com/pages/privacy","www.lebo.com.cn/privacy","msa-alliance.cn/col","privacy.kuaishou.com","kwaixiaodian.com","www.gamekuaishou.com","ad.e.kuaishou.com","u.kuaishou.com/home","suzao.e.kuaishou.com","niu.e.kuaishou.com","cc.e.kuaishou.com/privacy","k.kuaishou.com","ky.kuaishou.com","www.yuncheapp.cn/html/pearl","h5.getkwai.com","nielseniq.com","www.reyun.com","www.10086.cn","www.189.cn","www.10010.com","www.apple.com","www.sf-express.com"};
                if (!PatchProxy.applyVoidOneRefs(stringArray, obj1, privacyDialo, "6")) {
                   List c = PrivacyDialogHelper.c;
                   if (c != null) {
                      Collections.addAll(c, stringArray);
                   }
                }
                if (kDSPrivacyPa != null) {
                   if (!TextUtils.isEmpty(kDSPrivacyPa.privacyBundle)) {
                      PrivacyDialogHelper.d.privacyBundle = kDSPrivacyPa.privacyBundle;
                   }
                   if (!TextUtils.isEmpty(kDSPrivacyPa.protocolSummaryBundle)) {
                      PrivacyDialogHelper.d.protocolSummaryBundle = kDSPrivacyPa.protocolSummaryBundle;
                   }
                   if (!TextUtils.isEmpty(kDSPrivacyPa.protocolListBundle)) {
                      PrivacyDialogHelper.d.protocolListBundle = kDSPrivacyPa.protocolListBundle;
                   }
                   kDSPrivacyPa1 = kDSPrivacyPa.rnIgnoreList;
                   if (kDSPrivacyPa1 != null && !kDSPrivacyPa1.isEmpty()) {
                      PrivacyDialogHelper.b.addAll(kDSPrivacyPa.rnIgnoreList);
                   }
                   kDSPrivacyPa1 = kDSPrivacyPa.yodaIgnoreList;
                   if (kDSPrivacyPa1 != null && !kDSPrivacyPa1.isEmpty()) {
                      PrivacyDialogHelper.c.addAll(kDSPrivacyPa.yodaIgnoreList);
                   }
                }
             }
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
             PrivacyDialogHelper.d = obj1;
          }
       }
    }
}
