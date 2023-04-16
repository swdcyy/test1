package a.a.a.a.b.a.a$a;
import java.lang.Runnable;
import a.a.a.a.b.a.a;
import java.util.List;
import org.json.JSONArray;
import java.lang.String;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import java.lang.StringBuilder;
import org.json.JSONObject;
import org.json.JSONException;

public class a$a implements Runnable	// class@000007
{
    public final int b;
    public final List c;
    public final JSONArray d;
    public final String e;
    public final CountDownLatch f;
    public final a g;

    public void a$a(a p0,int p1,List p2,JSONArray p3,String p4,CountDownLatch p5){
       this.g = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public void run(){
       String str = "Start to download bitcode["+this.b+"] through thread";
       try{
          m$c.b(str);
          this.g.d(this.c, this.d.getJSONObject(this.b), this.e);
       }catch(org.json.JSONException e0){
          e0.printStackTrace();
       }
       this.f.countDown();
       return;
    }
}
