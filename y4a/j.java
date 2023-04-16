package y4a.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import y4a.j$a;
import com.kwai.library.widget.imageview.scale.ScaleHelpView$a;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.MotionEvent;
import ekd.m1;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView;
import y8c.a;
import im8.f;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.yxcorp.gifshow.entity.QPhoto;

public abstract class j extends PresenterV2	// class@004619
{
    public PhotosScaleHelpView p;
    public View q;
    public a r;
    public f s;
    public PhotoDetailParam t;
    public PhotoDetailLogger u;
    public QPhoto v;
    public Canvas w;
    public Bitmap x;

    public void j(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       this.p.c(this.P8());
       this.p.setAssistListener(new j$a(this));
       return;
    }
    public boolean P8(){
       return false;
    }
    public abstract RecyclerView R8();
    public View S8(){
       return null;
    }
    public abstract int V8(View p0);
    public void W8(MotionEvent p0){
    }
    public void X8(MotionEvent p0){
    }
    public void Y8(MotionEvent p0,boolean p1){
    }
    public void Z8(){
       this.x = null;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2f51);
       this.q = m1.f(p0, 0x7f0a09e1);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.r = this.r8("DETAIL_FRAGMENT");
       this.s = this.x8("DETAIL_COMMENT_RECYCLER_VIEW");
       this.t = this.q8(PhotoDetailParam.class);
       this.u = this.r8("DETAIL_LOGGER");
       this.v = this.q8(QPhoto.class);
       return;
    }
}
