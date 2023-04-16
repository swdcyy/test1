package iv1.j;
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
import android.widget.ImageView;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class j implements g	// class@0029a5
{
    public final LiveOperationNotificationView b;
    public final LiveCommonNoticeMessages$SCTopBroadcastNotice c;

    public void j(LiveOperationNotificationView p0,LiveCommonNoticeMessages$SCTopBroadcastNotice p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       b.Z(LiveLogTag.ACTIVITY_TEMPLATE_TOP_NOTIFICATION, "downloadLeftIconSucceed");
       tb.a(this.c);
       tb.b.invalidate();
       tb.b.setImageDrawable(new BitmapDrawable(tb.getResources(), p0));
       tb.b.setVisibility(0);
    }
}
