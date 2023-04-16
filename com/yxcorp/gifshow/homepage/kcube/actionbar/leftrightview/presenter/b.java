package com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.presenter.b;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.social.message.model.UnreadState;
import io.reactivex.subjects.PublishSubject;
import java.util.BitSet;
import java.util.concurrent.CopyOnWriteArrayList;
import nc5.t;
import java.lang.Object;
import ok.x;
import java.lang.Boolean;
import xsa.i;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.presenter.b$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import brd.t;
import xsa.e;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import fda.e;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import xsa.h;
import c66.h$b;
import xsa.f;
import zca.t;
import xsa.g;
import eoc.f;
import ai5.c;
import xsa.d;
import xsa.c;
import wkd.b;
import j9c.d;
import j9c.a;
import xsa.b;
import com.kwai.component.menudot.b;
import nc5.c;
import com.kwai.component.menudot.b$a;
import lnc.u1;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.presenter.b$b;
import java.lang.Runnable;
import ekd.k1;
import rua.a;
import java.lang.Integer;
import android.view.View;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.m;
import k9c.e;
import com.yxcorp.gifshow.reddot.model.RedDotLogModelExtParams;
import com.yxcorp.gifshow.util.ReddotRecordHelper;
import uv8.n0;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.HomeActivity;
import kn5.c;
import androidx.fragment.app.Fragment;
import wh5.c;
import tra.b;
import q87.c;
import java.util.Objects;
import sta.o;
import tkd.b;
import tkd.d;
import ayb.k;
import com.yxcorp.gifshow.plugin.impl.growth.reddot.RedDotProtectionType;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager;
import qrd.p;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.reddot.model.RedDot;
import com.kwai.framework.model.user.QCurrentUser;
import tta.e;
import j9c.b;
import qta.n0;
import qta.m0;
import t45.c;
import hn5.i0;
import java.lang.StringBuilder;
import oe6.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import xsa.m;
import java.util.Map;
import java.util.HashMap;
import b66.k$a;
import java.lang.Number;
import tra.a;
import android.content.SharedPreferences;
import o56.a;
import java.lang.Math;
import dub.z;

public class b extends PresenterV2 implements g	// class@001707
{
    public final b$a A;
    public c p;
    public UnreadState q;
    public c r;
    public BitSet s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final List w;
    public final boolean x;
    public a y;
    public final Runnable z;

    public void b(){
       super();
       this.q = new UnreadState(0);
       this.r = PublishSubject.g();
       this.s = new BitSet();
       this.v = false;
       this.w = new CopyOnWriteArrayList();
       this.x = t.b.get().booleanValue();
       this.z = new i(this);
       this.A = new b$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.X7(q.p0(this.getActivity()).r0().subscribe(new e(this), Functions.d()));
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(e.class, mAIN).subscribe(new h(this)));
       this.X7(f.g(h$b.class, mAIN).subscribe(new f(this)));
       this.X7(f.a(t.class, new g(this)));
       this.X7(f.g(c.class, mAIN).subscribe(new d(this)));
       this.y = new c(this);
       if (this.x != null) {
          b.a(0x2c71dec4).h(this.y);
       }
       this.p = new b(this);
       b.a(0x34c80eb4).t(this.p);
       b.a(0x34c80eb4).q(this.A);
       this.S8();
       u1.a(this);
       if (t.a.get().booleanValue()) {
          this.X7(this.r.subscribe(new b$b(this)));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       b.a(0x34c80eb4).v(this.p);
       u1.b(this);
       b.a(0x34c80eb4).f(this.A);
       b.a(0x2c71dec4).a(this.y);
       k1.m(this.z);
       return;
    }
    public final void P8(a p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "16")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       p0.setNumber(p1);
       if (p0 instanceof View) {
          int i = 0;
          if (p1 > 0) {
             GifshowActivity activity = this.getActivity();
             object oobject = p0;
             int number = p0.getNumber();
             m om = m.class;
             if (!PatchProxy.isSupport(om) || !PatchProxy.applyVoidFourRefs(activity, oobject, Integer.valueOf(number), Boolean.FALSE, null, m.class, "1")) {
                String str = e.b("menu_entrance");
                int i1 = 7;
                int[] ointArray = new int[i1]{'.',3,1,15,2,0x75d8,0x75d9};
                if (PatchProxy.isSupport(om)) {
                   Object[] objArray = new Object[9];
                   objArray[i] = str;
                   objArray[1] = activity;
                   objArray[2] = oobject;
                   objArray[3] = "menu_entrance";
                   objArray[4] = Integer.valueOf(i);
                   objArray[5] = Boolean.TRUE;
                   objArray[6] = Boolean.FALSE;
                   objArray[i1] = Integer.valueOf(number);
                   objArray[8] = ointArray;
                   if (!PatchProxy.applyVoid(objArray, null, om, "29")) {
                   }
                }else if(oobject.getVisibility()){
                   activity.getPage();
                   m.n(str, activity, oobject, "menu_entrance", 0, true, false, number, null, ointArray);
                }
             }
          label_00ad :
             ReddotRecordHelper.e.d(true, "TopMenu");
          }else {
             n0.a(p0);
             ReddotRecordHelper.e.d(i, "TopMenu");
          }
       }
       return;
    }
    public final a R8(int p0){
       Fragment obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.getActivity() == null) {
          return null;
       }else {
          obj = this.getActivity().I();
          if (obj != null && obj.getView() != null) {
             View view = obj.getView().findViewById(p0);
             if (view instanceof a) {
                return view;
             }
          }
          return null;
       }
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, b.class, "11")) {
          return;
       }
       this.V8(false);
       return;
    }
    public final void V8(boolean p0){
       Object[] objArray;
       Activity activity;
       boolean b1;
       RedDot redDot;
       boolean b = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       String str = "12";
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), b, uob, str)) {
          return;
       }
       a uoa = b.R8(R.id.left_btn);
       a uoa1 = b.R8(R.id.featured_left_hamburger);
       if (uoa != null && uoa1 != null) {
          String str1 = "HomeMenuHamburgerRedDotPresenter";
          int i = 0;
          if (c.b()) {
             objArray = new Object[i];
             b.C().w(str1, "child lock Enable", objArray);
             b.P8(uoa, i);
             b.P8(uoa1, i);
             activity = this.getActivity();
             Objects.requireNonNull(activity);
             q.p0(activity).A0(i);
             return;
          }else {
             o oo = o.class;
             Object obj = PatchProxy.apply(null, null, oo, "1");
             if (obj != patchProxyRe) {
                b1 = obj.booleanValue();
             }else {
                Object obj1 = PatchProxy.apply(null, null, oo, "2");
                b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): d.a(0x280e7c21).M4(RedDotProtectionType.HOME_MENU);
                o.a = b1;
             }
             if (b1) {
                objArray = new Object[i];
                b.C().w(str1, "delay show redDot", objArray);
                b.P8(uoa, i);
                b.P8(uoa1, i);
                activity = this.getActivity();
                Objects.requireNonNull(activity);
                q.p0(activity).A0(i);
                return;
             }else {
                b1 = t.a.get().booleanValue();
                if (b.x == null) {
                   if (b1) {
                      b1 = (b.s.cardinality())? true: false;
                   }else {
                      b1 = b.a(0x34c80eb4).i(1101);
                   }
                   b.v = b1;
                }
                Boolean uBoolean = PatchProxy.apply(null, null, HomeExperimentManager.class, str);
                if (uBoolean == patchProxyRe) {
                   uBoolean = HomeExperimentManager.l.getValue();
                }
                int b2 = uBoolean.booleanValue();
                if (b2) {
                   if (b.x != null) {
                      if (!b.w.size()) {
                      label_019c :
                         boolean b3 = (b.b(-3) > 0)? true: false;
                         if (b2) {
                            b3 = false;
                         }
                         b v = b.v;
                         n0 on0 = n0.class;
                         if (PatchProxy.isSupport(on0) && (!PatchProxy.applyVoidThreeRefs(Boolean.valueOf(v), Boolean.valueOf(i), Boolean.valueOf(b3), null, n0.class, "3") && n0.a.get().booleanValue())) {
                            if (v != null && !PatchProxy.applyVoid(null, null, on0, "4")) {
                               c.a(new m0());
                            }
                            if (b3) {
                               i0.a("red_dot_whole_log", "汉堡图红点生成原因：RedDotHelper.getLocalRedDotCount\(LocalRedDotType.NEW_VERSION\)");
                            }
                         }
                      label_01f7 :
                         b2 = (b.v != null || b3)? 1: 0;
                         b.P8(uoa, b2);
                         b2 = (b.v != null || b3)? 1: 0;
                         b.P8(uoa1, b2);
                         activity = this.getActivity();
                         Objects.requireNonNull(activity);
                         q oq = q.p0(activity);
                         if (b.v != null || b3) {
                            i = 1;
                         }
                         oq.A0(i);
                      }
                   }else if(b.s.cardinality()){
                   }
                   if (b.x == null) {
                      ArrayList uArrayList = new ArrayList();
                      int i1 = 0;
                      for (b1 = 0; b1 < b.s.cardinality(); b1 = b1 + 1) {
                         uArrayList.add(Integer.valueOf(b.s.nextSetBit(i1)));
                         i1 = b.s.nextSetBit(i1) + 1;
                      }
                      ArrayList uArrayList1 = new ArrayList();
                      Iterator iterator = uArrayList.iterator();
                      while (iterator.hasNext()) {
                         redDot = b.a(0x34c80eb4).c(iterator.next().intValue());
                         if (redDot != null) {
                            uArrayList1.add(redDot);
                         }
                      }
                      if (e.b(QCurrentUser.ME.getId(), uArrayList1)) {
                         b.v = i;
                         goto label_019c ;
                      }else if(p0){
                         b.v = i;
                         e.c(QCurrentUser.ME.getId(), uArrayList1);
                         goto label_019c ;
                      }else {
                         goto label_019c ;
                      }
                   }else if(e.b(QCurrentUser.ME.getId(), b.w)){
                      b.v = i;
                      goto label_019c ;
                   }else if(p0){
                      b.v = i;
                      e.c(QCurrentUser.ME.getId(), b.w);
                      goto label_019c ;
                   }else {
                      goto label_019c ;
                   }
                }else {
                   goto label_019c ;
                }
             }
          }
       }
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, b.class, "14")) {
          return;
       }
       a uoa = this.R8(R.id.featured_left_hamburger);
       if (this.R8(0x7f0a1716) == null || (uoa != null && TextUtils.isEmpty(a.e()+a.f()))) {
          b.a(0x34c80eb4).d(1003, RequestTiming.DEFAULT);
       }
    label_004c :
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new m());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void onEventMainThread(k$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "9")) {
          return;
       }
       if (p0.a == 2) {
          this.S8();
       }
       return;
    }
    public void onNewVersionEvent(c p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "6")) {
          return;
       }
       Object obj = PatchProxy.apply(null, this, uob, "13");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): Math.max(a.a.getInt("LatestVersionPromptedInSideMenu", 0), a.q);
       if (i < p0.a) {
          z.b("HomeMenuHamburgerRedDotPresenter", -3);
       }else {
          Integer[] integerArray = new Integer[]{Integer.valueOf(-3)};
          z.a("HomeMenuHamburgerRedDotPresenter", integerArray);
       }
       this.S8();
       return;
    }
}
