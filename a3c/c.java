package a3c.c;
import java.lang.Object;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.framework.model.user.User;
import qa6.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class c	// class@000064
{

    public void c(){
       super();
    }
    public static boolean a(UserProfile p0){
       boolean b1;
       char c;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, uoc, "7");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       boolean b = true;
       if (p0 != null) {
          p0 = p0.mCityName;
          Object obj2 = PatchProxy.applyOneRefs(p0, obj, uoc, "10");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else if(p0 == null || !p0.length()){
             int i = 0;
             while (true) {
                if (i < p0.length()) {
                   c = p0.charAt(i);
                   if (c != ' ' && (c != 9 && (c != 13 && c != 10))) {
                      b1 = false;
                      break ;
                   }else {
                      i = i + 1;
                   }
                }
             }
          }
          b1 = true;
          if (!b1) {
          label_0057 :
             return b;
          }
       }
       b = false;
       goto label_0057 ;
    }
    public static boolean b(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.b(p0);
    }
    public static boolean c(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n("F", p0.getSex());
    }
}
