package gra.d$a;
import android.view.View$OnClickListener;
import gra.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;
import gra.h;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$VfcButtonType;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import fra.e;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.vfc.model.NormalReceiveCouponDialogModel;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$a;

public final class d$a implements View$OnClickListener	// class@002ba7
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, str)) {
          return;
       }
       c uoc = this.b.X8();
       if (uoc != null) {
          uoc.o();
       }
       GrowthVfcLogger$a a = GrowthVfcLogger.a;
       GrowthVfcLogger$VfcButtonType x_CLOSE_BUTT = GrowthVfcLogger$VfcButtonType.X_CLOSE_BUTTON;
       d$a tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       d uod = PatchProxy.apply(objArray, tb, d.class, str);
       if (uod != PatchProxyResult.class) {
       }else {
          uod = tb.r;
          if (uod == null) {
             a.S("mCallContext");
          }
       }
       NormalReceiveCouponDialogModel normalReceiv = uod.b();
       if (normalReceiv != null) {
          objArray = normalReceiv.logTracker;
       }
       a.c(x_CLOSE_BUTT, objArray);
       return;
    }
}
