package gra.g$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.growth.vfc.model.ShowShareAwardDialog;
import gra.g;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonObject;
import fra.a;
import dra.c;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$VfcButtonType;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$a;
import com.kwai.library.widget.popup.common.c;
import gra.h;

public final class g$a extends m	// class@002bac
{
    public final ShowShareAwardDialog c;
    public final g d;

    public void g$a(ShowShareAwardDialog p0,g p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g$a.class, "1")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("vUserId", this.d.b9().d);
       jsonObject.c0("subBiz", this.d.b9().c);
       c.b(jsonObject);
       GrowthVfcLogger.a.a(this.d.D, GrowthVfcLogger$VfcButtonType.SUB_BUTTON);
       c uoc = this.d.X8();
       if (uoc != null) {
          uoc.o();
       }
       PatchProxy.onMethodExit(g$a.class, "1");
       return;
    }
}
