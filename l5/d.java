package l5.d;
import l5.s;
import java.lang.Object;
import android.util.JsonReader;
import android.util.JsonToken;
import android.graphics.Color;
import java.lang.Integer;

public class d implements s	// class@00251a
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public Object a(JsonReader p0,float p1){
       int i = (p0.peek() == JsonToken.BEGIN_ARRAY)? 1: 0;
       if (i) {
          p0.beginArray();
       }
       double d = p0.nextDouble();
       double d1 = p0.nextDouble();
       double d2 = p0.nextDouble();
       double d3 = p0.nextDouble();
       if (i) {
          p0.endArray();
       }
       int i1 = 0x3ff0000000000000;
       if (d - i1 <= 0 && (d1 - i1 <= 0 && (d2 - i1 <= 0 && d3 - i1 <= 0))) {
          double d4 = 0x406fe00000000000;
          d = d * d4;
          d1 = d1 * d4;
          d2 = d2 * d4;
          d3 = d3 * d4;
       }
    label_0044 :
       return Integer.valueOf(Color.argb((int)d3, (int)d, (int)d1, (int)d2));
    }
}
