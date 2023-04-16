package gra.t$a;
import erd.g;
import gra.t;
import brd.v;
import java.lang.Object;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcServerResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcModel;
import com.kwai.library.widget.popup.common.c;
import gra.h;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcUtilKt;
import fra.g;
import gra.v;
import java.lang.Boolean;
import brd.g;

public final class t$a implements g	// class@002bc4
{
    public final t b;
    public final v c;

    public void t$a(t p0,v p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t$a.class, "1")) {
       }else {
          GrowthVfcServerResponse dialog = p0.dialog;
          boolean b = true;
          if (dialog != null && dialog.hasFollow == b) {
             c uoc = this.b.b.X8();
             if (uoc != null) {
                GrowthVfcUtilKt.a(uoc);
             }
             GrowthVfcUtilKt.b(p0.dialog, this.b.b.k9().c(), this.b.b.k9().d());
          }
          t$a tc = this.c;
          p0 = p0.dialog;
          if (p0 == null || p0.hasFollow != null) {
             b = false;
          }
          tc.onNext(Boolean.valueOf(b));
          this.c.onComplete();
       }
       return;
    }
}
