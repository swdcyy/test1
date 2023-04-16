package k99.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import k99.r$b;
import k99.r$c;
import k99.r$a;
import im8.f;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.widget.viewpager.PhotosViewPager;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.util.Set;
import java.lang.StringBuilder;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import java.lang.CharSequence;
import android.view.ViewGroup;
import k99.r$e;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;
import k99.r$f;
import java.lang.Runnable;
import androidx.viewpager.widget.ViewPager$i;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.graphics.drawable.Drawable;
import com.kwai.slide.play.detail.bottom.atlasplayprogress.AtlasSegmentedProgressBar;
import android.content.Context;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import qrd.l1;
import android.widget.FrameLayout$LayoutParams;
import k99.r$d;
import android.animation.Animator;
import ekd.f;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Activity;
import uw9.m3;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import tp7.a;
import ekd.m1;
import j99.r;
import brd.y;

public final class r extends PresenterV2	// class@002b95
{
    public PhotoDetailParam A;
    public FrameLayout B;
    public TextView C;
    public View D;
    public View E;
    public NormalDetailBizParam F;
    public ViewGroup G;
    public final int H;
    public int I;
    public f J;
    public boolean K;
    public y L;
    public final y M;
    public final Runnable N;
    public ViewPager$i O;
    public final long p;
    public final int q;
    public Set r;
    public NormalDetailBizParam s;
    public t t;
    public boolean u;
    public ObjectAnimator v;
    public r w;
    public AtlasSegmentedProgressBar x;
    public PhotosViewPager y;
    public QPhoto z;

    public void r(){
       super();
       this.p = 1700;
       this.q = a1.e(21.00f);
       this.H = a1.d(0x7f07009e);
       this.K = true;
       this.M = new r$b(this);
       this.N = new r$c(this);
       this.O = new r$a(this);
    }
    public static final f P8(r p0){
       p0 = p0.J;
       if (p0 == null) {
          a.S("mAtlasScrollRef");
       }
       return p0;
    }
    public static final PhotoDetailParam R8(r p0){
       p0 = p0.A;
       if (p0 == null) {
          a.S("mDetailParam");
       }
       return p0;
    }
    public static final QPhoto S8(r p0){
       p0 = p0.z;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public static final PhotosViewPager V8(r p0){
       p0 = p0.y;
       if (p0 == null) {
          a.S("mPhotosPagerView");
       }
       return p0;
    }
    public static final TextView W8(r p0){
       p0 = p0.C;
       if (p0 == null) {
          a.S("mTextIndicator");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, r.class, "5")) {
          return;
       }
       r tz = this.z;
       String str = "mPhoto";
       if (tz == null) {
          a.S(str);
       }
       String str1 = "mTextIndicator";
       if (tz.getAtlasListSize() <= 1) {
          tz = this.x;
          if (tz != null) {
             tz.setVisibility(8);
          }
          tz = this.C;
          if (tz == null) {
             a.S(str1);
          }
          tz.setVisibility(8);
          return;
       }else {
          tz = this.r;
          if (tz != null) {
             tz.add(this.M);
          }
          tz = this.C;
          if (tz == null) {
             a.S(str1);
          }
          String str2 = "1/";
          r ty = this.y;
          String str3 = "mPhotosPagerView";
          if (ty == null) {
             a.S(str3);
          }
          a adapter = ty.getAdapter();
          a.m(adapter);
          a.o(adapter, "mPhotosPagerView.adapter!!");
          tz.setText(str2+adapter.j());
          tz = this.G;
          boolean b = false;
          if (tz != null) {
             tz.setClipChildren(b);
          }
          this.Z8();
          this.Y8();
          tz = this.t;
          a.m(tz);
          this.X7(tz.subscribe(new r$e(this), Functions.e));
          tz = this.s;
          a.m(tz);
          NormalDetailBizParam mStartImageI = tz.mStartImageIndex;
          if (mStartImageI > null) {
             ty = this.y;
             if (ty == null) {
                a.S(str3);
             }
             ty.setCurrentItem(mStartImageI, b);
          }
          tz = this.y;
          if (tz == null) {
             a.S(str3);
          }
          tz.post(new r$f(this));
          tz = this.y;
          if (tz == null) {
             a.S(str3);
          }
          tz.addOnPageChangeListener(this.O);
          tz = this.B;
          str2 = "mContainer";
          if (tz == null) {
             a.S(str2);
          }
          tz.getLayoutParams().height = a1.d(0x7f07030d);
          tz = this.B;
          if (tz == null) {
             a.S(str2);
          }
          tz.setBackground(a1.f(R.drawable.arg_RES_7f080dde));
          tz = this.B;
          if (tz == null) {
             a.S(str2);
          }
          Context context = this.getContext();
          a.m(context);
          AtlasSegmentedProgressBar uAtlasSegmen = new AtlasSegmentedProgressBar(context);
          uAtlasSegmen.setUnSelectedSegmentColor(a1.a(R.color.arg_RES_7f060620));
          uAtlasSegmen.setEnableFillSegmentAnim(NasaExperimentUtils.a());
          FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -2, 80);
          layoutParams.height = a1.d(0x7f0702e3);
          layoutParams.leftMargin = a1.d(0x7f0702ab);
          layoutParams.rightMargin = a1.d(0x7f0702ab);
          layoutParams.bottomMargin = a1.d(0x7f070271);
          tz.addView(uAtlasSegmen, layoutParams);
          tz = this.B;
          if (tz == null) {
             a.S(str2);
          }
          AtlasSegmentedProgressBar uAtlasSegmen1 = tz.findViewById(R.id.atlas_segment_progress);
          this.x = uAtlasSegmen1;
          if (uAtlasSegmen1 != null) {
             r tz1 = this.z;
             if (tz1 == null) {
                a.S(str);
             }
             uAtlasSegmen1.setCount(tz1.getAtlasListSize());
             r tF = this.F;
             if (tF == null) {
                a.S("mNormalDetailBizParam");
             }
             if (tF.mFromSlidePlayPhotoClick != null) {
                uAtlasSegmen1.post(new r$d(this));
             }
          }
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, r.class, "6")) {
          return;
       }
       r ty = this.y;
       if (ty == null) {
          a.S("mPhotosPagerView");
       }
       ty.removeOnPageChangeListener(this.O);
       f.a(this.v);
       k1.m(this.N);
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, r.class, "14")) {
          return;
       }
       r tC = this.C;
       String str = "mTextIndicator";
       if (tC == null) {
          a.S(str);
       }
       tC.setAlpha(0x3f800000);
       tC = this.C;
       if (tC == null) {
          a.S(str);
       }
       tC.setVisibility(8);
       return;
    }
    public final void Y8(){
       int i;
       r or = r.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, or, "8")) {
          return;
       }
       ViewGroup$LayoutParams obj = PatchProxy.apply(objArray, this, or, "9");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          Activity activity = this.getActivity();
          r tz = this.z;
          if (tz == null) {
             a.S("mPhoto");
          }
          i = m3.f(activity, tz);
       }
       float f = (float)i;
       float f1 = (this.u != null)? (float)this.q: 0;
       r tC = this.C;
       if (tC == null) {
          a.S("mTextIndicator");
       }
       tC.setTranslationY((f + f1));
       or = this.C;
       if (or == null) {
          a.S("mTextIndicator");
       }
       or.setTranslationY(0);
       or = this.C;
       if (or == null) {
          a.S("mTextIndicator");
       }
       obj = or.getLayoutParams();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       obj.topMargin = a1.d(0x7f070295);
       or = this.C;
       if (or == null) {
          a.S("mTextIndicator");
       }
       or.requestLayout();
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, r.class, "13")) {
          return;
       }
       if (this.K == null) {
          return;
       }
       f.a(this.v);
       k1.m(this.N);
       r tC = this.C;
       if (tC == null) {
          a.S("mTextIndicator");
       }
       tC.setVisibility(0);
       k1.r(this.N, this.p);
       return;
    }
    public final void a9(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "7")) {
          return;
       }
       if (p0.b() > 0) {
          r tx = this.x;
          if (tx != null) {
             tx.setCount(p0.b());
             tx.setCurrentSegment(p0.a());
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "3")) {
          return;
       }
       View view = m1.f(p0, R.id.view_pager_photos);
       a.o(view, "bindWidget\(rootView, R.id.view_pager_photos\)");
       this.y = view;
       view = m1.f(p0, R.id.atlas_player_progress_container);
       a.o(view, "bindWidget\(rootView, R.i¡­layer_progress_container\)");
       this.B = view;
       view = m1.f(p0, R.id.text_indicator);
       a.o(view, "bindWidget\(rootView, R.id.text_indicator\)");
       this.C = view;
       this.D = this.m8().findViewById(0x7f0a3126);
       this.G = m1.f(p0, 0x7f0a3057);
       p0 = m1.f(p0, R.id.title_root);
       a.o(p0, "bindWidget\(rootView, R.id.title_root\)");
       this.E = p0;
       return;
    }
    public void j8(){
       NormalDetailBizParam normalDetail = NormalDetailBizParam.class;
       if (PatchProxy.applyVoid(null, this, r.class, "4")) {
          return;
       }
       Object obj = this.q8(r.class);
       a.o(obj, "inject\(PhotoAtlasAdapter::class.java\)");
       this.w = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.z = obj;
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.A = obj;
       this.r = this.r8("DETAIL_SCROLL_LISTENERS");
       this.s = this.q8(normalDetail);
       this.t = this.r8("DETAIL_LIVING_TAG_SHOW_OBSERVABLE");
       f obj1 = this.q8(normalDetail);
       a.o(obj1, "inject\(NormalDetailBizParam::class.java\)");
       this.F = obj1;
       obj1 = this.x8("DETAIL_ATLAS_SCROLL_DISTANCE");
       a.o(obj1, "injectRef\(AccessIds.DETAIL_ATLAS_SCROLL_DISTANCE\)");
       this.J = obj1;
       this.L = this.r8("DETAIL_ATLAS_SEEKBAR_POSITION_OBSERVER");
       return;
    }
}
