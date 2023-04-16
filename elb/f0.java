package elb.f0;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wh5.c;
import com.kwai.framework.model.user.QCurrentUser;

public class f0	// class@002747
{

    public void f0(){
       super();
    }
    public static boolean a(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.canRewarded() && (!c.b() && QCurrentUser.ME.isLogined()))? true: false;
       return b;
    }
    public static boolean b(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.isAllowComment() && c.c())? true: false;
       return b;
    }
}
