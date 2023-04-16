package rm7.a;
import pm7.h;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import pm7.m;
import java.util.Map;
import org.json.JSONObject;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.robust.RobustException;
import java.util.HashMap;
import java.lang.Long;
import android.util.Log;

public abstract class a	// class@00239c
{
    public final String a;
    public boolean b;
    public final boolean c;
    public final h d;
    public long e;
    public Throwable f;
    public Object g;

    public void a(h p0,String p1,boolean p2,boolean p3){
       super();
       this.e = 0;
       this.f = null;
       this.a = p1;
       this.c = p2;
       this.b = p3;
       this.d = p0;
    }
    public Object a(){
       return this.g;
    }
    public String b(){
       return this.a;
    }
    public Throwable c(){
       return this.f;
    }
    public boolean d(){
       return this.b;
    }
    public abstract void e(m p0);
    public a f(Object p0){
       this.g = p0;
       return this;
    }
    public a g(long p0,Throwable p1){
       this.e = p0;
       this.f = p1;
       return this;
    }
    public String h(){
       Map map = this.i();
       try{
          JSONObject jSONObject = new JSONObject();
          Iterator iterator = map.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             Object value = uEntry.getValue();
             if (value != null) {
                jSONObject.put(uEntry.getKey(), value);
             }
          }
          return jSONObject.toString();
       }catch(java.lang.Exception e0){
          throw new RobustException(e0);
       }
    }
    public Map i(){
       HashMap hashMap = new HashMap();
       hashMap.put("robustId", this.d.f());
       hashMap.put("cost", Long.valueOf(this.e));
       Throwable throwable = this.c();
       if (throwable != null) {
          hashMap.put("throwable", Log.getStackTraceString(throwable));
       }else {
          hashMap.put("throwable", "");
       }
       return hashMap;
    }
}
