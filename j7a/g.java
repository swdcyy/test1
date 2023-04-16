package j7a.g;
import erd.g;
import j7a.i;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import uc6.c;
import sd5.d;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.drawable.Drawable;
import lnc.a1;

public final class g implements g	// class@00292d
{
    public final i b;

    public void g(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          if (NasaExperimentUtils.l()) {
             a.d().k(new PlayEvent(tb.x, PlayEvent$Status.PAUSE, 1, "SurfaceShowCover"));
          }
          if (NasaExperimentUtils.k() || !tb.x.isVideoType()) {
             tb.p.N().j();
          }else {
             tb.p.N().getCover().setForegroundDrawable(a1.f(R.drawable.arg_RES_7f080669));
          }
       }
       return;
    }
}
