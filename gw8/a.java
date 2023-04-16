package gw8.a;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.model.config.ActivityInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import flb.a;
import java.util.List;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Iterator;

public final class a	// class@002508
{

    public void a(){
       super();
    }
    public static ActivityInfo a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b(a.e.a(), p0);
    }
    public static ActivityInfo b(List p0,String p1){
       if (p0 == null || (p0.size() >= 1 && !TextUtils.x(p1))) {
          p1 = p1.replace("#", "");
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             ActivityInfo uActivityInf = iterator.next();
             if (uActivityInf != null) {
                ActivityInfo mTagType = uActivityInf.mTagType;
                if (mTagType == null || (mTagType == 1 && p1.equals(uActivityInf.mKeyword))) {
                   return uActivityInf;
                }
             }
          }
       }
       return null;
    }
    public static List c(){
       Object obj = PatchProxy.apply(null, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.e.a();
    }
}
