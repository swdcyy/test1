package axc.n;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.widget.OffsetCaliper;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.widget.OffsetCaliperBaseLine;
import com.yxcorp.gifshow.v3.widget.OffsetCaliper$a;

public final class n implements View$OnClickListener	// class@0002f0
{
    public final OffsetCaliper b;

    public void n(OffsetCaliper p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, OffsetCaliper.class, "7")) {
       }else {
          OffsetCaliper d = tb.d;
          Objects.requireNonNull(d);
          if (!PatchProxy.applyVoid(objArray, d, OffsetCaliperBaseLine.class, "6")) {
             d.b((- d.e));
          }
          d = tb.e;
          if (d != null) {
             d.a(tb.getCurrentOffset());
          }
       }
       return;
    }
}
