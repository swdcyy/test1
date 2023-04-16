package l5.m;
import android.util.JsonReader;
import a5.e;
import com.airbnb.lottie.ex.model.layer.Layer;
import com.airbnb.lottie.ex.model.layer.Layer$MatteType;
import java.util.ArrayList;
import java.lang.Float;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.airbnb.lottie.ex.model.content.Mask$MaskMode;
import h5.h;
import l5.c;
import h5.d;
import com.airbnb.lottie.ex.model.content.Mask;
import com.airbnb.lottie.ex.model.layer.Layer$LayerType;
import java.lang.Enum;
import h5.b;
import m5.f;
import android.graphics.Color;
import h5.l;
import l5.b;
import java.lang.StringBuilder;
import h5.j;
import l5.f;
import l5.s;
import java.util.List;
import h5.a;
import h5.k;
import i5.b;
import l5.e;
import n5.a;
import android.view.animation.Interpolator;

public class m	// class@002524
{

    public static Layer a(JsonReader p0,e p1){
       String str3;
       String str7;
       long l;
       boolean i9;
       ArrayList uArrayList2;
       String str9;
       String str10;
       b uob2;
       int b2;
       float f3;
       int b4;
       Mask$MaskMode maskMode;
       String str12;
       a uoa2;
       Layer layer;
       JsonReader jsonReader = p0;
       e uoe = p1;
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       p0.beginObject();
       Float uFloat = Float.valueOf(0x3f800000);
       Float uFloat1 = Float.valueOf(0);
       Layer$MatteType matteType = Layer$MatteType.NONE;
       int i = -1;
       float f = 0;
       double d = 0;
       String str = null;
       int i1 = 0;
       String str1 = null;
       l ol = null;
       int i2 = 0;
       Layer$MatteType matteType1 = null;
       int i3 = 0;
       float f1 = 0x3f800000;
       int i4 = 0;
       int i5 = 0;
       int i6 = 0;
       int i7 = 0;
       boolean b = false;
       b uob = null;
       boolean b1 = false;
       int i8 = 0;
       String str2 = "UNSET";
       while (p0.hasNext()) {
          str3 = p0.nextName();
          Objects.requireNonNull(str3);
          String str4 = "sw";
          String str5 = "sc";
          String str6 = "nm";
          str7 = str;
          str = "t";
          l = i8;
          switch (str3.hashCode()){
              case 0xc4ab08aa:
                if (!str3.equals("parent")) {
                label_018f :
                   i9 = -1;
                }else {
                   i9 = 0;
                }
                break;
              case 0xca24a4f2:
                if (!str3.equals("shapes")) {
                   goto label_018f ;
                }else {
                   i9 = 1;
                }
                break;
              case 'h':
                if (!str3.equals("h")) {
                   goto label_018f ;
                }else {
                   i9 = 2;
                }
                break;
              case 't':
                if (!str3.equals(str)) {
                   goto label_018f ;
                }else {
                   i9 = 3;
                }
                break;
              case 'w':
                if (!str3.equals("w")) {
                   goto label_018f ;
                }else {
                   i9 = 4;
                }
                break;
              case 3177:
                if (!str3.equals("cl")) {
                   goto label_018f ;
                }else {
                   i9 = 5;
                }
                break;
              case 3233:
                if (!str3.equals("ef")) {
                   goto label_018f ;
                }else {
                   i9 = 6;
                }
                break;
              case 3324:
                if (!str3.equals("hd")) {
                   goto label_018f ;
                }else {
                   i9 = 7;
                }
                break;
              case 3367:
                if (!str3.equals("ip")) {
                   goto label_018f ;
                }else {
                   i9 = 8;
                }
                break;
              case 3432:
                if (!str3.equals("ks")) {
                   goto label_018f ;
                }else {
                   i9 = 9;
                }
                break;
              case 3519:
                if (!str3.equals(str6)) {
                   goto label_018f ;
                }else {
                   i9 = 10;
                }
                break;
              case 3553:
                if (!str3.equals("op")) {
                   goto label_018f ;
                }else {
                   i9 = 11;
                }
                break;
              case 3664:
                if (!str3.equals(str5)) {
                   goto label_018f ;
                }else {
                   i9 = 12;
                }
                break;
              case 3669:
                if (!str3.equals("sh")) {
                   goto label_018f ;
                }else {
                   i9 = 13;
                }
                break;
              case 3679:
                if (!str3.equals("sr")) {
                   goto label_018f ;
                }else {
                   i9 = 14;
                }
                break;
              case 3681:
                if (!str3.equals("st")) {
                   goto label_018f ;
                }else {
                   i9 = 15;
                }
                break;
              case 3684:
                if (!str3.equals(str4)) {
                   goto label_018f ;
                }else {
                   i9 = 16;
                }
                break;
              case 3705:
                if (!str3.equals("tm")) {
                   goto label_018f ;
                }else {
                   i9 = 17;
                }
                break;
              case 3712:
                if (!str3.equals("tt")) {
                   goto label_018f ;
                }else {
                   i9 = 18;
                }
                break;
              case 3717:
                if (!str3.equals("ty")) {
                   goto label_018f ;
                }else {
                   i9 = 19;
                }
                break;
              case 0x197df:
                if (!str3.equals("ind")) {
                   goto label_018f ;
                }else {
                   i9 = 20;
                }
                break;
              case 0x675e90e:
                if (!str3.equals("refId")) {
                   goto label_018f ;
                }else {
                   i9 = 21;
                }
                break;
              case 0x55ed639a:
                if (!str3.equals("masksProperties")) {
                   goto label_018f ;
                }else {
                   i9 = 22;
                }
                break;
              default:
                goto label_018f ;
          }
          String str8 = "a";
          switch (i9){
              case 0:
                uArrayList2 = uArrayList;
                str9 = str2;
                i = (long)p0.nextInt();
             label_053e :
                str = str7;
                i8 = l;
                str2 = str9;
                break;
              case 1:
                uArrayList2 = uArrayList;
                str9 = str2;
                p0.beginArray();
                while (p0.hasNext()) {
                   b uob1 = e.a(p0, p1);
                   if (uob1 != null) {
                      uArrayList1.add(uob1);
                   }
                }
                p0.endArray();
                goto label_053e ;
                break;
              case 2:
                uArrayList2 = uArrayList;
                str9 = str2;
                float f2 = (float)p0.nextInt() * f.c();
                i6 = (int)f2;
                goto label_053e ;
                break;
              case 3:
                str9 = str2;
                p0.beginObject();
                while (p0.hasNext()) {
                   str6 = p0.nextName();
                   Objects.requireNonNull(str6);
                   if (!str6.equals(str8)) {
                      if (!str6.equals("d")) {
                         p0.skipValue();
                      }else {
                         i7 = new j(c.b(jsonReader, uoe, f.a));
                      }
                      uArrayList2 = uArrayList;
                      str10 = str8;
                      str8 = 2;
                   }else {
                      p0.beginArray();
                      if (p0.hasNext()) {
                         p0.beginObject();
                         b2 = false;
                         while (p0.hasNext()) {
                            str3 = p0.nextName();
                            Objects.requireNonNull(str3);
                            if (!str3.equals(str8)) {
                               p0.skipValue();
                            }else {
                               p0.beginObject();
                               a uoa = null;
                               a uoa1 = null;
                               uob2 = null;
                               b uob3 = null;
                               while (p0.hasNext()) {
                                  String str11 = p0.nextName();
                                  Objects.requireNonNull(str11);
                                  str10 = str8;
                                  int i10 = str11.hashCode();
                                  uArrayList2 = uArrayList;
                                  if (i10 != 116) {
                                     if (i10 != 3261) {
                                        if (i10 != 3664) {
                                           if (i10 != 3684 || !str11.equals(str4)) {
                                           label_047d :
                                              str11 = -1;
                                           }else {
                                              str11 = 3;
                                           }
                                        }else if(!str11.equals(str5)){
                                           goto label_047d ;
                                        }else {
                                           str11 = 2;
                                        }
                                     }else if(!str11.equals("fc")){
                                        goto label_047d ;
                                     }else {
                                        str11 = 1;
                                     }
                                  }else if(!str11.equals(str)){
                                     goto label_047d ;
                                  }else {
                                     str11 = 0;
                                  }
                                  if (str11) {
                                     if (str11 != 1) {
                                        if (str11 != 2) {
                                           if (str11 != 3) {
                                              p0.skipValue();
                                           }else {
                                              uob3 = c.d(p0, p1);
                                           }
                                        }else {
                                           uoa1 = c.c(p0, p1);
                                        }
                                     }else {
                                        uoa = c.c(p0, p1);
                                     }
                                  }else {
                                     uob2 = c.d(p0, p1);
                                  }
                                  str8 = str10;
                                  uArrayList = uArrayList2;
                               }
                               p0.endObject();
                               b2 = new k(uoa, uoa1, uob3, uob2);
                               str8 = str8;
                               uArrayList = uArrayList;
                               int i11 = p0;
                            }
                         }
                         uArrayList2 = uArrayList;
                         str10 = str8;
                         p0.endObject();
                         b = (b2 == null)? new k(null, null, null, null): b2;
                      }else {
                         uArrayList2 = uArrayList;
                         str10 = str8;
                         str8 = 2;
                      }
                      while (p0.hasNext()) {
                         p0.skipValue();
                      }
                      p0.endArray();
                   }
                   jsonReader = p0;
                   str8 = str10;
                   uArrayList = uArrayList2;
                   uob2 = null;
                }
                uArrayList2 = uArrayList;
                p0.endObject();
                goto label_053e ;
                break;
              case 4:
                str9 = str2;
                f3 = (float)p0.nextInt() * f.c();
                i5 = (int)f3;
             label_03c3 :
                str = str7;
             label_03c5 :
                i8 = l;
             label_03c7 :
                uArrayList2 = uArrayList;
                str2 = str9;
                i9 = false;
                break;
              case 5:
                str9 = str2;
                str = p0.nextString();
                goto label_03c5 ;
                break;
              case 6:
                str9 = str2;
                p0.beginArray();
                ArrayList uArrayList3 = new ArrayList();
                while (p0.hasNext()) {
                   p0.beginObject();
                   while (p0.hasNext()) {
                      str3 = p0.nextName();
                      Objects.requireNonNull(str3);
                      if (!str3.equals(str6)) {
                         p0.skipValue();
                      }else {
                         uArrayList3.add(p0.nextString());
                      }
                   }
                   p0.endObject();
                }
                p0.endArray();
                uoe.a("Lottie doesn\'t support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: "+uArrayList3);
             label_03a5 :
                uArrayList2 = uArrayList;
                i9 = false;
                goto label_053e ;
                break;
              case 7:
                str9 = str2;
                b1 = p0.nextBoolean();
                goto label_03c3 ;
                break;
              case 8:
                str9 = str2;
                f = (float)p0.nextDouble();
                goto label_03c3 ;
                break;
              case 9:
                str9 = str2;
                ol = b.a(p0, p1);
                goto label_03c3 ;
                break;
              case 10:
                str9 = p0.nextString();
                goto label_03c3 ;
                break;
              case 11:
                str9 = str2;
                d = (float)p0.nextDouble();
                goto label_03c3 ;
                break;
              case 12:
                str9 = str2;
                i3 = Color.parseColor(p0.nextString());
                goto label_03c3 ;
                break;
              case 13:
                str9 = str2;
                f3 = (float)p0.nextInt() * f.c();
                matteType1 = (int)f3;
                goto label_03c3 ;
                break;
              case 14:
                str9 = str2;
                f1 = (float)p0.nextDouble();
                goto label_03c3 ;
                break;
              case 15:
                str9 = str2;
                i4 = (float)p0.nextDouble();
                goto label_03c3 ;
                break;
              case 16:
                str9 = str2;
                f3 = (float)p0.nextInt() * f.c();
                i2 = (int)f3;
                goto label_03c3 ;
                break;
              case 17:
                str9 = str2;
                uob = c.e(jsonReader, uoe, false);
                goto label_03c3 ;
                break;
              case 18:
                str9 = str2;
                matteType = Layer$MatteType.values()[p0.nextInt()];
                uoe.n(1);
             label_02d1 :
                str2 = null;
                goto label_03c3 ;
                break;
              case 19:
                str9 = str2;
                b2 = p0.nextInt();
                Layer$LayerType uNKNOWN = Layer$LayerType.UNKNOWN;
                i1 = (b2 < uNKNOWN.ordinal())? Layer$LayerType.values()[b2]: uNKNOWN;
                str = str7;
                i8 = l;
             label_02a0 :
                str2 = null;
                goto label_03c7 ;
                break;
              case 20:
                str9 = str2;
                i8 = (long)p0.nextInt();
                str = str7;
                goto label_02a0 ;
                break;
              case 21:
                str9 = str2;
                str1 = p0.nextString();
                goto label_02d1 ;
                break;
              case 22:
                p0.beginArray();
                while (p0.hasNext()) {
                   p0.beginObject();
                   str6 = null;
                   h oh = null;
                   d uod = null;
                   boolean b3 = false;
                   while (p0.hasNext()) {
                      str4 = p0.nextName();
                      Objects.requireNonNull(str4);
                      i8 = str4.hashCode();
                      str9 = str2;
                      if (i8 != 111) {
                         if (i8 != 3588) {
                            if (i8 != 0x197f1) {
                               if (i8 != 0x3339a3 || !str4.equals("mode")) {
                               label_01fe :
                                  b4 = -1;
                               }else {
                                  b4 = 3;
                               }
                            }else if(!str4.equals("inv")){
                               goto label_01fe ;
                            }else {
                               b4 = 2;
                            }
                         }else if(!str4.equals("pt")){
                            goto label_01fe ;
                         }else {
                            b4 = true;
                         }
                      }else if(!str4.equals("o")){
                         goto label_01fe ;
                      }else {
                         b4 = false;
                      }
                      if (b4) {
                         if (b4 != 1) {
                            if (b4 != 2) {
                               if (b4 != 3) {
                                  p0.skipValue();
                               }else {
                                  str6 = p0.nextString();
                                  Objects.requireNonNull(str6);
                                  b4 = str6.hashCode();
                                  if (b4 != 97) {
                                     if (b4 != 105) {
                                        if (b4 != 115 || !str6.equals("s")) {
                                        label_0245 :
                                           maskMode = -1;
                                        }else {
                                           maskMode = 2;
                                        }
                                     }else if(!str6.equals("i")){
                                        goto label_0245 ;
                                     }else {
                                        maskMode = 1;
                                     }
                                  }else if(!str6.equals(str8)){
                                     goto label_0245 ;
                                  }else {
                                     maskMode = null;
                                  }
                                  if (maskMode) {
                                     if (maskMode != true) {
                                        if (maskMode != 2) {
                                           maskMode = Mask$MaskMode.MASK_MODE_ADD;
                                        }else {
                                           maskMode = Mask$MaskMode.MASK_MODE_SUBTRACT;
                                        }
                                     }else {
                                        uoe.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                        maskMode = Mask$MaskMode.MASK_MODE_INTERSECT;
                                     }
                                  }else {
                                     maskMode = Mask$MaskMode.MASK_MODE_ADD;
                                  }
                               }
                            }else {
                               b3 = p0.nextBoolean();
                            }
                         }else {
                            oh = c.i(p0, p1);
                         }
                      }else {
                         uod = c.g(p0, p1);
                      }
                      str2 = str9;
                   }
                   p0.endObject();
                   uArrayList.add(new Mask(str6, oh, uod, b3));
                }
                str9 = str2;
                uoe.n(uArrayList.size());
                p0.endArray();
                goto label_03a5 ;
                break;
              default:
                uArrayList2 = uArrayList;
                str9 = str2;
                p0.skipValue();
                goto label_053e ;
          }
          jsonReader = p0;
          uArrayList = uArrayList2;
          str4 = null;
       }
       str7 = str;
       uArrayList2 = uArrayList;
       str9 = str2;
       l = i8;
       p0.endObject();
       float f4 = f / f1;
       float f5 = d / f1;
       ArrayList uArrayList4 = new ArrayList();
       if (f4 > 0) {
          str12 = str7;
          uoa2 = new a(p1, uFloat1, uFloat1, null, 0, Float.valueOf(f4));
          uArrayList4.add(str2);
       }else {
          str12 = str7;
       }
       if (f5 <= 0) {
          f5 = p1.f();
       }
       e uoe1 = p1;
       uoa2 = new a(uoe1, uFloat, uFloat, null, f4, Float.valueOf(f5));
       uArrayList4.add(str2);
       uoa2 = new a(uoe1, uFloat1, uFloat1, null, f5, Float.valueOf(Float.MAX_VALUE));
       uArrayList4.add(uFloat);
       str3 = str9;
       if (str3.endsWith(".ai") || ("ai").equals(str12)) {
          uoe.a("Convert your Illustrator layers to shape layers.");
       }
       layer = new Layer(uArrayList1, p1, str3, l, i1, i, str1, uArrayList2, ol, i2, matteType1, i3, f1, i4, i5, i6, i7, b, uArrayList4, matteType, uob, b1);
       return v33;
    }
}
