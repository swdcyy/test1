package com.kuaishou.live.common.core.component.notification.b;
import erd.g;
import com.kuaishou.live.common.core.component.notification.LiveOperationNotificationView;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$SCTopBroadcastNotice;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.widget.FrameLayout;
import iv1.i;
import ekd.k1;
import crd.b;
import lnc.b9;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import android.view.View;
import iv1.h;

public final class b implements g	// class@0016e4
{
    public final LiveOperationNotificationView b;
    public final LiveCommonNoticeMessages$SCTopBroadcastNotice c;
    public final Runnable d;

    public void b(LiveOperationNotificationView p0,LiveCommonNoticeMessages$SCTopBroadcastNotice p1,Runnable p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       b tb = this.b;
       b tc = this.c;
       b td = this.d;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.setupMarqueeView(tc);
          LiveCommonNoticeMessages$SCTopBroadcastNotice displayDurat = tc.displayDurationMillis;
          if (!PatchProxy.isSupport(LiveOperationNotificationView.class) || !PatchProxy.applyVoidTwoRefs(td, Long.valueOf(displayDurat), tb, LiveOperationNotificationView.class, "6")) {
             b.Z(LiveLogTag.ACTIVITY_TEMPLATE_TOP_NOTIFICATION, "onCommonNotificationViewShow");
             tb.setVisibility(0);
             tb.bringToFront();
             p0 = new i(tb, td);
             if (displayDurat <= 0) {
                displayDurat = 0x3a98;
             }
             k1.r(p0, displayDurat);
             b9.a(tb.h);
          }
          tb.setupLeftIconViewAnimationIfNecessary(tc);
          if (!PatchProxy.applyVoidOneRefs(tc, tb, LiveOperationNotificationView.class, "19")) {
             if (tb.f(tc.shimmerPic)) {
                tb.g.setVisibility(0);
                k1.s(new h(tb), tb.i, 200);
             }else {
                tb.g.setVisibility(8);
             }
          }
       }else {
          tb.d(td);
       }
       return;
    }
}
