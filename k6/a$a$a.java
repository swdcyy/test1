package k6.a$a$a;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.String;
import org.json.JSONArray;
import java.lang.Throwable;
import u6.c;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public final class a$a$a	// class@002487
{
    public final LinkedHashMap a;

    public void a$a$a(){
       super();
       this.a = new LinkedHashMap();
    }
    public void a$a$a(String p0){
       super();
       this.a = new LinkedHashMap();
       JSONArray jSONArray = new JSONArray(p0);
       for (int i = 0; i < jSONArray.length(); i = i + 1) {
          JSONArray jSONArray1 = jSONArray.getJSONArray(i);
          String str = jSONArray1.getString(0);
          this.a.put(str, jSONArray1.getString(1));
       }
       return;
    }
    public String a(){
       JSONArray jSONArray = new JSONArray();
       Iterator iterator = this.a.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          JSONArray jSONArray1 = new JSONArray();
          jSONArray1.put(uEntry.getKey()).put(uEntry.getValue());
          jSONArray.put(jSONArray1);
       }
       return jSONArray.toString();
    }
}
