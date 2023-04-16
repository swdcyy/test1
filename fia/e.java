package fia.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fia.e$a;
import fia.e$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import fia.e$c;
import kga.c;
import erd.g;
import crd.b;
import brd.t;
import vy6.a;
import lnc.u1;
import com.yxcorp.gifshow.util.rx.RxBus;
import ve5.c;
import t45.d;
import brd.z;
import fia.e$d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import im8.f;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.c;
import android.app.Activity;
import org.greenrobot.eventbus.a;
import e6a.a;
import d6a.f;
import az6.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import kp.r1;
import ln5.e;
import e6a.f;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import cda.i;

public final class e extends PresenterV2	// class@0028fb
{
    public SlidePlayViewModel A;
    public final a B;
    public final b C;
    public t p;
    public f q;
    public QPhoto r;
    public PhotoDetailParam s;
    public BaseFragment t;
    public boolean u;
    public boolean v;
    public boolean w;
    public String x;
    public QPhoto y;
    public boolean z;

    public void e(){
       super();
       this.B = new e$a(this);
       this.C = new e$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "12")) {
          return;
       }
       e tt = this.t;
       String str = "mFragment";
       if (tt == null) {
          a.S(str);
       }
       this.A = SlidePlayViewModel.B0(tt.getParentFragment());
       tt = this.r;
       if (tt == null) {
          a.S("mPhoto");
       }
       this.y = tt;
       tt = this.p;
       if (tt == null) {
          a.S("mSmoothSwipeEventObservable");
       }
       this.X7(tt.subscribe(new e$c(this), c.a));
       tt = this.A;
       if (tt != null) {
          e tt1 = this.t;
          if (tt1 == null) {
             a.S(str);
          }
          tt.P(tt1, this.B);
       }
       u1.a(this);
       this.X7(RxBus.f.f(c.class).observeOn(d.a).subscribe(new e$d(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "13")) {
          return;
       }
       u1.b(this);
       e tA = this.A;
       if (tA != null) {
          e tt = this.t;
          if (tt == null) {
             a.S("mFragment");
          }
          tA.D(tt, this.B);
       }
       return;
    }
    public final void P8(){
       int i;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "14")) {
          return;
       }
       a obj = PatchProxy.apply(objArray, this, uoe, "17");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          uoe = this.A;
          i = (uoe != null)? uoe.a0(): 0;
       }
       e tq = this.q;
       String str = "mActivityOpacityHasChangedRef";
       if (tq == null) {
          a.S(str);
       }
       if (!tq.get().booleanValue() && i) {
          uoe = this.q;
          if (uoe == null) {
             a.S(str);
          }
          uoe.set(Boolean.TRUE);
          Activity activity = this.getActivity();
          a.m(activity);
          new c(activity).a();
       }
       uoe = this.A;
       if (uoe == null || (uoe.g1() == true || (this.u != null && this.S8()))) {
          obj = a.d();
          e tA = this.A;
          if (tA != null) {
             objArray = tA.V();
          }
          int i1 = f.c(objArray);
          tA = this.s;
          if (tA == null) {
             a.S("mDetailParams");
          }
          a mFeedPositio = tA.mFeedPosition;
          e tr = this.r;
          if (tr == null) {
             a.S("mPhoto");
          }
          obj.k(new a(i1, mFeedPositio, tr.mEntity));
       }
       return;
    }
    public final PhotoDetailParam R8(){
       e obj = PatchProxy.apply(null, this, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj == null) {
          a.S("mDetailParams");
       }
       return obj;
    }
    public final boolean S8(){
       e obj = PatchProxy.apply(null, this, e.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.s;
       if (obj == null) {
          a.S("mDetailParams");
       }
       BaseFeed entranceFeed = obj.getEntranceFeed();
       int i = 1;
       if (entranceFeed != null) {
          i = i ^ r1.S2(entranceFeed);
       }
       return i;
    }
    public final void V8(){
       e ty;
       String photoId;
       a uoa;
       e ty1;
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "15")) {
          return;
       }
       if (this.S8()) {
          boolean b = true;
          if (this.v == null) {
             ty = this.y;
             photoId = (ty != null)? ty.getPhotoId(): objArray;
             if (a.g(photoId, this.x)) {
                this.v = b;
                uoa = a.d();
                ty1 = this.y;
                if (ty1 != null) {
                   objArray = ty1.getPhotoId();
                }
                uoa.k(new e(objArray));
             }
          }
          if (this.w != null) {
             ty = this.y;
             photoId = (ty != null)? ty.getPhotoId(): objArray;
             if (a.g(photoId, this.x)) {
             label_00aa :
                return;
             }
          }
          ty = this.A;
          if (ty == null || (ty.g1() != b && (this.u != null || this.z != null))) {
             this.w = b;
             uoa = a.d();
             ty1 = this.A;
             if (ty1 != null) {
                objArray = ty1.V();
             }
             int i = f.c(objArray);
             ty1 = this.s;
             String str = "mDetailParams";
             if (ty1 == null) {
                a.S(str);
             }
             a mFeedPositio = ty1.mFeedPosition;
             e tr = this.r;
             if (tr == null) {
                a.S("mPhoto");
             }
             e ts = this.s;
             if (ts == null) {
                a.S(str);
             }
             DetailCommonParam detailCommon = ts.getDetailCommonParam();
             a.o(detailCommon, "mDetailParams.detailCommonParam");
             uoa.k(new f(i, mFeedPositio, tr, detailCommon.getUnserializableBundleId()));
             goto label_00aa ;
          }else {
             goto label_00aa ;
          }
       }else {
          goto label_00aa ;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       f obj = this.r8("PAGE_SMOOTH_SWIPE_OBSERVABLE");
       a.o(obj, "inject\(AccessIds.PAGE_SMOOTH_SWIPE_OBSERVABLE\)");
       this.p = obj;
       obj = this.x8("AGGREGATE_ACTIVITY_OPACITY_HAS_CHANGED");
       a.o(obj, "injectRef\(AccessIds.AGGR¡­VITY_OPACITY_HAS_CHANGED\)");
       this.q = obj;
       Object obj1 = this.q8(QPhoto.class);
       a.o(obj1, "inject\(QPhoto::class.java\)");
       this.r = obj1;
       obj1 = this.q8(PhotoDetailParam.class);
       a.o(obj1, "inject\(PhotoDetailParam::class.java\)");
       this.s = obj1;
       obj1 = this.r8("DETAIL_FRAGMENT");
       a.o(obj1, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.t = obj1;
       return;
    }
    public final void onEventMainThread(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "18")) {
          return;
       }
       a.p(p0, "event");
       this.x = p0.a;
       return;
    }
}
