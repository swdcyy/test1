package ihd.a;
import java.lang.Object;
import com.kuaishou.gifshow.forward.config.ForwardPanelConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import n80.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import java.util.Map;
import ihd.a$a;
import el.a;

public final class a	// class@001013
{
    public static Map a;
    public static ForwardPanelConfig b;

    public void a(){
       super();
    }
    public static ForwardPanelConfig a(){
       Object[] objArray = null;
       ForwardPanelConfig obj = PatchProxy.apply(objArray, objArray, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.b == null) {
          obj = ForwardPanelConfig.class;
          String str = a.a.getString("forwardPanelConfig", "");
          if (str != null && str != "") {
             objArray = b.a(str, obj);
          }
          a.b = objArray;
       }
       return a.b;
    }
    public static Map b(){
       Object[] objArray = null;
       Type obj = PatchProxy.apply(objArray, objArray, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.a == null) {
          obj = new a$a().getType();
          String str = a.a.getString("ForwardPanelConfigV2", "");
          if (str != null && str != "") {
             objArray = b.a(str, obj);
          }
          a.a = objArray;
       }
       return a.a;
    }
}
