package com.meizu.cloud.pushsdk.d.a.c;
import com.meizu.cloud.pushsdk.d.a.a;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.lang.String;
import java.lang.StringBuilder;
import com.meizu.cloud.pushsdk.d.f.c;
import com.meizu.cloud.pushsdk.d.f.e;
import org.json.JSONObject;

public class c implements a	// class@001503
{
    public final String a;
    public final HashMap b;

    public void c(){
       super();
       this.a = "c";
       this.b = new HashMap();
    }
    public Map a(){
       return this.b;
    }
    public void a(String p0,Object p1){
       if (p1 == null) {
          Object[] objArray = new Object[0];
          c.c(this.a, "The keys value is empty, returning without adding key: "+p0, objArray);
          return;
       }else {
          this.b.put(p0, p1);
          return;
       }
    }
    public void a(String p0,String p1){
       if (p1 == null || p1.isEmpty()) {
          Object[] objArray = new Object[0];
          c.c(this.a, "The keys value is empty, returning without adding key: "+p0, objArray);
          return;
       }else {
          this.b.put(p0, p1);
          return;
       }
    }
    public void a(Map p0){
       if (p0 == null) {
          Object[] objArray = new Object[0];
          c.c(this.a, "Map passed in is null, returning without adding map.", objArray);
          return;
       }else {
          this.b.putAll(p0);
          return;
       }
    }
    public long b(){
       return e.a(this.toString());
    }
    public String toString(){
       return e.a(this.b).toString();
    }
}
