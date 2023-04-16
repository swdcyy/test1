package com.yxcorp.gifshow.detail.slideplay.presenter.comment.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g7a.i0;
import g7a.w;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.d$a;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.d$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.List;
import brd.t;
import g7a.x;
import erd.g;
import crd.b;
import g7a.y;
import g7a.z;
import g7a.d0;
import g7a.e0;
import com.yxcorp.gifshow.util.rx.RxBus;
import rd5.b;
import g7a.b0;
import nk9.i;
import t45.d;
import brd.z;
import g7a.c0;
import vy6.a;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import wca.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import g7a.v;
import erd.r;
import g7a.a0;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.entity.QPhoto;
import gx9.l;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.nasa.scheme.action.NasaSlideSchemeAction;
import rd5.g;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.nasa.scheme.action.NasaSlideSchemeActionShowLikePanel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.model.CDNUrl;
import g7a.g0;
import io.reactivex.subjects.PublishSubject;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.nasa.scheme.action.NasaSlideSchemeActionShowCollectorListPanel;
import g7a.h0;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import android.view.View;
import java.lang.StringBuilder;
import android.view.Window;
import lnc.bb;
import com.yxcorp.utility.Log;
import ekd.c;
import com.kwai.component.tabs.panel.a;
import lnc.u1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;
import zm5.a;
import nk9.e;
import hda.a;
import com.yxcorp.gifshow.fansgroup.OpenCommentPanelEvent$FROM;
import org.greenrobot.eventbus.a;
import mvb.a;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import rf5.u;
import ro5.a;
import uo5.a;
import joc.a0;
import ge5.d;
import joc.z;
import im8.f;
import z1.k;
import g7a.u;
import com.kwai.component.tabs.panel.a$a;
import ekd.r0;
import al9.a;
import qvb.i;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Integer;
import yg5.r0;
import java.lang.Number;
import pk9.h;
import gx9.j;
import pk9.h$a;
import java.util.Collection;
import ekd.q;
import gx9.k;
import gx9.i;
import java.util.Collections;
import gx9.h;
import nk9.m;
import d0a.g;
import yy6.c;
import de5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.comment.e;
import ek9.t0;
import brd.y;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import xx9.a;
import com.kwai.feature.api.danmaku.c;
import mrd.a;
import b76.a;
import ak5.j;

public class d extends PresenterV2	// class@00185a
{
    public a A;
    public f B;
    public f C;
    public c D;
    public PhotoDetailParam E;
    public PublishSubject F;
    public a G;
    public u H;
    public PublishSubject I;
    public PublishSubject J;
    public PublishSubject K;
    public a L;
    public BaseFragment M;
    public e N;
    public t0 O;
    public y P;
    public MilanoContainerEventBus Q;
    public List R;
    public f S;
    public int T;
    public g U;
    public SlidePlayViewModel U0;
    public final i0 V;
    public final a V0;
    public d W;
    public final a W0;
    public a X;
    public final t0 X0;
    public boolean Y;
    public boolean Z;
    public PublishSubject p;
    public boolean q;
    public c r;
    public a s;
    public a t;
    public a u;
    public View v;
    public SwipeLayout w;
    public QPhoto x;
    public NasaBizParam y;
    public List z;

    public void d(){
       super();
       this.q = false;
       this.V = new i0();
       this.V0 = new w(this);
       this.W0 = new d$a(this);
       this.X0 = new d$b(this);
    }
    public void E8(){
       boolean b;
       d i;
       g og;
       SlidePlayViewModel slidePlayVie = this;
       d uod = d.class;
       Object[] objArray = null;
       String str = "4";
       if (PatchProxy.applyVoid(objArray, slidePlayVie, uod, str)) {
          return;
       }
       slidePlayVie.U0 = SlidePlayViewModel.S0(slidePlayVie.M.getParentFragment());
       slidePlayVie.R.add(slidePlayVie.X0);
       d s = slidePlayVie.s;
       if (s != null) {
          slidePlayVie.X7(s.distinctUntilChanged().subscribe(new x(slidePlayVie)));
       }
       s = slidePlayVie.t;
       if (s != null) {
          slidePlayVie.X7(s.distinctUntilChanged().subscribe(new y(slidePlayVie)));
       }
       slidePlayVie.X7(slidePlayVie.F.subscribe(new z(slidePlayVie)));
       slidePlayVie.X7(slidePlayVie.I.subscribe(new d0(slidePlayVie)));
       s = slidePlayVie.J;
       if (s != null) {
          slidePlayVie.X7(s.subscribe(new e0(slidePlayVie)));
       }
       RxBus f = RxBus.f;
       slidePlayVie.X7(f.f(b.class).subscribe(new b0(slidePlayVie)));
       z a = d.a;
       slidePlayVie.X7(f.f(i.class).observeOn(a).subscribe(new c0(slidePlayVie)));
       d u0 = slidePlayVie.U0;
       if (u0 != null) {
          u0.P(slidePlayVie.M, slidePlayVie.W0);
       }else {
          u0 = slidePlayVie.z;
          if (u0 != null) {
             u0.add(slidePlayVie.W0);
          }
       }
       if (PatchProxy.applyVoid(objArray, slidePlayVie, uod, "21") || (slidePlayVie.y.getNasaSlideParam().mIsFriendsNasaDetail != null && slidePlayVie.y.getNasaSlideParam().mIsNewsSlideNasaDetail != null)) {
          slidePlayVie.X7(f.g(n.class, RxBus$ThreadMode.MAIN).filter(new v(slidePlayVie)).observeOn(a).subscribe(new a0(slidePlayVie), Functions.d()));
       }
    label_00f9 :
       uod = slidePlayVie.V;
       NasaSlideParam mSchemeActio = slidePlayVie.y.getNasaSlideParam().mSchemeAction;
       b = l.a(slidePlayVie.x, slidePlayVie.y);
       i = slidePlayVie.I;
       Objects.requireNonNull(uod);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i0 oi0 = i0.class;
       if (!PatchProxy.isSupport(oi0) || !PatchProxy.applyVoidThreeRefs(mSchemeActio, Boolean.valueOf(b), i, uod, i0.class, "2")) {
          uod.a();
          String str1 = "";
          g0 og0 = 2;
          if (mSchemeActio.mType == og0) {
             if (PatchProxy.isSupport(oi0)) {
                og = PatchProxy.applyTwoRefs(mSchemeActio, Boolean.valueOf(b), uod, oi0, "3");
                if (og != patchProxyRe) {
                }else if(mSchemeActio.mHasConsume == null && b){
                   og = new g(0, objArray);
                   og.c = og0;
                   v9 = mSchemeActio instanceof NasaSlideSchemeActionShowLikePanel;
                   NasaSlideSchemeActionShowLikePanel nasaSlideSch1 = (og0)? mSchemeActio.mAnchorUserId: objArray;
                   if (!TextUtils.x(nasaSlideSch1)) {
                      User user1 = new User(nasaSlideSch1, null, null, null, null);
                   }else {
                      Object[] objArray1 = objArray;
                   }
                   og.e = b;
                   NasaSlideSchemeActionShowLikePanel mAggregateUi = (og0)? mSchemeActio.mAggregateUids: str1;
                   og.f = mAggregateUi;
                   og.d = false;
                }else {
                   og = objArray;
                }
             }else {
                goto label_014f ;
             }
             if (og != null) {
                og0 = new g0(uod, i, og, mSchemeActio);
                uod.a = og0;
                k1.r(og0, 1000);
             }
          }
          if (mSchemeActio.mType == 3) {
             h0 obj = PatchProxy.applyOneRefs(mSchemeActio, uod, oi0, str);
             if (obj != patchProxyRe) {
                objArray = obj;
             }else if(mSchemeActio.mHasConsume == null){
                g og1 = new g(0, objArray);
                og1.c = 11;
                v4 = mSchemeActio instanceof NasaSlideSchemeActionShowCollectorListPanel;
                NasaSlideSchemeActionShowCollectorListPanel nasaSlideSch = (og)? mSchemeActio.mAnchorUserId: objArray;
                if (!TextUtils.x(nasaSlideSch)) {
                   User user = new User(nasaSlideSch, null, null, null, null);
                }
                og1.e = objArray;
                if (og) {
                   str1 = mSchemeActio.mAggregateUids;
                }
                og1.f = str1;
                og1.d = false;
                objArray = og1;
             }
             if (objArray != null) {
                obj = new h0(uod, i, objArray, mSchemeActio);
                uod.a = obj;
                k1.r(obj, 1000);
             }
          }
       }
    label_01f2 :
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.w = w9.c(this.getActivity());
       View view = this.getActivity().findViewById(R.id.comment_container);
       this.v = view;
       if (view == null) {
          StringBuilder str = "";
          bb.a(this.getActivity().getWindow().getDecorView(), str);
          Log.d("NasaCommentPresenter", "error findView, viewTree = "+str);
       }else {
          c.c(view, "comment");
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "5")) {
          return;
       }
       d tX = this.X;
       if (tX != null && tX.d()) {
          this.X.j(false);
       }
       this.R.remove(this.X0);
       this.X = objArray;
       tX = this.U0;
       if (tX != null) {
          tX.D(this.M, this.W0);
       }else {
          tX = this.z;
          if (tX != null) {
             tX.remove(this.W0);
          }
       }
       u1.b(this);
       this.V.a();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       d tX = this.X;
       if (tX != null && !tX.g()) {
          Activity activity = this.getActivity();
          Objects.requireNonNull(activity);
          if (!this.X.h(activity.getSupportFragmentManager(), 0x7f0a084f)) {
             this.X.b();
          }
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, d.class, "11")) {
          return;
       }
       boolean b = true;
       InvalidGestureChecker.b(this.getContext(), b);
       if (this.X != null) {
          d tu = this.u;
          if (tu != null) {
             tu.b(b, 3);
          }
          RxBus f = RxBus.f;
          f.b(new e(false));
          d tU = this.U;
          if (tU != null && tU.i != null) {
             f.b(new a(OpenCommentPanelEvent$FROM.HALF_FANS_GROUP));
          }
          this.X.j(b);
          a.d().k(new a(2));
       }
       return;
    }
    public boolean S8(DetailCommonParam p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0.isFromCommentPush()) {
          return false;
       }
       if (!p0.isCommentPushFirst()) {
          return true;
       }
       p0.setCommentPushFirst(false);
       return false;
    }
    public void V8(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "15")) {
          return;
       }
       uod = this.U0;
       if (uod != null) {
          uod.d(p0, 5);
       }
       this.H.F(p0, 2);
       a.o(this.M, p0, 6);
       uod = this.w;
       if (uod != null) {
          uod.n(p0, 7);
       }
       a.c(this.getActivity(), p0, 3);
       uod = this.W;
       if (uod != null) {
          if (p0) {
             uod.b().g(3);
          }else {
             uod.b().a(3);
          }
       }
       uod = this.X;
       if (uod != null) {
          uod.l((p0 ^ 0x01));
       }
       return;
    }
    public void W8(){
       d x1;
       r0 or0;
       d obj;
       l ol1;
       PatchProxyResult patchProxyRe1;
       h oh;
       List list1;
       boolean b = this;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, uod, "9")) {
          return;
       }
       int b1 = false;
       InvalidGestureChecker.b(this.getContext(), b1);
       if (b.Y == null) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, b, uod, "8") && (b.X == null || b.q != null)) {
          b.q = b1;
          a uoa = b.S.get().get();
          b.X = uoa;
          uoa.k(b.R);
          b.X.i(new u(b));
       }
       d x = b.X;
       if (x != null && !x.d()) {
          x = b.u;
          int i = 3;
          if (x != null) {
             x.b(b1, i);
          }
          RxBus f = RxBus.f;
          f.b(new e(true));
          if (b.Z != null && r0.d(this.getContext())) {
             b.G.p0();
             b.G.clear();
             b.G.a();
          }
          b.Z = b1;
          if (b.G.isEmpty() || (b.G.K() && !b.G.isLoading())) {
             b.G.j0();
          }
          if (!PatchProxy.applyVoid(objArray, b, uod, "10")) {
             x1 = b.v;
             if (x1 != null) {
                x1.setVisibility(b1);
                b.v.setTranslationY(0);
             }
          }
          this.P8();
          x1 = b.X;
          d t = b.T;
          List list = x1.m();
          d y = b.y;
          d u = b.U;
          d x2 = b.x;
          boolean b2 = b.S8(b.E.getDetailCommonParam());
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          l ol = l.class;
          if (PatchProxy.isSupport(ol)) {
             Object[] objArray1 = new Object[]{Integer.valueOf(t),list,y,u,x2,Boolean.valueOf(b2)};
             or0 = PatchProxy.apply(objArray1, objArray, ol, "2");
             if (or0 != patchProxyRe) {
             label_0228 :
                if (!x1.c(true, or0)) {
                   b.X.b();
                }
                if (!PatchProxy.applyVoid(null, b, uod, "20")) {
                   b.x.setAlreadyShowGodComment(true);
                   f.b(new g());
                   if (b.x.isNeedShowGodComment()) {
                      b.x.setNeedShowGodComment(false);
                   }
                }
             }
          }
          or0 = new r0();
          or0.b(l.a, Integer.valueOf(t));
          if (PatchProxy.isSupport(ol)) {
             obj = PatchProxy.applyTwoRefs(Integer.valueOf(t), y, objArray, ol, "5");
             if (obj != patchProxyRe) {
                b1 = obj.intValue();
             }else if(y != null && (y.getNasaSlideParam().mIsFriendsNasaDetail != null || (y.getNasaSlideParam().isEnableReceiveLikeComment() && (t != true && (t != null && (t != 11 && t != 9)))))){
                switch (t){
                    case 2:
                      break;
                    case 3:
                    case 5:
                      b1 = 3001;
                      break;
                    case 4:
                    case 6:
                      b1 = 5001;
                      break;
                    case 7:
                      b1 = 2001;
                      break;
                    case 9:
                      b1 = 7001;
                      break;
                    case 10:
                      b1 = 6050;
                      break;
                    case 11:
                      b1 = 6001;
                      break;
                    default:
                   label_0156 :
                      b1 = 1001;
                }
             }
             b1 = 4001;
          }else {
             goto label_0132 ;
          }
          or0.e(b1);
          or0.a(u);
          or0.a(list);
          if (PatchProxy.isSupport(ol)) {
             ol1 = ol;
             patchProxyRe1 = patchProxyRe;
             obj = x2;
             t = u;
             h obj1 = PatchProxy.applyThreeRefs(u, x2, Boolean.valueOf(b2), null, l.class, "1");
             if (obj1 != patchProxyRe1) {
                oh = obj1;
             }else if(t == null){
                if (t.c == true) {
                   oh = new h(j.a);
                }else if(!q.f(t.j) || t.b != null){
                   g b4 = t.b;
                   b4 = (b4 == null)? t.j: Collections.singletonList(b4.mId);
                   obj1 = new h(new h(b4));
                   boolean b5 = (b4.size() == 1)? true: false;
                   obj1.f(b5);
                   obj1.d(b4);
                   obj1.h = true;
                   oh = obj1;
                }else if(obj.hasGodCommentShow() && (obj.isNeedShowGodComment() && t.a == true)){
                   oh = new h(k.a);
                }else if(b2){
                   oh = new h(i.a);
                }
             }
             oh = null;
          }else {
             ol1 = ol;
             patchProxyRe1 = patchProxyRe;
             obj = x2;
             t = u;
             goto label_019d ;
          }
          or0.a(oh);
          m om = PatchProxy.applyOneRefs(t, null, ol1, "3");
          if (om != patchProxyRe1) {
          }else {
             om = new m();
             boolean b3 = (t != null && t.c == true)? true: false;
             om.c = b3;
          }
          or0.a(om);
          goto label_0228 ;
       }
    label_0258 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_EDITOR_SHOW_STATE_CHANGE");
       this.x = this.q8(QPhoto.class);
       this.y = this.q8(NasaBizParam.class);
       this.z = this.t8("DETAIL_ATTACH_LISTENERS");
       this.B = this.x8("DETAIL_LOGGER");
       this.C = this.x8("LOG_LISTENER");
       this.D = this.q8(c.class);
       this.E = this.q8(PhotoDetailParam.class);
       this.F = this.r8("DETAIL_ADD_COMMENT_FRAGMENT");
       this.G = this.q8(a.class);
       this.H = this.q8(u.class);
       this.I = this.r8("SLIDE_PLAY_SHOW_COMMENT_DIALOG");
       this.K = this.r8("DETAIL_SLIDE_COMMENT_FRAGMENT_VISIBLE");
       this.L = this.q8(a.class);
       this.M = this.r8("DETAIL_FRAGMENT");
       this.N = this.r8("COMMENT_HELPER");
       this.O = this.r8("COMMENT_GLOBAL_ACTION");
       this.R = this.r8("SLIDE_PLAY_COMMENT_PANEL_STATE_LISTENER_LIST");
       this.S = this.x8("NASA_COMMENT_TAB_SUPPLIER_REF");
       this.P = this.t8("ENABLE_PICTURE_IN_PICTURE_MODE_OBSERVER");
       this.Q = this.s8(MilanoContainerEventBus.class);
       this.A = this.t8("DETAIL_SCREEN_CLEAN_STATUS");
       this.J = this.t8("SLIDE_PLAY_HIDE_COMMENT_DIALOG");
       this.W = this.t8("PHOTO_ROOTVIEW_TOUCH_MANAGER");
       this.r = this.t8("FRAGMENT_BARRAGE_KIT_WRAPPER");
       this.s = this.t8("COMMENT_PANEL_SHOW_DANMAKU_LIST");
       this.t = this.t8("COMMENT_PANEL_SHOW_SUMMARY_LIST");
       this.u = this.t8("DETAIL_PLAY_SCENE_RECORD");
       return;
    }
    public void onEventMainThread(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "16")) {
          return;
       }
       j.o().d();
       return;
    }
}
