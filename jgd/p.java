package jgd.p;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import jgd.o;
import erd.g;
import com.yxcorp.plugin.setting.helper.j;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class p implements SlipSwitchButton$b	// class@0016ec
{
    public GifshowActivity a;
    public j b;
    public final boolean c;

    public void p(boolean p0){
       this.c = p0;
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, op, "1")) {
          return;
       }
       this.b.l(p0, "enable_shake", p1, new o(p1));
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       p0.elementPackage = uElementPack;
       uElementPack.action2 = "SHAKE_SET_BUTTON";
       i3 oi3 = i3.f();
       int i = 2;
       int i1 = (this.c != null)? 1: 2;
       oi3.c("status", Integer.valueOf(i1));
       if (p1) {
          i = 1;
       }
       oi3.c("click_area", Integer.valueOf(i));
       uElementPack.params = oi3.e();
       u1.G("3378123", 1, uElementPack, null);
       return;
    }
}
