package ba2.b0;
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
import ba2.v;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.hourlytrank.LiveHourlyRankPendantView;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.ViewFlipper;

public final class b0 implements Runnable	// class@000384
{
    public final h b;

    public void b0(h p0){
       this.b = p0;
    }
    public final void run(){
       boolean b;
       b0 tb = this.b;
       Objects.requireNonNull(tb);
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, oh, "21")) {
       }else if(tb.r == null){
          h obj = PatchProxy.apply(objArray, tb, oh, "32");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = tb.X;
             if (obj != null && (obj.isInTop != null && v.g())) {
                obj = tb.X;
                if (obj.isInGlobalRank != null && !TextUtils.x(obj.globalRankName)) {
                   b = true;
                }
             }
          label_0048 :
             b = false;
          }
          if (b) {
             if (!PatchProxy.applyVoid(objArray, tb, oh, "26")) {
                if (tb.v == null) {
                   tb.v = tb.R8(1, 1);
                }
                if (tb.v.getParent() == null) {
                   tb.r.addView(tb.v);
                }
                if (!TextUtils.n(tb.v.getContentText(), tb.X.globalRankName)) {
                   tb.v.setContentText(tb.X.globalRankName);
                   tb.v.requestLayout();
                }
                tb.H = 1;
                oh = tb.X;
                tb.I = oh.globalRankName;
                String[] stringArray = tb.S8(oh.globalPendantColor);
                if (tb.m9(tb.v, tb.Z0, stringArray)) {
                   tb.Z0 = stringArray;
                }
                tb.b9();
             }
          }else {
             oh = tb.v;
             if (oh != null) {
                tb.r.removeView(oh);
             }
          }
       }
       return;
    }
}
