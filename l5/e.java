package l5.e;
import android.util.JsonReader;
import a5.e;
import i5.b;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import h5.l;
import l5.b;
import h5.b;
import l5.c;
import com.airbnb.lottie.ex.model.content.ShapeTrimPath$Type;
import com.airbnb.lottie.ex.model.content.ShapeTrimPath;
import java.util.ArrayList;
import com.airbnb.lottie.ex.model.content.ShapeStroke$LineJoinType;
import com.airbnb.lottie.ex.model.content.ShapeStroke$LineCapType;
import h5.d;
import h5.a;
import com.airbnb.lottie.ex.model.content.ShapeStroke;
import java.util.List;
import com.airbnb.lottie.ex.model.content.PolystarShape$Type;
import h5.m;
import l5.a;
import com.airbnb.lottie.ex.model.content.PolystarShape;
import h5.h;
import i5.j;
import i5.f;
import h5.f;
import i5.e;
import com.airbnb.lottie.ex.model.content.MergePaths$MergePathsMode;
import com.airbnb.lottie.ex.model.content.MergePaths;
import com.airbnb.lottie.ex.model.content.GradientType;
import h5.c;
import com.airbnb.lottie.ex.model.content.a;
import i5.i;
import android.graphics.Path$FillType;
import i5.d;
import i5.h;
import i5.a;

public class e	// class@00251b
{

    public static b a(JsonReader p0,e p1){
       b uob;
       int i1;
       String str9;
       boolean b1;
       String str10;
       m om;
       f uof;
       boolean b2;
       String str11;
       boolean i4;
       boolean b3;
       String str12;
       String str13;
       Path$FillType uFillType;
       GradientType gradientType;
       String str15;
       ArrayList uArrayList;
       boolean i6;
       b uob1;
       a uoa2;
       JsonReader jsonReader1;
       b uob3;
       String str16;
       int i8;
       MergePaths mergePaths;
       b uob5;
       b uob7;
       int i10;
       String str19;
       object oobject3;
       JsonReader jsonReader = p0;
       e uoe = p1;
       p0.beginObject();
       int i = 2;
       while (true) {
          String str = "d";
          uob = null;
          if (p0.hasNext()) {
             String str1 = p0.nextName();
             Objects.requireNonNull(str1);
             if (!str1.equals(str)) {
                if (!str1.equals("ty")) {
                   p0.skipValue();
                }else {
                   str1 = p0.nextString();
                label_0035 :
                   if (str1 == null) {
                      break ;
                   }else {
                      switch (str1.hashCode()){
                          case 3239:
                            if (!str1.equals("el")) {
                            label_00df :
                               i1 = -1;
                            }else {
                               i1 = 0;
                            }
                            break;
                          case 3270:
                            if (!str1.equals("fl")) {
                               goto label_00df ;
                            }else {
                               i1 = 1;
                            }
                            break;
                          case 3295:
                            if (!str1.equals("gf")) {
                               goto label_00df ;
                            }else {
                               i1 = 2;
                            }
                            break;
                          case 3307:
                            if (!str1.equals("gr")) {
                               goto label_00df ;
                            }else {
                               i1 = 3;
                            }
                            break;
                          case 3308:
                            if (!str1.equals("gs")) {
                               goto label_00df ;
                            }else {
                               i1 = 4;
                            }
                            break;
                          case 3488:
                            if (!str1.equals("mm")) {
                               goto label_00df ;
                            }else {
                               i1 = 5;
                            }
                            break;
                          case 3633:
                            if (!str1.equals("rc")) {
                               goto label_00df ;
                            }else {
                               i1 = 6;
                            }
                            break;
                          case 3646:
                            if (!str1.equals("rp")) {
                               goto label_00df ;
                            }else {
                               i1 = 7;
                            }
                            break;
                          case 3669:
                            if (!str1.equals("sh")) {
                               goto label_00df ;
                            }else {
                               i1 = 8;
                            }
                            break;
                          case 3679:
                            if (!str1.equals("sr")) {
                               goto label_00df ;
                            }else {
                               i1 = 9;
                            }
                            break;
                          case 3681:
                            if (!str1.equals("st")) {
                               goto label_00df ;
                            }else {
                               i1 = 10;
                            }
                            break;
                          case 3705:
                            if (!str1.equals("tm")) {
                               goto label_00df ;
                            }else {
                               i1 = 11;
                            }
                            break;
                          case 3710:
                            if (!str1.equals("tr")) {
                               goto label_00df ;
                            }else {
                               i1 = 12;
                            }
                            break;
                          default:
                            goto label_00df ;
                      }
                      String str2 = "r";
                      String str3 = "p";
                      String str4 = "s";
                      String str5 = "o";
                      String str6 = "nm";
                      String str7 = "hd";
                      String str8 = "g";
                      int i2 = 101;
                      int i3 = 115;
                      int b = 111;
                      switch (i1){
                          case 0:
                            str9 = str6;
                            str8 = (i == 3)? 1: 0;
                            b1 = str8;
                            str10 = null;
                            om = null;
                            uof = null;
                            b2 = false;
                         label_0b2d :
                            if (!p0.hasNext()) {
                               a uoa = new a(str10, om, uof, b1, b2);
                               while (p0.hasNext()) {
                                  p0.skipValue();
                               }
                               p0.endObject();
                               return uob;
                            }
                            break;
                          case 1:
                            str9 = str6;
                            a uoa1 = null;
                            i4 = 1;
                            b3 = false;
                            d uod = null;
                            i2 = false;
                            str12 = null;
                            while (p0.hasNext()) {
                               str13 = p0.nextName();
                               Objects.requireNonNull(str13);
                               int i5 = str13.hashCode();
                               if (i5 != -396065730) {
                                  i3 = 111;
                                  if (i5 != 99) {
                                     if (i5 != i3) {
                                        if (i5 != 114) {
                                           if (i5 != 3324) {
                                              if (i5 != 3519 || !str13.equals(str9)) {
                                              label_0aca :
                                                 str11 = -1;
                                              }else {
                                                 str11 = 5;
                                              }
                                           }else if(!str13.equals(str7)){
                                              goto label_0aca ;
                                           }else {
                                              str11 = 4;
                                           }
                                        }else if(!str13.equals(str2)){
                                           goto label_0aca ;
                                        }else {
                                           str11 = 3;
                                        }
                                     }else if(!str13.equals(str5)){
                                        goto label_0aca ;
                                     }else {
                                        str11 = 2;
                                     }
                                  }else if(!str13.equals("c")){
                                     goto label_0aca ;
                                  }else {
                                     str11 = 1;
                                  }
                               }else if(!str13.equals("fillEnabled")){
                                  goto label_0aca ;
                               }else {
                                  str11 = 0;
                               }
                               if (str11) {
                                  if (str11 != 1) {
                                     if (str11 != 2) {
                                        if (str11 != 3) {
                                           if (str11 != 4) {
                                              if (str11 != 5) {
                                                 p0.skipValue();
                                              }else {
                                                 str12 = p0.nextString();
                                              }
                                           }else {
                                              i2 = p0.nextBoolean();
                                           }
                                        }else {
                                           i4 = p0.nextInt();
                                        }
                                     }else {
                                        uod = c.g(p0, p1);
                                     }
                                  }else {
                                     uoa1 = c.c(p0, p1);
                                  }
                               }else {
                                  b3 = p0.nextBoolean();
                               }
                               b = false;
                            }
                            Path$FillType wINDING = (i4 == 1)? Path$FillType.WINDING: Path$FillType.EVEN_ODD;
                            h oh = new h(str12, b3, wINDING, uoa1, uod, i2);
                            continue ;
                            break;
                          case 2:
                            str9 = str6;
                            uFillType = Path$FillType.WINDING;
                            String str14 = null;
                            gradientType = null;
                            c uoc = null;
                            d uod1 = null;
                            f uof1 = null;
                            f uof2 = null;
                            boolean b4 = false;
                            while (p0.hasNext()) {
                               str15 = p0.nextName();
                               Objects.requireNonNull(str15);
                               i1 = str15.hashCode();
                               if (i1 != 101) {
                                  if (i1 != 103) {
                                     if (i1 != 111) {
                                        if (i1 != 3324) {
                                           if (i1 != 3519) {
                                              switch (i1){
                                                  case 'r':
                                                    if (str15.equals(str2)) {
                                                       i = 3;
                                                    }
                                                    break;
                                                  case 's':
                                                    if (str15.equals(str4)) {
                                                       i = 4;
                                                    }
                                                    break;
                                                  case 't':
                                                    if (str15.equals("t")) {
                                                       i = 5;
                                                    }
                                                    break;
                                                  default:
                                              }
                                              switch (i){
                                                  case 0:
                                                    uof2 = c.h(p0, p1);
                                                    break;
                                                  case 1:
                                                    p0.beginObject();
                                                    i = -1;
                                                    while (p0.hasNext()) {
                                                       str1 = p0.nextName();
                                                       Objects.requireNonNull(str1);
                                                       if (!str1.equals("k")) {
                                                          if (!str1.equals(str3)) {
                                                             p0.skipValue();
                                                          }else {
                                                             i = p0.nextInt();
                                                             continue ;
                                                          }
                                                       }else {
                                                          uoc = c.f(p0, uoe, i);
                                                          continue ;
                                                       }
                                                    }
                                                    p0.endObject();
                                                    continue ;
                                                    break;
                                                  case 2:
                                                    uod1 = c.g(p0, p1);
                                                    continue ;
                                                    break;
                                                  case 3:
                                                    Path$FillType wINDING1 = (p0.nextInt() == 1)? Path$FillType.WINDING: Path$FillType.EVEN_ODD;
                                                    uFillType = wINDING1;
                                                    continue ;
                                                    break;
                                                  case 4:
                                                    uof1 = c.h(p0, p1);
                                                    continue ;
                                                    break;
                                                  case 5:
                                                    GradientType lINEAR = (p0.nextInt() == 1)? GradientType.LINEAR: GradientType.RADIAL;
                                                    gradientType = lINEAR;
                                                    continue ;
                                                    break;
                                                  case 6:
                                                    b4 = p0.nextBoolean();
                                                    continue ;
                                                    break;
                                                  case 7:
                                                    str14 = p0.nextString();
                                                    continue ;
                                                    break;
                                                  default:
                                                    p0.skipValue();
                                                    continue ;
                                              }
                                           }else if(!str15.equals(str9)){
                                              i = 7;
                                              goto label_09cb ;
                                           }
                                        }else if(!str15.equals(str7)){
                                           i = 6;
                                           goto label_09cb ;
                                        }
                                     }else if(!str15.equals(str5)){
                                        i = 2;
                                        goto label_09cb ;
                                     }
                                  }else if(!str15.equals(str8)){
                                     i = 1;
                                     goto label_09cb ;
                                  }
                               }else if(!str15.equals("e")){
                                  i = 0;
                                  goto label_09cb ;
                               }
                               i = -1;
                               goto label_09cb ;
                            }
                            d uod2 = new d(str14, gradientType, uFillType, uoc, uod1, uof1, uof2, null, null, b4);
                            continue ;
                            break;
                          case 3:
                            str9 = str6;
                            uArrayList = new ArrayList();
                            i1 = false;
                            str13 = null;
                            while (p0.hasNext()) {
                               str = p0.nextName();
                               Objects.requireNonNull(str);
                               i6 = str.hashCode();
                               if (i6 != 3324) {
                                  if (i6 != 3371) {
                                     if (i6 != 3519 || !str.equals(str9)) {
                                     label_0908 :
                                        i4 = -1;
                                     }else {
                                        i4 = 2;
                                     }
                                  }else if(!str.equals("it")){
                                     goto label_0908 ;
                                  }else {
                                     i4 = true;
                                  }
                               }else if(!str.equals(str7)){
                                  goto label_0908 ;
                               }else {
                                  i4 = false;
                               }
                               if (i4) {
                                  if (i4 != 1) {
                                     if (i4 != 2) {
                                        p0.skipValue();
                                     }else {
                                        str13 = p0.nextString();
                                        continue ;
                                     }
                                  }else {
                                     p0.beginArray();
                                     while (p0.hasNext()) {
                                        uob1 = e.a(p0, p1);
                                        if (uob1 != null) {
                                           uArrayList.add(uob1);
                                        }else {
                                           continue ;
                                        }
                                     }
                                     p0.endArray();
                                     continue ;
                                  }
                               }else {
                                  i1 = p0.nextBoolean();
                                  continue ;
                               }
                            }
                            i oi = new i(str13, uArrayList, i1);
                         label_093d :
                            uoa2 = oi;
                            i1 = p0;
                            continue ;
                            break;
                          case 4:
                            jsonReader1 = jsonReader;
                            str9 = str6;
                            uArrayList = new ArrayList();
                            str13 = null;
                            i6 = 0;
                            c uoc1 = null;
                            str6 = 0;
                            int i7 = 0;
                            f uof3 = null;
                            b uob2 = null;
                            object oobject = null;
                            object oobject1 = null;
                            gradientType = 0;
                            uFillType = 0;
                            boolean b5 = false;
                            while (p0.hasNext()) {
                               str1 = p0.nextName();
                               Objects.requireNonNull(str1);
                               i3 = str1.hashCode();
                               d uod3 = str6;
                               if (i3 != 100) {
                                  if (i3 != 101) {
                                     if (i3 != 103) {
                                        if (i3 != 111) {
                                           if (i3 != 119) {
                                              if (i3 != 3324) {
                                                 if (i3 != 3447) {
                                                    if (i3 != 3454) {
                                                       if (i3 != 3487) {
                                                          if (i3 != 3519) {
                                                             if (i3 != 115) {
                                                                if (i3 != 116 || !str1.equals("t")) {
                                                                label_078c :
                                                                   i1 = -1;
                                                                }else {
                                                                   i1 = 5;
                                                                }
                                                             }else if(!str1.equals(str4)){
                                                                goto label_078c ;
                                                             }else {
                                                                i1 = 4;
                                                             }
                                                          }else if(!str1.equals(str9)){
                                                             goto label_078c ;
                                                          }else {
                                                             i1 = 11;
                                                          }
                                                       }else if(!str1.equals("ml")){
                                                          goto label_078c ;
                                                       }else {
                                                          i1 = 10;
                                                       }
                                                    }else if(!str1.equals("lj")){
                                                       goto label_078c ;
                                                    }else {
                                                       i1 = 9;
                                                    }
                                                 }else if(!str1.equals("lc")){
                                                    goto label_078c ;
                                                 }else {
                                                    i1 = 8;
                                                 }
                                              }else if(!str1.equals(str7)){
                                                 goto label_078c ;
                                              }else {
                                                 i1 = 7;
                                              }
                                           }else if(!str1.equals("w")){
                                              goto label_078c ;
                                           }else {
                                              i1 = 6;
                                           }
                                        }else if(!str1.equals(str5)){
                                           goto label_078c ;
                                        }else {
                                           i1 = 3;
                                        }
                                     }else if(!str1.equals(str8)){
                                        goto label_078c ;
                                     }else {
                                        i1 = 2;
                                     }
                                  }else if(!str1.equals("e")){
                                     goto label_078c ;
                                  }else {
                                     i1 = 1;
                                  }
                               }else if(!str1.equals(str)){
                                  goto label_078c ;
                               }else {
                                  i1 = 0;
                               }
                               switch (i1){
                                   case 0:
                                     p0.beginArray();
                                     while (p0.hasNext()) {
                                        p0.beginObject();
                                        str1 = null;
                                        uob3 = null;
                                        while (p0.hasNext()) {
                                           str16 = p0.nextName();
                                           Objects.requireNonNull(str16);
                                           if (!str16.equals("n")) {
                                              if (!str16.equals("v")) {
                                                 p0.skipValue();
                                              }else {
                                                 uob3 = c.d(p0, p1);
                                              }
                                           }else {
                                              str1 = p0.nextString();
                                           }
                                           b = p0;
                                        }
                                        p0.endObject();
                                        if (str1.equals(str5)) {
                                           b uob4 = uob3;
                                        }else if(str1.equals(str) || str1.equals(str8)){
                                           uoe.p(true);
                                           uArrayList.add(uob3);
                                        label_0882 :
                                           b = p0;
                                        }
                                        jsonReader1 = 1;
                                        goto label_0882 ;
                                     }
                                     p0.endArray();
                                     if (uArrayList.size() == 1) {
                                        uArrayList.add(uArrayList.get(0));
                                     }else {
                                        jsonReader1 = 0;
                                     }
                                     jsonReader1 = p0;
                                     i8 = uod3;
                                     break;
                                   case 1:
                                     uof3 = c.h(p0, p1);
                                  label_0820 :
                                     i8 = uod3;
                                  label_0822 :
                                     jsonReader1 = 0;
                                  label_08a1 :
                                     jsonReader1 = p0;
                                     break;
                                   case 2:
                                     p0.beginObject();
                                     i1 = -1;
                                     while (p0.hasNext()) {
                                        str6 = p0.nextName();
                                        Objects.requireNonNull(str6);
                                        if (!str6.equals("k")) {
                                           if (!str6.equals(str3)) {
                                              p0.skipValue();
                                           }else {
                                              i1 = p0.nextInt();
                                              continue ;
                                           }
                                        }else {
                                           uoc1 = c.f(jsonReader1, uoe, i1);
                                           continue ;
                                        }
                                     }
                                     p0.endObject();
                                     goto label_0820 ;
                                     break;
                                   case 3:
                                     i8 = c.g(p0, p1);
                                     goto label_0822 ;
                                     break;
                                   case 4:
                                     i7 = c.h(p0, p1);
                                     goto label_0820 ;
                                     break;
                                   case 5:
                                     GradientType lINEAR1 = (p0.nextInt() == 1)? GradientType.LINEAR: GradientType.RADIAL;
                                     GradientType gradientType1 = lINEAR1;
                                     goto label_0820 ;
                                     break;
                                   case 6:
                                     uob2 = c.d(p0, p1);
                                     goto label_0820 ;
                                     break;
                                   case 7:
                                     b5 = p0.nextBoolean();
                                     goto label_0820 ;
                                     break;
                                   case 8:
                                     i8 = p0.nextInt() - 1;
                                     oobject = ShapeStroke$LineCapType.values()[i8];
                                     goto label_0820 ;
                                     break;
                                   case 9:
                                     i8 = p0.nextInt() - 1;
                                     oobject1 = ShapeStroke$LineJoinType.values()[i8];
                                     goto label_0820 ;
                                     break;
                                   case 10:
                                     float f = (float)p0.nextDouble();
                                     goto label_0820 ;
                                     break;
                                   case 11:
                                     str13 = p0.nextString();
                                     goto label_0820 ;
                                     break;
                                   default:
                                     p0.skipValue();
                                     i8 = uod3;
                                     goto label_08a1 ;
                               }
                            }
                            a uoa3 = new a(str13, i6, uoc1, str6, i7, uof3, uob2, oobject, oobject1, gradientType, uArrayList, uFillType, b5);
                            goto label_093d ;
                            break;
                          case 5:
                            b = jsonReader;
                            str9 = str6;
                            i = 0;
                            i1 = false;
                            str13 = null;
                            while (p0.hasNext()) {
                               str = p0.nextName();
                               Objects.requireNonNull(str);
                               i6 = str.hashCode();
                               if (i6 != 3324) {
                                  if (i6 != 3488) {
                                     if (i6 != 3519 || !str.equals(str9)) {
                                     label_067e :
                                        i4 = -1;
                                     }else {
                                        i4 = 2;
                                     }
                                  }else if(!str.equals("mm")){
                                     goto label_067e ;
                                  }else {
                                     i4 = true;
                                  }
                               }else if(!str.equals(str7)){
                                  goto label_067e ;
                               }else {
                                  i4 = false;
                               }
                               if (i4) {
                                  if (i4 != 1) {
                                     if (i4 != 2) {
                                        p0.skipValue();
                                     }else {
                                        str13 = p0.nextString();
                                        continue ;
                                     }
                                  }else {
                                     MergePaths$MergePathsMode mergePathsMo = MergePaths$MergePathsMode.forId(p0.nextInt());
                                     continue ;
                                  }
                               }else {
                                  i1 = p0.nextBoolean();
                                  continue ;
                               }
                            }
                            mergePaths = new MergePaths(str13, i, i1);
                            uoe.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove\(\).");
                         label_06aa :
                            uoa2 = mergePaths;
                         label_063e :
                            JsonReader jsonReader2 = b;
                            continue ;
                            break;
                          case 6:
                            b = jsonReader;
                            str9 = str6;
                            i = false;
                            uob5 = null;
                            String str17 = null;
                            m om1 = null;
                            f uof4 = null;
                            while (p0.hasNext()) {
                               str1 = p0.nextName();
                               Objects.requireNonNull(str1);
                               i4 = str1.hashCode();
                               if (i4 != 112) {
                                  if (i4 != 3324) {
                                     if (i4 != 3519) {
                                        if (i4 != 114) {
                                           if (i4 != i3 || !str1.equals(str4)) {
                                           label_0603 :
                                              i1 = -1;
                                           }else {
                                              i1 = 2;
                                           }
                                        }else if(!str1.equals(str2)){
                                           goto label_0603 ;
                                        }else {
                                           i1 = true;
                                        }
                                     }else if(!str1.equals(str9)){
                                        goto label_0603 ;
                                     }else {
                                        i1 = 4;
                                     }
                                  }else if(!str1.equals(str7)){
                                     goto label_0603 ;
                                  }else {
                                     i1 = 3;
                                  }
                               }else if(!str1.equals(str3)){
                                  goto label_0603 ;
                               }else {
                                  i1 = false;
                               }
                               if (i1) {
                                  if (i1 != 1) {
                                     if (i1 != 2) {
                                        if (i1 != 3) {
                                           if (i1 != 4) {
                                              p0.skipValue();
                                           }else {
                                              str17 = p0.nextString();
                                              continue ;
                                           }
                                        }else {
                                           i = p0.nextBoolean();
                                           continue ;
                                        }
                                     }else {
                                        uof4 = c.h(p0, p1);
                                        continue ;
                                     }
                                  }else {
                                     uob5 = c.d(p0, p1);
                                     continue ;
                                  }
                               }else {
                                  om1 = a.b(p0, p1);
                                  continue ;
                               }
                            }
                            e uoe1 = new e(str17, om1, uof4, uob5, i);
                            goto label_06aa ;
                            break;
                          case 7:
                            jsonReader1 = jsonReader;
                            str9 = str6;
                            l ol = null;
                            b uob6 = null;
                            uob7 = null;
                            boolean b6 = false;
                            str12 = null;
                            while (p0.hasNext()) {
                               str1 = p0.nextName();
                               Objects.requireNonNull(str1);
                               i4 = str1.hashCode();
                               if (i4 != 99) {
                                  if (i4 != 111) {
                                     if (i4 != 3324) {
                                        if (i4 != 3519) {
                                           if (i4 != 3710 || !str1.equals("tr")) {
                                           label_056e :
                                              i1 = -1;
                                           }else {
                                              i1 = 4;
                                           }
                                        }else if(!str1.equals(str9)){
                                           goto label_056e ;
                                        }else {
                                           i1 = 3;
                                        }
                                     }else if(!str1.equals(str7)){
                                        goto label_056e ;
                                     }else {
                                        i1 = 2;
                                     }
                                  }else if(!str1.equals(str5)){
                                     goto label_056e ;
                                  }else {
                                     i1 = true;
                                  }
                               }else if(!str1.equals("c")){
                                  goto label_056e ;
                               }else {
                                  i1 = false;
                               }
                               if (i1) {
                                  if (i1 != 1) {
                                     if (i1 != 2) {
                                        if (i1 != 3) {
                                           if (i1 != 4) {
                                              p0.skipValue();
                                           }else {
                                              ol = b.a(p0, p1);
                                              continue ;
                                           }
                                        }else {
                                           str12 = p0.nextString();
                                           continue ;
                                        }
                                     }else {
                                        b6 = p0.nextBoolean();
                                        continue ;
                                     }
                                  }else {
                                     uob7 = c.e(jsonReader1, uoe, false);
                                     continue ;
                                  }
                               }else {
                                  uob6 = c.e(jsonReader1, uoe, false);
                                  continue ;
                               }
                            }
                            f uof5 = new f(str12, uob6, uob7, ol, b6);
                            goto label_06aa ;
                            break;
                          case 8:
                            b = jsonReader;
                            str9 = str6;
                            h oh1 = null;
                            i1 = 0;
                            i4 = false;
                            str13 = null;
                            while (p0.hasNext()) {
                               str2 = p0.nextName();
                               Objects.requireNonNull(str2);
                               b3 = str2.hashCode();
                               if (b3 != 3324) {
                                  if (b3 != 3432) {
                                     if (b3 != 3519) {
                                        if (b3 != 0x197df || !str2.equals("ind")) {
                                        label_04e5 :
                                           i6 = -1;
                                        }else {
                                           i6 = 3;
                                        }
                                     }else if(!str2.equals(str9)){
                                        goto label_04e5 ;
                                     }else {
                                        i6 = 2;
                                     }
                                  }else if(!str2.equals("ks")){
                                     goto label_04e5 ;
                                  }else {
                                     i6 = true;
                                  }
                               }else if(!str2.equals(str7)){
                                  goto label_04e5 ;
                               }else {
                                  i6 = false;
                               }
                               if (i6) {
                                  if (i6 != 1) {
                                     if (i6 != 2) {
                                        if (i6 != 3) {
                                           p0.skipValue();
                                        }else {
                                           i1 = p0.nextInt();
                                           continue ;
                                        }
                                     }else {
                                        str13 = p0.nextString();
                                        continue ;
                                     }
                                  }else {
                                     oh1 = c.i(p0, p1);
                                     continue ;
                                  }
                               }else {
                                  i4 = p0.nextBoolean();
                                  continue ;
                               }
                            }
                            mergePaths = new j(str13, i1, oh1, i4);
                            goto label_06aa ;
                            break;
                          case 9:
                            str9 = str6;
                            String str18 = null;
                            PolystarShape$Type type = null;
                            b uob8 = null;
                            m om2 = null;
                            b uob9 = null;
                            b uob10 = null;
                            b uob11 = null;
                            b uob12 = null;
                            b uob13 = null;
                            boolean b7 = false;
                            while (p0.hasNext()) {
                               str11 = p0.nextName();
                               Objects.requireNonNull(str11);
                               i = str11.hashCode();
                               if (i != 112) {
                                  if (i != 114) {
                                     if (i != 3324) {
                                        if (i != 3519) {
                                           if (i != 3588) {
                                              if (i != 3686) {
                                                 if (i != 3369) {
                                                    if (i != 3370) {
                                                       if (i != 3555) {
                                                          if (i != 3556 || !str11.equals("os")) {
                                                          label_0421 :
                                                             b = -1;
                                                          }else {
                                                             b = 7;
                                                          }
                                                       }else if(!str11.equals("or")){
                                                          goto label_0421 ;
                                                       }else {
                                                          b = 6;
                                                       }
                                                    }else if(!str11.equals("is")){
                                                       goto label_0421 ;
                                                    }else {
                                                       b = 4;
                                                    }
                                                 }else if(!str11.equals("ir")){
                                                    goto label_0421 ;
                                                 }else {
                                                    b = 3;
                                                 }
                                              }else if(!str11.equals("sy")){
                                                 goto label_0421 ;
                                              }else {
                                                 b = 9;
                                              }
                                           }else if(!str11.equals("pt")){
                                              goto label_0421 ;
                                           }else {
                                              b = 8;
                                           }
                                        }else if(!str11.equals(str9)){
                                           goto label_0421 ;
                                        }else {
                                           b = 5;
                                        }
                                     }else if(!str11.equals(str7)){
                                        goto label_0421 ;
                                     }else {
                                        b = 2;
                                     }
                                  }else if(!str11.equals(str2)){
                                     goto label_0421 ;
                                  }else {
                                     b = 1;
                                  }
                               }else if(!str11.equals(str3)){
                                  goto label_0421 ;
                               }else {
                                  b = 0;
                               }
                               switch (b){
                                   case 0:
                                     om2 = a.b(p0, p1);
                                     break;
                                   case 1:
                                     uob9 = c.e(p0, uoe, false);
                                     continue ;
                                     break;
                                   case 2:
                                     b7 = p0.nextBoolean();
                                     continue ;
                                     break;
                                   case 3:
                                     uob10 = c.d(p0, p1);
                                     continue ;
                                     break;
                                   case 4:
                                     uob12 = c.e(p0, uoe, false);
                                     continue ;
                                     break;
                                   case 5:
                                     str18 = p0.nextString();
                                     continue ;
                                     break;
                                   case 6:
                                     uob11 = c.d(p0, p1);
                                     continue ;
                                     break;
                                   case 7:
                                     uob13 = c.e(p0, uoe, false);
                                     continue ;
                                     break;
                                   case 8:
                                     uob8 = c.e(p0, uoe, false);
                                     continue ;
                                     break;
                                   case 9:
                                     type = PolystarShape$Type.forValue(p0.nextInt());
                                     b = p0;
                                     continue ;
                                     break;
                                   default:
                                     p0.skipValue();
                                     continue ;
                               }
                            }
                            b = p0;
                            PolystarShape polystarShap = new PolystarShape(str18, type, uob8, om2, uob9, uob10, uob11, uob12, uob13, b7);
                            goto label_06aa ;
                            break;
                          case 10:
                            uArrayList = new ArrayList();
                            str1 = null;
                            str13 = null;
                            a uoa4 = null;
                            d uod4 = null;
                            uob7 = null;
                            i2 = 0;
                            str16 = 0;
                            object oobject2 = null;
                            boolean b8 = false;
                            while (p0.hasNext()) {
                               str11 = p0.nextName();
                               Objects.requireNonNull(str11);
                               int i9 = str11.hashCode();
                               float f1 = str16;
                               if (i9 != 99) {
                                  if (i9 != 100) {
                                     if (i9 != 111) {
                                        if (i9 != 119) {
                                           if (i9 != 3324) {
                                              if (i9 != 3447) {
                                                 if (i9 != 3454) {
                                                    if (i9 != 3487) {
                                                       if (i9 != 3519 || !str11.equals(str6)) {
                                                       label_0254 :
                                                          i9 = -1;
                                                       }else {
                                                          i9 = 8;
                                                       }
                                                    }else if(!str11.equals("ml")){
                                                       goto label_0254 ;
                                                    }else {
                                                       i9 = 7;
                                                    }
                                                 }else if(!str11.equals("lj")){
                                                    goto label_0254 ;
                                                 }else {
                                                    i9 = 6;
                                                 }
                                              }else if(!str11.equals("lc")){
                                                 goto label_0254 ;
                                              }else {
                                                 i9 = 5;
                                              }
                                           }else if(!str11.equals(str7)){
                                              goto label_0254 ;
                                           }else {
                                              i9 = 4;
                                           }
                                        }else if(!str11.equals("w")){
                                           goto label_0254 ;
                                        }else {
                                           i9 = 3;
                                        }
                                     }else if(!str11.equals(str5)){
                                        goto label_0254 ;
                                     }else {
                                        i9 = 2;
                                     }
                                  }else if(!str11.equals(str)){
                                     goto label_0254 ;
                                  }else {
                                     i9 = 1;
                                  }
                               }else if(!str11.equals("c")){
                                  goto label_0254 ;
                               }else {
                                  i9 = 0;
                               }
                               switch (i9){
                                   case 0:
                                     str9 = str6;
                                     uoa4 = c.c(p0, p1);
                                  label_0344 :
                                     i3 = f1;
                                     break;
                                   case 1:
                                     str9 = str6;
                                     p0.beginArray();
                                     while (p0.hasNext()) {
                                        p0.beginObject();
                                        str11 = null;
                                        uob3 = null;
                                        while (p0.hasNext()) {
                                           str16 = p0.nextName();
                                           Objects.requireNonNull(str16);
                                           b uob14 = str13;
                                           if (!str16.equals("n")) {
                                              if (!str16.equals("v")) {
                                                 p0.skipValue();
                                              }else {
                                                 uob3 = c.d(p0, p1);
                                              }
                                           }else {
                                              str11 = p0.nextString();
                                           }
                                           i10 = uob14;
                                        }
                                        str19 = str13;
                                        p0.endObject();
                                        Objects.requireNonNull(str11);
                                        i10 = str11.hashCode();
                                        if (i10 != 100) {
                                           if (i10 != 103) {
                                              if (i10 != 111 || !str11.equals(str5)) {
                                              label_0311 :
                                                 b = -1;
                                              }else {
                                                 b = 2;
                                              }
                                           }else if(!str11.equals(str8)){
                                              goto label_0311 ;
                                           }else {
                                              b = true;
                                           }
                                        }else if(!str11.equals(str)){
                                           goto label_0311 ;
                                        }else {
                                           b = false;
                                        }
                                        uob = 1;
                                        if (b && b != uob) {
                                           if (b == 2) {
                                           label_0325 :
                                              i10 = str6;
                                           }
                                        }else {
                                           uoe.p(uob);
                                           uArrayList.add(uob3);
                                        }
                                        str6 = str19;
                                        goto label_0325 ;
                                     }
                                     str19 = str13;
                                     p0.endArray();
                                     if (uArrayList.size() == 1) {
                                        uArrayList.add(uArrayList.get(0));
                                     }
                                     i10 = str19;
                                     goto label_0344 ;
                                     break;
                                   case 2:
                                     str9 = str6;
                                     uod4 = c.g(p0, p1);
                                     goto label_0344 ;
                                     break;
                                   case 3:
                                     str9 = str6;
                                     uob7 = c.d(p0, p1);
                                     goto label_0344 ;
                                     break;
                                   case 4:
                                     str9 = str6;
                                     b8 = p0.nextBoolean();
                                     goto label_0344 ;
                                     break;
                                   case 5:
                                     str9 = str6;
                                     i3 = p0.nextInt() - 1;
                                     oobject2 = ShapeStroke$LineCapType.values()[i3];
                                     goto label_0344 ;
                                     break;
                                   case 6:
                                     str9 = str6;
                                     i2 = p0.nextInt() - 1;
                                     oobject3 = ShapeStroke$LineJoinType.values()[i2];
                                     goto label_0344 ;
                                     break;
                                   case 7:
                                     str9 = str6;
                                     float f2 = (float)p0.nextDouble();
                                     break;
                                   case 8:
                                     str1 = p0.nextString();
                                     str9 = str6;
                                     goto label_0344 ;
                                     break;
                                   default:
                                     str9 = str6;
                                     p0.skipValue();
                                     goto label_0344 ;
                               }
                               str6 = str9;
                               i9 = p0;
                            }
                            ShapeStroke shapeStroke = new ShapeStroke(str1, str13, uArrayList, uoa4, uod4, uob7, oobject2, i2, str16, b8);
                            b = p0;
                            goto label_06aa ;
                            break;
                          case 11:
                            str15 = null;
                            i1 = 0;
                            uob1 = null;
                            b uob15 = null;
                            b3 = false;
                            uob5 = null;
                            while (p0.hasNext()) {
                               str8 = p0.nextName();
                               Objects.requireNonNull(str8);
                               i10 = str8.hashCode();
                               if (i10 != i2) {
                                  if (i10 != 109) {
                                     if (i10 != b) {
                                        if (i10 != i3) {
                                           if (i10 != 3324) {
                                              if (i10 != 3519 || !str8.equals(str6)) {
                                              label_0165 :
                                                 i10 = -1;
                                              }else {
                                                 i10 = 5;
                                              }
                                           }else if(!str8.equals(str7)){
                                              goto label_0165 ;
                                           }else {
                                              i10 = 4;
                                           }
                                        }else if(!str8.equals(str4)){
                                           goto label_0165 ;
                                        }else {
                                           i10 = 3;
                                        }
                                     }else if(!str8.equals(str5)){
                                        goto label_0165 ;
                                     }else {
                                        i10 = 2;
                                     }
                                  }else if(!str8.equals("m")){
                                     goto label_0165 ;
                                  }else {
                                     i10 = 1;
                                  }
                               }else if(!str8.equals("e")){
                                  goto label_0165 ;
                               }else {
                                  i10 = 0;
                               }
                               if (i10) {
                                  if (i10 != true) {
                                     if (i10 != 2) {
                                        if (i10 != 3) {
                                           if (i10 != 4) {
                                              if (i10 != 5) {
                                                 p0.skipValue();
                                              }else {
                                                 str15 = p0.nextString();
                                              }
                                           }else {
                                              b3 = p0.nextBoolean();
                                           }
                                        }else {
                                           uob1 = c.e(jsonReader, uoe, false);
                                        }
                                     }else {
                                        uob15 = c.e(jsonReader, uoe, false);
                                     }
                                  }else {
                                     ShapeTrimPath$Type type1 = ShapeTrimPath$Type.forId(p0.nextInt());
                                  }
                               }else {
                                  uob5 = c.e(jsonReader, uoe, false);
                               }
                               oobject3 = 101;
                            }
                            ShapeTrimPath shapeTrimPat = new ShapeTrimPath(str15, i1, uob1, uob5, uob15, b3);
                         label_00ff :
                            jsonReader1 = jsonReader;
                            uoa2 = uoe;
                            goto label_063e ;
                            break;
                          case 12:
                            l ol1 = b.a(p0, p1);
                            goto label_00ff ;
                            break;
                          default:
                            uoa2 = null;
                            continue ;
                      }
                      str11 = p0.nextName();
                      Objects.requireNonNull(str11);
                      i = str11.hashCode();
                      if (i != 100) {
                         str8 = 3324;
                         if (i != 112) {
                            i2 = 3519;
                            if (i != 115) {
                               if (i != str8) {
                                  if (i != i2 || !str11.equals(str9)) {
                                  label_0b83 :
                                     b = -1;
                                  }else {
                                     b = 4;
                                  }
                               }else if(!str11.equals(str7)){
                                  goto label_0b83 ;
                               }else {
                                  b = 3;
                               }
                            }else if(!str11.equals(str4)){
                               goto label_0b83 ;
                            }else {
                               b = 2;
                            }
                         }else if(!str11.equals(str3)){
                            goto label_0b83 ;
                         }else {
                            b = true;
                         }
                      }else if(!str11.equals(str)){
                         goto label_0b83 ;
                      }else {
                         b = false;
                      }
                      if (b) {
                         if (b != 1) {
                            if (b != 2) {
                               if (b != 3) {
                                  if (b != 4) {
                                     p0.skipValue();
                                     goto label_0b2d ;
                                  }else {
                                     str10 = p0.nextString();
                                     goto label_0b2d ;
                                  }
                               }else {
                                  b2 = p0.nextBoolean();
                                  goto label_0b2d ;
                               }
                            }else {
                               uof = c.h(p0, p1);
                               goto label_0b2d ;
                            }
                         }else {
                            om = a.b(p0, p1);
                            goto label_0b2d ;
                         }
                      }else if(p0.nextInt() == 3){
                         b1 = true;
                         goto label_0b2d ;
                      }else {
                         b1 = false;
                         goto label_0b2d ;
                      }
                   }
                }
             }else {
                i = p0.nextInt();
             }
          }else {
             b uob16 = uob;
             goto label_0035 ;
          }
       }
       return uob;
    }
}
