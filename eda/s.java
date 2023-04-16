package eda.s;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Long;
import java.lang.Math;

public final class s	// class@002665
{
    public boolean a;
    public String b;
    public String c;
    public long d;

    public void s(){
       super();
    }
    public static s a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, s.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return s.b(QCurrentUser.ME.getId(), p0, 0);
    }
    public static s b(String p0,String p1,long p2){
       s obj;
       if (PatchProxy.isSupport(s.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Long.valueOf(p2), null, s.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new s();
       obj.b = p0;
       obj.c = p1;
       obj.d = Math.min(p2, 5000);
       return obj;
    }
    public static s c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, s.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return s.e(QCurrentUser.ME.getId(), p0, 0);
    }
    public static s d(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, s.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return s.e(p0, p1, 0);
    }
    public static s e(String p0,String p1,long p2){
       s obj;
       if (PatchProxy.isSupport(s.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Long.valueOf(p2), null, s.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new s();
       obj.a = true;
       obj.d = Math.min(p2, 5000);
       obj.b = p0;
       obj.c = p1;
       return obj;
    }
}
