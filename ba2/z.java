package ba2.z;
import java.lang.Runnable;
import com.kuaishou.live.core.show.hourlytrank.h;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.hourlytrank.LiveHourlyRankPendantView;
import android.view.View;
import android.widget.ViewFlipper;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class z implements Runnable	// class@0003b7
{
    public final h b;

    public void z(h p0){
       this.b = p0;
    }
    public final void run(){
       z tb = this.b;
       Objects.requireNonNull(tb);
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, oh, "19")) {
       }else if(tb.r == null || tb.X == null){
          if (tb.y == null) {
             tb.y = tb.R8(3, 0);
          }
          if (!PatchProxy.applyVoid(objArray, tb, oh, "20")) {
             oh = tb.u;
             if (oh != null) {
                tb.r.removeView(oh);
             }
             oh = tb.v;
             if (oh != null) {
                tb.r.removeView(oh);
             }
             oh = tb.z;
             if (oh != null) {
                tb.r.removeView(oh);
             }
          }
          if (tb.y.getParent() == null) {
             tb.r.addView(tb.y);
          }
          if (!TextUtils.n(tb.X.displayNotInTop, tb.y.getContentText())) {
             tb.y.setContentText(tb.X.displayNotInTop);
             tb.y.requestLayout();
          }
          tb.H = 3;
          tb.I = tb.X.displayNotInTop;
          tb.b9();
       }
       return;
    }
}
