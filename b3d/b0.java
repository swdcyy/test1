package b3d.b0;
import java.lang.Object;
import android.content.Context;
import com.kwai.feature.api.social.login.model.LoginParams;
import n3d.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.userlogin.fragment.f$a;
import android.os.Bundle;
import b3d.b0$a;
import ou5.a;
import com.yxcorp.login.userlogin.fragment.h;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.c;
import android.app.Activity;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;
import b3d.b0$b;
import com.yxcorp.login.userlogin.fragment.j;
import com.kwai.robust.PatchProxyResult;

public class b0	// class@00031e
{

    public void b0(){
       super();
    }
    public static void a(Context p0,LoginParams p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b0.class, "2")) {
          return;
       }
       c uoc = new c(p0);
       uoc.L(h.f(p0, new f$a(p1.mLoginSource, p1.mExtraInfoParams).a(), new b0$a(p1), p2));
       uoc.B(true);
       uoc.k().Z();
       return;
    }
    public static void b(Context p0,LoginParams p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b0.class, "4")) {
          return;
       }
       b0$b uob = new b0$b(p1);
       j oj = PatchProxy.applyFourRefs(p0, p1, uob, p2, null, j.class, "1");
       if (oj != PatchProxyResult.class) {
       }else {
          oj = new j(p0, p1, uob, p2);
       }
       c uoc = new c(p0);
       uoc.L(oj);
       uoc.B(true);
       uoc.k().Z();
       return;
    }
}
