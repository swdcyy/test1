package ab6.f;
import java.lang.Object;
import com.yxcorp.retrofit.model.ConfigModel;
import com.yxcorp.retrofit.model.LocationConfigModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;

public class f	// class@000069
{

    public void f(){
       super();
    }
    public static boolean a(ConfigModel p0,LocationConfigModel p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.isEmpty(p0.mBizCode)) {
          return false;
       }
       if (p1.mBizTypeModelMap.containsKey(p0.mBizCode)) {
          return p1.mBizTypeModelMap.get(p0.mBizCode).booleanValue();
       }
       return false;
    }
    public static boolean b(String p0,List p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (q.f(p1)) {
          return false;
       }
       if (p1.contains(p0)) {
          return true;
       }
       Iterator iterator = p1.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          obj = iterator.next();
          if (!TextUtils.isEmpty(obj) && obj.contains("*")) {
             int i = obj.length() - true;
             if (p0.contains(obj.subSequence(false, i))) {
                break ;
             }
          }
       }
       return true;
    }
}
