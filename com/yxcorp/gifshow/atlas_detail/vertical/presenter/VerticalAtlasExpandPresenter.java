package com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter;
import im8.g;
import com.smile.gifmaker.mvps.presenter.a;
import e1a.e;
import lnc.a1;
import java.util.LinkedList;
import java.util.Random;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter$c;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter$b;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter$mExpandRootViewLayoutVisibleListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter$a;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter$d;
import e8a.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ekd.i;
import android.app.Application;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.animation.Animator$AnimatorListener;
import java.lang.Boolean;
import joc.z;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import android.view.Window;
import lnc.i5;
import java.lang.Float;
import android.os.SystemClock;
import nsd.r0;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.google.common.base.Optional;
import java.util.Arrays;
import uf5.x;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPreInfo;
import com.yxcorp.gifshow.entity.QPhoto;
import de5.a;
import p5a.e;
import com.kwai.framework.player.core.b;
import java.util.Queue;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.RenderMode;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import t9a.b;
import android.view.ViewConfiguration;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import com.yxcorp.gifshow.atlas_detail.horizontal.InnerAtlasFrameLayout;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter$mExpandRootViewLayoutVisibleListener$2$a;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2$a;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter$e;
import java.lang.Runnable;
import com.yxcorp.gifshow.util.cdnresource.f;
import ekd.m1;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import java.lang.Integer;
import n99.o;
import java.util.Map;
import java.util.HashMap;
import im8.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;

public final class VerticalAtlasExpandPresenter extends a implements g	// class@001bd8
{
    public KwaiActionBar A;
    public View B;
    public long C;
    public boolean D;
    public Bitmap E;
    public Canvas F;
    public PhotosScaleHelpView G;
    public SlideLongAtlasRecyclerView H;
    public FrameLayout I;
    public a J;
    public SwipeLayout K;
    public e L;
    public int M;
    public int N;
    public final Queue O;
    public int P;
    public final Random Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final int U0;
    public boolean V;
    public int V0;
    public boolean W;
    public final PublishSubject W0;
    public boolean X;
    public final y X0;
    public View Y;
    public final VerticalAtlasExpandPresenter$b Y0;
    public Set Z;
    public final p Z0;
    public final p a1;
    public final c b1;
    public final PhotosScaleHelpView$c c1;
    public QPhoto r;
    public BaseFragment s;
    public Set t;
    public PhotoDetailParam u;
    public NormalDetailBizParam v;
    public a w;
    public ViewGroup x;
    public f y;
    public View z;

    public void VerticalAtlasExpandPresenter(){
       super();
       this.L = new e();
       this.N = a1.e(200.00f);
       this.O = new LinkedList();
       this.Q = new Random();
       this.V = true;
       this.W = true;
       this.U0 = a1.e(52.50f);
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Int>\(\)");
       this.W0 = publishSubje;
       this.X0 = new VerticalAtlasExpandPresenter$c(this);
       this.Y0 = new VerticalAtlasExpandPresenter$b(this);
       this.Z0 = s.c(new VerticalAtlasExpandPresenter$mExpandRootViewLayoutVisibleListener$2(this));
       this.a1 = s.c(new VerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2(this));
       this.b1 = new VerticalAtlasExpandPresenter$a(this);
       this.c1 = new VerticalAtlasExpandPresenter$d(this);
       this.U7(new r());
    }
    public void E8(){
       int i;
       VerticalAtlasExpandPresenter verticalAtla = VerticalAtlasExpandPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, verticalAtla, "5")) {
          return;
       }
       if (this.K == null) {
          this.K = w9.c(this.getActivity());
       }
       this.T = n.u(a.B);
       VerticalAtlasExpandPresenter tZ = this.Z;
       if (tZ != null) {
          tZ.add(this.X0);
       }
       tZ = this.t;
       if (tZ == null) {
          a.S("mDoubleClickContentListeners");
       }
       tZ.add(this.b1);
       tZ = this.U0;
       Object obj = PatchProxy.apply(objArray, this, verticalAtla, "28");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else if(i.c()){
          i = n.A(a.b());
       }else {
          i = 0;
       }
       this.V0 = tZ + i;
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VerticalAtlasExpandPresenter.class, "6")) {
          return;
       }
       VerticalAtlasExpandPresenter tH = this.H;
       if (tH != null) {
          tH.setAdapter(objArray);
       }
       tH = this.I;
       if (tH != null) {
          ViewPropertyAnimator viewProperty = tH.animate();
          if (viewProperty != null) {
             viewProperty.setListener(objArray);
          }
       }
       tH = this.t;
       if (tH == null) {
          a.S("mDoubleClickContentListeners");
       }
       tH.remove(this.b1);
       return;
    }
    public final boolean R8(String p0){
       Activity activity;
       VerticalAtlasExpandPresenter verticalAtla = VerticalAtlasExpandPresenter.class;
       VerticalAtlasExpandPresenter obj = PatchProxy.applyOneRefs(p0, this, verticalAtla, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = this.S + this.V0;
       VerticalAtlasExpandPresenter tR = this.R;
       if (i < tR) {
          this.h9((i - tR));
       }
       obj = this.K;
       if (obj != null) {
          obj.n(true, 5);
       }
       obj = this.K;
       if (obj != null) {
          z touchDetecto = obj.getTouchDetector();
          if (touchDetecto != null) {
             touchDetecto.g(true);
          }
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, verticalAtla, "20") && this.J != null) {
          Activity activity1 = this.getActivity();
          Objects.requireNonNull(activity1, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          activity1.l3(this.J);
       }
       this.c9(false);
       this.a2(p0);
       activity = this.getActivity();
       if (activity != null) {
          objArray = activity.getWindow();
       }
       i5.j(objArray, -1);
       this.b9(true);
       return true;
    }
    public final void S8(float p0,float p1){
       VerticalAtlasExpandPresenter verticalAtla = VerticalAtlasExpandPresenter.class;
       if (PatchProxy.isSupport(verticalAtla) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, verticalAtla, "8")) {
          return;
       }
       this.C = SystemClock.elapsedRealtime();
       this.D = true;
       this.V8(p0, p1);
       return;
    }
    public final void V8(float p0,float p1){
       String str;
       VerticalAtlasExpandPresenter x;
       int i1;
       String likeActivity;
       QPreInfo mPreExpTag;
       VerticalAtlasExpandPresenter verticalAtla = this;
       VerticalAtlasExpandPresenter verticalAtla1 = VerticalAtlasExpandPresenter.class;
       if (PatchProxy.isSupport(verticalAtla1) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, verticalAtla1, "7")) {
          return;
       }
       float f = 0;
       boolean b = true;
       if (!PatchProxy.isSupport(verticalAtla1) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, this, verticalAtla1, "10")) {
          i1 = 2;
          Object[] objArray = new Object[i1];
          x = verticalAtla.u;
          String str1 = "mPhotoDetailParam";
          if (x == null) {
             a.S(str1);
          }
          PhotoDetailParam mDetailCommo = x.mDetailCommonParam;
          String str2 = "mPhotoDetailParam.mDetailCommonParam";
          a.o(mDetailCommo, str2);
          String str3 = "_";
          objArray[f] = Optional.fromNullable(mDetailCommo.getPreUserId()).or(str3);
          x = verticalAtla.u;
          if (x == null) {
             a.S(str1);
          }
          mDetailCommo = x.mDetailCommonParam;
          a.o(mDetailCommo, str2);
          objArray[b] = Optional.fromNullable(mDetailCommo.getPrePhotoId()).or(str3);
          String str4 = String.format("%s/%s", Arrays.copyOf(objArray, i1));
          a.o(str4, "java.lang.String.format\(format, *args\)");
          GifshowActivity activity = this.getActivity();
          if (activity != null) {
             x = verticalAtla.r;
             if (x == null) {
                a.S("mPhoto");
             }
             str = activity.getUrl()+"#doublelike";
             VerticalAtlasExpandPresenter u = verticalAtla.u;
             if (u == null) {
                a.S(str1);
             }
             if (u.mDetailCommonParam.mPreInfo != null) {
                u = verticalAtla.u;
                if (u == null) {
                   a.S(str1);
                }
                mPreExpTag = u.mDetailCommonParam.mPreInfo.mPreExpTag;
             }else {
                mPreExpTag = null;
             }
             x ox = new x(x, str, mPreExpTag, str4);
             Activity uActivity = this.getActivity();
             VerticalAtlasExpandPresenter w = verticalAtla.w;
             str = "mPlayModule";
             if (w == null) {
                a.S(str);
             }
             likeActivity = w.c();
             w = verticalAtla.w;
             if (w == null) {
                a.S(str);
             }
             e player = w.getPlayer();
             a.o(player, "mPlayModule.player");
             ox.b(uActivity, true, likeActivity, player.getCurrentPosition());
          }
       }
       if (!PatchProxy.isSupport(verticalAtla1) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, verticalAtla1, "11")) {
          int i = -1;
          float f1 = (float)i;
          if (p0 - f1 > 0 && p1 - f1 > 0) {
             f = Float.MIN_VALUE;
          }
          VerticalAtlasExpandPresenter n = verticalAtla.N;
          LottieAnimationView lottieAnimat = verticalAtla.O.poll();
          str = "mLikeAnimParent";
          if (lottieAnimat == null) {
             if (verticalAtla.P != 16) {
                lottieAnimat = new LottieAnimationView(this.getActivity());
                lottieAnimat.setRenderMode(RenderMode.HARDWARE);
                lottieAnimat.k(b);
                x = verticalAtla.x;
                if (x == null) {
                   a.S(str);
                }
                x.addView(lottieAnimat, new FrameLayout$LayoutParams(verticalAtla.N, verticalAtla.N));
                verticalAtla.P = verticalAtla.P + b;
             }
          }
          ViewGroup$LayoutParams layoutParams = lottieAnimat.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
          layoutParams.width = n;
          layoutParams.height = n;
          float f2 = 2.00f;
          if (f) {
             f = (float)n;
             lottieAnimat.setTranslationX((p0 - (f / f2)));
             lottieAnimat.setTranslationY((p1 - (f * 0x3f2e147b)));
             lottieAnimat.setRotation((float)this.Y8());
             layoutParams.gravity = i;
          }else {
             lottieAnimat.setTranslationX(0);
             lottieAnimat.setTranslationY(0);
             lottieAnimat.setRotation(0);
             layoutParams.gravity = 17;
          }
          lottieAnimat.setLayoutParams(layoutParams);
          this.d9(lottieAnimat);
          verticalAtla1 = verticalAtla.r;
          if (verticalAtla1 == null) {
             a.S("mPhoto");
          }
          if (!r1.s2(verticalAtla1.mEntity)) {
             float f3 = (float)n;
             i1 = (int)(p0 - (f3 / f2));
             int i2 = (int)(p1 - (f3 * 0.30f));
             VerticalAtlasExpandPresenter x1 = verticalAtla.x;
             if (x1 == null) {
                a.S(str);
             }
             verticalAtla1 = verticalAtla.r;
             if (verticalAtla1 == null) {
                a.S("mPhoto");
             }
             likeActivity = verticalAtla1.getLikeActivityResourceId();
             VerticalAtlasExpandPresenter r = verticalAtla.r;
             if (r == null) {
                a.S("mPhoto");
             }
             b.b(i1, i2, n, n, 0xbf800000, x1, likeActivity, r);
          }
       }
    label_01d0 :
       return;
    }
    public final ViewGroup W8(){
       Activity obj = PatchProxy.apply(null, this, VerticalAtlasExpandPresenter.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getActivity();
       a.m(obj);
       View view = obj.findViewById(0x1020002);
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       return view;
    }
    public final PublishSubject X8(){
       return this.W0;
    }
    public final int Y8(){
       Object obj = PatchProxy.apply(null, this, VerticalAtlasExpandPresenter.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.Q.nextInt(53) - 26);
    }
    public final boolean Z8(){
       Object obj = PatchProxy.apply(null, this, VerticalAtlasExpandPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = ((SystemClock.elapsedRealtime() - this.C) - (long)ViewConfiguration.getJumpTapTimeout() < 0)? true: false;
       return b;
    }
    public final void a2(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalAtlasExpandPresenter.class, "22")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "ALBUM_CLICK_TO_VIEW_ALL";
       i3 oi3 = i3.f();
       oi3.d("click_type", p0);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       VerticalAtlasExpandPresenter tr = this.r;
       if (tr == null) {
          a.S("mPhoto");
       }
       uContentPack.photoPackage = w1.f(tr.mEntity);
       u1.B(new ClickMetaData().setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack));
       return;
    }
    public final void a9(LottieAnimationView p0,Animator$AnimatorListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VerticalAtlasExpandPresenter.class, "14")) {
          return;
       }
       p0.v(p1);
       p0.setVisibility(4);
       this.O.offer(p0);
       int i = this.M - 1;
       this.M = i;
       if (!i) {
          VerticalAtlasExpandPresenter tL = this.L;
          tL.c(tL.a, false);
       }
       return;
    }
    public final void b9(boolean p0){
       VerticalAtlasExpandPresenter verticalAtla = VerticalAtlasExpandPresenter.class;
       if (PatchProxy.isSupport(verticalAtla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, verticalAtla, "31")) {
          return;
       }
       if (i.c()) {
          Activity activity = this.getActivity();
          a.m(activity);
          i.a(activity, 0, p0);
       }
       return;
    }
    public final void c9(boolean p0){
       VerticalAtlasExpandPresenter tI1;
       ViewPropertyAnimator viewProperty;
       Object obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       VerticalAtlasExpandPresenter verticalAtla = VerticalAtlasExpandPresenter.class;
       if (PatchProxy.isSupport(verticalAtla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, verticalAtla, "21")) {
          return;
       }
       long l = 300;
       VerticalAtlasExpandPresenter tI = this.I;
       if (!tI instanceof InnerAtlasFrameLayout) {
          tI = null;
       }
       if (tI != null) {
          tI.setTouchAble(p0);
       }
       float f = 0;
       if (p0) {
          tI1 = this.I;
          if (tI1 != null) {
             tI1.setAlpha(f);
             tI1.setVisibility(0);
             viewProperty = tI1.animate().alpha(0x3f800000).setDuration(l);
             obj = PatchProxy.apply(null, this, verticalAtla, "1");
             if (obj != patchProxyRe) {
             }else {
                obj = this.Z0.getValue();
             }
             viewProperty.setListener(obj);
          }
       }else {
          tI1 = this.G;
          if (tI1 != null) {
             tI1.setEnabled(0);
          }
          tI1 = this.I;
          if (tI1 != null) {
             viewProperty = tI1.animate();
             if (viewProperty != null) {
                viewProperty = viewProperty.alpha(f);
                if (viewProperty != null) {
                   viewProperty = viewProperty.setDuration(l);
                   if (viewProperty != null) {
                      obj = PatchProxy.apply(null, this, verticalAtla, "2");
                      if (obj != patchProxyRe) {
                      }else {
                         obj = this.a1.getValue();
                      }
                      viewProperty.setListener(obj);
                   }
                }
             }
          }
       }
    label_0090 :
       return;
    }
    public final void d9(LottieAnimationView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalAtlasExpandPresenter.class, "13")) {
          return;
       }
       p0.t();
       p0.f();
       p0.setVisibility(4);
       VerticalAtlasExpandPresenter tr = this.r;
       if (tr == null) {
          a.S("mPhoto");
       }
       f.d(tr.getLikeActivityResourceId(), p0, CdnResource$ResourceKey.detail_center_like_b, R.raw.arg_RES_7f0f000e, new VerticalAtlasExpandPresenter$e(this, p0));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalAtlasExpandPresenter.class, "4")) {
          return;
       }
       View view = m1.f(p0, R.id.atlas_content_container);
       a.o(view, "ViewBindUtils.bindWidget¡­.atlas_content_container\)");
       this.z = view;
       p0 = m1.f(p0, R.id.title_root);
       a.o(p0, "ViewBindUtils.bindWidget¡­ootView, R.id.title_root\)");
       this.A = p0;
       return;
    }
    public final void e9(int p0){
       VerticalAtlasExpandPresenter verticalAtla = VerticalAtlasExpandPresenter.class;
       if (PatchProxy.isSupport(verticalAtla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, verticalAtla, "27")) {
          return;
       }
       verticalAtla = this.H;
       if (verticalAtla != null) {
          verticalAtla.scrollBy(0, p0);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VerticalAtlasExpandPresenter.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, VerticalAtlasExpandPresenter.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(VerticalAtlasExpandPresenter.class, new o());
       }else {
          obj.put(VerticalAtlasExpandPresenter.class, null);
       }
       return obj;
    }
    public final void h9(int p0){
       VerticalAtlasExpandPresenter verticalAtla = VerticalAtlasExpandPresenter.class;
       if (PatchProxy.isSupport(verticalAtla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, verticalAtla, "26")) {
          return;
       }
       verticalAtla = this.y;
       if (verticalAtla == null) {
          a.S("mOuterSlideLongAtlasRecyclerView");
       }
       verticalAtla.get().scrollBy(0, p0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, VerticalAtlasExpandPresenter.class, "3")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.r = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.s = obj;
       obj = this.r8("DETAIL_DOUBLE_CLICK_LISTENERS");
       a.o(obj, "inject\(AccessIds.DETAIL_DOUBLE_CLICK_LISTENERS\)");
       this.t = obj;
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.u = obj;
       obj = this.q8(NormalDetailBizParam.class);
       a.o(obj, "inject\(NormalDetailBizParam::class.java\)");
       this.v = obj;
       obj = this.q8(a.class);
       a.o(obj, "inject\(DetailPlayModule::class.java\)");
       this.w = obj;
       obj = this.x8("DETAIL_COMMENT_RECYCLER_VIEW");
       a.o(obj, "injectRef\(AccessIds.DETAIL_COMMENT_RECYCLER_VIEW\)");
       this.y = obj;
       this.Z = this.r8("DETAIL_SCROLL_LISTENERS");
       return;
    }
}
