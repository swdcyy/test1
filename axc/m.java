package axc.m;
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

public final class m implements View$OnClickListener	// class@0002ef
{
    public final OffsetCaliper b;

    public void m(OffsetCaliper p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, OffsetCaliper.class, "6")) {
       }else {
          OffsetCaliper d = tb.d;
          Objects.requireNonNull(d);
          if (!PatchProxy.applyVoid(objArray, d, OffsetCaliperBaseLine.class, "5")) {
             d.b(d.e);
          }
          d = tb.e;
          if (d != null) {
             d.a(tb.getCurrentOffset());
          }
       }
       return;
    }
}
