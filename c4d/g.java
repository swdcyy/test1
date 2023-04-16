package c4d.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class g	// class@0004e5
{

    public void g(){
       super();
    }
    public static void a(int p0,String p1,String p2,boolean p3){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, Boolean.valueOf(p3), null, g.class, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "GIF_SEARCH_RESULT";
       i3 oi3 = i3.f();
       oi3.c("emo_index", Integer.valueOf(p0));
       oi3.d("emo_id", p2);
       oi3.d("keyword", p1);
       uElementPack.params = oi3.e();
       if (p3) {
          u1.u0(3, uElementPack, null);
       }else {
          u1.u(1, uElementPack, null);
       }
       return;
    }
}
