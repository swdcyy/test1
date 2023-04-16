package j7a.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import j7a.a$b;
import j7a.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import px6.b;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule;
import ux6.d;
import com.kwai.library.kwaiplayerkit.framework.module.ui.UiModule;
import java.util.Objects;
import nx6.b;
import nx6.a;
import android.view.View$OnLayoutChangeListener;
import android.widget.FrameLayout;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.g;
import j7a.a$c;
import erd.g;
import crd.b;
import brd.t;
import brd.y;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewParent;
import android.view.View;
import uw9.o;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import q87.c;
import ekd.m1;
import mrd.c;
import io.reactivex.subjects.PublishSubject;

public final class a extends PresenterV2	// class@002924
{
    public final String p;
    public QPhoto q;
    public c r;
    public c s;
    public PublishSubject t;
    public KwaiPlayerKitView u;
    public b v;
    public a w;
    public boolean x;
    public final View$OnLayoutChangeListener y;
    public final g z;

    public void a(){
       super();
       this.p = "PlayerContentPositionLocationPresenter";
       this.y = new a$b(this);
       this.z = new a$a(this);
    }
    public void E8(){
       d uod;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
          return;
       }
       a tu = this.u;
       String str = "mPlayerKitView";
       if (tu == null) {
          a.S(str);
       }
       DefaultFrameUiModule uDefaultFram = tu.getPlayerKitContext().i(DefaultFrameUiModule.class);
       if (uDefaultFram != null) {
          uod = uDefaultFram.l();
          Objects.requireNonNull(uod, "null cannot be cast to non-null type com.kwai.library.kwaiplayerkit.domain.play.ui.ContentFrameViewModel");
       }else {
          uod = objArray;
       }
       this.v = uod;
       tu = this.u;
       if (tu == null) {
          a.S(str);
       }
       this.w = tu.getPlayerKitContext().e(a.class);
       tu = this.v;
       if (tu != null) {
          tu.d(this.y);
       }
       tu = this.u;
       if (tu == null) {
          a.S(str);
       }
       tu.addOnLayoutChangeListener(this.y);
       tu = this.w;
       int[] ointArray = (tu != null)? tu.k(): objArray;
       a.m(ointArray);
       if (ointArray[1]) {
          this.P8();
       }
       Activity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          objArray.k3(this.z);
       }
       tu = this.t;
       if (tu == null) {
          a.S("mSmallWindowProgressEmitter");
       }
       this.X7(tu.subscribe(new a$c(this)));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "4")) {
          return;
       }
       a tv = this.v;
       if (tv != null) {
          tv.b(this.y);
       }
       tv = this.u;
       if (tv == null) {
          a.S("mPlayerKitView");
       }
       tv.removeOnLayoutChangeListener(this.y);
       Activity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          objArray.t3(this.z);
       }
       return;
    }
    public final void P8(){
       int i1;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "5")) {
          return;
       }
       a tw = this.w;
       if (tw != null) {
          int[] ointArray = tw.k();
          a tr = this.r;
          if (tr == null) {
             a.S("mSlidePlayerContentViewLocationUpdateBehavior");
          }
          tr.onNext(ointArray);
          if (this.x == null) {
             o obj = PatchProxy.apply(objArray, this, uoa, "6");
             int i = 1;
             if (obj != PatchProxyResult.class) {
                i1 = obj.intValue();
             }else {
                uoa = this.u;
                String str1 = "mPlayerKitView";
                if (uoa == null) {
                   a.S(str1);
                }
                i1 = uoa.getTop();
                a tu = this.u;
                if (tu == null) {
                   a.S(str1);
                }
                for (ViewParent parent = tu.getParent(); parent != null; parent = parent.getParent()) {
                   int i2 = a.g(parent, this.m8()) ^ i;
                   if (i2) {
                      i1 = i1 + parent.getTop();
                   }
                }
             }
             ointArray[i] = i1;
             uoa = this.s;
             if (uoa == null) {
                a.S("mSlidePlayerContentViewRelativeLocationUpdateBehavior");
             }
             uoa.onNext(ointArray);
             obj = o.C();
             a tp = this.p;
             StringBuilder str = "photoId:";
             a tq = this.q;
             if (tq == null) {
                a.S("mPhoto");
             }
             Object[] objArray1 = new Object[0];
             obj.w(tp, str+tq.getPhotoId()+" relativePosition.top = "+ointArray[i]+", relativePosition.height = "+ointArray[3], objArray1);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       p0 = m1.f(p0, R.id.slide_playerkit_view);
       a.o(p0, "ViewBindUtils.bindWidget¡­.id.slide_playerkit_view\)");
       this.u = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       obj = this.r8("SLIDE_PLAYER_CONTENT_VIEW_LOCATION_UPDATE_BEHAVIOR");
       a.o(obj, "inject\(AccessIds.SLIDE_P¡­LOCATION_UPDATE_BEHAVIOR\)");
       this.r = obj;
       obj = this.r8("SLIDE_PLAYER_CONTENT_VIEW_RELATIVE_LOCATION_UPDATE_BEHAVIOR");
       a.o(obj, "inject\(AccessIds.SLIDE_P¡­LOCATION_UPDATE_BEHAVIOR\)");
       this.s = obj;
       obj = this.r8("SLIDE_PLAY_SMALL_WINDOW_PROGRESS");
       a.o(obj, "inject\(AccessIds.SLIDE_PLAY_SMALL_WINDOW_PROGRESS\)");
       this.t = obj;
       return;
    }
}
