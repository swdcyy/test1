package l5.j;
import android.util.JsonReader;
import android.graphics.Color;
import android.graphics.PointF;
import l5.j$a;
import android.util.JsonToken;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.List;
import java.util.ArrayList;

public class j	// class@002521
{

    public static int a(JsonReader p0){
       p0.beginArray();
       int i = (int)(p0.nextDouble() * 0x406fe00000000000);
       int i1 = (int)(p0.nextDouble() * 0x406fe00000000000);
       int i2 = (int)(p0.nextDouble() * 0x406fe00000000000);
       while (p0.hasNext()) {
          p0.skipValue();
       }
       p0.endArray();
       return Color.argb(255, i, i1, i2);
    }
    public static PointF b(JsonReader p0,float p1){
       float f;
       float f1;
       int i = j$a.a[p0.peek().ordinal()];
       if (i != Double.MIN_VALUE) {
          if (i != -676986306008443830000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.00f) {
             if (i != 3) {
                throw new IllegalArgumentException("Unknown point starts with "+p0.peek());
             }
             p0.beginObject();
             f = 0;
             f1 = 0;
             while (p0.hasNext()) {
                String str = p0.nextName();
                Objects.requireNonNull(str);
                if (!str.equals("x")) {
                   if (!str.equals("y")) {
                      p0.skipValue();
                   }else {
                      f1 = j.d(p0);
                   }
                }else {
                   f = j.d(p0);
                }
             }
             p0.endObject();
             return new PointF((f * p1), (f1 * p1));
          }else {
             p0.beginArray();
             f = (float)p0.nextDouble();
             f1 = (float)p0.nextDouble();
             while (p0.peek() != JsonToken.END_ARRAY) {
                p0.skipValue();
             }
             p0.endArray();
             return new PointF((f * p1), (f1 * p1));
          }
       }else {
          f = (float)p0.nextDouble();
          f1 = (float)p0.nextDouble();
          while (p0.hasNext()) {
             p0.skipValue();
          }
          return new PointF((f * p1), (f1 * p1));
       }
    }
    public static List c(JsonReader p0,float p1){
       ArrayList uArrayList = new ArrayList();
       p0.beginArray();
       while (p0.peek() == JsonToken.BEGIN_ARRAY) {
          p0.beginArray();
          uArrayList.add(j.b(p0, p1));
          p0.endArray();
       }
       p0.endArray();
       return uArrayList;
    }
    public static float d(JsonReader p0){
       JsonToken jsonToken = p0.peek();
       int i = j$a.a[jsonToken.ordinal()];
       if (i == 1) {
          return (float)p0.nextDouble();
       }
       if (i != 2) {
          throw new IllegalArgumentException("Unknown value for token of type "+jsonToken);
       }
       p0.beginArray();
       float f = (float)p0.nextDouble();
       while (p0.hasNext()) {
          p0.skipValue();
       }
       p0.endArray();
       return f;
    }
}
