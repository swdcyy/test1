package gra.y$b;
import android.view.View$OnClickListener;
import gra.y;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$VfcButtonType;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$VfcPopType;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$a;
import com.kwai.library.widget.popup.common.c;
import gra.h;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcUtilKt;

public final class y$b implements View$OnClickListener	// class@002bd0
{
    public final y b;

    public void y$b(y p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y$b.class, "1")) {
          return;
       }
       GrowthVfcLogger$a.d(GrowthVfcLogger.a, GrowthVfcLogger$VfcButtonType.X_CLOSE_BUTTON, GrowthVfcLogger$VfcPopType.TYPE4, null, 4, null);
       c uoc = this.b.X8();
       if (uoc != null) {
          GrowthVfcUtilKt.a(uoc);
       }
       return;
    }
}
