package com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter$c;
import com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter$e;
import com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter$b;
import com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter$gestureDetector$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import android.graphics.Bitmap;
import java.lang.Float;
import android.os.SystemClock;
import java.util.Collection;
import java.util.List;
import ze5.a;
import android.view.GestureDetector;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import w85.a;
import wh5.c;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import android.view.MotionEvent;
import java.lang.Number;
import java.lang.Math;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView;
import xx9.a;
import rf5.u;
import android.view.ViewConfiguration;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import android.content.Context;
import androidx.core.content.ContextCompat;
import android.content.res.Resources;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.entity.QPhoto;
import x85.a;
import im8.f;
import io.reactivex.subjects.PublishSubject;
import d6a.e;
import ge5.d;
import r7a.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import mrd.a;
import brd.y;

public abstract class SlidePlayAtlasBaseTouchPresenter extends PresenterV2	// class@00183a
{
    public final PhotosScaleHelpView$c A;
    public final a B;
    public long C;
    public boolean D;
    public SlidePlayViewModel E;
    public QPhoto F;
    public a G;
    public PhotoDetailParam H;
    public NasaBizParam I;
    public PublishSubject J;
    public List K;
    public a L;
    public PublishSubject M;
    public f N;
    public u O;
    public d P;
    public f Q;
    public BaseFragment R;
    public View S;
    public TextView T;
    public PhotosScaleHelpView U;
    public final RecyclerView$r U0;
    public SlideHorizontalAtlasPlayer V;
    public a W;
    public a X;
    public y Y;
    public final p Z;
    public Canvas p;
    public Bitmap q;
    public int r;
    public int s;
    public float t;
    public boolean u;
    public boolean v;
    public float w;
    public boolean x;
    public boolean y;
    public ScaleHelpView$a z;
    public static final SlidePlayAtlasBaseTouchPresenter$a V0;

    static {
       SlidePlayAtlasBaseTouchPresenter.V0 = new SlidePlayAtlasBaseTouchPresenter$a(null);
    }
    public void SlidePlayAtlasBaseTouchPresenter(){
       super();
       this.z = new SlidePlayAtlasBaseTouchPresenter$c(this);
       this.A = new SlidePlayAtlasBaseTouchPresenter$e(this);
       this.B = new SlidePlayAtlasBaseTouchPresenter$b(this);
       this.Z = s.c(new SlidePlayAtlasBaseTouchPresenter$gestureDetector$2(this));
       this.U0 = new SlidePlayAtlasBaseTouchPresenter$d(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, SlidePlayAtlasBaseTouchPresenter.class, "24")) {
          return;
       }
       SlidePlayAtlasBaseTouchPresenter tR = this.R;
       String str = "currentFragment";
       if (tR == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tR.getParentFragment());
       a.o(slidePlayVie, "SlidePlayViewModel.get\(c¡­tFragment.parentFragment\)");
       this.E = slidePlayVie;
       if (slidePlayVie == null) {
          a.S("slidePlayViewModel");
       }
       SlidePlayAtlasBaseTouchPresenter tR1 = this.R;
       if (tR1 == null) {
          a.S(str);
       }
       slidePlayVie.P(tR1, this.B);
       tR = this.V;
       str = "atlasRV";
       if (tR == null) {
          a.S(str);
       }
       tR.setVisibility(0);
       tR = this.V;
       if (tR == null) {
          a.S(str);
       }
       tR.addOnScrollListener(this.U0);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, SlidePlayAtlasBaseTouchPresenter.class, "25")) {
          return;
       }
       SlidePlayAtlasBaseTouchPresenter tV = this.V;
       if (tV == null) {
          a.S("atlasRV");
       }
       tV.removeOnScrollListener(this.U0);
       tV = this.E;
       if (tV == null) {
          a.S("slidePlayViewModel");
       }
       SlidePlayAtlasBaseTouchPresenter tR = this.R;
       if (tR == null) {
          a.S("currentFragment");
       }
       tV.D(tR, this.B);
       tV = this.q;
       if (tV != null && !tV.isRecycled()) {
          tV = this.q;
          if (tV != null) {
             tV.recycle();
          }
          this.q = null;
       }
       return;
    }
    public final void P8(float p0,float p1){
       SlidePlayAtlasBaseTouchPresenter slidePlayAtl = SlidePlayAtlasBaseTouchPresenter.class;
       if (PatchProxy.isSupport(slidePlayAtl) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, slidePlayAtl, "39")) {
          return;
       }
       this.C = SystemClock.elapsedRealtime();
       this.D = true;
       int i = 0;
       SlidePlayAtlasBaseTouchPresenter tK = this.K;
       if (tK == null) {
          a.S("slideLikeEventListeners");
       }
       int i1 = tK.size();
       for (; i < i1; i = i + 1) {
          SlidePlayAtlasBaseTouchPresenter tK1 = this.K;
          if (tK1 == null) {
             a.S("slideLikeEventListeners");
          }
          tK1.get(i).K(p0, p1);
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, SlidePlayAtlasBaseTouchPresenter.class, "36")) {
          return;
       }
       SlidePlayAtlasBaseTouchPresenter tU = this.U;
       String str = "scaleHelpView";
       if (tU == null) {
          a.S(str);
       }
       tU.e(this.Y8());
       tU = this.U;
       if (tU == null) {
          a.S(str);
       }
       tU.setScaleEnabled(false);
       return;
    }
    public final boolean S8(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SlidePlayAtlasBaseTouchPresenter slidePlayAtl = SlidePlayAtlasBaseTouchPresenter.class;
       Object obj = PatchProxy.apply(null, this, slidePlayAtl, "32");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!NasaExperimentUtils.n()) {
          Object obj1 = PatchProxy.apply(null, this, slidePlayAtl, "33");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             SlidePlayAtlasBaseTouchPresenter tG = this.G;
             if (tG == null) {
                a.S("detailVMParam");
             }
             if (tG.g()) {
                tG = this.E;
                if (tG == null) {
                   a.S("slidePlayViewModel");
                }
                if (tG.b1()) {
                   b1 = true;
                }
             }
             b1 = false;
          }
          if (b1 || (!c.b() && !VisitorModeManager.f())) {
          label_005e :
             return b;
          }
       }
    label_005d :
       b = true;
       goto label_005e ;
    }
    public final float V8(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlidePlayAtlasBaseTouchPresenter.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)Math.sqrt((double)(((p0.getX(1) - p0.getX(0)) * (p0.getX(1) - p0.getX(0))) + ((p0.getY(1) - p0.getY(0)) * (p0.getY(1) - p0.getY(0)))));
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, SlidePlayAtlasBaseTouchPresenter.class, "35")) {
          return;
       }
       SlidePlayAtlasBaseTouchPresenter tU = this.U;
       String str = "scaleHelpView";
       if (tU == null) {
          a.S(str);
       }
       tU.setScaleEnabled(true);
       tU = this.U;
       if (tU == null) {
          a.S(str);
       }
       tU.j(this.Y8());
       return;
    }
    public final SlideHorizontalAtlasPlayer X8(){
       SlidePlayAtlasBaseTouchPresenter obj = PatchProxy.apply(null, this, SlidePlayAtlasBaseTouchPresenter.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.V;
       if (obj == null) {
          a.S("atlasRV");
       }
       return obj;
    }
    public final GestureDetector Y8(){
       Object obj = PatchProxy.apply(null, this, SlidePlayAtlasBaseTouchPresenter.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Z.getValue();
    }
    public final PhotosScaleHelpView Z8(){
       SlidePlayAtlasBaseTouchPresenter obj = PatchProxy.apply(null, this, SlidePlayAtlasBaseTouchPresenter.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.U;
       if (obj == null) {
          a.S("scaleHelpView");
       }
       return obj;
    }
    public final a a9(){
       SlidePlayAtlasBaseTouchPresenter obj = PatchProxy.apply(null, this, SlidePlayAtlasBaseTouchPresenter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.L;
       if (obj == null) {
          a.S("screenCleanStatusCombination");
       }
       return obj;
    }
    public final u b9(){
       SlidePlayAtlasBaseTouchPresenter obj = PatchProxy.apply(null, this, SlidePlayAtlasBaseTouchPresenter.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.O;
       if (obj == null) {
          a.S("swipeToProfileFeedMovement");
       }
       return obj;
    }
    public final boolean c9(){
       Object obj = PatchProxy.apply(null, this, SlidePlayAtlasBaseTouchPresenter.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = ((SystemClock.elapsedRealtime() - this.C) - (long)ViewConfiguration.getJumpTapTimeout() < 0)? true: false;
       return b;
    }
    public void d9(){
       if (PatchProxy.applyVoid(null, this, SlidePlayAtlasBaseTouchPresenter.class, "27")) {
          return;
       }
       SlidePlayAtlasBaseTouchPresenter tV = this.V;
       if (tV == null) {
          a.S("atlasRV");
       }
       tV.setVisibility(0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayAtlasBaseTouchPresenter.class, "23")) {
          return;
       }
       View view = m1.f(p0, R.id.open_long_atlas);
       a.o(view, "ViewBindUtils.bindWidget¡­ew, R.id.open_long_atlas\)");
       this.S = view;
       view = m1.f(p0, R.id.out_mask);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.out_mask\)");
       this.U = view;
       p0 = m1.f(p0, R.id.autoplay_cover_view_page_style);
       a.o(p0, "ViewBindUtils.bindWidget¡­ay_cover_view_page_style\)");
       this.V = p0;
       if (!NasaExperimentUtils.n()) {
          TextView textView = new TextView(this.getContext());
          this.T = textView;
          Context context = this.getContext();
          a.m(context);
          textView.setTextColor(ContextCompat.getColor(context, R.color.arg_RES_7f0620c7));
          SlidePlayAtlasBaseTouchPresenter tT = this.T;
          String str = "scaleCleanTips";
          if (tT == null) {
             a.S(str);
          }
          tT.setTextSize(14.00f);
          tT = this.T;
          if (tT == null) {
             a.S(str);
          }
          context = this.getContext();
          a.m(context);
          a.o(context, "context!!");
          Resources resources = context.getResources();
          int i = (NasaSlidePlayExperimentUtil.e())? 0x7f0802b3: 0x7f0802b2;
          tT.setBackground(resources.getDrawable(i));
       }
       return;
    }
    public void e9(){
    }
    public final QPhoto getPhoto(){
       SlidePlayAtlasBaseTouchPresenter obj = PatchProxy.apply(null, this, SlidePlayAtlasBaseTouchPresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.F;
       if (obj == null) {
          a.S("photo");
       }
       return obj;
    }
    public void h9(MotionEvent p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayAtlasBaseTouchPresenter.class, "26")) {
          return;
       }
       a.p(p0, "e");
       SlidePlayAtlasBaseTouchPresenter tE = this.E;
       if (tE == null) {
          a.S("slidePlayViewModel");
       }
       if (tE.C()) {
          tE = this.G;
          if (tE == null) {
             a.S("detailVMParam");
          }
          if (tE.b().b()) {
             tE = this.N;
             if (tE == null) {
                a.S("isBigMarqueeLongClickingRef");
             }
             if (!tE.get().booleanValue()) {
                tE = this.M;
                String str = "showMoreOperationPanelEvent";
                if (tE == null) {
                   a.S(str);
                }
                if (tE.d()) {
                   tE = this.V;
                   String str1 = "atlasRV";
                   if (tE == null) {
                      a.S(str1);
                   }
                   if (!tE.getScrollState()) {
                      tE = this.V;
                      if (tE == null) {
                         a.S(str1);
                      }
                      i = tE.getCurrentPosition();
                   }else {
                      i = -1;
                   }
                   tE = this.M;
                   if (tE == null) {
                      a.S(str);
                   }
                   e uoe = new e(true, i, false, 4, null);
                   tE.onNext(str);
                }
             }
          }
       }
    label_0088 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SlidePlayAtlasBaseTouchPresenter.class, "22")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.F = obj;
       obj = this.q8(a.class);
       a.o(obj, "inject\(DetailParam::class.java\)");
       this.G = obj;
       obj = this.r8("DETAIL_CLICK_LIKE_LISTENERS");
       a.o(obj, "inject\(AccessIds.DETAIL_CLICK_LIKE_LISTENERS\)");
       this.K = obj;
       obj = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       a.o(obj, "inject\(DetailAccessIds.DETAIL_SCREEN_CLEAN_STATUS\)");
       this.L = obj;
       this.J = this.r8("DETAIL_IMAGE_SINGLE_TAP_UP");
       obj = this.r8("show_more_operation_panel_action");
       a.o(obj, "inject\(AccessIds.SHOW_MORE_OPERATION_PANEL_ACTION\)");
       this.M = obj;
       obj = this.x8("SLIDE_PLAY_BIG_MARQUEE_LONG_CLICK");
       a.o(obj, "injectRef\(AccessIds.SLID¡­Y_BIG_MARQUEE_LONG_CLICK\)");
       this.N = obj;
       this.P = this.t8("PHOTO_ROOTVIEW_TOUCH_MANAGER");
       Object obj1 = this.q8(u.class);
       a.o(obj1, "inject\(SwipeToProfileFeedMovement::class.java\)");
       this.O = obj1;
       this.Q = this.t8("NASA_SIDEBAR_STATUS");
       obj1 = this.r8("DETAIL_FRAGMENT");
       a.o(obj1, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.R = obj1;
       obj1 = this.q8(PhotoDetailParam.class);
       a.o(obj1, "inject\(PhotoDetailParam::class.java\)");
       this.H = obj1;
       obj1 = this.q8(NasaBizParam.class);
       a.o(obj1, "inject\(NasaBizParam::class.java\)");
       this.I = obj1;
       this.W = this.r8("DETAIL_LOADING_ANIM_OBSERVABLE");
       this.X = this.r8("NASA_PLAY_FAILED_RETRY_SHOW");
       this.Y = this.r8("NASA_SCALE_CLEAN_CONTROLLER_SHOW_OBSERVER");
       return;
    }
    public void j9(){
       if (PatchProxy.applyVoid(null, this, SlidePlayAtlasBaseTouchPresenter.class, "34")) {
          return;
       }
       this.W8();
       return;
    }
    public final SlidePlayViewModel p0(){
       SlidePlayAtlasBaseTouchPresenter obj = PatchProxy.apply(null, this, SlidePlayAtlasBaseTouchPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.E;
       if (obj == null) {
          a.S("slidePlayViewModel");
       }
       return obj;
    }
}
