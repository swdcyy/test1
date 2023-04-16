package ad3.h;
import erd.g;
import ad3.j;
import java.lang.Object;
import com.kuaishou.live.recruit.LiveRecruitWidgetInfoResponse;
import com.kuaishou.commercial.reporter.data.ApiResponseMessageData;
import java.lang.System;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import oy.a;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LivePlusRecruitButton;
import q51.b;

public final class h implements g	// class@00008e
{
    public final j b;
    public final long c;

    public void h(j p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       h tb = this.b;
       j t = tb.t;
       t.mRecruitSendTimePeriodMs = this.c - tb.q;
       t.mRecruitReceiveTimePeriodMs = System.currentTimeMillis() - tb.q;
       if (tb.B != null) {
          b.Z(LiveLiteLogTag.LITE_RECRUIT_BOTTOM, "requestRecruitBottomBarIfNecessary, hasReceivedBottomBarInfo, ignore");
       }else {
          int i = 1;
          if (tb.v == null) {
             tb.s.d0(i);
             tb.v = i;
          }
          p0 = b.a(p0.mBottomBarWidgetBase64Info);
          if (p0 == null) {
             j t1 = tb.t;
             LivePlusRecruitMessages$LivePlusRecruitButton canShow = p0.canShow;
             t1.mCanShowWidget = canShow;
             if (canShow == null) {
                i = 2;
             }
             t1.mWidgetDataType = i;
          }
          tb.V2(p0);
       }
       return;
    }
}
