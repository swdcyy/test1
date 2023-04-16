package g33.x;
import android.view.View$OnClickListener;
import com.kuaishou.live.external.LiveSettingsActivity;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wk2.s;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.live.core.show.subscribe.subscribelist.LiveSubscribedAnchorActivity;
import android.content.Intent;
import android.content.Context;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class x implements View$OnClickListener	// class@002a62
{
    public GifshowActivity b;
    public final LiveSettingsActivity c;

    public void x(LiveSettingsActivity p0){
       this.c = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "1")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, objArray, s.class, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "APPOINTMENT_LIST_ENTRY";
          u1.u(1, uElementPack, objArray);
       }
       x tb = this.b;
       if (!PatchProxy.applyVoidOneRefs(tb, objArray, LiveSubscribedAnchorActivity.class, "1")) {
          tb.startActivity(new Intent(tb, LiveSubscribedAnchorActivity.class));
       }
       return;
    }
}
