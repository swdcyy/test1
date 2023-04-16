package com.yxcorp.gifshow.atlas_detail.horizontal.presenter.HorizontalAtlasExpandPresenterV4;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.HorizontalAtlasExpandPresenterV4$mExpandRootLayoutAnimListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.HorizontalAtlasExpandPresenterV4$c;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.HorizontalAtlasExpandPresenterV4$d;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.HorizontalAtlasExpandPresenterV4$b;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.HorizontalAtlasExpandPresenterV4$a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;
import java.util.Set;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import j99.t;
import android.util.SparseArray;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.widget.viewpager.PhotosViewPager;
import joc.z;
import im8.f;
import android.view.Window;
import lnc.i5;
import android.view.ViewGroup;
import android.view.View;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import ekd.i;
import com.yxcorp.gifshow.atlas_detail.horizontal.InnerAtlasFrameLayout;
import android.widget.FrameLayout;
import android.view.ViewPropertyAnimator;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.HorizontalAtlasExpandPresenterV4$mExpandRootLayoutAnimListener$2$a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import j99.r;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import de5.a;

public final class HorizontalAtlasExpandPresenterV4 extends PresenterV2	// class@001bbb
{
    public boolean A;
    public PhotosViewPager B;
    public r C;
    public a D;
    public SwipeLayout E;
    public PhotosViewPager F;
    public AtlasSegmentedProgressBar G;
    public int H;
    public final p I;
    public ViewPager$i J;
    public ViewPager$i K;
    public final c L;
    public ViewPager$i M;
    public QPhoto p;
    public BaseFragment q;
    public Set r;
    public PhotoDetailParam s;
    public NormalDetailBizParam t;
    public a u;
    public f v;
    public FrameLayout w;
    public View x;
    public View y;
    public FrameLayout z;

    public void HorizontalAtlasExpandPresenterV4(){
       super();
       this.I = s.c(new HorizontalAtlasExpandPresenterV4$mExpandRootLayoutAnimListener$2(this));
       this.J = new HorizontalAtlasExpandPresenterV4$c(this);
       this.K = new HorizontalAtlasExpandPresenterV4$d(this);
       this.L = new HorizontalAtlasExpandPresenterV4$b(this);
       this.M = new HorizontalAtlasExpandPresenterV4$a(this);
    }
    public static final QPhoto P8(HorizontalAtlasExpandPresenterV4 p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, HorizontalAtlasExpandPresenterV4.class, "7")) {
          return;
       }
       if (this.E == null) {
          this.E = w9.c(this.getActivity());
       }
       HorizontalAtlasExpandPresenterV4 tF = this.F;
       if (tF != null) {
          tF.addOnPageChangeListener(this.K);
       }
       tF = this.r;
       if (tF == null) {
          a.S("mDoubleClickContentListeners");
       }
       tF.add(this.L);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HorizontalAtlasExpandPresenterV4.class, "8")) {
          return;
       }
       this.V8();
       HorizontalAtlasExpandPresenterV4 tB = this.B;
       if (tB != null) {
          tB.removeOnPageChangeListener(this.J);
       }
       tB = this.B;
       if (tB != null) {
          tB.removeOnPageChangeListener(this.M);
       }
       tB = this.r;
       if (tB == null) {
          a.S("mDoubleClickContentListeners");
       }
       tB.remove(this.L);
       tB = this.F;
       if (tB != null) {
          tB.removeOnPageChangeListener(this.K);
       }
       tB = this.B;
       a adapter = (tB != null)? tB.getAdapter(): objArray;
       if (!adapter instanceof t) {
          adapter = objArray;
       }
       if (adapter != null && !PatchProxy.applyVoid(objArray, adapter, t.class, "4")) {
          int i = 0;
          while (i < adapter.i.size()) {
             PresenterV2 presenterV2 = adapter.i.valueAt(i);
             if (presenterV2 != null && (presenterV2.R1() && !presenterV2.y8())) {
                presenterV2.destroy();
             }
          label_0078 :
             i = i + 1;
          }
          adapter.i.clear();
       }
       return;
    }
    public final boolean R8(String p0){
       HorizontalAtlasExpandPresenterV4 obj = PatchProxy.applyOneRefs(p0, this, HorizontalAtlasExpandPresenterV4.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.B;
       if (obj != null) {
          obj.setIsShown(false);
       }
       obj = this.E;
       if (obj != null) {
          obj.n(true, 22);
       }
       obj = this.E;
       if (obj != null) {
          z touchDetecto = obj.getTouchDetector();
          if (touchDetecto != null) {
             touchDetecto.g(22);
          }
       }
       this.V8();
       this.X8(false);
       this.A = false;
       this.a2(p0);
       HorizontalAtlasExpandPresenterV4 tv = this.v;
       if (tv == null) {
          a.S("mInnerAtlasExpended");
       }
       tv.set(Boolean.FALSE);
       Activity activity = this.getActivity();
       Window window = (activity != null)? activity.getWindow(): null;
       i5.j(window, -1);
       this.W8(true);
       return true;
    }
    public final ViewGroup S8(){
       Object[] objArray = null;
       Activity obj = PatchProxy.apply(objArray, this, HorizontalAtlasExpandPresenterV4.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getActivity();
       if (obj != null) {
          objArray = obj.findViewById(0x1020002);
       }
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type android.view.ViewGroup");
       return objArray;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, HorizontalAtlasExpandPresenterV4.class, "12")) {
          return;
       }
       if (this.D != null) {
          Activity activity = this.getActivity();
          Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          activity.l3(this.D);
       }
       return;
    }
    public final void W8(boolean p0){
       HorizontalAtlasExpandPresenterV4 horizontalAt = HorizontalAtlasExpandPresenterV4.class;
       if (PatchProxy.isSupport(horizontalAt) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, horizontalAt, "19")) {
          return;
       }
       if (i.c()) {
          Activity activity = this.getActivity();
          a.m(activity);
          i.a(activity, 0, p0);
       }
       return;
    }
    public final void X8(boolean p0){
       HorizontalAtlasExpandPresenterV4 tw1;
       HorizontalAtlasExpandPresenterV4 horizontalAt = HorizontalAtlasExpandPresenterV4.class;
       if (PatchProxy.isSupport(horizontalAt) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, horizontalAt, "15")) {
          return;
       }
       long l = 300;
       HorizontalAtlasExpandPresenterV4 tw = this.w;
       if (!tw instanceof InnerAtlasFrameLayout) {
          tw = null;
       }
       if (tw != null) {
          tw.setTouchAble(p0);
       }
       if (p0) {
          tw1 = this.w;
          if (tw1 != null) {
             tw1.setAlpha(0);
             tw1.setVisibility(0);
             tw1.animate().alpha(0x3f800000).setDuration(l).setListener(null);
          }
       }else {
          tw1 = this.w;
          if (tw1 != null) {
             ViewPropertyAnimator viewProperty = tw1.animate();
             if (viewProperty != null) {
                viewProperty = viewProperty.alpha(0);
                if (viewProperty != null) {
                   viewProperty = viewProperty.setDuration(l);
                   if (viewProperty != null) {
                      HorizontalAtlasExpandPresenterV4$mExpandRootLayoutAnimListener$2$a omExpandRoot = PatchProxy.apply(null, this, horizontalAt, "2");
                      if (omExpandRoot == PatchProxyResult.class) {
                         omExpandRoot = this.I.getValue();
                      }
                      viewProperty.setListener(omExpandRoot);
                   }
                }
             }
          }
       }
       return;
    }
    public final void a2(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HorizontalAtlasExpandPresenterV4.class, "13")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "ALBUM_CLICK_TO_VIEW_ALL";
       i3 oi3 = i3.f();
       oi3.d("click_type", p0);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       HorizontalAtlasExpandPresenterV4 tp = this.p;
       if (tp == null) {
          a.S("mPhoto");
       }
       uContentPack.photoPackage = w1.f(tp.mEntity);
       u1.B(new ClickMetaData().setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HorizontalAtlasExpandPresenterV4.class, "6")) {
          return;
       }
       this.F = m1.f(p0, 0x7f0a4452);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, HorizontalAtlasExpandPresenterV4.class, "5")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       obj = this.r8("DETAIL_DOUBLE_CLICK_LISTENERS");
       a.o(obj, "inject\(AccessIds.DETAIL_DOUBLE_CLICK_LISTENERS\)");
       this.r = obj;
       this.C = this.q8(r.class);
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.s = obj;
       obj = this.q8(NormalDetailBizParam.class);
       a.o(obj, "inject\(NormalDetailBizParam::class.java\)");
       this.t = obj;
       obj = this.q8(a.class);
       a.o(obj, "inject\(DetailPlayModule::class.java\)");
       this.u = obj;
       obj = this.x8("DETAIL_INNER_ATLAS_EXPENDED");
       a.o(obj, "injectRef\(DetailAccessId¡­AIL_INNER_ATLAS_EXPENDED\)");
       this.v = obj;
       return;
    }
}
