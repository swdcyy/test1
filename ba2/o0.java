package ba2.o0;
import java.lang.Runnable;
import com.kuaishou.live.core.show.hourlytrank.h;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneLiveHourRankInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.hourlytrank.LiveHourlyRankPendantView;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.ViewFlipper;

public final class o0 implements Runnable	// class@0003a1
{
    public final h b;

    public void o0(h p0){
       this.b = p0;
    }
    public final void run(){
       o0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, h.class, "37")) {
       }else if(tb.a9(tb.Z) && !TextUtils.x(tb.V8(tb.Z))){
          if (tb.x == null) {
             tb.x = tb.R8(6, 2);
          }
          if (tb.x.getParent() == null) {
             tb.r.addView(tb.x);
          }
          String str = tb.V8(tb.Z);
          if (!TextUtils.n(tb.x.getContentText(), str)) {
             tb.x.setContentText(str);
             tb.x.requestLayout();
          }
          tb.H = 6;
          tb.I = str;
          tb.b9();
       }else {
          h x = tb.x;
          if (x != null) {
             tb.r.removeView(x);
          }
       }
       return;
    }
}
