package hl2.m;
import erd.g;
import com.kuaishou.live.core.show.template.j;
import com.kuaishou.livestream.message.nano.LiveActivitySignalMessage$LiveActivityPopUpInfo;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import android.graphics.Bitmap;
import java.util.Objects;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import lnc.a1;
import java.lang.String;
import android.graphics.drawable.Drawable;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import n92.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class m implements g	// class@002dc7
{
    public final j b;
    public final LiveActivitySignalMessage$LiveActivityPopUpInfo c;
    public final UserInfo d;

    public void m(j p0,LiveActivitySignalMessage$LiveActivityPopUpInfo p1,UserInfo p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       m tb = this.b;
       m tc = this.c;
       m td = this.d;
       Objects.requireNonNull(tb);
       tb.b9(tc.activityId, td, tc.displayFollowButton, tc.timeoutMillis, new BitmapDrawable(a1.m(), p0), tc.animationPicInfo);
       p0 = tb.K.Z2.a();
       LiveActivitySignalMessage$LiveActivityPopUpInfo activityId = tc.activityId;
       if (PatchProxy.applyVoidThreeRefs(p0, td, activityId, null, c.class, "1")) {
       }else {
          u1.u0(9, c.b(activityId, "KWAI_ACTIVE_FOLLOW_CARD"), c.a(p0, td));
       }
       return;
    }
}
