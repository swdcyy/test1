package hf.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;

public class a	// class@002126
{
    public static final List a;
    public static final Map b;

    static {
       a.a = new ArrayList();
       a.b = new HashMap();
    }
    public void a(){
       super();
    }
    public static View a(View p0,String p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.b(p0);
       if (obj != null && obj.equals(p1)) {
          return p0;
       }
       if (p0 instanceof ViewGroup) {
          int i = 0;
          while (i < p0.getChildCount()) {
             View view = a.a(p0.getChildAt(i), p1);
             if (view != null) {
                return view;
             }
             i = i + 1;
          }
       }
       return null;
    }
    public static String b(View p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, a.class, "8");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       p0 = p0.getTag(R.id.view_tag_native_id);
       if (p0 instanceof String) {
          obj = p0;
       }
       return obj;
    }
}
