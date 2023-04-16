package dia.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import k2b.e0;

public final class a	// class@0024af
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final void c(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, uoa, "13")) {
          return;
       }
       ShowMetaData showMetaData = new ShowMetaData();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SERVER_RETURN_RESULT_BUTTON";
       i3 oi3 = i3.f();
       oi3.c("type", Integer.valueOf(p0));
       uElementPack.params = oi3.e();
       showMetaData.setElementPackage(uElementPack);
       showMetaData.setContentPackage(new ClientContent$ContentPackage());
       u1.B0(showMetaData);
       return;
    }
    public final void a(int p0,Integer p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "3")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_TIPS";
       i3 oi3 = i3.f();
       oi3.c("live_num", Integer.valueOf(p0));
       oi3.c("button_style", p1);
       uElementPack.params = oi3.e();
       u1.u(1, uElementPack, null);
       return;
    }
    public final void b(e0 p0,int p1,Integer p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, a.class, "7")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_TIPS";
       i3 oi3 = i3.f();
       oi3.c("live_num", Integer.valueOf(p1));
       oi3.c("button_style", p2);
       uElementPack.params = oi3.e();
       u1.B0(new ShowMetaData().setLogPage(p0).setType(3).setElementPackage(uElementPack));
       return;
    }
}
