package n9a.r;
import p9a.a;
import com.yxcorp.gifshow.detail.view.NasaFeaturedSeekBar;
import android.animation.ValueAnimator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class r extends a	// class@003119
{
    public final NasaFeaturedSeekBar c;

    public void r(NasaFeaturedSeekBar p0,int p1){
       this.c = p0;
       super(p1);
    }
    public void a(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
          return;
       }
       this.c.setProgress(p0.getAnimatedValue().intValue());
       return;
    }
}
