package f66.j;
import ekd.z0;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.StackTraceElement;

public class j	// class@0015dc
{
    public static z0 a;

    static {
       j.a = new z0();
    }
    public void j(){
       super();
    }
    public static String a(Throwable p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = p0.toString()+"\n";
          StackTraceElement[] stackTrace = p0.getStackTrace();
          int len = stackTrace.length;
          for (int i = 0; i < len; i = i + 1) {
             obj = obj+stackTrace[i].toString()+"\n";
          }
          return obj;
       }catch(java.lang.NullPointerException e0){
          return "";
       }
    }
    public static StringBuilder b(Object[] p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = j.a.a();
       if (p0 != null && p0.length) {
          int len = p0.length;
          int i = 0;
          while (i < len) {
             object oobject = p0[i];
             if (oobject != null) {
                obj = obj+oobject.toString()+",";
             }
             i = i + 1;
          }
          int i1 = obj.lastIndexOf(",");
          if (i1 >= 0) {
             obj.deleteCharAt(i1);
          }
       }
       return obj;
    }
}
