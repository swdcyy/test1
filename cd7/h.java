package cd7.h;
import java.lang.Object;
import java.lang.String;
import k2b.e0;
import com.kwai.nearby.model.NearbyPendantInfo$NearbyPendantConfig;
import com.kwai.nearby.model.WidgetState;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.yxcorp.gifshow.log.model.CommonParams;
import android.view.View;

public final class h	// class@000538
{

    public void h(){
       super();
    }
    public static void a(String p0,e0 p1,NearbyPendantInfo$NearbyPendantConfig p2,WidgetState p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, h.class, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "NEARBY_FLOAT_POPUP";
       i3 oi3 = i3.f();
       oi3.d("click_area", p0);
       oi3.c("float_id", Integer.valueOf(p2.mWidgetId));
       oi3.d("float_title", p2.mWidgetBiz);
       oi3.d("float_status", String.valueOf(p3));
       uElementPack.params = oi3.e();
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       uClickEvent.type = 1;
       uClickEvent.elementPackage = uElementPack;
       b.a(0x4b316083).Y("3280902", uClickEvent, null, false, null, null, null);
       return;
    }
}
