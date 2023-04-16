package m9a.l$b;
import m9a.l$c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import m9a.l$b$b;
import java.lang.reflect.Type;
import el.a;
import java.util.Map;
import uw9.c;
import java.util.HashMap;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import com.kwai.robust.PatchProxyResult;
import m9a.l$b$a;

public class l$b implements l$c	// class@002f86
{
    public String a;

    public void l$b(String p0){
       super();
       this.a = p0;
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$b.class, "2")) {
          return;
       }
       Map map = c.d(new l$b$b(this).getType());
       if (map == null) {
          map = new HashMap();
       }
       map.put(this.a, p0);
       SharedPreferences$Editor uEditor = c.a.edit();
       uEditor.putString("detailFrequencyControlHelper", b.e(map));
       g.a(uEditor);
       return;
    }
    public String get(){
       Object[] objArray = null;
       Map obj = PatchProxy.apply(objArray, this, l$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.d(new l$b$a(this).getType());
       if (obj == null) {
          return objArray;
       }
       return obj.get(this.a);
    }
}
