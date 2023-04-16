package com.kuaishou.live.lite.comment.CommentViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.fragment.app.c;
import com.kuaishou.live.service.ServiceProvider;
import hf3.a;
import ds5.a;
import e93.a;
import td3.o;
import xp5.i;
import n91.f;
import x83.a;
import hx1.a;
import tj3.e;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import ip3.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import s93.v;
import com.kuaishou.live.lite.comment.model.CommentConfigProvider;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import or5.b;
import s93.b;
import com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager;
import com.kuaishou.live.lite.comment.CommentViewController$displayUserStateManager$1;
import androidx.lifecycle.LifecycleOwner;
import msd.a;
import com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager;
import com.kuaishou.live.lite.comment.CommentViewController$displayAuthorStateManager$1;
import w93.a;
import com.kuaishou.live.lite.comment.manager.MockCommentManager;
import com.kwai.framework.model.user.User;
import xp5.g;
import brd.t;
import com.kuaishou.live.lite.comment.CommentViewController$d;
import erd.o;
import com.kuaishou.live.lite.comment.CommentViewController$e;
import w93.c;
import com.kuaishou.live.lite.comment.CommentViewController$b;
import com.kuaishou.live.lite.comment.CommentViewController$a;
import com.kuaishou.live.lite.comment.CommentViewController$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$r;
import s93.h;
import aa3.a;
import com.kuaishou.live.lite.comment.CommentViewController$g;
import lnc.a1;
import com.kuaishou.live.common.core.component.comments.display.config.LiveCommentsDisplayParams;
import com.kuaishou.live.lite.comment.view.CommentMessageListAdapter;
import com.kuaishou.live.lite.comment.view.CommentLinearLayoutManager;
import com.kuaishou.live.lite.comment.view.LiveLiteCommentRecyclerView;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.content.Context;
import android.view.View;
import ha1.a;
import k51.d;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import java.lang.Enum;
import qrd.l1;
import s93.i;
import java.lang.Runnable;
import a2.c0;
import ak5.j;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.live.lite.comment.CommentViewController$f;
import com.kuaishou.live.lite.comment.view.LiveLiteCommentRecyclerView$a;
import android.app.Activity;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$n;
import android.os.Looper;
import java.util.List;
import msd.l;
import crd.b;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService$DefaultImpls;
import com.kuaishou.live.lite.comment.CommentViewController$setupGestureDetector$1;
import u63.a;
import s93.e;
import java.lang.IllegalStateException;
import lf3.g;
import e93.f;
import android.view.View$OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import s93.f;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCCommentFeed;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import kotlin.collections.CollectionsKt__CollectionsKt;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public final class CommentViewController extends ViewController	// class@0007e0
{
    public final a A;
    public b B;
    public final Runnable C;
    public final int D;
    public final int E;
    public final int F;
    public ViewTreeObserver$OnPreDrawListener G;
    public ViewTreeObserver$OnGlobalLayoutListener H;
    public int I;
    public final c J;
    public final ServiceProvider K;
    public final ServiceProvider L;
    public final a M;
    public final a N;
    public final a O;
    public final o P;
    public final i Q;
    public final f R;
    public final a S;
    public final a T;
    public final e U;
    public final LiveLiteGestureService V;
    public final a W;
    public final a X;
    public final String j;
    public boolean k;
    public final v l;
    public final CommentConfigProvider m;
    public final b n;
    public final LiveLiteDisplayUserStateManager o;
    public final LiveLiteDisplayAuthorStateManager p;
    public final a q;
    public final MockCommentManager r;
    public final c s;
    public final CommentViewController$b t;
    public final CommentViewController$a u;
    public final CommentViewController$c v;
    public LiveLiteCommentRecyclerView w;
    public CommentMessageListAdapter x;
    public CommentLinearLayoutManager y;
    public final RecyclerView$r z;

    public void CommentViewController(c p0,ServiceProvider p1,ServiceProvider p2,a p3,a p4,a p5,o p6,i p7,f p8,a p9,a p10,e p11,LiveLiteGestureService p12,a p13,a p14){
       v obj = p0;
       CommentConfigProvider obj1 = p1;
       LiveStreamFeedWrapper obj2 = p2;
       t obj3 = p3;
       a obj4 = p4;
       Object obj5 = p5;
       t obj6 = p6;
       Object obj7 = p7;
       Object obj8 = p8;
       Object obj9 = p9;
       Object obj10 = p10;
       MockCommentManager obj11 = p11;
       LiveLiteDisplayAuthorStateManager obj12 = p12;
       LiveLiteDisplayUserStateManager obj13 = p13;
       LiveLiteDisplayAuthorStateManager obj14 = p14;
       a.p(obj, "fragmentManager");
       a.p(obj1, "commentServiceProvider");
       a.p(obj2, "commentSentNotifyServiceProvider");
       a.p(obj3, "longConnection");
       a.p(obj4, "playConfigManager");
       a.p(obj5, "audienceInfoManager");
       a.p(obj6, "userStatusManager");
       a.p(obj7, "logPackageProvider");
       a.p(obj8, "serverTimeProvider");
       a.p(obj9, "anonymityManager");
       a.p(obj10, "roleInfoManager");
       a.p(obj11, "logReporter");
       a.p(obj12, "gestureService");
       a.p(obj13, "commentEditorService");
       a.p(obj14, "profileCardService");
       super();
       ViewController viewControll = this;
       viewControll.J = obj;
       viewControll.K = obj1;
       viewControll.L = obj2;
       viewControll.M = obj3;
       viewControll.N = obj4;
       viewControll.O = obj5;
       viewControll.P = obj6;
       viewControll.Q = obj7;
       viewControll.R = obj8;
       viewControll.S = obj9;
       viewControll.T = obj10;
       viewControll.U = obj11;
       viewControll.V = obj12;
       viewControll.W = obj13;
       viewControll.X = obj14;
       viewControll.j = "CommentViewController";
       viewControll.k = true;
       obj = new v();
       viewControll.l = obj;
       obj2 = p5.r5();
       a.o(obj2, "audienceInfoManager.liveStreamFeedWrapper");
       obj1 = new CommentConfigProvider(obj2.isGRPRCustomizedLive());
       viewControll.m = obj1;
       b uob = new b(obj3, obj11);
       viewControll.n = uob;
       obj13 = new LiveLiteDisplayUserStateManager(viewControll, new CommentViewController$displayUserStateManager$1(viewControll), obj4);
       viewControll.o = obj13;
       obj12 = new LiveLiteDisplayAuthorStateManager(viewControll, new CommentViewController$displayAuthorStateManager$1(viewControll), obj4);
       viewControll.p = obj12;
       obj4 = new a(obj3, obj1, uob, obj);
       viewControll.q = obj4;
       User user = p5.I();
       a.m(user);
       a.o(user, "audienceInfoManager.anchorUser!!");
       obj3 = p6.T3().map(CommentViewController$d.b);
       a.o(obj3, "userStatusManager.audien\x20\x02mentSuffix ?: false\n    }\x00");
       obj6 = p6.W().map(CommentViewController$e.b);
       a.o(obj6, "userStatusManager.timeCo¡­fterSendGiftConfig\)\n    }");
       LiveLiteDisplayAuthorStateManager liveLiteDisp = obj12;
       a uoa = obj4;
       obj14 = liveLiteDisp;
       obj11 = new MockCommentManager(uoa, obj13, obj14, user, obj3, obj6, p8, p9, p10);
       viewControll.r = obj;
       LiveStreamFeedWrapper liveStreamFe = p5.r5();
       a.o(liveStreamFe, "audienceInfoManager.liveStreamFeedWrapper");
       viewControll.s = new c(liveStreamFe, obj, obj7);
       viewControll.t = new CommentViewController$b();
       viewControll.u = new CommentViewController$a(viewControll);
       viewControll.v = new CommentViewController$c(viewControll);
       h oh = PatchProxy.apply(null, viewControll, CommentViewController.class, "13");
       if (oh != PatchProxyResult.class) {
       }else {
          oh = new h(viewControll);
       }
       viewControll.z = oh;
       viewControll.A = new a();
       viewControll.C = new CommentViewController$g(viewControll);
       viewControll.D = a1.e(1000.00f);
       viewControll.E = a1.e((float)obj1.a.mFastScrollSpeedDp);
       viewControll.F = a1.e((float)obj1.a.mSlowScrollSpeedDp);
       return;
    }
    public static final CommentMessageListAdapter V2(CommentViewController p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("adapter");
       }
       return p0;
    }
    public static final CommentLinearLayoutManager W2(CommentViewController p0){
       p0 = p0.y;
       if (p0 == null) {
          a.S("layoutManager");
       }
       return p0;
    }
    public static final LiveLiteCommentRecyclerView X2(CommentViewController p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("recyclerView");
       }
       return p0;
    }
    public void F2(){
       ViewTreeObserver$OnPreDrawListener onPreDrawLis = this;
       CommentViewController uCommentView = CommentViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, onPreDrawLis, uCommentView, "1")) {
          return;
       }
       LiveLogTag lIVE_LITE_CO = LiveLogTag.LIVE_LITE_COMMENT;
       b.Z(lIVE_LITE_CO, onPreDrawLis.j+'('+onPreDrawLis+"\) onCreate");
       View view = a.a(onPreDrawLis, this.D2(), R.layout.live_lite_comment_layout);
       view.setTag(d.a, LayoutViewType.CommentList.name());
       onPreDrawLis.R2(view);
       if (!PatchProxy.applyVoid(objArray, onPreDrawLis, uCommentView, "16")) {
          view = this.P2();
          c0 uoc0 = c0.a(view, new i(view, onPreDrawLis));
          a.o(uoc0, "OneShotPreDrawListener.add\(this\) { action\(this\) }");
          onPreDrawLis.G = uoc0;
       }
       if (!PatchProxy.applyVoid(objArray, onPreDrawLis, uCommentView, "14")) {
          j oj = j.o();
          a.o(oj, "KwaiEmotionManager.getInstance\(\)");
          if (!oj.t()) {
             b.Z(lIVE_LITE_CO, onPreDrawLis.j+" initEmojiIfNeeded execute");
             j.o().d();
          }
       }
       LiveLiteCommentRecyclerView liveLiteComm = onPreDrawLis.A2(R.id.live_lite_comment_recycler_view);
       onPreDrawLis.w = liveLiteComm;
       String str = "recyclerView";
       if (liveLiteComm == null) {
          a.S(str);
       }
       liveLiteComm.setItemAnimator(objArray);
       CommentViewController w = onPreDrawLis.w;
       if (w == null) {
          a.S(str);
       }
       w.setTouchStateListener(new CommentViewController$f(onPreDrawLis));
       CommentLinearLayoutManager uCommentLine = new CommentLinearLayoutManager(this.B2());
       onPreDrawLis.y = uCommentLine;
       CommentViewController v = onPreDrawLis.v;
       Objects.requireNonNull(uCommentLine);
       String str1 = "2";
       if (!PatchProxy.applyVoidOneRefs(v, uCommentLine, CommentLinearLayoutManager.class, str1)) {
          a.p(v, "layoutStateListener");
          uCommentLine.r = v;
       }
       w = onPreDrawLis.w;
       if (w == null) {
          a.S(str);
       }
       v = onPreDrawLis.y;
       if (v == null) {
          a.S("layoutManager");
       }
       w.setLayoutManager(v);
       Activity uActivity = this.B2();
       ItemViewControllerFactory$a uoa = PatchProxy.apply(objArray, onPreDrawLis, uCommentView, "10");
       if (uoa != PatchProxyResult.class) {
       }else {
          ItemViewControllerFactory$a uoa1 = new ItemViewControllerFactory$a(onPreDrawLis.J, onPreDrawLis.O, onPreDrawLis.Q, onPreDrawLis.V, onPreDrawLis.P, onPreDrawLis.n, onPreDrawLis.X, onPreDrawLis.W);
       }
       onPreDrawLis.x = new CommentMessageListAdapter(onPreDrawLis, uActivity, uoa);
       w = onPreDrawLis.w;
       if (w == null) {
          a.S(str);
       }
       v = onPreDrawLis.x;
       if (v == null) {
          a.S("adapter");
       }
       w.setAdapter(v);
       w = onPreDrawLis.w;
       if (w == null) {
          a.S(str);
       }
       w.addOnScrollListener(onPreDrawLis.z);
       w = onPreDrawLis.w;
       if (w == null) {
          a.S(str);
       }
       w.addItemDecoration(onPreDrawLis.A);
       w = onPreDrawLis.q;
       v = onPreDrawLis.u;
       Objects.requireNonNull(w);
       if (!PatchProxy.applyVoidOneRefs(v, w, a.class, str1)) {
          a.p(v, "updateListener");
          if (a.g(Looper.getMainLooper(), Looper.myLooper())) {
             w.f.add(v);
          }else {
             throw new IllegalStateException(w.a+" addUpdateListener not in main thread".toString());
          }
       }
       if (!PatchProxy.applyVoid(objArray, onPreDrawLis, uCommentView, "9")) {
          v = onPreDrawLis.V;
          CommentViewController w1 = onPreDrawLis.w;
          if (w1 == null) {
             a.S(str);
          }
          a.a(onPreDrawLis, new CommentViewController$setupGestureDetector$1(LiveLiteGestureService$DefaultImpls.a(v, w1, false, null, 4, null)));
       }
       if (!PatchProxy.applyVoid(objArray, onPreDrawLis, uCommentView, "7")) {
          onPreDrawLis.K.b(onPreDrawLis, new e(onPreDrawLis));
       }
       onPreDrawLis.L.b(onPreDrawLis, onPreDrawLis.t);
       return;
    }
    public void J2(){
       b b;
       a uoa = a.class;
       CommentViewController uCommentView = CommentViewController.class;
       Object[] objArray = null;
       String str = "6";
       if (PatchProxy.applyVoid(objArray, this, uCommentView, str)) {
          return;
       }
       LiveLogTag lIVE_LITE_CO = LiveLogTag.LIVE_LITE_COMMENT;
       b.Z(lIVE_LITE_CO, this.j+'('+this+"\) onDestroy");
       CommentViewController tn = this.n;
       Objects.requireNonNull(tn);
       if (!PatchProxy.applyVoid(objArray, tn, b.class, "5")) {
          b.Z(lIVE_LITE_CO, tn.a+" destroy");
          b i = tn.i;
          int i1 = 300;
          b = tn.b;
          if (b == null) {
             a.S("enterRoomACKListener");
          }
          i.o(i1, b);
       }
       f.f(this.C);
       tn = this.w;
       String str1 = "recyclerView";
       if (tn == null) {
          a.S(str1);
       }
       tn.removeOnScrollListener(this.z);
       tn = this.w;
       if (tn == null) {
          a.S(str1);
       }
       tn.setOnTouchListener(objArray);
       tn = this.q;
       CommentViewController tu = this.u;
       Objects.requireNonNull(tn);
       if (!PatchProxy.applyVoidOneRefs(tu, tn, uoa, "3")) {
          a.p(tu, "updateListener");
          if (a.g(Looper.getMainLooper(), Looper.myLooper())) {
             tn.f.remove(tu);
          }else {
             throw new IllegalStateException(tn.a+" removeUpdateListener not in main thread".toString());
          }
       }
       tn = this.q;
       Objects.requireNonNull(tn);
       if (!PatchProxy.applyVoid(objArray, tn, uoa, str)) {
          b.Z(lIVE_LITE_CO, tn.a+" destroy");
          f.f(tn.o);
       }
       CommentViewController tB = this.B;
       if (tB != null) {
          tB.dispose();
       }
       if (!PatchProxy.applyVoid(objArray, this, uCommentView, "17")) {
          ViewTreeObserver viewTreeObse = this.P2().getViewTreeObserver();
          if (viewTreeObse != null && viewTreeObse.isAlive()) {
             uCommentView = this.G;
             if (uCommentView == null) {
                a.S("preDrawListener");
             }
             viewTreeObse.removeOnPreDrawListener(uCommentView);
          }
       }
       return;
    }
    public void K2(){
       if (PatchProxy.applyVoid(null, this, CommentViewController.class, "4")) {
          return;
       }
       this.Y2();
       return;
    }
    public void L2(){
       CommentViewController uCommentView = CommentViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uCommentView, "3")) {
          return;
       }
       f uof = PatchProxy.apply(objArray, this, uCommentView, "18");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = new f(this);
       }
       this.H = uof;
       this.P2().getViewTreeObserver().addOnGlobalLayoutListener(this.H);
       return;
    }
    public void M2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CommentViewController.class, "2")) {
          return;
       }
       LiveLogTag lIVE_LITE_CO = LiveLogTag.LIVE_LITE_COMMENT;
       b.Z(lIVE_LITE_CO, this.j+'('+this+"\) onStart");
       CommentViewController tq = this.q;
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoid(objArray, tq, a.class, "4")) {
          b.Z(lIVE_LITE_CO, tq.a+" startUpdating");
          tq.p.u0(310, LiveStreamMessages$SCFeedPush.class, tq.g);
          if (tq.n != null) {
             b.Z(lIVE_LITE_CO, tq.a+" startUpdating observe the first comment");
             tq.p.u0(1036, LiveStreamMessages$SCCommentFeed.class, tq.h);
          }
          tq.b();
       }
       return;
    }
    public void N2(){
       Object[] objArray = null;
       String str = "5";
       if (PatchProxy.applyVoid(objArray, this, CommentViewController.class, str)) {
          return;
       }
       LiveLogTag lIVE_LITE_CO = LiveLogTag.LIVE_LITE_COMMENT;
       b.Z(lIVE_LITE_CO, this.j+'('+this+"\) onStop");
       CommentViewController tq = this.q;
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoid(objArray, tq, a.class, str)) {
          b.Z(lIVE_LITE_CO, tq.a+" stopUpdating");
          tq.p.o(310, tq.g);
          tq.c();
          f.f(tq.o);
       }
       return;
    }
    public final void Y2(){
       if (PatchProxy.applyVoid(null, this, CommentViewController.class, "19")) {
          return;
       }
       if (this.H == null) {
          return;
       }
       b.Z(LiveLogTag.LIVE_LITE_COMMENT, this.j+" removeContentViewHeightListener");
       this.P2().getViewTreeObserver().removeOnGlobalLayoutListener(this.H);
       this.H = null;
       return;
    }
    public final void Z2(){
       if (PatchProxy.applyVoid(null, this, CommentViewController.class, "15")) {
          return;
       }
       CommentViewController ty = this.y;
       String str = "layoutManager";
       if (ty == null) {
          a.S(str);
       }
       if (!ty.i0()) {
          ty = this.y;
          if (ty == null) {
             a.S(str);
          }
          int i = ty.c();
          CommentViewController tx = this.x;
          if (tx == null) {
             a.S("adapter");
          }
          if (i == CollectionsKt__CollectionsKt.G(tx.L0())) {
             LiveLogTag lIVE_LITE_CO = LiveLogTag.LIVE_LITE_COMMENT;
             b.Z(lIVE_LITE_CO, this.j+" updateFirstViewItemDecoration all items insight");
             tx = this.w;
             if (tx == null) {
                a.S("recyclerView");
             }
             RecyclerView$ViewHolder viewHolder = tx.findViewHolderForAdapterPosition(0);
             if (viewHolder != null) {
                viewHolder = viewHolder.itemView;
                if (viewHolder != null && this.A.f(viewHolder.getTop())) {
                   b.Z(lIVE_LITE_CO, this.j+" updateFirstViewItemDecoration firstItemTopSpace: "+viewHolder.getTop());
                   ty = this.x;
                   if (ty == null) {
                      a.S("adapter");
                   }
                   ty.l0(0);
                }
             }
          }else if(this.A.f(0)){
             b.Z(LiveLogTag.LIVE_LITE_COMMENT, this.j+" updateFirstViewItemDecoration remove space");
             ty = this.x;
             if (ty == null) {
                a.S("adapter");
             }
             ty.l0(0);
          }
          this.Y2();
       }else {
          goto label_0099 ;
       }
    label_00c6 :
       return;
    }
}
