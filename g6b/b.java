package g6b.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fg6.a;
import g6b.b$a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.Map;
import u5b.a;
import java.lang.Exception;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import rm8.b;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;

public final class b	// class@002a8b
{
    public static Map a;
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void a(String p0){
       Map map;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       try{
          map = a.a.i(p0, new b$a().getType());
       }catch(java.lang.Exception e4){
          Object[] objArray = new Object[0];
          a.c.w("MapFilterRecordManager", e4.getMessage(), objArray);
          map = null;
       }
       b.a = map;
       return;
    }
    public final Map b(){
       Object[] objArray = null;
       Map obj = PatchProxy.apply(objArray, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a;
       int i = 0;
       obj = (obj == null || obj.isEmpty())? 1: null;
       if (!obj) {
          return b.a;
       }else {
          this.a(b.a.getString(b.d("user")+"map_filter_record", ""));
          obj = b.a;
          if (obj == null || obj.isEmpty()) {
             i = 1;
          }
          if (!i) {
             objArray = b.a;
          }
          return objArray;
       }
    }
}
