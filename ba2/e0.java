package ba2.e0;
import java.lang.Runnable;
import com.kuaishou.live.core.show.hourlytrank.h;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.livestream.message.nano.SCLivePopularityRankInfo;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.hourlytrank.LiveHourlyRankPendantView;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.ViewFlipper;
import java.lang.StringBuilder;
import java.lang.Integer;
import com.kuaishou.live.core.show.hourlytrank.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ba2.i;

public final class e0 implements Runnable	// class@00038b
{
    public final h b;

    public void e0(h p0){
       this.b = p0;
    }
    public final void run(){
       SCLivePopularityRankInfo displayRank;
       e0 tb = this.b;
       Objects.requireNonNull(tb);
       h oh = h.class;
       if (PatchProxy.applyVoid(null, tb, oh, "35")) {
       }else if(tb.r == null){
          String str = "LiveNewHourlyRankPresenter";
          if (tb.Y != null) {
             LiveLogTag hOURLY_RANK = LiveLogTag.HOURLY_RANK;
             hOURLY_RANK.appendTag(str);
             LiveLogTag liveLogTag = hOURLY_RANK;
             b.T(liveLogTag, "on update [popularity]", "showRank", Boolean.valueOf(tb.Y.showRank), "displayRank", tb.Y.displayRank);
          }
          h y = tb.Y;
          if (y != null && (y.showRank != null && !TextUtils.x(y.displayRank))) {
             int i = 7;
             if (tb.w == null) {
                LiveHourlyRankPendantView liveHourlyRa = tb.R8(i, 3);
                tb.w = liveHourlyRa;
                liveHourlyRa.setIconRes(R.string.arg_RES_7f101e7c);
             }
             if (tb.w.getParent() == null) {
                tb.r.addView(tb.w);
                b.P(LiveLogTag.HOURLY_RANK.appendTag(str), "add [popularity] pendant");
             }
             if (!TextUtils.n(tb.w.getContentText(), tb.Y.displayRank)) {
                b.P(LiveLogTag.HOURLY_RANK.appendTag(str), "update [popularity] pendant str = "+tb.Y.displayRank);
                tb.w.setContentText(tb.Y.displayRank);
                tb.w.requestLayout();
             }
             tb.H = i;
             y = tb.Y;
             displayRank = y.displayRank;
             tb.I = displayRank;
             SCLivePopularityRankInfo rankType = y.rankType;
             if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(rankType), displayRank, tb, oh, "47")) {
                oh = tb.F;
                if (oh == null || (oh.t() && tb.U == null)) {
                   tb.U = true;
                   int[] ointArray = new int[0];
                   i.e(tb.J.a(), rankType, displayRank, ointArray);
                }
             }
          }else {
             oh = tb.w;
             if (oh != null) {
                tb.r.removeView(oh);
             }
          }
       }
    label_00f6 :
       return;
    }
}
