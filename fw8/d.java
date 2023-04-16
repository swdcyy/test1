package fw8.d;
import com.yxcorp.gifshow.activity.a;
import ok.x;
import com.google.common.base.Suppliers;
import com.yxcorp.gifshow.activity.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import xf6.d;

public final class d	// class@00235a
{
    public static final x a;
    public static final x b;
    public static Boolean c;

    static {
       d.a = Suppliers.a(a.b);
       d.b = Suppliers.a(b.b);
    }
    public void d(){
       super();
    }
    public static boolean a(boolean p0){
       Boolean obj;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, uod, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (d.b()) {
          if (d.Q()) {
             return true;
          }else if(!d.a.get().booleanValue()){
             return false;
          }else {
             return p0;
          }
       }else if(d.Q()){
          return true;
       }else {
          obj = d.c;
          if (obj != null) {
             return obj.booleanValue();
          }else if(!d.a.get().booleanValue()){
             d.c = Boolean.FALSE;
             return false;
          }else {
             Boolean uBoolean = Boolean.valueOf(p0);
             d.c = uBoolean;
             return uBoolean.booleanValue();
          }
       }
    }
    public static boolean b(){
       Object obj = PatchProxy.apply(null, null, d.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = d.b.get();
       }
       return obj.booleanValue();
    }
}
