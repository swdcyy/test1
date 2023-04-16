package jgd.j;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import wkd.b;
import io5.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class j implements SlipSwitchButton$b	// class@0016e6
{
    public GifshowActivity a;
    public final GifshowActivity b;

    public void j(GifshowActivity p0){
       this.b = p0;
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oj, "1")) {
          return;
       }
       int i = -468808496;
       b.a(i).d((p1 ^ 0x01));
       if (!p1) {
          b.a(i).b();
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CLICK_SERVER_ENTRANCE";
       uElementPack.name = "WEAK_WLAN_CHANGE_REMIND";
       i3 oi3 = i3.f();
       String str = (p1)? "ON": "OFF";
       oi3.d("button_type", str);
       uElementPack.params = oi3.e();
       u1.L("1008106", this.b, 1, uElementPack, null);
       return;
    }
}
