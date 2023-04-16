package aic.d;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import aic.e$a;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import aic.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import qrd.l1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import java.lang.Integer;
import o07.o;

public final class d implements PopupInterface$h	// class@000129
{
    public final e$a b;

    public void d(e$a p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       e$a b = this.b.b;
       String str = "SHARE_TIP_POPUP";
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidOneRefs(str, b, e.class, "2")) {
          a.p(str, "area");
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          ClientEvent$AreaPackage uAreaPackage = new ClientEvent$AreaPackage();
          uAreaPackage.name = str;
          showEvent.areaPackage = uAreaPackage;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "AREA";
          showEvent.elementPackage = uElementPack;
          u1.g0(showEvent);
       }
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, d.class, "2")) {
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
