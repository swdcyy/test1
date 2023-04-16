package k99.p;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k99.p$a;
import com.yxcorp.gifshow.widget.viewpager.PhotosViewPager;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import im8.f;

public final class p extends PresenterV2	// class@002b8c
{
    public f p;
    public PhotosViewPager q;
    public QPhoto r;
    public NormalDetailBizParam s;
    public final p$a t;

    public void p(){
       super();
       this.t = new p$a(this);
    }
    public static final PhotosViewPager P8(p p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mPhotosPagerView");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p.class, "3")) {
          return;
       }
       p tq = this.q;
       if (tq == null) {
          a.S("mPhotosPagerView");
       }
       tq.getViewTreeObserver().addOnGlobalLayoutListener(this.t);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, p.class, "4")) {
          return;
       }
       p tq = this.q;
       if (tq == null) {
          a.S("mPhotosPagerView");
       }
       tq.getViewTreeObserver().removeOnGlobalLayoutListener(this.t);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       p0 = m1.f(p0, R.id.view_pager_photos);
       a.o(p0, "ViewBindUtils.bindWidget¡­, R.id.view_pager_photos\)");
       this.q = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.r = obj;
       obj = this.q8(NormalDetailBizParam.class);
       a.o(obj, "inject\(NormalDetailBizParam::class.java\)");
       this.s = obj;
       obj = this.x8("DETAIL_COMMENT_RECYCLER_VIEW");
       a.o(obj, "injectRef\(AccessIds.DETAIL_COMMENT_RECYCLER_VIEW\)");
       this.p = obj;
       return;
    }
}
