package aja.c;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import k2b.u1;

public class c	// class@000089
{

    public void c(){
       super();
    }
    public static void a(QPhoto p0,boolean p1,int p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), null, c.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "INTERACTIVE_INFORMATION_PERCEIVED";
       i3 oi3 = i3.f();
       oi3.c("like_button_type", Integer.valueOf(p1));
       oi3.c("tag_show_type", Integer.valueOf(p2));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p0.getEntity());
       u1.C0("", null, 5, uElementPack, uContentPack);
       return;
    }
}
