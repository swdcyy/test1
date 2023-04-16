package l5.r;
import l5.s;
import java.lang.Object;
import android.util.JsonReader;
import android.util.JsonToken;
import java.lang.String;
import java.util.Objects;
import java.util.List;
import l5.j;
import i5.g;
import android.graphics.PointF;
import java.util.Collections;
import java.util.ArrayList;
import m5.e;
import g5.a;
import java.lang.IllegalArgumentException;

public class r implements s	// class@002529
{
    public static final r a;

    static {
       r.a = new r();
    }
    public void r(){
       super();
    }
    public Object a(JsonReader p0,float p1){
       int i;
       int i1;
       PointF pointF;
       boolean b2;
       g og;
       if (p0.peek() == JsonToken.BEGIN_ARRAY) {
          p0.beginArray();
       }
       p0.beginObject();
       List list = null;
       boolean b = false;
       List list1 = list;
       List list2 = list1;
       boolean b1 = false;
       while (p0.hasNext()) {
          String str = p0.nextName();
          Objects.requireNonNull(str);
          i = str.hashCode();
          i1 = 3;
          pointF = 2;
          if (i != 99) {
             if (i != 105) {
                if (i != 111) {
                   if (i != 118 || !str.equals("v")) {
                   label_0061 :
                      b2 = -1;
                   }else {
                      b2 = 3;
                   }
                }else if(!str.equals("o")){
                   goto label_0061 ;
                }else {
                   b2 = 2;
                }
             }else if(!str.equals("i")){
                goto label_0061 ;
             }else {
                b2 = true;
             }
          }else if(!str.equals("c")){
             goto label_0061 ;
          }else {
             b2 = false;
          }
          if (b2) {
             if (b2 != 1) {
                if (b2 != pointF) {
                   if (b2 != i1) {
                      continue ;
                   }
                }else {
                   list2 = j.c(p0, p1);
                }
             }else {
                list1 = j.c(p0, p1);
             }
          }else {
             b1 = p0.nextBoolean();
          }
          list = j.c(p0, p1);
       }
       p0.endObject();
       if (p0.peek() == JsonToken.END_ARRAY) {
          p0.endArray();
       }
       if (list != null && (list1 != null && list2 != null)) {
          if (list.isEmpty()) {
             og = new g(new PointF(), b, Collections.emptyList());
          }else {
             int i2 = list.size();
             PointF pointF1 = list.get(b);
             ArrayList uArrayList = new ArrayList(i2);
             for (i = 1; i < i2; i = i + 1) {
                PointF pointF2 = list.get(i);
                i1 = i - 1;
                pointF = list.get(i1);
                PointF pointF3 = e.a(pointF, list2.get(i1));
                uArrayList.add(new a(pointF3, e.a(pointF2, list1.get(i)), pointF2));
             }
             if (b1) {
                PointF pointF4 = list.get(b);
                i2 = i2 - 1;
                PointF pointF5 = list.get(i2);
                PointF pointF6 = e.a(pointF5, list2.get(i2));
                uArrayList.add(new a(pointF6, e.a(pointF4, list1.get(b)), pointF4));
             }
             og = new g(pointF1, b1, uArrayList);
          }
          return og;
       }else {
          throw new IllegalArgumentException("Shape data was missing information.");
       }
    }
}
