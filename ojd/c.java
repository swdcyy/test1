package ojd.c;
import okhttp3.RequestBody;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.lang.Boolean;
import java.lang.Object;
import com.google.gson.Gson;
import java.lang.String;
import com.google.gson.c;
import com.google.gson.JsonElement;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import okhttp3.MediaType;
import okio.c;
import okhttp3.internal.Util;
import java.nio.charset.Charset;

public class c extends RequestBody	// class@001f20
{
    public Map a;
    public JsonObject b;
    public Boolean c;

    public void c(JsonObject p0){
       super();
       this.a = new HashMap();
       this.b = new JsonObject();
       this.c = Boolean.FALSE;
       this.b = p0;
       this.c();
    }
    public void c(Object p0){
       super();
       this.a = new HashMap();
       this.b = new JsonObject();
       this.c = Boolean.FALSE;
       this.b = new c().a(new Gson().q(p0)).r();
       this.c();
    }
    public void c(Map p0){
       super();
       this.a = new HashMap();
       this.b = new JsonObject();
       this.c = Boolean.FALSE;
       this.a = p0;
    }
    public static c d(JsonObject p0){
       return new c(p0);
    }
    public Map a(){
       return this.a;
    }
    public Boolean b(){
       return this.c;
    }
    public final void c(){
       Iterator iterator = this.b.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          this.a.put(key, uEntry.getValue());
       }
       return;
    }
    public MediaType contentType(){
       return MediaType.parse("application/json; charset=utf-8");
    }
    public void writeTo(c p0){
       p0.write((new Gson().q(this.a)).getBytes(Util.UTF_8));
    }
}
