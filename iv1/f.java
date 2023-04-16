package iv1.f;
import erd.g;
import com.kuaishou.live.common.core.component.notification.LiveOperationNotificationView;
import java.lang.Object;
import android.graphics.Bitmap;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;

public final class f implements g	// class@0029a1
{
    public final LiveOperationNotificationView b;

    public void f(LiveOperationNotificationView p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       b.Z(LiveLogTag.ACTIVITY_TEMPLATE_TOP_NOTIFICATION, "download Shimmer Succeed");
       tb.f.setImageBitmap(Bitmap.createScaledBitmap(p0, a1.d(R.dimen.arg_RES_7f070896), a1.d(R.dimen.arg_RES_7f070897), true));
       tb.f.setVisibility(4);
    }
}
