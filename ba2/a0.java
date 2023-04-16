package ba2.a0;
import java.lang.Runnable;
import com.kuaishou.live.core.show.hourlytrank.h;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankInfo;
import com.kuaishou.live.core.show.hourlytrank.LiveHourlyRankPendantView;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.ViewFlipper;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;

public final class a0 implements Runnable	// class@000382
{
    public final h b;

    public void a0(h p0){
       this.b = p0;
    }
    public final void run(){
       a0 tb = this.b;
       Objects.requireNonNull(tb);
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, oh, "22")) {
       }else if(tb.r == null){
          String str = "LiveNewHourlyRankPresenter";
          if (tb.Z8()) {
             if (!PatchProxy.applyVoid(objArray, tb, oh, "23") && tb.r != null) {
                oh = tb.X;
                if (oh != null) {
                   if (tb.f1 == null) {
                      tb.f1 = tb.R8(oh.aggregationRankType, 1);
                   }
                   if (tb.f1.getParent() == null) {
                      tb.r.addView(tb.f1);
                      b.P(LiveLogTag.HOURLY_RANK.appendTag(str), "add [district] pendant");
                   }
                   if (!TextUtils.n(tb.f1.getContentText(), tb.X.aggregationDisplayName)) {
                      b.P(LiveLogTag.HOURLY_RANK.appendTag(str), "update [district] pendant str = "+tb.X.aggregationDisplayName);
                      tb.f1.setContentText(tb.X.aggregationDisplayName);
                      tb.f1.requestLayout();
                   }
                   oh = tb.X;
                   tb.H = oh.aggregationRankType;
                   tb.I = oh.aggregationDisplayName;
                   String[] stringArray = tb.S8(oh.aggregationPendantColor);
                   if (tb.m9(tb.f1, tb.g1, stringArray)) {
                      tb.g1 = stringArray;
                   }
                   tb.b9();
                }
             }
          }else if(tb.f1 != null){
             b.P(LiveLogTag.HOURLY_RANK.appendTag(str), "delete [district] pendant");
             if (!PatchProxy.applyVoid(objArray, tb, oh, "25")) {
                oh = tb.r;
                if (oh != null) {
                   h oh1 = tb.f1;
                   if (oh1 != null) {
                      oh.removeView(oh1);
                      tb.X = objArray;
                   }
                }
             }
          }
       }
       return;
    }
}
