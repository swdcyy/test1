package aic.b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import aic.a$d;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yhc.a;
import java.util.Objects;
import aic.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import qrd.l1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import java.lang.Integer;
import o07.o;

public final class b implements PopupInterface$h	// class@000127
{
    public final a$d b;

    public void b(a$d p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       a$d b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       a.a.e();
       b = this.b.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoid(null, b, a.class, "2")) {
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          ClientEvent$AreaPackage uAreaPackage = new ClientEvent$AreaPackage();
          uAreaPackage.name = "MASTER_SHARE_TIP_POPUP";
          showEvent.areaPackage = uAreaPackage;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "AREA";
          showEvent.elementPackage = uElementPack;
          u1.g0(showEvent);
       }
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, b.class, "2")) {
          return;
       }
       a.p(p0, "popup");
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
