package f02.d;
import java.lang.Object;
import sz1.e;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lh3.b;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import nh3.b;
import f02.a;
import lp3.e;
import java.util.List;
import gq1.l;
import lp3.c;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.Integer;
import lnc.i3;
import java.lang.Number;

public class d	// class@002266
{

    public void d(){
       super();
    }
    public static String a(e p0){
       String str = null;
       Object obj = PatchProxy.applyOneRefs(p0, str, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SCInteractiveChatRoomInfo sCInteractiv = p0.gc().b();
       b uob = (sCInteractiv != null)? a.j(sCInteractiv): str;
       if (uob != null) {
          str = uob.a();
       }
       return str;
    }
    public static List b(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.a(l.class).lk();
    }
    public static boolean c(){
       Object obj = PatchProxy.apply(null, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("disableAnchorMultiLineGiftEffect", false);
    }
    public static String d(int p0,int p1){
       i3 obj;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, uod, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = i3.f();
       obj.c("chatType", Integer.valueOf(p0));
       obj.c("source", Integer.valueOf(p1));
       return obj.e();
    }
}
