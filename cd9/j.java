package cd9.j;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutPanel;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager$LayoutMode;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class j implements View$OnClickListener	// class@0005a9
{
    public final DuetLayoutPanel b;
    public final DuetLayoutManager$LayoutMode c;

    public void j(DuetLayoutPanel p0,DuetLayoutManager$LayoutMode p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       j tb = this.b;
       j tc = this.c;
       tb.q = tc;
       tb.ch();
       DuetLayoutPanel p = tb.p;
       Objects.requireNonNull(p);
       if (PatchProxy.applyVoidOneRefs(tc, p, DuetLayoutManager.class, "14")) {
       }else {
          p.v = tc;
          p.h2();
       }
       if (!PatchProxy.applyVoid(null, null, CameraLogger.class, "40")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.type = 1;
          uElementPack.action = 406;
          uElementPack.name = "select_layout";
          u1.u(1, uElementPack, new ClientContent$ContentPackage());
       }
       return;
    }
}
