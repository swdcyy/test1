package l5.p;
import l5.s;
import java.lang.Object;
import android.util.JsonReader;
import android.util.JsonToken;
import android.graphics.PointF;
import l5.j;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public class p implements s	// class@002527
{
    public static final p a;

    static {
       p.a = new p();
    }
    public void p(){
       super();
    }
    public Object a(JsonReader p0,float p1){
       PointF pointF;
       JsonToken jsonToken = p0.peek();
       if (jsonToken == JsonToken.BEGIN_ARRAY) {
          pointF = j.b(p0, p1);
       }else if(jsonToken == JsonToken.BEGIN_OBJECT){
          pointF = j.b(p0, p1);
       }else if(jsonToken == JsonToken.NUMBER){
          PointF pointF1 = new PointF(((float)p0.nextDouble() * p1), ((float)p0.nextDouble() * p1));
          while (p0.hasNext()) {
             p0.skipValue();
          }
          pointF = pointF1;
       }else {
          throw new IllegalArgumentException("Cannot convert json to point. Next token is "+jsonToken);
       }
       return pointF;
    }
}
