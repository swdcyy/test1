package g33.u;
import u07.u;
import com.kuaishou.live.external.LiveSettingsActivity;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import oe6.e;

public final class u implements u	// class@002a5f
{
    public final LiveSettingsActivity b;
    public final AtomicBoolean c;

    public void u(LiveSettingsActivity p0,AtomicBoolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       u tb = this.b;
       Objects.requireNonNull(tb);
       this.c.set(true);
       if (PatchProxy.applyVoid(null, tb, LiveSettingsActivity.class, "17")) {
       }else {
          ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 0x76b8;
          uClickEvent.elementPackage = uElementPack;
          uClickEvent.type = 1;
          u1.u(true, uElementPack, null);
       }
       e.i0(false);
       tb.u3();
       return;
    }
}
