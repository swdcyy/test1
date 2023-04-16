package l5.a;
import android.util.JsonReader;
import a5.e;
import h5.e;
import java.util.ArrayList;
import android.util.JsonToken;
import m5.f;
import l5.o;
import l5.s;
import n5.a;
import l5.k;
import d5.h;
import java.lang.Object;
import java.util.List;
import l5.l;
import android.graphics.PointF;
import l5.j;
import h5.m;
import java.lang.String;
import java.util.Objects;
import h5.b;
import l5.c;
import h5.i;

public class a	// class@002517
{

    public static e a(JsonReader p0,e p1){
       ArrayList uArrayList = new ArrayList();
       if (p0.peek() == JsonToken.BEGIN_ARRAY) {
          p0.beginArray();
          while (p0.hasNext()) {
             boolean b = (p0.peek() == JsonToken.BEGIN_OBJECT)? true: false;
             uArrayList.add(new h(p1, k.a(p0, p1, f.c(), o.a, b)));
          }
          p0.endArray();
          l.b(uArrayList);
       }else {
          uArrayList.add(new a(j.b(p0, f.c())));
       }
       return new e(uArrayList);
    }
    public static m b(JsonReader p0,e p1){
       p0.beginObject();
       e uoe = null;
       b uob = uoe;
       b uob1 = uob;
       int i = 0;
       while (p0.peek() != JsonToken.END_OBJECT) {
          String str = p0.nextName();
          Objects.requireNonNull(str);
          int i1 = -1;
          switch (str.hashCode()){
              case 'k':
                if (str.equals("k")) {
                   i1 = 0;
                }
                break;
              case 'x':
                if (str.equals("x")) {
                   i1 = 1;
                }
                break;
              case 'y':
                if (str.equals("y")) {
                   i1 = 2;
                }
                break;
              default:
          }
          switch (i1){
              case 0:
                uoe = a.a(p0, p1);
                break;
              case 1:
                if (p0.peek() == JsonToken.STRING) {
                   p0.skipValue();
                label_0064 :
                   i = 1;
                }else {
                   uob = c.d(p0, p1);
                }
                break;
              case 2:
                if (p0.peek() == JsonToken.STRING) {
                   p0.skipValue();
                   goto label_0064 ;
                }else {
                   uob1 = c.d(p0, p1);
                }
                break;
              default:
                p0.skipValue();
          }
       }
       p0.endObject();
       if (i) {
          p1.a("Lottie doesn\'t support expressions.");
       }
       if (uoe != null) {
          return uoe;
       }else {
          return new i(uob, uob1);
       }
    }
}
