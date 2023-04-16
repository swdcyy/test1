package az5.j;
import az5.i;
import androidx.collection.LruCache;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import a06.a;
import wy5.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class j extends i	// class@0003d7
{

    public void j(){
       super();
    }
    public LruCache b(){
       Object[] objArray = null;
       Type obj = PatchProxy.apply(objArray, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.t;
       String str = a.a.getString(b.d("user")+"live_history", "");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
    public int f(){
       return 200;
    }
    public void i(LruCache p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString(b.d("user")+"live_history", b.e(p0));
       g.a(uEditor);
       return;
    }
}
