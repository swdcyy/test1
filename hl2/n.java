package hl2.n;
import erd.g;
import com.kuaishou.live.core.show.template.j;
import com.kuaishou.livestream.message.nano.LiveActivitySignalMessage$LiveActivityPopUpInfo;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.String;
import android.graphics.drawable.Drawable;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo;
import com.kuaishou.android.live.log.LiveLogTag;
import fg6.a;
import com.google.gson.Gson;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class n implements g	// class@002dc8
{
    public final j b;
    public final LiveActivitySignalMessage$LiveActivityPopUpInfo c;
    public final UserInfo d;
    public final CDNUrl[] e;

    public void n(j p0,LiveActivitySignalMessage$LiveActivityPopUpInfo p1,UserInfo p2,CDNUrl[] p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       n tb = this.b;
       n tc = this.c;
       Objects.requireNonNull(tb);
       tb.b9(tc.activityId, this.d, tc.displayFollowButton, tc.timeoutMillis, null, tc.animationPicInfo);
       b.c0(LiveLogTag.LIVE_GUEST_ACTIVITY, "download image failed", "popupDialogBackgroundUrls", a.a.q(this.e));
    }
}
