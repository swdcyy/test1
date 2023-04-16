package com.yxcorp.gifshow.reminder.a;
import rx5.c;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import com.yxcorp.gifshow.reminder.ReminderTabHostFragment;
import nec.e;
import java.lang.Boolean;
import wkd.b;
import ncc.g;
import android.content.Intent;
import nec.d;
import android.content.Context;
import com.yxcorp.gifshow.reminder.ReminderActivity;
import android.app.Activity;
import android.view.View;
import java.lang.Runnable;
import com.yxcorp.gifshow.reminder.widget.a;
import b0d.a;
import uh5.e;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView;
import lnc.p8;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;
import ncc.k;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y8c.t;
import qvb.i;
import lkd.b;
import ok.h;
import com.yxcorp.gifshow.pymk.f;
import com.kwai.social.startup.follow.model.SayHiConfigParam;
import x6c.j;
import n7c.c;
import a7c.h$a;
import kcc.m;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import ok.x;
import a7c.d;
import kcc.q;
import kcc.o;
import f7c.a;
import kcc.p;
import kcc.n;
import com.yxcorp.gifshow.pymk.b;
import a7c.b$a;
import com.kwai.component.feedstaggercard.widget.a;
import a7c.h;
import tkd.b;
import tkd.d;
import hx5.a;
import hx5.b;
import nfc.a;
import androidx.fragment.app.Fragment;
import ekd.j0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.List;
import android.net.Uri;
import ekd.x0;
import android.net.Uri$Builder;
import java.util.Collection;
import ekd.q;
import zw5.b;
import xh7.b;
import xh7.a;
import qh7.b;
import qh7.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import hfc.b;
import java.lang.Number;
import com.kwai.social.startup.reminder.model.NotifyMixConfig;
import java.lang.reflect.Type;
import mw4.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class a implements c	// class@001a65
{

    public void a(){
       super();
    }
    public boolean GA(){
       return true;
    }
    public BaseFragment Hz(BaseFragment p0){
       ReminderTabHostFragment reminderTabH = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (reminderTabH != PatchProxyResult.class) {
       }else {
          reminderTabH = e.d(p0);
       }
       return reminderTabH;
    }
    public boolean Ih(){
       Object obj = PatchProxy.apply(null, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(-83154551).m();
    }
    public boolean J50(){
       Object obj = PatchProxy.apply(null, this, a.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(-83154551).b();
    }
    public boolean JA(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (d.e(p0) != null)? true: false;
       return b;
    }
    public boolean MP(){
       Object obj = PatchProxy.apply(null, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(-83154551).o();
    }
    public boolean Nf(Context p0){
       return p0 instanceof ReminderActivity;
    }
    public void ON(Activity p0,View p1,Runnable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "9")) {
          return;
       }
       a.b(p0, p1, p2);
       return;
    }
    public void Py(){
       if (PatchProxy.applyVoid(null, this, a.class, "24")) {
          return;
       }
       a.b(false);
       return;
    }
    public void Qa(BaseFragment p0,View[] p1){
       String str = "5";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, str)) {
          return;
       }
       e uoe = e.class;
       object obj = null;
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, obj, uoe, "4") && e.c(p0)) {
          int i = e.c();
          if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), p1, obj, uoe, str)) {
             int len = p1.length;
             int i1 = 0;
             while (i1 < len) {
                obj = p1[i1];
                if (obj instanceof RecyclerView) {
                   p8.a(obj, i);
                }else if(obj.getLayoutParams() instanceof ViewGroup$MarginLayoutParams){
                   ViewGroup$MarginLayoutParams layoutParams = obj.getLayoutParams();
                   layoutParams.bottomMargin = Math.max(i, layoutParams.bottomMargin);
                   obj.setLayoutParams(layoutParams);
                }else if(obj.getPaddingBottom() >= i){
                   obj.setPadding(obj.getPaddingLeft(), obj.getPaddingTop(), obj.getPaddingRight(), Math.max(obj.getPaddingBottom(), i));
                }
                i1 = i1 + 1;
             }
          }
       }
       return;
    }
    public boolean UB(){
       Object obj = PatchProxy.apply(null, this, a.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return new k().a("moment");
    }
    public t UK(RecyclerFragment p0,t p1,i p2,int p3,int p4,String p5,String p6,b p7,h p8,boolean p9){
       SayHiConfigParam obj1;
       int i2;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p5;
       object oobject4 = p6;
       object oobject5 = p7;
       object oobject6 = p8;
       boolean b = p9;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       int i = 2;
       int i1 = 1;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[10];
          objArray[0] = oobject;
          objArray[i1] = oobject1;
          objArray[i] = oobject2;
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = oobject3;
          objArray[6] = oobject4;
          objArray[7] = oobject5;
          objArray[8] = oobject6;
          objArray[9] = Boolean.valueOf(p9);
          obj1 = PatchProxy.apply(objArray, obj, uoa, "16");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       if (oobject2 instanceof f) {
       }else {
          oobject2 = new f(p3);
       }
       obj1 = j.a();
       boolean b1 = c.f();
       h$a uoa1 = new h$a(new m(oobject), oobject2, p0.m());
       if (PatchProxy.isSupport(h$a.class)) {
          Object obj2 = PatchProxy.applyOneRefs(Integer.valueOf(i), uoa1, h$a.class, "8");
          if (obj2 != patchProxyRe) {
             uoa1 = obj2;
          label_0098 :
             uoa1.c(true);
             if (b1 && c.d()) {
                i2 = 0x7f0d0216;
             }else if(b1 && c.e()){
                i2 = 0x7f0d0217;
             }else if(b){
                i2 = 0x7f0d1313;
             }else {
                i2 = 0x7f0d1311;
             }
             h$a uoa2 = uoa1.j(i2, new q(b1, oobject3, oobject4, b), new o(oobject5, oobject2));
             int i3 = (b)? 0x7f0d130a: 0x7f0d1309;
             uoa2 = uoa2.k(i3, new p(oobject2));
             uoa2.q = oobject6;
             uoa2.h = 0x7f0d130f;
             uoa2.i = null;
             uoa2.e = new n(obj, b1, oobject2);
             h$a uoa3 = uoa2.q((b.c() ^ 1));
             b$a uoa4 = new b$a();
             uoa4.e(obj1.btnType);
             uoa3.g(uoa4);
             uoa3.r(a.b);
             return d.a(0x5a2b5479).SM(oobject, oobject1, uoa3.b());
          }
       }
       uoa1.a.a = 2;
       goto label_0098 ;
    }
    public boolean Yp(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a();
    }
    public boolean bU(Fragment p0){
       return p0 instanceof ReminderTabHostFragment;
    }
    public boolean hT(BaseFragment p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(p0, null, e.class, "3");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          ReminderTabHostFragment reminderTabH = e.d(p0);
          b = (reminderTabH != null && reminderTabH.K0())? true: false;
       }
       return b;
    }
    public boolean isAvailable(){
       return true;
    }
    public boolean j10(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       int i = j0.b(p0, "NOTICE_TYPE", -1);
       if (i == 1 || i == 2) {
          b = true;
       }
       return b;
    }
    public boolean jG(){
       Object obj = PatchProxy.apply(null, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(-83154551).j();
    }
    public void lF(GifshowActivity p0,String p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "22")) {
          return;
       }
       Uri uri = (p1 != null)? x0.f(p1): null;
       if (uri == null) {
          uri = new Uri$Builder().scheme("kwai").authority("newsslide").build();
       }
       if (!q.f(p2)) {
          d.a(0x7948eb5d).l7(uri, p2);
       }else {
          b uob = b.j(p0, "");
          uob.i(uri);
          a.b(uob, null);
       }
       return;
    }
    public boolean nU(BaseFragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.c(p0);
    }
    public PresenterV2 o40(){
       Object obj = PatchProxy.applyWithListener(null, this, a.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(a.class, "18");
       return new b();
    }
    public void og(View[] p0){
       PatchProxy.applyVoidOneRefs(p0, this, a.class, "6");
    }
    public int rv(){
       return 0x7f0d1303;
    }
    public Uri ul(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.b(p0);
    }
    public boolean vB(){
       Object obj = PatchProxy.apply(null, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(-83154551).l();
    }
    public int xW(){
       int i;
       NotifyMixConfig obj = PatchProxy.apply(null, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = a.m(NotifyMixConfig.class);
       obj = (obj != null)? obj.mNewFansThreshold: 0;
       return obj;
    }
    public void yD(){
       if (PatchProxy.applyVoid(null, this, a.class, "15")) {
          return;
       }
       b.a(-83154551).p();
       return;
    }
    public boolean zL(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       String queryParamet = (p0 != null && (p0.getData() != null && p0.getData().isHierarchical()))? p0.getData().getQueryParameter("utm_source"): null;
       boolean b = (!TextUtils.n(queryParamet, "notify") && (TextUtils.n(queryParamet, "push_notify") || (queryParamet != null && queryParamet.startsWith("danmaku"))))? true: false;
       return b;
    }
}
