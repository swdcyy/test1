package jx8.c$a;
import java.lang.Runnable;
import jx8.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.graphics.Rect;
import hsa.a;
import com.kwai.kcube.TabIdentifier;
import isa.a;
import com.yxcorp.gifshow.homepage.activity.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.u1;

public class c$a implements Runnable	// class@0029d1
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c$a.class, "1")) {
          return;
       }
       c p = this.b.p;
       if (p == null) {
          return;
       }
       if (!p.getVisibility()) {
          c$a tb = this.b;
          if (tb.p.getGlobalVisibleRect(tb.s)) {
             p = this.b.r;
             if (!PatchProxy.applyVoidOneRefs(p, objArray, a.class, "4")) {
                a uoa = e.a(p);
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "ACTIVITY_ENTRANCE_TAB";
                uElementPack.params = a.b(uoa);
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.ksOrderInfoPackage = a.a(uoa);
                u1.u0(6, uElementPack, uContentPack);
             }
          }
       }
       return;
    }
}
