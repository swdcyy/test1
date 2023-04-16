package gra.v$a;
import android.view.View$OnClickListener;
import gra.v;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;
import gra.h;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$VfcButtonType;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$VfcPopType;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$a;

public final class v$a implements View$OnClickListener	// class@002bc8
{
    public final v b;

    public void v$a(v p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$a.class, "1")) {
          return;
       }
       c uoc = this.b.X8();
       if (uoc != null) {
          uoc.q(1);
       }
       GrowthVfcLogger.a.b(GrowthVfcLogger$VfcButtonType.X_CLOSE_BUTTON, GrowthVfcLogger$VfcPopType.TYPE1, this.b.e9());
       return;
    }
}
