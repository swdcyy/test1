package a4c.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import a4c.k$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import com.kuaishou.android.model.music.Music;
import u0d.a;
import com.yxcorp.gifshow.music.utils.d;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import jd.c;
import ub.b;
import wb5.g;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;

public class k extends PresenterV2	// class@000076
{
    public Music p;
    public KwaiImageView q;
    public final a r;

    public void k(){
       super();
       this.r = new k$a(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k.class, "3")) {
          return;
       }
       if (this.p.equals(this.q.getTag(0x7f0a2c76))) {
          return;
       }
       if (this.p.isOffline()) {
          objArray = new a(51);
       }
       g.x(this.q, this.p, d.c, objArray, this.r);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a09e2);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.p = this.q8(Music.class);
       return;
    }
}
