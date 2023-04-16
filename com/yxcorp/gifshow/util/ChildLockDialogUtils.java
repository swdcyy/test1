package com.yxcorp.gifshow.util.ChildLockDialogUtils;
import uj9.a;
import com.yxcorp.gifshow.util.ChildLockDialogUtils$a;
import android.app.Activity;
import tkd.b;
import tkd.d;
import fp5.a;
import yxb.b;
import hn5.n;
import hn5.m;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import brd.t;
import lnc.o0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kwai.library.widget.popup.common.c;
import com.kwai.component.uiconfig.childlock.model.TeenageModeConfig;
import java.util.List;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import java.lang.Object;
import com.kwai.component.uiconfig.childlock.model.DialogNewContentItem;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.component.uiconfig.childlock.model.DialogTopInfo;
import k2b.l0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.activitycontext.ActivityContext;
import vj9.b;
import vj9.a;
import uj9.o;
import wh5.a;
import uj9.l;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.r;
import com.yxcorp.gifshow.childlock.ChildVerifyActivity;
import wh5.c;
import com.yxcorp.gifshow.childlock.ChildLockGuideActivity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import th5.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import android.view.WindowManager$BadTokenException;
import zf6.k;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import kzc.d;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import w07.a;
import w07.l;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.Html;
import android.text.style.URLSpan;
import com.yxcorp.gifshow.util.ChildLockDialogUtils$URLSpanUnderline;
import lnc.l0;
import u07.u;
import com.kuaishou.growth.privacy.dialog.helper.g;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.kwai.library.widget.popup.common.c$b;
import com.kuaishou.growth.privacy.dialog.helper.j;
import com.kwai.library.widget.popup.common.PopupInterface$g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.config.PopupOrientation;
import com.yxcorp.gifshow.util.ChildLockDialogUtils$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.framework.activitycontext.ActivityContext$b;
import lnc.n0;
import com.yxcorp.gifshow.util.ChildLockDialogUtils$d;
import lnc.m0;
import com.yxcorp.gifshow.util.ChildLockDialogUtils$c;
import nl9.h0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import xf6.d;
import uj9.n;
import q87.c;
import wkd.b;
import com.yxcorp.gifshow.childlock.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import uj9.m;
import zca.b;
import java.lang.StringBuilder;
import lnc.b9;

public final class ChildLockDialogUtils	// class@001ed9
{
    public static boolean a;
    public static final m b;
    public static TeenageModeConfig c;
    public static boolean d;
    public static b e;
    public static boolean f;
    public static final ActivityContext$b g;

    static {
       ChildLockDialogUtils.b = new a();
       ChildLockDialogUtils.g = new ChildLockDialogUtils$a();
    }
    public static void a(Activity p0){
       FragmentActivity uFragmentAct;
       boolean b = false;
       if (d.a(0x31a55ac8).s0(p0)) {
          ChildLockDialogUtils.f = b;
          return;
       }else if(!d.a(-430326918).cR(p0)){
          if (m.a().U3(p0)) {
             uFragmentAct = p0;
             if (!q.p0(uFragmentAct).s0() && !q.p0(uFragmentAct).t0()) {
             label_0089 :
                ChildLockDialogUtils.f = true;
                ChildLockDialogUtils.q();
             }
          }
          if (m.a().U3(p0)) {
             uFragmentAct = p0;
             if (q.p0(uFragmentAct).s0() || q.p0(uFragmentAct).t0()) {
                ChildLockDialogUtils.f = b;
                if (ChildLockDialogUtils.e == null) {
                   ChildLockDialogUtils.e = q.p0(uFragmentAct).r0().subscribe(new o0(p0), Functions.d());
                }
             }
          }
          ChildLockDialogUtils.f = b;
          ChildLockDialogUtils.q();
       }else {
          goto label_0089 ;
       }
       return;
    }
    public static ClientEvent$UrlPackage b(){
       ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
       urlPackage.page = 89;
       urlPackage.category = 1;
       return urlPackage;
    }
    public static void c(c p0,TeenageModeConfig p1){
       TeenageModeConfig dialogNewCon = p1.dialogNewContent;
       if (dialogNewCon != null && dialogNewCon.size() >= 4) {
          ChildLockDialogUtils.l(p0.z().findViewById(R.id.icon1), p0.z().findViewById(R.id.txt1), p1.dialogNewContent.get(0));
          ChildLockDialogUtils.l(p0.z().findViewById(R.id.icon2), p0.z().findViewById(R.id.txt2), p1.dialogNewContent.get(1));
          ChildLockDialogUtils.l(p0.z().findViewById(R.id.icon3), p0.z().findViewById(R.id.txt3), p1.dialogNewContent.get(2));
          ChildLockDialogUtils.l(p0.z().findViewById(R.id.icon4), p0.z().findViewById(R.id.txt4), p1.dialogNewContent.get(3));
       }
       return;
    }
    public static void d(String p0){
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CLOSE_CHILD_LOCK_DIALOG";
       i3 oi3 = i3.f();
       oi3.d("click_type", p0);
       uElementPack.params = oi3.e();
       u1.A(ChildLockDialogUtils.b(), "", 1, uElementPack, null);
    }
    public static void e(boolean p0,boolean p1){
       ChildLockDialogUtils.f(p0, p1, false);
    }
    public static void f(boolean p0,boolean p1,boolean p2){
       DialogTopInfo mKsOrderId;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       int i = 1;
       if (p0) {
          uElementPack.action2 = "SHOW_CHILD_LOCK_DIALOG";
          if (p2) {
             i3 oi3 = i3.f();
             oi3.c("is_related_link", Integer.valueOf(i));
             uElementPack.params = oi3.e();
          }
       }else if(p1){
          uElementPack.action = 0x77f1;
       }else {
          uElementPack.action = 0x77f9;
       }
       i = 0;
       if (i) {
          TeenageModeConfig dialogTopInf = ChildLockDialogUtils.c.dialogTopInfo;
          if (dialogTopInf != null) {
             mKsOrderId = dialogTopInf.mKsOrderId;
          label_003a :
             u1.y0(ChildLockDialogUtils.b(), 3, uElementPack, l0.b(mKsOrderId));
             return;
          }
       }
       mKsOrderId = null;
       goto label_003a ;
    }
    public static void g(int p0,boolean p1){
       ChildLockDialogUtils.h(p0, p1, null, null);
    }
    public static void h(int p0,boolean p1,String p2,String p3){
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = p0;
       if (!TextUtils.x(p2)) {
          i3 oi3 = i3.f();
          oi3.d("click_type", p2);
          uElementPack.params = oi3.e();
       }
       u1.A(ChildLockDialogUtils.b(), "", 1, uElementPack, l0.b(p3));
       return;
    }
    public static boolean i(){
       return ChildLockDialogUtils.a;
    }
    public static void j(TeenageModeConfig p0,int p1){
       int i;
       Activity uActivity = ActivityContext.g().e();
       if (p0.mMode != null) {
          a.a().e(o.b(p0.mCanVerifyIdCard), o.b(p0.mCanVerifyIdCard)).subscribe(Functions.d(), Functions.d());
          a.k(true);
          l.e(0);
          RxBus.f.b(new r(true));
          if (p1 == 1) {
             if (p0.mCanVerifyIdCard != null) {
                ChildVerifyActivity.A3(uActivity, "child_recognition_dialog");
                ChildLockDialogUtils.g(0x77f3, true);
             }else {
                c.a(uActivity, p0.mOfficialPhone);
                ChildLockDialogUtils.g(0x7818, false);
             }
          }else if(p0.mCanVerifyIdCard != null){
             i = 0x77f2;
          }else {
             i = 0x7817;
          }
          ChildLockDialogUtils.g(i, false);
       }else if(!p1){
          ChildLockGuideActivity.A3(uActivity);
          ChildLockDialogUtils.g(0x7797, true);
       }else {
          ChildLockDialogUtils.g(0x7798, false);
       }
       return;
    }
    public static void k(TeenageModeConfig p0,Activity p1){
       if (c.b()) {
          return;
       }
       if (!PatchProxy.applyVoid(null, null, a.class, "11")) {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putLong("show_teenage_mode_dialog_time", System.currentTimeMillis());
          g.a(uEditor);
       }
       try{
          TeenageModeConfig dialogNewCon = p0.dialogNewContent;
          if (dialogNewCon != null && dialogNewCon.size() >= 4) {
             dialogNewCon = p0.dialogTopInfo;
             if (dialogNewCon != null && dialogNewCon.mType == 1) {
                ChildLockDialogUtils.n(p0, p1);
             }else {
                ChildLockDialogUtils.o(p0, p1);
             }
          }else {
             ChildLockDialogUtils.m(p0, p1);
          }
       }catch(android.view.WindowManager$BadTokenException e4){
          e4.printStackTrace();
       }
       return;
    }
    public static void l(KwaiImageView p0,TextView p1,DialogNewContentItem p2){
       DialogNewContentItem darkIconUrl = (k.d())? p2.darkIconUrl: p2.lightIconUrl;
       p0.L(darkIconUrl);
       p1.setText(p2.titleText);
       return;
    }
    public static void m(TeenageModeConfig p0,Activity p1){
       ChildLockDialogUtils.d = true;
       d uod = new d(p1);
       uod.Z0(88);
       uod.b1(KwaiDialogOption.d);
       uod.B0(R.drawable.arg_RES_7f0809c7);
       uod.X0(p0.mDialogTitle);
       uod.a0(new a());
       TeenageModeConfig mDialogConte = p0.mDialogContent;
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       if (TextUtils.x(mDialogConte)) {
       }else {
          spannableStr.append(Html.fromHtml(mDialogConte));
          URLSpan[] spans = spannableStr.getSpans(0, spannableStr.length(), URLSpan.class);
          int len = spans.length;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = spans[i];
             int spanStart = spannableStr.getSpanStart(oobject);
             int spanEnd = spannableStr.getSpanEnd(oobject);
             spannableStr.removeSpan(oobject);
             spannableStr.setSpan(new ChildLockDialogUtils$URLSpanUnderline(oobject.getURL()), spanStart, spanEnd, 0);
          }
       }
       uod.z0(spannableStr);
       uod.T0(p0.mDialogCancelText);
       uod.u0(new l0(p0));
       uod.G(g.a);
       uod.O(j.a);
       uod.L(new PopupInterface$g(R.layout.arg_RES_7f0d1181));
       uod.U(PopupOrientation.ORIENTATION_PORTRAIT);
       uod.Y(new ChildLockDialogUtils$b(p0));
       ActivityContext.k(ChildLockDialogUtils.g);
       ChildLockDialogUtils.q();
       return;
    }
    public static void n(TeenageModeConfig p0,Activity p1){
       ChildLockDialogUtils.d = true;
       d uod = new d(p1);
       uod.Z0(88);
       uod.b1(KwaiDialogOption.d);
       uod.X0(p0.mDialogTitle);
       uod.T0(p0.mDialogCancelText);
       uod.u0(new n0(p0));
       uod.G(g.a);
       uod.O(j.a);
       uod.L(new PopupInterface$g(R.layout.arg_RES_7f0d1182));
       uod.U(PopupOrientation.ORIENTATION_PORTRAIT);
       uod.Y(new ChildLockDialogUtils$d(p0));
       ActivityContext.k(ChildLockDialogUtils.g);
       ChildLockDialogUtils.q();
    }
    public static void o(TeenageModeConfig p0,Activity p1){
       ChildLockDialogUtils.d = true;
       d uod = new d(p1);
       uod.Z0(88);
       uod.b1(KwaiDialogOption.d);
       uod.X0(p0.mDialogTitle);
       uod.T0(p0.mDialogCancelText);
       uod.u0(new m0(p0));
       uod.G(g.a);
       uod.O(j.a);
       uod.L(new PopupInterface$g(R.layout.arg_RES_7f0d1183));
       uod.U(PopupOrientation.ORIENTATION_PORTRAIT);
       uod.Y(new ChildLockDialogUtils$c(p0));
       ActivityContext.k(ChildLockDialogUtils.g);
       ChildLockDialogUtils.q();
    }
    public static boolean p(TeenageModeConfig p0){
       b uob;
       boolean b;
       Activity uActivity = ActivityContext.g().e();
       if (d.a(-536296199).je(uActivity)) {
          uActivity = m.a().gB();
       }
       if (d.r("KEY_FORCE_SHOW_CHILD_LOCK_DIALOG")) {
          Object[] objArray = new Object[0];
          n.C().w("TeenageMode", "canShowGuideDialog FeedTestConfig", objArray);
          uob = 1;
       }else if(p0.mShowDialog == null || (!c.b() && !a.e())){
          a uoa = b.a(-1942497302);
          Objects.requireNonNull(uoa);
          Object obj = PatchProxy.apply(null, uoa, a.class, "13");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(uoa.c != null && (a.t().d("teenageModeDialogDelayShow", 0) && l.b() < 2)){
             b = true;
          }else {
             b = false;
          }
          if (!b && SlideGuideManager.a().k == null) {
             b = ChildLockDialogUtils.b.b(uActivity);
          }
       }
    label_0096 :
       uob = false;
       if (!uob) {
          RxBus.f.b(new b(0, p0.mEnablePhotoContinue));
          return 0;
       }else {
          ChildLockDialogUtils.a(uActivity);
          if (!ChildLockDialogUtils.f) {
             ActivityContext$b g = ChildLockDialogUtils.g;
             ActivityContext.k(g);
             ActivityContext.i(g);
             Object[] objArray1 = new Object[0];
             n.C().w("TeenageMode", "registerLifecycleListener, currentActivity="+uActivity, objArray1);
             return true;
          }else {
             ChildLockDialogUtils.k(p0, uActivity);
             return 0;
          }
       }
    }
    public static void q(){
       b9.a(ChildLockDialogUtils.e);
       ChildLockDialogUtils.e = null;
    }
}
