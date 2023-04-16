package c.t.m.g.dq;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.String;

public class dq	// class@000c51
{
    public String a;
    public String b;
    public int c;

    public void dq(){
       super();
    }
    public void dq(JSONObject p0){
       super();
       this.a = p0.optString("bid", null);
       this.b = p0.optString("floor", "1000");
       this.c = p0.optInt("type", -1);
    }
}
