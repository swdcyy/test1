package l5.q;
import l5.s;
import java.lang.Object;
import android.util.JsonReader;
import android.util.JsonToken;
import n5.d;

public class q implements s	// class@002528
{
    public static final q a;

    static {
       q.a = new q();
    }
    public void q(){
       super();
    }
    public Object a(JsonReader p0,float p1){
       int i = (p0.peek() == JsonToken.BEGIN_ARRAY)? 1: 0;
       if (i) {
          p0.beginArray();
       }
       float f = (float)p0.nextDouble();
       float f1 = (float)p0.nextDouble();
       while (p0.hasNext()) {
          p0.skipValue();
       }
       if (i) {
          p0.endArray();
       }
       return new d(((f / 100.00f) * p1), ((f1 / 100.00f) * p1));
    }
}
