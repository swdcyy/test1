package com.kuaishou.live.core.show.redpacket.redpackrain2.widget.a;
import erd.g;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.LiveRedPackRainSnatchView;
import java.lang.Object;
import java.lang.Long;
import wh2.b;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource$RedPackRainButton;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource$RedPackRainText;
import android.graphics.Color;
import uh2.r;
import android.widget.TextView;

public final class a implements g	// class@000f33
{
    public final LiveRedPackRainSnatchView b;
    public final long c;

    public void a(LiveRedPackRainSnatchView p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       a tb = this.b;
       a tc = this.c;
       if (tb.l == null && (p0.longValue() - 0x493e0 < 0 && tb.o == null)) {
          tb.setOnClickListener(new b(tb));
          if (!PatchProxy.applyVoid(null, tb, LiveRedPackRainSnatchView.class, "9")) {
             LiveRedPackRainSnatchView k = tb.k;
             String str = "/udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_count_down_bg.webp";
             String str1 = "#C23D01";
             if (k != null) {
                LiveRedPackRainResource mGrabPrepare = k.mGrabPrepareCountDownButton;
                if (mGrabPrepare != null) {
                   tb.g(mGrabPrepare.mImageUrls, str);
                   LiveRedPackRainResource$RedPackRainButton mRedPackRain = mGrabPrepare.mRedPackRainText;
                   if (mRedPackRain != null) {
                      tb.d.setTextColor(r.b(mRedPackRain.mTextColor, Color.parseColor(str1)));
                      tb.f.setTextColor(r.b(mRedPackRain.mTextColor, Color.parseColor(str1)));
                   }else {
                      tb.d.setTextColor(Color.parseColor(str1));
                      tb.f.setTextColor(Color.parseColor(str1));
                   }
                }
             }
             tb.a(str);
             tb.d.setTextColor(Color.parseColor(str1));
             tb.f.setTextColor(Color.parseColor(str1));
          }
          tb.o = true;
       }
    label_008c :
       tb.e(p0.longValue(), tc);
       if (p0.longValue() <= 0) {
          tb.d();
       }
       return;
    }
}
