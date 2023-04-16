package com.kuaishou.live.audience.course.e;
import k51.c;
import android.os.Handler;
import android.os.Looper;
import com.kuaishou.live.audience.course.e$a;
import com.kuaishou.live.audience.course.e$b;
import com.kuaishou.live.audience.course.e$c;
import s31.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s31.y;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import com.kuaishou.live.common.course.model.QLiveCourse;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import cz1.a;
import s31.c;
import ds5.c;
import ds5.a;
import com.kuaishou.live.core.basic.activity.x;
import s31.k;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import com.kuaishou.live.audience.course.b;
import com.kwai.feature.api.live.base.service.quitlive.AudienceQuitLiveCheckOrder;
import tq5.a;
import tq5.c;
import com.kuaishou.live.common.core.component.share.LiveShareSubBiz$AudienceSubBiz;
import com.kuaishou.live.common.core.component.share.LiveShareSubBiz;
import sx1.i;
import com.kuaishou.live.core.show.share.f$b;
import com.kuaishou.live.audience.course.g;
import java.util.Objects;
import androidx.lifecycle.MutableLiveData;
import x61.c;
import lp3.c;
import lp3.e;
import java.lang.Runnable;
import crd.b;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import s31.a;
import android.view.View$OnClickListener;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.live.audience.course.d;
import s31.e0;
import brd.t;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.PayCourseApiService;
import cjd.e;
import erd.o;
import com.kuaishou.live.audience.course.j;
import erd.a;
import com.kuaishou.live.audience.course.c;
import com.kuaishou.live.audience.course.a;
import s31.h;
import erd.g;
import java.lang.Throwable;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import jyc.b;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.utility.TextUtils;
import java.lang.System;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import s31.b;
import java.lang.Long;
import pf1.b;
import android.graphics.Color;
import android.os.SystemClock;
import java.lang.Math;
import z61.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import k2b.u1;
import lnc.a1;
import e17.i;
import com.kuaishou.live.audience.course.LiveCourseTrialEndFragment;
import com.kuaishou.live.audience.course.e$d;
import s31.e;
import androidx.fragment.app.e;
import com.kwai.video.waynelive.LivePlayerController;
import ds5.e;
import android.view.View;
import android.view.ViewGroup;
import cc1.a;
import nl8.o;
import nl8.n;

public class e extends c	// class@000c01
{
    public long A;
    public LiveCourseTrialEndFragment B;
    public long C;
    public final Handler D;
    public g E;
    public final c F;
    public final Runnable G;
    public b H;
    public final c I;
    public final i J;
    public ViewGroup p;
    public b q;
    public a0 r;
    public m s;
    public y t;
    public QLiveCourse u;
    public QLivePlayExtraInfo v;
    public String w;
    public Runnable x;
    public b y;
    public long z;
    public static String sLivePresenterClassName = "LiveAudienceCoursePresenter";

    public void e(){
       super();
       this.A = 0x493e0;
       this.D = new Handler(Looper.getMainLooper());
       this.F = new e$a(this);
       this.G = new e$b(this);
       this.I = new e$c(this);
       this.J = new g(this);
    }
    public void E8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "3")) {
          return;
       }
       this.t = new y(this.r.c);
       if (this.s.b() != null && (this.s.b().getActivity() != null && this.s.b().getActivity().getIntent() != null)) {
          Intent intent = this.s.b().getActivity().getIntent();
          this.u = QLiveCourse.fromIntent(intent);
          a0 o = this.r.o;
          if (o != null) {
             this.w = a.a(intent, o.mLiveSourceType);
          }
       }
       e tu = this.u;
       if (tu != null) {
          this.t.d(tu.mCourseId, tu.mLessonId);
       }
       tu = this.w;
       if (tu != null) {
          this.t.d = tu;
       }
       this.x = new c(this);
       this.r.J.gd(this.I);
       this.r.J.gd(this.F);
       this.C = this.r.S.s0();
       if (!PatchProxy.applyVoid(objArray, this, uoe, "5") && this.r.h != null) {
          this.r.y2.P4(new k(this));
       }
       this.r.w1.Ci(new b(this), AudienceQuitLiveCheckOrder.COURSE);
       this.r.o1.N0(LiveShareSubBiz$AudienceSubBiz.COURSE_LIVE, this.J);
       g og = this.P8();
       Objects.requireNonNull(og);
       if (!PatchProxy.applyVoid(objArray, og, g.class, "2")) {
          og.c.setValue(og.b);
          og.a.a(c.class).v1(og.c);
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "4")) {
          return;
       }
       this.clear();
       e uoe = (this.u != null)? 1: null;
       if (uoe) {
          this.D.removeCallbacks(this.G);
       }
       b9.a(this.y);
       this.r.J.fo(this.I);
       this.r.J.fo(this.F);
       this.r.o1.F1(LiveShareSubBiz$AudienceSubBiz.COURSE_LIVE);
       g og = this.P8();
       Objects.requireNonNull(og);
       if (!PatchProxy.applyVoid(objArray, og, g.class, "3")) {
          og.a.a(c.class).O0(1011);
       }
       return;
    }
    public final g P8(){
       Object obj = PatchProxy.apply(null, this, e.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.E == null) {
          this.E = new g(new a(this));
       }
       return this.E;
    }
    public void R8(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "13")) {
          return;
       }
       if (!QCurrentUser.me().isLogined() || (this.u != null && this.H == null)) {
          ProgressFragment progressFrag = new ProgressFragment();
          progressFrag.show(this.s.b().getChildFragmentManager(), "course-order");
          GifshowActivity activity = this.s.b().getActivity();
          QLiveCourse mCourseId = this.u.mCourseId;
          d uod = new d(this, progressFrag);
          t ot = PatchProxy.applyThreeRefsWithListener(activity, mCourseId, uod, null, e0.class, "1");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = b.a(0x74d268f).getPrepayInfo(mCourseId, 1).map(new e()).concatMap(new j(activity, uod, mCourseId));
             PatchProxy.onMethodExit(e0.class, "1");
          }
          this.H = ot.doFinally(new c(this, progressFrag)).subscribe(new a(this, p0), new h(this, p0));
       }
    label_00a5 :
       return;
    }
    public final void S8(Throwable p0,boolean p1,boolean p2){
       String str;
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, e.class, "14")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity == null) {
          return;
       }
       if (p0 != null && !("canceled").equals(p0.getMessage())) {
          ExceptionHandler.handleException(this.s.b().getActivity(), p0);
       }
       if (p1) {
          String w = WebEntryUrls.W;
          QLiveCourse mCourseId = this.u.mCourseId;
          b uob = b.class;
          if (PatchProxy.isSupport(uob)) {
             Object[] objArray = new Object[]{w,mCourseId,null,null,null};
             str = PatchProxy.apply(objArray, null, uob, "6");
             if (str != PatchProxyResult.class) {
             label_00dd :
                activity.startActivity(KwaiWebViewActivity.N3(activity, TextUtils.d(str, "channel="+this.w)).o("ks://course/detail").a());
                activity.finish();
             }
          }
          w = w+"/"+mCourseId;
          if (!TextUtils.isEmpty(null)) {
             w = TextUtils.d(w, "cc=null");
          }
          if (!TextUtils.isEmpty(null)) {
             w = TextUtils.d(w, "et=null");
          }
          if (!TextUtils.isEmpty(null)) {
             w = TextUtils.d(w, "userId=null");
          }
          str = TextUtils.d(TextUtils.d(w, "fid="+QCurrentUser.me().getId()), "timestamp="+System.currentTimeMillis());
          goto label_00dd ;
       }else if(p2){
          this.D.post(new b(this));
       }
       return;
    }
    public final void V8(long p0){
       String str;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoe, "8")) {
          return;
       }
       this.q.b(false);
       this.q.i(R.string.arg_RES_7f10200c);
       this.q.g(Color.argb(153, 255, 255, 255));
       this.D.removeCallbacks(this.G);
       long l = SystemClock.elapsedRealtime();
       long l1 = 0;
       if (!this.z - l1) {
          this.z = l;
       }
       p0 = Math.max((p0 * 1000), l1);
       this.A = p0;
       this.D.postDelayed(this.G, Math.min(p0, 0x2710));
       g og = this.P8();
       Objects.requireNonNull(og);
       Object[] objArray = null;
       b uob = PatchProxy.apply(objArray, og, g.class, "5");
       if (uob != patchProxyRe) {
       }else {
          uob = og.b.mIsVisible;
       }
       int b = true;
       if (!uob.booleanValue()) {
          this.P8().setVisible(b);
          e tt = this.t;
          Objects.requireNonNull(tt);
          if (!PatchProxy.applyVoid(objArray, tt, y.class, "1")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action = 1098;
             uElementPack.name = tt.b;
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = y.a(tt.a);
             y.b(tt.d);
             u1.u0(6, uElementPack, uContentPack);
          }
       }
       long l2 = (this.A - l) + this.z;
       if (l2 - l1 > 0) {
          if (PatchProxy.isSupport(uoe)) {
             str = PatchProxy.applyOneRefs(Long.valueOf(l2), this, uoe, "15");
             if (str != patchProxyRe) {
             }else {
             label_00dd :
                float f = ((float)l2 / 1000.00f) / 60.00f;
                if (f - 0x3f800000 >= 0) {
                   i = (int)(f + 0x3f000000);
                   b = (i > b)? 0x7f103a4b: 0x7f103a48;
                   str = a1.q(b, i);
                }else {
                   str = a1.q(R.string.arg_RES_7f103a57, ((int)l2 / 1000));
                }
             }
          }else {
             goto label_00dd ;
          }
          i.d(R.style.arg_RES_7f110669, a1.r(R.string.arg_RES_7f102014, str));
       }
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, e.class, "9")) {
          return;
       }
       this.q.b(true);
       this.q.i(R.string.arg_RES_7f103cec);
       this.q.g(a1.a(R.color.arg_RES_7f061fd5));
       this.D.removeCallbacks(this.G);
       this.P8().setVisible(false);
       return;
    }
    public void X8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "11")) {
          return;
       }
       try{
          if (this.B == null && this.s.b() != null) {
             LiveCourseTrialEndFragment liveCourseTr = new LiveCourseTrialEndFragment();
             liveCourseTr.g = this.v;
             liveCourseTr.b = new e$d(this);
             liveCourseTr.c = new e(this);
             c childFragmen = this.s.b().getChildFragmentManager();
             String str = "live_course_trial";
             if (!PatchProxy.applyVoidTwoRefs(childFragmen, str, liveCourseTr, LiveCourseTrialEndFragment.class, "7")) {
                liveCourseTr.d = false;
                e uoe = childFragmen.beginTransaction();
                uoe.g(R.id.close_fragment_container, liveCourseTr, str);
                uoe.m();
             }
             this.B = liveCourseTr;
             e tt = this.t;
             Objects.requireNonNull(tt);
             if (!PatchProxy.applyVoid(objArray, tt, y.class, "2")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action = 1099;
                uElementPack.name = tt.b;
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.photoPackage = y.a(tt.a);
                y.b(tt.d);
                u1.u0(1, uElementPack, uContentPack);
             }
             this.r.E.stopPlay("Course");
             a0 j = this.r.J;
             if (j != null) {
                j.G7();
             }
          }
       }catch(java.lang.Exception e0){
       }
       return;
    }
    public void clear(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "7")) {
          return;
       }
       this.u = objArray;
       this.D.removeCallbacks(this.G);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.p = a.a(p0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.q = this.r8("LIVE_AUDIENCE_COMMENT_PLACEHOLDER_SERVICE");
       this.r = this.q8(a0.class);
       this.s = this.r8("LIVE_BASIC_CONTEXT");
       this.P8().i(n.a(this));
       return;
    }
}
