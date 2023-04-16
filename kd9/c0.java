package kd9.c0;
import java.lang.Object;
import k2b.e0;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class c0	// class@002c49
{

    public void c0(){
       super();
    }
    public static void a(e0 p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c0.class, "1")) {
          return;
       }
       if (TextUtils.x(p1)) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "FRAME_STYLE_POPUP";
       i3 oi3 = i3.f();
       oi3.d("button_content", p1);
       uElementPack.params = oi3.e();
       u1.L("", p0, 1, uElementPack, null);
       return;
    }
}
