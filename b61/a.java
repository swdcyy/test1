package b61.a;
import java.lang.Object;
import java.util.List;
import com.kwai.framework.model.user.UserExtraInfo$RoleInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserExtraInfo;

public class a	// class@000319
{

    public void a(){
       super();
    }
    public static UserExtraInfo$RoleInfo a(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!q.f(p0)) {
          return p0.get(0);
       }
       return null;
    }
    public static boolean b(List p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (a.c(a.a(p0)) != a.c(a.a(p1)))? true: false;
       return b;
    }
    public static boolean c(UserExtraInfo$RoleInfo p0){
       boolean b = (p0 != null && p0.mRoleType != null)? true: false;
       return b;
    }
    public static boolean d(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.c(a.a(p0));
    }
    public static boolean e(UserInfo p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          p0 = p0.mExtraInfo;
          if (p0 != null && a.d(p0.mRoleInfos)) {
             b = true;
          label_0025 :
             return b;
          }
       }
       b = false;
       goto label_0025 ;
    }
    public static void f(UserInfo p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "5")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p0.mExtraInfo == null) {
          p0.mExtraInfo = new UserExtraInfo();
       }
       p0.mExtraInfo.mRoleInfos = p1;
       UserExtraInfo$RoleInfo roleInfo = a.a(p1);
       if (roleInfo != null && a.d(p1)) {
          p0.mName = roleInfo.mRoleName;
          p0.mHeadUrls = roleInfo.mHeadUrls;
       }
       return;
    }
}
