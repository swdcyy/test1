package l5.n;
import android.util.JsonReader;
import a5.e;
import m5.f;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import androidx.collection.SparseArrayCompat;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import g5.g;
import g5.b;
import i5.b;
import l5.e;
import i5.i;
import g5.c;
import java.util.List;
import java.lang.Integer;
import com.airbnb.lottie.ex.model.layer.Layer;
import l5.m;
import com.airbnb.lottie.ex.model.layer.Layer$LayerType;
import java.lang.StringBuilder;
import a5.d;
import a5.g;
import android.graphics.Rect;

public class n	// class@002525
{

    public static e a(JsonReader p0){
       int i3;
       float f4;
       HashMap hashMap3;
       ArrayList uArrayList2;
       HashMap hashMap4;
       String str7;
       HashMap hashMap5;
       int i6;
       Layer layer;
       String str8;
       String str9;
       int i7;
       int i8;
       double d;
       int i9;
       int i10;
       JsonReader jsonReader = p0;
       float f = f.c();
       LongSparseArray longSparseAr = new LongSparseArray();
       ArrayList uArrayList = new ArrayList();
       HashMap hashMap = new HashMap();
       HashMap hashMap1 = new HashMap();
       HashMap hashMap2 = new HashMap();
       ArrayList uArrayList1 = new ArrayList();
       SparseArrayCompat sparseArrayC = new SparseArrayCompat();
       e uoe = new e();
       p0.beginObject();
       String str = null;
       int i = 0;
       String str1 = null;
       String str2 = null;
       String str3 = null;
       while (p0.hasNext()) {
          String str4 = p0.nextName();
          Objects.requireNonNull(str4);
          float f1 = str;
          str = "h";
          float f2 = str3;
          str3 = "layers";
          float f3 = str2;
          str2 = "w";
          int i1 = str1;
          int i2 = 1;
          switch (str4.hashCode()){
              case 0xac107383:
                if (str4.equals("assets")) {
                   i3 = 0;
                }else {
                }
                break;
              case 0xbddad542:
                if (str4.equals(str3)) {
                   i3 = 1;
                }else {
                }
                break;
              case 'h':
                if (str4.equals(str)) {
                   i3 = 2;
                }else {
                }
                break;
              case 'v':
                if (str4.equals("v")) {
                   i3 = 3;
                }else {
                }
                break;
              case 'w':
                if (str4.equals(str2)) {
                   i3 = 4;
                }else {
                }
                break;
              case 3276:
                if (str4.equals("fr")) {
                   i3 = 5;
                }else {
                }
                break;
              case 3367:
                if (str4.equals("ip")) {
                   i3 = 6;
                }else {
                }
                break;
              case 3553:
                if (str4.equals("op")) {
                   i3 = 7;
                }else {
                }
                break;
              case 0x5a3d7dd:
                if (str4.equals("chars")) {
                   i3 = 8;
                }else {
                }
                break;
              case 0x5d17e04:
                if (str4.equals("fonts")) {
                   i3 = 9;
                }else {
                }
                break;
              case 0x3205f379:
                if (str4.equals("markers")) {
                   i3 = 10;
                }else {
                }
                break;
              default:
                i3 = -1;
          }
          str1 = "fFamily";
          switch (i3){
              case 0:
                f4 = f;
                hashMap3 = hashMap;
                uArrayList2 = uArrayList1;
                hashMap4 = hashMap1;
                p0.beginArray();
                while (p0.hasNext()) {
                   ArrayList uArrayList3 = new ArrayList();
                   LongSparseArray longSparseAr1 = new LongSparseArray();
                   p0.beginObject();
                   str1 = null;
                   String str5 = str1;
                   String str6 = str5;
                   int i4 = 0;
                   int i5 = 0;
                   while (p0.hasNext()) {
                      str7 = p0.nextName();
                      Objects.requireNonNull(str7);
                      hashMap5 = hashMap2;
                      switch (str7.hashCode()){
                          case 0xbddad542:
                            if (str7.equals(str3)) {
                               i6 = 0;
                            }
                            break;
                          case 'h':
                            if (str7.equals(str)) {
                               i6 = 1;
                            }
                            break;
                          case 'p':
                            if (str7.equals("p")) {
                               i6 = 2;
                            }
                            break;
                          case 'u':
                            if (str7.equals("u")) {
                               i6 = 3;
                            }
                            break;
                          case 'w':
                            if (str7.equals(str2)) {
                               i6 = 4;
                            }
                            break;
                          case 3355:
                            if (str7.equals("id")) {
                               i6 = 5;
                            }
                            break;
                          default:
                         label_0439 :
                            i6 = -1;
                      }
                      switch (i6){
                          case 0:
                            p0.beginArray();
                            while (p0.hasNext()) {
                               layer = m.a(jsonReader, uoe);
                               longSparseAr1.put(layer.a(), layer);
                               uArrayList3.add(layer);
                               str3 = str3;
                               str2 = str2;
                            }
                            str8 = str2;
                            str9 = str3;
                            p0.endArray();
                         label_04c0 :
                            str3 = str9;
                            hashMap2 = hashMap5;
                            str2 = str8;
                            break;
                          case 1:
                            i5 = p0.nextInt();
                         label_0498 :
                            hashMap2 = hashMap5;
                            break;
                          case 2:
                            str5 = p0.nextString();
                            goto label_0498 ;
                            break;
                          case 3:
                            str6 = p0.nextString();
                            goto label_0498 ;
                            break;
                          case 4:
                            i4 = p0.nextInt();
                            goto label_0498 ;
                            break;
                          case 5:
                            str1 = p0.nextString();
                            goto label_0498 ;
                            break;
                          default:
                            p0.skipValue();
                            str8 = str2;
                            str9 = str3;
                            goto label_04c0 ;
                      }
                      str7 = 4;
                   }
                   hashMap5 = hashMap2;
                   str8 = str2;
                   str9 = str3;
                   p0.endObject();
                   if (str5 != null) {
                      g og = new g(i4, i5, str1, str5, str6);
                      hashMap4.put(hashMap.c, hashMap);
                   }else {
                      hashMap3.put(str1, uArrayList3);
                   }
                   str3 = str9;
                   hashMap2 = hashMap5;
                   str2 = str8;
                   str7 = 4;
                }
                hashMap5 = hashMap2;
                p0.endArray();
             label_0357 :
                str = f1;
             label_0359 :
                str3 = f2;
             label_035b :
                str2 = f3;
             label_035d :
                str1 = i1;
                break;
              case 1:
                f4 = f;
                hashMap3 = hashMap;
                uArrayList2 = uArrayList1;
                hashMap4 = hashMap1;
                p0.beginArray();
                i7 = 0;
                while (p0.hasNext()) {
                   layer = m.a(jsonReader, uoe);
                   if (layer.d() == Layer$LayerType.IMAGE) {
                      i7 = i7 + 1;
                   }
                   uArrayList.add(layer);
                   longSparseAr.put(layer.a(), layer);
                   if (i7 > 4) {
                      d.c("You have "+i7+" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                   }
                }
                p0.endArray();
             label_0355 :
                hashMap5 = hashMap2;
                goto label_0357 ;
                break;
              case 2:
                f4 = f;
                hashMap3 = hashMap;
                uArrayList2 = uArrayList1;
                hashMap4 = hashMap1;
                str1 = p0.nextInt();
                hashMap5 = hashMap2;
                i7 = f1;
                str3 = f2;
                str2 = f3;
                break;
              case 3:
                f4 = f;
                hashMap3 = hashMap;
                uArrayList2 = uArrayList1;
                hashMap4 = hashMap1;
                String[] stringArray = (p0.nextString()).split("\\.");
                i8 = Integer.parseInt(stringArray[0]);
                i7 = Integer.parseInt(stringArray[i2]);
                i6 = Integer.parseInt(stringArray[2]);
                str4 = 4;
                if (i8 < str4 || (i8 <= str4 && (i7 < str4 || (i7 <= str4 && i6 < 0)))) {
                   i2 = 0;
                }
             label_0396 :
                if (!i2) {
                   uoe.a("Lottie only supports bodymovin >= 4.4.0");
                   goto label_0355 ;
                }else {
                   goto label_0355 ;
                }
                break;
              case 4:
                f4 = f;
                hashMap3 = hashMap;
                uArrayList2 = uArrayList1;
                hashMap4 = hashMap1;
                i = p0.nextInt();
                goto label_0355 ;
                break;
              case 5:
                f4 = f;
                hashMap3 = hashMap;
                uArrayList2 = uArrayList1;
                hashMap4 = hashMap1;
                str = (float)p0.nextDouble();
                hashMap5 = hashMap2;
                goto label_0359 ;
                break;
              case 6:
                f4 = f;
                hashMap3 = hashMap;
                uArrayList2 = uArrayList1;
                hashMap4 = hashMap1;
                str2 = (float)p0.nextDouble();
                hashMap5 = hashMap2;
                i7 = f1;
                str3 = f2;
                goto label_035d ;
                break;
              case 7:
                f4 = f;
                hashMap3 = hashMap;
                uArrayList2 = uArrayList1;
                hashMap4 = hashMap1;
                str3 = (float)p0.nextDouble() - 0.01f;
                hashMap5 = hashMap2;
                i7 = f1;
                goto label_035b ;
                break;
              case 8:
                f4 = f;
                hashMap3 = hashMap;
                uArrayList2 = uArrayList1;
                hashMap4 = hashMap1;
                p0.beginArray();
             label_0233 :
                if (p0.hasNext()) {
                   ArrayList uArrayList4 = new ArrayList();
                   p0.beginObject();
                   d = 0;
                   double d1 = d;
                   str8 = null;
                   String str10 = str8;
                   char c = 0;
                   while (p0.hasNext()) {
                      String str11 = p0.nextName();
                      Objects.requireNonNull(str11);
                      switch (str11.hashCode()){
                          case 0x90b8e36a:
                            if (str11.equals(str1)) {
                               i8 = 0;
                            }else {
                            }
                            break;
                          case 'w':
                            if (str11.equals(str2)) {
                               i8 = 1;
                            }else {
                            }
                            break;
                          case 3173:
                            if (str11.equals("ch")) {
                               i8 = 2;
                            }else {
                            }
                            break;
                          case 0x2eefaa:
                            if (str11.equals("data")) {
                               i8 = 3;
                            }else {
                            }
                            break;
                          case 0x35e001:
                            if (str11.equals("size")) {
                               i8 = 4;
                            }else {
                            }
                            break;
                          case 0x68b1db1:
                            if (str11.equals("style")) {
                               i8 = 5;
                            }else {
                            }
                            break;
                          default:
                            i8 = -1;
                      }
                      switch (i8){
                          case 0:
                            str10 = p0.nextString();
                            break;
                          case 1:
                            d1 = p0.nextDouble();
                            break;
                          case 2:
                            c = (p0.nextString()).charAt(0);
                            break;
                          case 3:
                            p0.beginObject();
                         label_02b4 :
                            if (p0.hasNext()) {
                               if (("shapes").equals(p0.nextName())) {
                                  p0.beginArray();
                                  while (p0.hasNext()) {
                                     uArrayList4.add(e.a(jsonReader, uoe));
                                  }
                                  p0.endArray();
                                  goto label_02b4 ;
                               }else {
                                  p0.skipValue();
                                  goto label_02b4 ;
                               }
                            }else {
                               p0.endObject();
                            }
                            break;
                          case 4:
                            d = p0.nextDouble();
                            break;
                          case 5:
                            str8 = p0.nextString();
                            break;
                          default:
                            p0.skipValue();
                      }
                   }
                   p0.endObject();
                   c uoc = new c(uArrayList4, c, d, d1, str8, str10);
                   sparseArrayC.put(hashMap1.hashCode(), hashMap1);
                   goto label_0233 ;
                }else {
                   p0.endArray();
                   goto label_0355 ;
                }
                break;
              case 9:
                p0.beginObject();
                while (p0.hasNext()) {
                   str = p0.nextName();
                   Objects.requireNonNull(str);
                   if (!str.equals("list")) {
                      p0.skipValue();
                   }else {
                      p0.beginArray();
                      while (p0.hasNext()) {
                         p0.beginObject();
                         str = null;
                         str4 = str;
                         str2 = str4;
                         float f5 = 0;
                         while (p0.hasNext()) {
                            uArrayList2 = uArrayList1;
                            String str12 = p0.nextName();
                            Objects.requireNonNull(str12);
                            f4 = f;
                            switch (str12.hashCode()){
                                case 0x90b8e36a:
                                  if (str12.equals(str1)) {
                                     i9 = 0;
                                  }else {
                                  }
                                  break;
                                case 0xac092cda:
                                  if (str12.equals("ascent")) {
                                     i9 = 1;
                                  }else {
                                  }
                                  break;
                                case 0xb2d67ceb:
                                  if (str12.equals("fStyle")) {
                                     i9 = 2;
                                  }else {
                                  }
                                  break;
                                case 0x5c24c11:
                                  if (str12.equals("fName")) {
                                     i9 = 3;
                                  }else {
                                  }
                                  break;
                                default:
                                  i9 = -1;
                            }
                            switch (i9){
                                case 0:
                                  str = p0.nextString();
                                  break;
                                case 1:
                                  f5 = (float)p0.nextDouble();
                                  hashMap = hashMap;
                                  hashMap1 = hashMap1;
                                  break;
                                case 2:
                                  str2 = p0.nextString();
                                  break;
                                case 3:
                                  str4 = p0.nextString();
                                  break;
                                default:
                                  p0.skipValue();
                            }
                            uArrayList1 = uArrayList2;
                            f = f4;
                         }
                         p0.endObject();
                         b uob = new b(str, str4, str2, f5);
                         hashMap2.put(uob.b, uob);
                         hashMap = hashMap;
                         hashMap1 = hashMap1;
                         uArrayList1 = uArrayList1;
                         f = f;
                      }
                      p0.endArray();
                      uArrayList1 = uArrayList1;
                      f = f;
                   }
                }
                f4 = f;
                hashMap3 = hashMap;
                uArrayList2 = uArrayList1;
                hashMap4 = hashMap1;
                p0.endObject();
                goto label_0355 ;
                break;
              case 10:
                p0.beginArray();
             label_00eb :
                if (p0.hasNext()) {
                   p0.beginObject();
                   str = null;
                   float f6 = 0;
                   double d2 = 0;
                   while (p0.hasNext()) {
                      str2 = p0.nextName();
                      Objects.requireNonNull(str2);
                      switch (str2.hashCode()){
                          case 3178:
                            if (str2.equals("cm")) {
                               i10 = 0;
                            }else {
                            }
                            break;
                          case 3214:
                            if (str2.equals("dr")) {
                               i10 = 1;
                            }else {
                            }
                            break;
                          case 3705:
                            if (str2.equals("tm")) {
                               i10 = 2;
                            }else {
                            }
                            break;
                          default:
                            i10 = -1;
                      }
                      switch (i10){
                          case 0:
                            str = p0.nextString();
                            break;
                          case 1:
                            d2 = (float)p0.nextDouble();
                            break;
                          case 2:
                            f6 = (float)p0.nextDouble();
                            break;
                          default:
                            p0.skipValue();
                      }
                   }
                   p0.endObject();
                   uArrayList1.add(new g(str, f6, d2));
                   goto label_00eb ;
                }else {
                   p0.endArray();
                label_0155 :
                   f4 = f;
                   hashMap3 = hashMap;
                   hashMap5 = hashMap2;
                   uArrayList2 = uArrayList1;
                   hashMap4 = hashMap1;
                   goto label_0357 ;
                }
                break;
              default:
                p0.skipValue();
                goto label_0155 ;
          }
          hashMap = hashMap3;
          hashMap1 = hashMap4;
          uArrayList1 = uArrayList2;
          f = f4;
          hashMap2 = hashMap5;
       }
       f4 = f;
       p0.endObject();
       uoe.j = new Rect(0, 0, (int)((float)i * f4), (int)((float)str1 * f4));
       uoe.k = str2;
       uoe.l = str3;
       uoe.m = str;
       uoe.i = uArrayList;
       uoe.h = longSparseAr;
       uoe.c = hashMap;
       uoe.d = hashMap1;
       uoe.g = sparseArrayC;
       uoe.e = hashMap2;
       uoe.f = uArrayList1;
       return uoe;
    }
}
