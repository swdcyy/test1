package b61.b;
import java.lang.Object;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.User;
import b61.a;
import wkd.b;
import mu7.e;

public class b	// class@00031a
{

    public void b(){
       super();
    }
    public static String a(UserInfos$UserInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       return b.c(UserInfo.convertFromProto(p0));
    }
    public static String b(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       return b.c(UserInfo.convertFromQUser(p0));
    }
    public static String c(UserInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       if (a.e(p0)) {
          return p0.mName;
       }
       return b.a(-1878684066).b(p0.mId, p0.mName);
    }
}
