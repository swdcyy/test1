package a7a.h;
import e7a.a;
import a7a.h$c;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import a7a.h$a;
import a7a.h$b;
import ud5.c;
import ud5.e;
import x85.a;
import w85.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import jd5.i;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import brd.y;
import android.view.View;
import ekd.m1;
import mrd.c;

public final class h extends a	// class@000058
{
    public final h$c A;
    public SlideHorizontalAtlasPlayer v;
    public a w;
    public PublishSubject x;
    public PublishSubject y;
    public c z;

    public void h(){
       super();
       this.A = new h$c(this);
    }
    public static final PublishSubject X8(h p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("mAtlasAutoPlayEvent");
       }
       return p0;
    }
    public static final SlideHorizontalAtlasPlayer Y8(h p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("mImagePlayer");
       }
       return p0;
    }
    public void E8(){
       boolean b;
       a uoa1;
       NasaBizParam mAtlasPhotoI;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, h.class, "3")) {
          return;
       }
       super.E8();
       h tv = this.v;
       if (tv == null) {
          a.S("mImagePlayer");
       }
       tv.y(this.R8(), NasaExperimentUtils.m(), new h$a(this), new h$b(this));
       tv = this.w;
       if (tv == null) {
          a.S("mDetailParam");
       }
       a uoa = tv.b();
       Objects.requireNonNull(uoa);
       h obj = PatchProxy.apply(objArray, uoa, a.class, "5");
       int i = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(uoa.i != null){
          uoa1 = uoa.e;
       }else if(uoa.k.getSource() == 2){
          uoa1 = 1;
       }else {
          uoa1 = null;
       }
       if (b != null) {
          obj = this.w;
          if (obj == null) {
             a.S("mDetailParam");
          }
          uoa1 = obj.b();
          uoa1 = (uoa1.i != null)? uoa1.f: uoa1.l.mAtlasPhotoIndex;
          i = uoa1;
       }
       obj = this.v;
       if (obj == null) {
          a.S("mImagePlayer");
       }
       obj.N(i);
       obj = this.v;
       if (obj == null) {
          a.S("mImagePlayer");
       }
       obj.x(this.A);
       PatchProxy.onMethodExit(h.class, "3");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, h.class, "5")) {
          return;
       }
       super.J8();
       h tv = this.v;
       if (tv == null) {
          a.S("mImagePlayer");
       }
       tv.M(this.A);
       PatchProxy.onMethodExit(h.class, "5");
       return;
    }
    public void V8(){
    }
    public void W8(){
    }
    public final void Z8(boolean p0){
       if (PatchProxy.isSupport2(h.class, "4") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, h.class, "4")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity == null || activity.isFinishing()) {
          PatchProxy.onMethodExit(h.class, "4");
          return;
       }else if(NasaExperimentUtils.m()){
          h tz = this.z;
          if (tz == null) {
             a.S("mLoadingAnimObservable");
          }
          tz.onNext(Boolean.valueOf(p0));
       }
       PatchProxy.onMethodExit(h.class, "4");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, h.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       super.doBindView(p0);
       p0 = m1.f(p0, R.id.autoplay_cover_view_page_style);
       a.o(p0, "ViewBindUtils.bindWidget¡­ay_cover_view_page_style\)");
       this.v = p0;
       PatchProxy.onMethodExit(h.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, h.class, "1")) {
          return;
       }
       super.j8();
       Object obj = this.q8(a.class);
       a.o(obj, "inject\(DetailParam::class.java\)");
       this.w = obj;
       obj = this.r8("SLIDE_PLAY_ATLAS_PLAY_PROGRESS");
       a.o(obj, "inject\(AccessIds.SLIDE_PLAY_ATLAS_PLAY_PROGRESS\)");
       this.x = obj;
       obj = this.r8("ATLAS_PROGRESS_BAR_ANIMATION_STOP");
       a.o(obj, "inject\(AccessIds.ATLAS_P¡­GRESS_BAR_ANIMATION_STOP\)");
       this.y = obj;
       obj = this.r8("DETAIL_LOADING_ANIM_OBSERVABLE");
       a.o(obj, "inject\(DETAIL_LOADING_ANIM_OBSERVABLE\)");
       this.z = obj;
       PatchProxy.onMethodExit(h.class, "1");
       return;
    }
}
