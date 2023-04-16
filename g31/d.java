package g31.d;
import erd.g;
import com.kuaishou.live.audience.component.topbar.LiveAudienceTopBarPresenter;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;

public final class d implements g	// class@00240b
{
    public final LiveAudienceTopBarPresenter b;

    public void d(LiveAudienceTopBarPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       tb.P.L(p0);
       tb.Q.setAlpha(0);
    }
}
