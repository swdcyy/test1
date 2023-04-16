package k99.k;
import qf5.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k99.k$a;
import com.kwai.library.widget.imageview.scale.ScaleHelpView$a;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.request.ImageRequest;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import tyc.v1;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.List;
import kp.r1;
import s0d.f;
import java.util.Collection;
import uc.d;
import s0d.a;
import s0d.e;
import ekd.j;
import android.widget.ImageView;
import android.view.View;
import ekd.m1;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import io.reactivex.subjects.PublishSubject;
import java.lang.Integer;

public class k extends b	// class@002b86
{
    public PublishSubject r;
    public PhotosScaleHelpView s;
    public KwaiImageView t;
    public View u;
    public QPhoto v;
    public int w;
    public Bitmap x;
    public v1 y;

    public void k(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       this.s.setAssistListener(new k$a(this));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, k.class, "6")) {
          return;
       }
       k tx = this.x;
       if (tx != null && !tx.isRecycled()) {
          this.x.recycle();
       }
       this.x = null;
       return;
    }
    public ImageRequest P8(){
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, k.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = r1.m0(this.v.mEntity, this.y.a(this.w));
       if (obj != null && !obj.isEmpty()) {
          e[] uoeArray = f.x().q(obj).p(this.X8()).w();
          if (!j.h(uoeArray)) {
             return uoeArray[0];
          }
       }
       return objArray;
    }
    public ImageView V8(){
       return this.t;
    }
    public ScaleHelpView W8(){
       return this.s;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a2a96);
       this.t = m1.f(p0, 0x7f0a130c);
       this.u = m1.f(p0, 0x7f0a0e4d);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.r = this.t8("DETAIL_SCALE_EMITTER");
       this.v = this.q8(QPhoto.class);
       this.w = this.r8("ATLAS_ADAPTER_POSITION").intValue();
       this.y = this.r8("ATLAS_LOAD_HELPER");
       return;
    }
}
