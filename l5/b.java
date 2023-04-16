package l5.b;
import android.util.JsonReader;
import a5.e;
import h5.l;
import android.util.JsonToken;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import h5.b;
import l5.c;
import h5.g;
import l5.q;
import l5.s;
import java.util.List;
import h5.n;
import n5.a;
import java.lang.Float;
import android.view.animation.Interpolator;
import h5.m;
import l5.a;
import h5.d;
import h5.e;
import android.graphics.PointF;
import h5.i;
import n5.d;

public class b	// class@002518
{

    public static l a(JsonReader p0,e p1){
       a uoa;
       a uoa1;
       JsonReader jsonReader = p0;
       e uoe = p1;
       int i = (p0.peek() == JsonToken.BEGIN_OBJECT)? 1: 0;
       if (i) {
          p0.beginObject();
       }
       List list = null;
       e uoe1 = null;
       m om = null;
       g og = null;
       b uob = null;
       b uob1 = null;
       d uod = null;
       b uob2 = null;
       b uob3 = null;
       String str = null;
       while (p0.hasNext()) {
          String str1 = p0.nextName();
          Objects.requireNonNull(str1);
          int i1 = -1;
          switch (str1.hashCode()){
              case 'a':
                if (str1.equals("a")) {
                   i1 = 0;
                }
                break;
              case 'o':
                if (str1.equals("o")) {
                   i1 = 1;
                }
                break;
              case 'p':
                if (str1.equals("p")) {
                   i1 = 2;
                }
                break;
              case 'r':
                if (str1.equals("r")) {
                   i1 = 3;
                }
                break;
              case 's':
                if (str1.equals("s")) {
                   i1 = 4;
                }
                break;
              case 3242:
                if (str1.equals("eo")) {
                   i1 = 5;
                }
                break;
              case 3656:
                if (str1.equals("rz")) {
                   i1 = 6;
                }
                break;
              case 3662:
                if (str1.equals("sa")) {
                   i1 = 7;
                }
                break;
              case 3672:
                if (str1.equals("sk")) {
                   i1 = 8;
                }
                break;
              case 3676:
                if (str1.equals("so")) {
                   i1 = 9;
                }
                break;
              default:
          }
          switch (i1){
              case 0:
                p0.beginObject();
                while (p0.hasNext()) {
                   if ((p0.nextName()).equals("k")) {
                      uoe1 = a.a(p0, p1);
                   }else {
                      p0.skipValue();
                      continue ;
                   }
                }
                p0.endObject();
                break;
              case 1:
                uod = c.g(p0, p1);
                break;
              case 2:
                om = a.b(p0, p1);
                break;
              case 3:
                b uob4 = c.e(jsonReader, uoe, false);
                if (uob4.b().isEmpty()) {
                   uoa = v6;
                   uoa1 = v6;
                   uoa = new a(p1, Float.valueOf(str), Float.valueOf(str), null, null, Float.valueOf(p1.f()));
                   uob4.b().add(uoa1);
                }else if(uob4.b().get(false).b == null){
                   uoa = new a(p1, Float.valueOf(str), Float.valueOf(str), 0, 0, Float.valueOf(p1.f()));
                   uob4.b().set(false, v12);
                }
                list = uob4;
                break;
              case 4:
                og = new g(c.b(jsonReader, uoe, q.a));
                break;
              case 5:
                uob3 = c.e(jsonReader, uoe, false);
                break;
              case 6:
                uoe.a("Lottie doesn\'t support 3D layers.");
                goto label_00e1 ;
                break;
              case 7:
                uob1 = c.e(jsonReader, uoe, false);
                break;
              case 8:
                uob = c.e(jsonReader, uoe, false);
                break;
              case 9:
                uob2 = c.e(jsonReader, uoe, false);
                break;
              default:
                p0.skipValue();
          }
       }
       if (i) {
          p0.endObject();
       }
       jsonReader = (uoe1 == null || (uoe1.c() && uoe1.b().get(false).b.equals(str, str)))? 1: 0;
       if (jsonReader) {
          uoe1 = 0;
       }
       boolean b = (om == null || (!om instanceof i && (om.c() && om.b().get(false).b.equals(str, str))))? true: false;
       if (b) {
          om = 0;
       }
       b = (list == null || (list.c() && !list.b().get(false).b.floatValue() - str))? true: false;
       b uob5 = (b)? null: list;
       if (og != null) {
          if (og.c()) {
             a b1 = og.b().get(false).b;
             b1 = (!b1.a - 0x3f800000 && !b1.b - 0x3f800000)? 1: 0;
             if (!b1) {
             label_0227 :
                b = false;
             label_022a :
                g og1 = (b)? null: og;
                b = (uob == null || (uob.c() && !uob.b().get(false).b.floatValue() - str))? true: false;
                b uob6 = (b)? null: uob;
                uoa1 = (uob1 == null || (uob1.c() && !uob1.b().get(false).b.floatValue() - str))? 1: 0;
                b uob7 = (uoa1)? null: uob1;
                l ol = new l(uoe1, om, og1, uob5, uod, uob2, uob3, uob6, uob7);
                return b;
             }
          }else {
             goto label_0227 ;
          }
       }
       b = true;
       goto label_022a ;
    }
}
