package ba2.c0;
import java.lang.Runnable;
import com.kuaishou.live.core.show.hourlytrank.h;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.hourlytrank.LiveHourlyRankPendantView;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.ViewFlipper;

public final class c0 implements Runnable	// class@000386
{
    public final h b;

    public void c0(h p0){
       this.b = p0;
    }
    public final void run(){
       boolean b;
       c0 tb = this.b;
       Objects.requireNonNull(tb);
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, oh, "28")) {
       }else if(tb.r == null){
          h obj = PatchProxy.apply(objArray, tb, oh, "33");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = tb.X;
             b = (obj != null && (obj.isInTop != null && (obj.isInRank != null && !TextUtils.x(obj.rankName))))? true: false;
          }
          if (b) {
             if (!PatchProxy.applyVoid(objArray, tb, oh, "29")) {
                int i = 2;
                if (tb.u == null) {
                   tb.u = tb.R8(i, 1);
                }
                if (tb.u.getParent() == null) {
                   tb.r.addView(tb.u);
                }
                if (!TextUtils.n(tb.u.getContentText(), tb.X.rankName)) {
                   tb.u.setContentText(tb.X.rankName);
                   tb.u.requestLayout();
                }
                tb.H = i;
                oh = tb.X;
                tb.I = oh.rankName;
                String[] stringArray = tb.S8(oh.districtPendantColor);
                if (tb.m9(tb.u, tb.a1, stringArray)) {
                   tb.a1 = stringArray;
                }
                tb.b9();
             }
          }else {
             oh = tb.u;
             if (oh != null) {
                tb.r.removeView(oh);
             }
          }
       }
       return;
    }
}
