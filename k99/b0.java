package k99.b0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k99.b0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$c;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import com.yxcorp.gifshow.detail.view.AtlasOutMaskView;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import im8.f;
import java.lang.Integer;
import android.view.View;
import ekd.m1;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import io.reactivex.subjects.PublishSubject;
import java.util.Set;

public class b0 extends PresenterV2	// class@002b69
{
    public final PhotosScaleHelpView$c A;
    public PhotosScaleHelpView p;
    public AtlasOutMaskView q;
    public QPhoto r;
    public PhotoDetailParam s;
    public NormalDetailBizParam t;
    public PublishSubject u;
    public Set v;
    public PublishSubject w;
    public PublishSubject x;
    public int y;
    public f z;

    public void b0(){
       super();
       this.A = new b0$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "4")) {
          return;
       }
       ImageMeta$AtlasCoverSize atlasSize = this.r.getAtlasSize(this.y);
       if (atlasSize != null && atlasSize.mWidth - null) {
          this.p.setVerticalPhotosScaleHelper(this.A);
          int i = NasaExperimentUtils.c();
          if (i > 0) {
             this.p.setLongPressTimeOut((long)i);
          }
          this.q.setPhotosScaleHelper(this.A);
       }
       return;
    }
    public MotionEvent P8(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MotionEvent.obtain(p0.getDownTime(), p0.getEventTime(), p0.getAction(), p0.getRawX(), ((float)this.z.get().intValue() + p0.getRawY()), p0.getMetaState());
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a2a9a);
       this.p = m1.f(p0, 0x7f0a2a96);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       this.s = this.q8(PhotoDetailParam.class);
       this.t = this.q8(NormalDetailBizParam.class);
       this.u = this.r8("DETAIL_DOUBLE_CLICK_LIKE");
       this.v = this.r8("DETAIL_DOUBLE_CLICK_LISTENERS");
       this.w = this.t8("DETAIL_SLIDE_CHANGE_SCREEN_VISIBLE");
       this.x = this.r8("DETAIL_ATLAS_AUTO_PLAY");
       this.y = this.r8("ATLAS_ADAPTER_POSITION").intValue();
       this.z = this.x8("DETAIL_SCROLL_DISTANCE");
       return;
    }
}
