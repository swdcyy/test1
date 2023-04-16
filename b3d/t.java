package b3d.t;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.login.util.h;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o1d.c;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import android.app.Activity;
import com.yxcorp.utility.n;
import java.lang.Exception;
import o07.o;

public class t implements PopupInterface$h	// class@000345
{
    public final int[] b;
    public final GifshowActivity c;
    public final h d;

    public void t(h p0,int[] p1,GifshowActivity p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       int i = this.b[0];
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), null, uoc, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "RISK_NOTICE_POPUP";
          i3 oi3 = i3.f();
          oi3.c("type", Integer.valueOf(i));
          uElementPack.params = oi3.e();
          u1.D0("2699180", null, 4, uElementPack, null, null);
       }
       try{
          n.C(this.c);
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
       }
       return;
    }
    public void H(c p0,int p1){
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
