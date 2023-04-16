package p6.b;
import java.lang.String;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Throwable;
import u6.c;

public final class b	// class@0028c2
{
    public final String a;
    public final String b;

    public void b(String p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public String a(){
       return this.b;
    }
    public String b(){
       return this.a;
    }
    public JSONObject c(){
       JSONObject jSONObject = null;
       if (TextUtils.isEmpty(this.b)) {
          return jSONObject;
       }
       try{
          jSONObject = new JSONObject(this.b);
       }catch(java.lang.Exception e0){
          c.c(e0);
       }
       return jSONObject;
    }
    public String toString(){
       Object[] objArray = new Object[]{this.a,this.b};
       return String.format("<Letter envelop=%s body=%s>", objArray);
    }
}
