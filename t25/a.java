package t25.a;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.util.List;
import java.util.Collection;
import java.lang.Integer;
import java.lang.Long;

public final class a	// class@002458
{

    public static final int a(Object p0){
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, uoa, "1");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       int i = 0;
       if (p0 != null) {
          if (p0 instanceof List && (p0.isEmpty() ^ 1)) {
             return a.a(p0.get(i));
          }else if(p0 instanceof String){
             Object obj1 = PatchProxy.applyOneRefs(p0, null, uoa, "2");
             if (obj1 != patchProxyRe) {
                i1 = obj1.intValue();
             }else {
                switch (p0.hashCode()){
                    case 0xe4bda087:
                      if (!p0.equals("UG_AUTH_FAILED")) {
                      label_0072 :
                         i = 1;
                      }
                      break;
                    case 0x23345a52:
                      if (!p0.equals("UG_GET_FIELD_EMPTY")) {
                      }
                      break;
                    case 0x466b5f3f:
                      if (!p0.equals("UG_EXCEPTION_HAPPEN")) {
                      }
                      break;
                    case 0x7ba8a2b0:
                      if (!p0.equals("UG_SERVICE_OBJECT_NULL")) {
                      }
                      break;
                    default:
                      goto label_0072 ;
                }
             label_0073 :
                i1 = i;
             }
             return i1;
          }else if(p0 instanceof Integer){
             return a.b((long)p0.intValue());
          }else if(p0 instanceof Long){
             return a.b(p0.longValue());
          }
       }
       return i;
    }
    public static final int b(long p0){
       int i;
       if (!p0 - (long)-3) {
       }else if(!p0 - (long)-1 || (!p0 || !p0 - (long)-2)){
          i = 1;
       label_001e :
          return i;
       }
       i = 0;
       goto label_001e ;
    }
}
