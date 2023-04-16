package k99.c0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.View;
import com.yxcorp.gifshow.widget.viewpager.PhotosViewPager;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import k99.c0$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Integer;

public class c0 extends PresenterV2	// class@002b6c
{
    public KwaiImageView p;
    public PhotosViewPager q;
    public QPhoto r;
    public int s;
    public View t;

    public void c0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "3")) {
          return;
       }
       ImageMeta$AtlasCoverSize atlasSize = this.r.getAtlasSize(this.s);
       if (atlasSize != null && atlasSize.mWidth) {
          this.q = this.t.findViewById(0x7f0a4452);
          this.p.getViewTreeObserver().addOnGlobalLayoutListener(new c0$a(this));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a130c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       this.s = this.r8("ATLAS_ADAPTER_POSITION").intValue();
       this.t = this.r8("FRAGMENT_VIEW");
       return;
    }
}
