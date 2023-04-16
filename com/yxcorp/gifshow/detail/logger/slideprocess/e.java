package com.yxcorp.gifshow.detail.logger.slideprocess.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.logger.slideprocess.c;
import ok.x;
import com.google.common.base.Suppliers;
import com.yxcorp.gifshow.detail.logger.slideprocess.d;
import java.util.HashMap;
import android.app.Activity;
import java.util.ArrayList;
import s1a.h;
import u1a.b;
import t1a.b;
import com.yxcorp.gifshow.detail.logger.slideprocess.e$a;
import com.yxcorp.gifshow.detail.logger.slideprocess.e$b;
import com.yxcorp.gifshow.detail.logger.slideprocess.e$c;
import com.yxcorp.gifshow.detail.logger.slideprocess.e$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.u1;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qw6.a;
import sy6.a;
import qvb.q;
import android.app.Application;
import android.app.Application$ActivityLifecycleCallbacks;
import tkd.b;
import tkd.d;
import hn5.n;
import android.content.Context;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import s1a.g;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import androidx.fragment.app.FragmentActivity;
import ko5.d;
import ko5.c;
import wq6.l;
import wq6.g;
import wq6.e;
import fr6.d;
import s1a.e;
import s1a.d;
import com.trello.rxlifecycle3.components.support.RxFragment;
import s1a.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.kcube.TabIdentifier;
import wq6.h;
import on5.b;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import s1a.a;
import java.util.Collection;
import ekd.q;
import java.lang.System;
import s1a.b;
import android.os.SystemClock;
import java.util.List;
import wkd.b;
import com.yxcorp.gifshow.detail.logger.slideprocess.a;
import java.util.Objects;
import java.util.Map;
import fg6.a;
import com.google.gson.Gson;
import k2b.u1;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import java.lang.Integer;
import v1a.a;
import bf5.p;
import java.util.LinkedList;
import u1a.a;
import k2b.e0;
import hf5.f;
import uw9.l0;
import jf5.a;
import m56.f;
import m56.g;

public class e extends PresenterV2	// class@00157f
{
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public QPhoto E;
    public List F;
    public final Runnable G;
    public List H;
    public List I;
    public List J;
    public b K;
    public a L;
    public String M;
    public int N;
    public MilanoContainerEventBus O;
    public Activity P;
    public a Q;
    public b R;
    public boolean S;
    public boolean T;
    public b U;
    public final a V;
    public final b W;
    public final d X;
    public final q Y;
    public BaseFragment p;
    public String q;
    public l0 r;
    public int s;
    public boolean t;
    public Activity u;
    public int v;
    public String w;
    public QPhoto x;
    public int y;
    public boolean z;
    public static final x U0;
    public static final HashMap V0;
    public static final x Z;

    static {
       e.Z = Suppliers.a(c.b);
       e.U0 = Suppliers.a(d.b);
       e.V0 = new HashMap();
    }
    public void e(Activity p0){
       super();
       this.y = -1;
       this.z = false;
       this.A = false;
       this.B = true;
       this.C = false;
       this.D = false;
       this.F = new ArrayList();
       this.G = new h(this);
       this.H = new ArrayList();
       this.I = new ArrayList();
       this.J = new ArrayList();
       this.K = new b();
       this.R = new b();
       this.V = new e$a(this);
       this.W = new e$b(this);
       this.X = new e$c(this);
       this.Y = new e$d(this);
       this.P = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       if (this.W8()) {
          return;
       }
       this.D = true;
       this.B = true;
       u1.a(this);
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.p);
       this.L = slidePlayVie;
       slidePlayVie.h(this.V);
       this.L.e(this.Y);
       this.P.getApplication().registerActivityLifecycleCallbacks(this.W);
       this.t = d.a(-1883158055).U3(this.P);
       this.X7(this.O.A.subscribe(new g(this), Functions.e));
       e tP = this.P;
       this.u = tP;
       if (this.t != null) {
          l ol = c.a(tP).d();
          Fragment uFragment = ol.k().N().p();
          if (uFragment != null) {
             this.v = uFragment.hashCode();
          }
          ol.a(this.X);
       }
       this.X7(this.O.P.subscribe(new e(this), Functions.d()));
       this.X7(this.O.Q.subscribe(new d(this), Functions.d()));
       this.X7(this.p.m().subscribe(new f(this)));
       String str = this.p.o();
       this.q = str;
       if (!TextUtils.x(str)) {
          this.p = null;
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       if (this.D == null) {
          return;
       }
       u1.b(this);
       this.L.l(this.V);
       this.L.b(this.Y);
       this.P.getApplication().unregisterActivityLifecycleCallbacks(this.W);
       if (this.t != null) {
          l ol = c.a(this.P).d();
          Fragment uFragment = ol.k().N().p();
          if (uFragment != null) {
             this.v = uFragment.hashCode();
          }
          ol.m(this.X);
          this.S8("EXIT_APP");
       }else {
          this.S8("LEAVE_PAGE");
       }
       return;
    }
    public final String P8(){
       Object obj = PatchProxy.apply(null, this, e.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.M+":"+this.V8()+":"+e.V0.get(this.w);
    }
    public String R8(String p0){
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       e obj = PatchProxy.applyOneRefs(p0, this, uoe, "17");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.q;
       if (TextUtils.x(obj)) {
          str = "unknow";
          if (this.t != null) {
             l ol = c.a(this.P).d();
             e uoe1 = ol.k().N();
             StringBuilder str1 = str+":";
             str = (ol.o(uoe1.M2(), b.B))? "TOP_BAR": "BOTTOM_BAR";
             str = str1+str+":"+uoe1.M2().getType();
          }
       }
       StringBuilder str2 = str+":";
       String str3 = PatchProxy.applyOneRefs(p0, this, uoe, "24");
       if (str3 != patchProxyRe) {
       }else {
          str3 = "null";
          if (!TextUtils.x(p0)) {
             Matcher matcher = Pattern.compile("\\w+\\/\\d+_\([a-zA-Z_]+\)").matcher(p0);
             while (matcher.find()) {
                str3 = matcher.group(1);
             }
             a.E("exptag: "+str3);
          }
       }
       return str2+str3;
    }
    public void S8(String p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "23")) {
          return;
       }
       if (this.U == null || (this.z == null && !q.f(this.H))) {
          this.z = true;
          this.U.mLeaveTime = System.currentTimeMillis();
          e tU = this.U;
          tU.mDuration = tU.mLeaveTime - tU.mEnterTime;
          tU.b = SystemClock.elapsedRealtime();
          tU = this.U;
          tU.mSystemClockDuration = tU.b - tU.a;
          this.U.mSlideCount = (("SLIDE_MAX_RANK").equals(p0))? 6: this.s;
          this.U.mDeduplicationSlideCount = this.F.size();
          tU = this.U;
          tU.mUploadReason = p0;
          tU.mSlidePhotoInfoList = this.H;
          tU.mNavigateActionList = this.K.a();
          p0.mFeedRequestActionList = this.R.b();
          this.a9("endSlideProcessInfo");
          a uoa = b.a(-1448653007);
          tU = this.U;
          b mPageSession = tU.mPageSessionId;
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoidTwoRefs(mPageSession, tU, uoa, a.class, "3") && !TextUtils.x(mPageSession)) {
             a = uoa.a;
             if (a != null && (!a.isEmpty() && uoa.a.containsKey(mPageSession))) {
                uoa.a.remove(mPageSession);
                uoa.d();
             }
          label_00b8 :
             uoa = a.a.q(tU);
             a.B(" upload: "+uoa);
             u1.R("SLIDE_USER_PROCESS", uoa, 14);
          }
       }
    label_00d9 :
       return;
    }
    public String V8(){
       e obj = PatchProxy.apply(null, this, e.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.x;
       String str = (obj == null)? "null": obj.getPhotoId();
       return str;
    }
    public boolean W8(){
       HashMap obj = PatchProxy.apply(null, this, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = e.V0;
       boolean b = false;
       if (obj.isEmpty()) {
          return b;
       }
       if (TextUtils.x(this.w)) {
          return b;
       }
       Integer integer = obj.get(this.w);
       if (integer == null) {
          return b;
       }
       if (integer.intValue() > 6) {
          b = true;
       }
       return b;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, e.class, "11")) {
          return;
       }
       if (!e.Z.get().booleanValue()) {
          return;
       }
       if (this.x == null) {
          return;
       }
       String str = this.P8();
       if (this.I.contains(str)) {
          return;
       }
       this.Y8("VIDEO_PLAY_V2");
       this.I.add(str);
       return;
    }
    public final void Y8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "13")) {
          return;
       }
       e tQ = this.Q;
       if (tQ != null && this.O != null) {
          String str = "null";
          if (str.equals(tQ.mWatchId)) {
             tQ = this.Q;
             MilanoContainerEventBus z = this.O.z;
             if (z != null) {
                str = z.c();
             }
             tQ.b(str);
          }
          String str1 = a.a.q(this.Q);
          u1.R(p0, str1, 14);
          a.B("VideoPlay: "+p0+":"+str1);
       }
       return;
    }
    public void Z8(Activity p0){
       String str2;
       boolean b = this;
       Object obj = p0;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(obj, b, e.class, "9")) {
          return;
       }
       if (this.W8()) {
          return;
       }
       e p = b.P;
       boolean b1 = false;
       Integer integer = (obj == p)? 1: null;
       e uoe = (b.u == p)? 1: null;
       if (uoe && b.t != null) {
          l ol = c.a(p).d();
          if (ol != null) {
             Fragment uFragment = ol.k().N().T().p();
             if (uFragment != null) {
                uoe = (b.N == uFragment.hashCode())? 1: null;
             }
          }
       }
       if (!integer && uoe == null) {
          return;
       }else if(uoe != null && !integer){
          p = 1;
       }else {
          p = null;
       }
       if (p) {
          b.C = b1;
          e k = b.K;
          String str = this.V8();
          e s = b.s;
          int i = b.L.a0();
          Objects.requireNonNull(k);
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidFourRefs(p0, str, Integer.valueOf(s), Integer.valueOf(i), k, b.class, "1")) {
             a.E("enterPage activity start photoId:"+str+" slideCount:"+s+"  index:"+i);
             if (k.a.isEmpty() || k.a.getLast().c()) {
                String str1 = PatchProxy.applyOneRefs(obj, k, uob, "8");
                if (str1 != PatchProxyResult.class) {
                }else {
                   str1 = p0.getLocalClassName();
                   if (obj instanceof e0) {
                      String str3 = obj.o();
                      if (!TextUtils.x(str3)) {
                         str2 = str3;
                      label_00f7 :
                         a uoa = v6;
                         a uoa1 = new a(str, s, i, str2, p0.hashCode());
                         uoa.a();
                         a uoa2 = uoa;
                         k.a.add(uoa2);
                         a.E("enterPage activity end photoId:"+str+" slideCount:"+s+"  index:"+i+"  hash:"+uoa2.b()+"  pageName:"+uoa2.mToPage);
                         a.E("enterPage--navigate action size:"+k.a.size());
                      }
                   }
                }
                str2 = str1;
                goto label_00f7 ;
             }
          }
          b.u = obj;
          b.d9("navigateOtherPage");
          if (b.U != null) {
             b.b9(true);
          }
       }else if(uoe == null){
          b.C = true;
          p = b.K;
          e u = b.u;
          Objects.requireNonNull(p);
          if (!PatchProxy.applyVoidOneRefs(u, p, uob, "3")) {
             p.c(u.hashCode());
          }
          b.u = obj;
          b.d9("backFromOtherPage");
       }
       return;
    }
    public final void a9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "25")) {
          return;
       }
       if (this.U == null) {
          return;
       }
       if (a.C()) {
          a.B(p0);
          a.B(a.a.q(this.U));
       }else {
          a.E(p0);
       }
       return;
    }
    public final void b9(boolean p0){
       e tQ;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "20")) {
          return;
       }
       if (this.U == null) {
          return;
       }
       if (p0) {
          tQ = this.Q;
          if (tQ != null) {
             uoe = this.O;
             if (uoe != null) {
                MilanoContainerEventBus z = uoe.z;
                String str = (z == null)? "null": z.c();
                tQ.a(str);
             }
          }
          this.e9();
       }
       tQ = this.U;
       tQ.mSlideCount = this.s;
       tQ.mDeduplicationSlideCount = this.F.size();
       tQ.mLeaveTime = System.currentTimeMillis();
       tQ = this.U;
       tQ.mDuration = tQ.mLeaveTime - tQ.mEnterTime;
       tQ.b = SystemClock.elapsedRealtime();
       tQ = this.U;
       tQ.mSystemClockDuration = tQ.b - tQ.a;
       uoe = this.U;
       b.a(-1448653007).c(uoe.mPageSessionId, uoe);
       return;
    }
    public void c9(){
       if (PatchProxy.applyVoid(null, this, e.class, "22")) {
          return;
       }
       if (this.U == null) {
          return;
       }
       List list = this.R.b();
       if (q.f(list)) {
          return;
       }
       this.U.mFeedRequestActionList = list;
       this.a9("updateFeedRequestActions");
       return;
    }
    public final void d9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "21")) {
          return;
       }
       if (this.U == null) {
          return;
       }
       List list = this.K.a();
       if (q.f(list)) {
          return;
       }
       this.U.mNavigateActionList = list;
       this.a9("updateNavigateActions "+p0);
       return;
    }
    public void e9(){
       if (PatchProxy.applyVoid(null, this, e.class, "19")) {
          return;
       }
       if (this.U != null && !q.f(this.H)) {
          this.U.mSlidePhotoInfoList = this.H;
          this.a9("updateSlidePhotos");
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       BaseFragment uBaseFragmen = this.r8("FRAGMENT");
       this.p = uBaseFragmen;
       if (uBaseFragmen instanceof f) {
          this.N = uBaseFragmen.identity();
          this.M = this.p.ae();
       }
       l0 ol0 = this.q8(l0.class);
       this.r = ol0;
       this.O = ol0.X;
       return;
    }
    public void onBackground(f p0){
       e k;
       e v;
       String str1;
       e s;
       int i;
       int i1;
       String str2;
       e uoe;
       String str3;
       a uoa;
       Object obj = this;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, obj, e.class, "6")) {
          return;
       }
       if (obj.C == null || this.W8()) {
          return;
       }
       String str = "enterPage--navigate action size:";
       if (obj.t != null) {
          k = obj.K;
          v = obj.v;
          str1 = this.V8();
          s = obj.s;
          i = obj.L.a0();
          Objects.requireNonNull(k);
          if (PatchProxy.isSupport(uob)) {
             i1 = i;
             str2 = str;
             uoe = s;
             str3 = str1;
             if (!PatchProxy.applyVoidFourRefs(Integer.valueOf(v), str1, Integer.valueOf(s), Integer.valueOf(i), k, b.class, "6")) {
             }
          }else {
             str2 = str;
             i1 = i;
             uoe = s;
             str3 = str1;
          }
       }else {
          k = obj.u;
          if (k != null) {
             v = obj.K;
             str1 = this.V8();
             s = obj.s;
             i = obj.L.a0();
             Objects.requireNonNull(v);
             if (PatchProxy.isSupport(uob)) {
                i1 = i;
                str2 = str;
                uoe = s;
                str3 = str1;
                if (!PatchProxy.applyVoidFourRefs(k, str1, Integer.valueOf(s), Integer.valueOf(i), v, b.class, "5")) {
                }
             }else {
                str2 = str;
                i1 = i;
                uoe = s;
                str3 = str1;
             }
          }
       }
    label_01db :
       e uoe1 = this;
       uoe1.d9("onBackground");
       uoe1.b9(true);
       return;
    }
    public void onForeground(g p0){
       String str = "7";
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, str)) {
          return;
       }
       if (this.C != null && !this.W8()) {
          e tK = this.K;
          Objects.requireNonNull(tK);
          if (!PatchProxy.applyVoid(null, tK, b.class, str) && !tK.a.isEmpty()) {
             a last = tK.a.getLast();
             last.d("BACK");
             a.E("leavePage end:"+last);
             a.E("leavePage--navigate action size:"+tK.a.size());
          }
          this.d9("onForeground");
       }
       return;
    }
}
