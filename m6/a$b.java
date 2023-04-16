package m6.a$b;
import java.lang.String;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.Throwable;
import u6.c;

public final class a$b	// class@0025b3
{
    public final String a;
    public final int b;
    public final String c;

    public void a$b(String p0,int p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static JSONObject a(a$b p0){
       if (p0 == null) {
          return null;
       }
       try{
          return new JSONObject().put("pn", p0.a).put("v", p0.b).put("pk", p0.c);
       }catch(org.json.JSONException e4){
          c.c(e4);
          return v0;
       }
    }
    public String toString(){
       return String.valueOf(a$b.a(this));
    }
}
