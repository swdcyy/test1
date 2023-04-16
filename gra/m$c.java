package gra.m$c;
import android.view.View$OnClickListener;
import gra.m;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;
import gra.h;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$VfcButtonType;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$a;

public final class m$c implements View$OnClickListener	// class@002bbb
{
    public final m b;

    public void m$c(m p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$c.class, "1")) {
          return;
       }
       c uoc = this.b.X8();
       if (uoc != null) {
          uoc.o();
       }
       GrowthVfcLogger.a.e(this.b.C, GrowthVfcLogger$VfcButtonType.X_CLOSE_BUTTON);
       return;
    }
}
