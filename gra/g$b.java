package gra.g$b;
import android.view.View$OnClickListener;
import gra.g;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;
import gra.h;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$VfcButtonType;
import com.google.gson.JsonObject;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$a;

public final class g$b implements View$OnClickListener	// class@002bad
{
    public final g b;

    public void g$b(g p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$b.class, "1")) {
          return;
       }
       c uoc = this.b.X8();
       if (uoc != null) {
          uoc.o();
       }
       GrowthVfcLogger.a.a(this.b.D, GrowthVfcLogger$VfcButtonType.X_CLOSE_BUTTON);
       return;
    }
}
