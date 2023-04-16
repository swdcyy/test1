package oj.f;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.gifshow.tuna.player.poi.f;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nj.a;
import nj.g;
import k2b.e0;
import nj.b;
import oj.h;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import o07.o;

public class f implements PopupInterface$h	// class@0027d6
{
    public final f b;

    public void f(f p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, str)) {
          return;
       }
       e0 uoe0 = this.b.a.a.c();
       if (!PatchProxy.applyVoidOneRefs(uoe0, null, h.class, "4")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "COLLECT_SUCCESS_DIALOG";
          i3 oi3 = i3.f();
          oi3.d("card_type", str);
          uElementPack.params = oi3.e();
          u1.C0("", uoe0, 10, uElementPack, null);
       }
       return;
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
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
