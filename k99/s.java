package k99.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k99.s$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tyc.v1;
import com.facebook.drawee.view.DraweeView;
import tyc.k;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;

public class s extends PresenterV2	// class@002b97
{
    public KwaiImageView p;
    public QPhoto q;
    public int r;
    public v1 s;
    public final k t;

    public void s(){
       super();
       this.t = new s$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, s.class, "3")) {
          return;
       }
       this.p.setAspectRatio(this.s.c(this.r));
       this.s.d(this.t, this.r);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, s.class, "4")) {
          return;
       }
       this.P8(null);
       return;
    }
    public void P8(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "5")) {
          return;
       }
       this.p.setImageDrawable(p0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a041c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       this.r = this.r8("ATLAS_ADAPTER_POSITION").intValue();
       this.s = this.r8("ATLAS_LOAD_HELPER");
       return;
    }
}
