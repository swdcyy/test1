package k99.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k99.g$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$c;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView;
import com.yxcorp.gifshow.detail.view.AtlasOutMaskView;
import android.view.View;
import ekd.m1;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import io.reactivex.subjects.PublishSubject;
import java.util.Set;
import java.lang.Integer;
import e1a.e;

public class g extends PresenterV2	// class@002b7b
{
    public PhotosScaleHelpView p;
    public AtlasOutMaskView q;
    public QPhoto r;
    public PhotoDetailParam s;
    public NormalDetailBizParam t;
    public PublishSubject u;
    public Set v;
    public Set w;
    public e x;
    public int y;
    public final PhotosScaleHelpView$c z;

    public void g(){
       super();
       this.z = new g$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       ImageMeta$AtlasCoverSize atlasSize = this.r.getAtlasSize(this.y);
       if (atlasSize != null && atlasSize.mWidth - null) {
          this.p.setVerticalPhotosScaleHelper(this.z);
          this.q.setPhotosScaleHelper(this.z);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a2a9a);
       this.p = m1.f(p0, 0x7f0a2a96);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       this.s = this.q8(PhotoDetailParam.class);
       this.t = this.q8(NormalDetailBizParam.class);
       this.u = this.r8("DETAIL_DOUBLE_CLICK_LIKE");
       this.v = this.r8("DETAIL_DOUBLE_CLICK_LISTENERS");
       this.y = this.r8("ATLAS_ADAPTER_POSITION").intValue();
       this.w = this.r8("DETAIL_ATLAS_OUTER_DOUBLE_CLICK_LISTENERS");
       this.x = this.r8("DETAIL_INNER_ATLAS_GESTURE_CONFLICT_HELPER");
       return;
    }
}
