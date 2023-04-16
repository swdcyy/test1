package ba2.d0;
import java.lang.Runnable;
import com.kuaishou.live.core.show.hourlytrank.h;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.ViewFlipper;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.hourlytrank.LiveHourlyRankPendantView;
import android.view.ViewParent;
import android.widget.LinearLayout;

public final class d0 implements Runnable	// class@000389
{
    public final h b;

    public void d0(h p0){
       this.b = p0;
    }
    public final void run(){
       boolean b;
       d0 tb = this.b;
       Objects.requireNonNull(tb);
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, oh, "30")) {
       }else {
          h r = tb.r;
          if (r != null) {
             if (tb.V0 == null) {
                h z = tb.z;
                if (z != null) {
                   r.removeView(z);
                }
             }else {
                Object obj = PatchProxy.apply(objArray, tb, oh, "34");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else {
                   r = tb.X;
                   b = (r != null && (r.isInCityRank != null && !TextUtils.x(r.cityRankName)))? true: false;
                }
                if (b) {
                   if (!PatchProxy.applyVoid(objArray, tb, oh, "31")) {
                      int i = 9;
                      tb.H = i;
                      tb.I = tb.X.cityRankName;
                      if (tb.z == null) {
                         tb.z = tb.R8(i, 1);
                      }
                      if (tb.z.getParent() == null) {
                         tb.r.addView(tb.z);
                      }
                      if (!TextUtils.n(tb.z.getContentText(), tb.I)) {
                         tb.z.setContentText(tb.I);
                         tb.z.requestLayout();
                      }
                      String[] stringArray = tb.S8(tb.X.cityPendantColor);
                      if (tb.m9(tb.z, tb.b1, stringArray)) {
                         tb.b1 = stringArray;
                      }
                      tb.b9();
                   }
                }else {
                   oh = tb.z;
                   if (oh != null) {
                      tb.r.removeView(oh);
                   }
                }
             }
          }
       }
       return;
    }
}
