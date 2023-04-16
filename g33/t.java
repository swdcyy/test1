package g33.t;
import u07.u;
import com.kuaishou.live.external.LiveSettingsActivity;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.content.Context;
import lnc.i9;

public final class t implements u	// class@002a5e
{
    public final LiveSettingsActivity b;
    public final AtomicBoolean c;

    public void t(LiveSettingsActivity p0,AtomicBoolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       p0 = this.b;
       p0.y = true;
       this.c.set(true);
       if (PatchProxy.applyVoid(null, p0, LiveSettingsActivity.class, "16")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 0x76b7;
          u1.u(true, uElementPack, null);
       }
       i9.d(ActivityContext.g().e());
       return;
    }
}
