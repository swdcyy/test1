package d0c.e;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Collection;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kuaishou.webkit.URLUtil;

public final class e	// class@0020ab
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public final List a(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return new ArrayList();
       }
       obj = new ArrayList();
       int i = 0;
       int i1 = p0.size();
       while (i < i1) {
          Object obj1 = p0.get(i);
          if (!obj1 instanceof CDNUrl) {
             Log.d("PostFontUtil", "changeBackgroundAndImage url = "+obj1+" is not CDNUrl");
             if (obj1 instanceof String && URLUtil.isNetworkUrl(obj1)) {
                obj.add(new CDNUrl("", obj1));
             }
          }else {
             obj.add(obj1);
          }
          i = i + 1;
       }
       return obj;
    }
}
