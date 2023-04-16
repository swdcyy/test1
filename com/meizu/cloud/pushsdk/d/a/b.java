package com.meizu.cloud.pushsdk.d.a.b;
import com.meizu.cloud.pushsdk.d.a.a;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import com.meizu.cloud.pushsdk.d.f.d;
import java.util.Map;
import com.meizu.cloud.pushsdk.d.f.c;
import com.meizu.cloud.pushsdk.d.f.e;
import org.json.JSONObject;

public class b implements a	// class@001502
{
    public final String a;
    public final HashMap b;

    public void b(String p0,Object p1){
       super();
       this.a = "b";
       this.b = new HashMap();
       this.a(p0);
       this.a(p1);
    }
    public b a(Object p0){
       if (p0 == null) {
          return this;
       }
       this.b.put("dt", p0);
       return this;
    }
    public b a(String p0){
       d.a(p0, "schema cannot be null");
       d.a((p0.isEmpty() ^ 0x01), "schema cannot be empty.");
       this.b.put("sa", p0);
       return this;
    }
    public Map a(){
       return this.b;
    }
    public void a(String p0,String p1){
       Object[] objArray = new Object[0];
       c.c(this.a, "Payload: add\(String, String\) method called - Doing nothing.", objArray);
    }
    public long b(){
       return e.a(this.toString());
    }
    public String toString(){
       return e.a(this.b).toString();
    }
}
