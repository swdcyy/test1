package l5.l;
import android.util.JsonReader;
import a5.e;
import l5.s;
import java.util.List;
import java.util.ArrayList;
import android.util.JsonToken;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import n5.a;
import l5.k;
import java.lang.Float;
import d5.h;

public class l	// class@002523
{

    public static List a(JsonReader p0,e p1,float p2,s p3){
       ArrayList uArrayList = new ArrayList();
       if (p0.peek() == JsonToken.STRING) {
          p1.a("Lottie doesn\'t support expressions.");
          return uArrayList;
       }else {
          p0.beginObject();
          while (p0.hasNext()) {
             String str = p0.nextName();
             Objects.requireNonNull(str);
             if (!str.equals("k")) {
                p0.skipValue();
             }else if(p0.peek() == JsonToken.BEGIN_ARRAY){
                p0.beginArray();
                if (p0.peek() == JsonToken.NUMBER) {
                   uArrayList.add(k.a(p0, p1, p2, p3, false));
                }else {
                   while (p0.hasNext()) {
                      uArrayList.add(k.a(p0, p1, p2, p3, true));
                   }
                }
                p0.endArray();
             }else {
                uArrayList.add(k.a(p0, p1, p2, p3, false));
             }
          }
          p0.endObject();
          l.b(uArrayList);
          return uArrayList;
       }
    }
    public static void b(List p0){
       int i = p0.size();
       int i1 = 0;
       int i2 = i - 1;
       while (i1 < i2) {
          a uoa = p0.get(i1);
          i1 = i1 + 1;
          a uoa1 = p0.get(i1);
          uoa.f = Float.valueOf(uoa1.e);
          if (uoa.c == null) {
             uoa1 = uoa1.b;
             if (uoa1 != null) {
                uoa.c = uoa1;
                if (uoa instanceof h) {
                   uoa.e();
                }
             }
          }
       }
       a uoa2 = p0.get(i2);
       if (uoa2.b == null || (uoa2.c == null && p0.size() > 1)) {
          p0.remove(uoa2);
       }
       return;
    }
}
