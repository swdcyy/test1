package iv1.l;
import erd.g;
import com.kuaishou.live.common.core.component.notification.LiveOperationNotificationView;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$SCTopBroadcastNotice;
import java.lang.Object;
import android.graphics.Bitmap;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import android.content.res.Resources;
import android.widget.FrameLayout;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$StretchablePicture;
import lnc.a1;
import android.graphics.drawable.NinePatchDrawable;
import ya1.y;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class l implements g	// class@0029a7
{
    public final LiveOperationNotificationView b;
    public final LiveCommonNoticeMessages$SCTopBroadcastNotice c;

    public void l(LiveOperationNotificationView p0,LiveCommonNoticeMessages$SCTopBroadcastNotice p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       l tb = this.b;
       Bitmap uBitmap = p0;
       Objects.requireNonNull(tb);
       b.Z(LiveLogTag.ACTIVITY_TEMPLATE_TOP_NOTIFICATION, "downloadBackgroundSucceed");
       p0 = this.c.backgroundPicture;
       Resources resources = tb.getResources();
       tb.d.setImageDrawable(y.a(resources, uBitmap, 1, a1.e((float)p0.insetLeftDp), uBitmap.getHeight(), a1.e((float)p0.insetRightDp)));
    }
}
