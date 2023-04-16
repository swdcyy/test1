package k99.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import k99.a$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Integer;
import tyc.v1;

public class a extends PresenterV2	// class@002b67
{
    public KwaiImageView p;
    public v1 q;
    public QPhoto r;
    public int s;
    public static final int t;

    static {
       a.t = a1.e(10.00f);
    }
    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       ImageMeta$AtlasCoverSize atlasSize = this.r.getAtlasSize(this.s);
       if (atlasSize != null && atlasSize.mWidth - null) {
          this.p.getViewTreeObserver().addOnGlobalLayoutListener(new a$a(this));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a130c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       this.s = this.r8("ATLAS_ADAPTER_POSITION").intValue();
       this.q = this.r8("ATLAS_LOAD_HELPER");
       return;
    }
}
