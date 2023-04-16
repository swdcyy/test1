package bg2.b;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import android.widget.ViewFlipper;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.live.widget.LiveNumberTextView;
import android.content.Context;
import lnc.a1;
import android.widget.TextView;
import android.graphics.Typeface;

public class b	// class@0003ee
{
    public final LiveViewFlipper a;

    public void b(LiveViewFlipper p0,int p1){
       super();
       this.a = p0;
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), this, uob, "3")) {
          p0.addView(this.a(p1));
          p0.addView(this.a(p1));
       }
       return;
    }
    public final View a(int p0){
       LiveNumberTextView obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new LiveNumberTextView(this.a.getContext());
       obj.setTextColor(a1.a(p0));
       obj.setTextSize(0, (float)a1.d(R.dimen.arg_RES_7f070295));
       obj.setTypeface(Typeface.defaultFromStyle(3));
       return obj;
    }
}
