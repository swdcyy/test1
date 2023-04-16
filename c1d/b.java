package c1d.b;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.utility.TextUtils;
import k2b.u1;
import java.lang.Integer;
import q2b.h$b;
import java.lang.Throwable;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import com.yxcorp.retrofit.model.KwaiException;

public class b	// class@0004c5
{

    public void b(){
       super();
    }
    public static void a(String p0,ClientContent$ContentPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, null, null, b.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = TextUtils.I(p0);
       u1.u(1, uElementPack, null);
       return;
    }
    public static void b(String p0,int p1,ClientContent$ContentPackage p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), null, null, b.class, "2")) {
          return;
       }
       h$b uob = h$b.e(p1, p0);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = TextUtils.I(p0);
       uob.k(uElementPack);
       uob.h(null);
       u1.r0(uob);
       return;
    }
    public static void c(String p0,int p1,ClientContent$ContentPackage p2,Throwable p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), null, p3, null, b.class, "3")) {
          return;
       }
       h$b uob = h$b.e(p1, p0);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = TextUtils.I(p0);
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       if (p3 != null && p3 instanceof KwaiException) {
          resultPackag.code = p3.mErrorCode;
       }
       uob.k(uElementPack);
       uob.h(null);
       uob.q(resultPackag);
       u1.r0(uob);
       return;
    }
}
