package wu8.d;
import wu8.v;
import java.lang.String;
import java.lang.Object;
import android.content.SharedPreferences;
import java.util.Map;
import wu8.a;
import wu8.c;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.HashMap;

public class d	// class@002786
{
    public Type a;
    public String b;
    public v c;

    public void d(v p0,String p1){
       super();
       this.a = null;
       this.c = p0;
       this.b = p1;
    }
    public final Map a(SharedPreferences p0,String p1){
       try{
          Gson a = a.a;
          String str = p0.getString(p1, "{}");
          if (this.a == null) {
             this.a = new c(this).getType();
          }
          return a.i(str, this.a);
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public Map b(){
       SharedPreferences sharedPrefer = this.c.b();
       if (sharedPrefer != null) {
          int i = 1;
          Object[] objArray = new Object[i];
          objArray[0] = this.b;
          if (sharedPrefer.contains(String.format("user%s", objArray))) {
             Object[] objArray1 = new Object[i];
             objArray1[0] = this.b;
             return this.a(sharedPrefer, String.format("user%s", objArray1));
          }
       }
       return new HashMap();
    }
}
