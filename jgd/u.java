package jgd.u;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import wkd.b;
import ho5.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class u implements SlipSwitchButton$b	// class@0016f1
{
    public GifshowActivity a;

    public void u(){
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ou, "1")) {
          return;
       }
       b.a(-607332832).x(p1);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       p0.elementPackage = uElementPack;
       uElementPack.action2 = "CLICK_SERVER_ENTRANCE";
       i3 oi3 = i3.f();
       String str = (p1)? "ON": "OFF";
       oi3.d("button_type", str);
       uElementPack.params = oi3.e();
       u1.G("1008106", 1, uElementPack, null);
       return;
    }
}
