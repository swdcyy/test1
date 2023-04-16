package gra.h$c;
import uo7.u;
import gra.h;
import java.lang.Object;
import java.lang.Throwable;
import uo7.k;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcUtilKt;

public final class h$c implements u	// class@002bb2
{
    public final h b;

    public void h$c(h p0){
       this.b = p0;
       super();
    }
    public int a(Throwable p0){
       return 0;
    }
    public void d(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h$c.class, "1")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "panelElement");
       c uoc = this.b.X8();
       if (uoc != null) {
          GrowthVfcUtilKt.a(uoc);
       }
       return;
    }
    public void e(k p0,ShareInitResponse$SharePanelElement p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h$c.class, "2")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "panelElement");
       return;
    }
}
