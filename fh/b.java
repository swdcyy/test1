package fh.b;
import java.lang.String;
import com.gifshow.kanim.parser.moshi.JsonReader$a;
import java.lang.Object;
import com.gifshow.kanim.parser.moshi.JsonReader;
import bh.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import android.util.SparseArray;
import fh.d;
import ch.a;
import fh.e;
import fh.f;
import dh.b;
import com.gifshow.kanim.parser.moshi.JsonReader$Token;
import java.util.List;
import fh.a;
import fh.i;
import fh.g;
import fh.h;
import fh.j;
import java.lang.Integer;
import ih.c;
import java.lang.Float;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import jh.d;
import jh.b;
import jh.c;
import jh.a;
import jh.e;

public class b	// class@002001
{
    public static final JsonReader$a a;

    static {
       String[] stringArray = new String[]{"w","h","ip","op","fr","v","layers"};
       b.a = JsonReader$a.a(stringArray);
    }
    public void b(){
       super();
    }
    public static i a(JsonReader p0){
       b uob;
       float f1;
       int i;
       a a;
       b obj5;
       d obj8;
       Object obj9;
       Iterator iterator1;
       float f3;
       Object obj = p0;
       String obj1 = null;
       String[] obj2 = PatchProxy.applyOneRefs(obj, obj1, b.class, "1");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       HashMap hashMap = new HashMap();
       SparseArray sparseArray = new SparseArray();
       HashMap hashMap1 = new HashMap();
       i oi = new i();
       p0.c();
       float f = 0;
       String str = "2";
       while (p0.g()) {
          uob = 1;
          switch (obj.v(b.a)){
              case 0:
              case 1:
                f1 = f;
                p0.l();
             label_01ea :
                f = f1;
                break;
              case 2:
              case 3:
                f1 = f;
                p0.k();
                goto label_01ea ;
                break;
              case 4:
                f = (float)p0.k();
                break;
              case 5:
                f1 = f;
                obj2 = (p0.p()).split("\\.");
                i = Integer.parseInt(obj2[uob]);
                Integer.parseInt(obj2[2]);
                break;
              case 6:
                String str1 = str;
                f1 = f;
                if (PatchProxy.applyVoidFourRefs(p0, hashMap, sparseArray, hashMap1, 0, b.class, "3")) {
                   goto label_01ea ;
                }else {
                   p0.a();
                   while (p0.g()) {
                      a uoa = PatchProxy.applyOneRefs(obj, obj1, d.class, "1");
                      if (uoa != PatchProxyResult.class) {
                         obj1 = str1;
                         uob = 1;
                      }else {
                         p0.c();
                         String str2 = "UNSET";
                         String str3 = obj1;
                         Object obj3 = str3;
                         int i1 = 0;
                         int i2 = -1;
                         while (p0.g()) {
                            int i3 = obj.v(d.a);
                            if (i3) {
                               i = 1;
                               if (i3 != i) {
                                  a uoa1 = 2;
                                  if (i3 != uoa1) {
                                     int i4 = 3;
                                     if (i3 != i4) {
                                        if (i3 != 4) {
                                           p0.x();
                                           p0.y();
                                        }else {
                                           i2 = p0.l();
                                        }
                                     }else {
                                        f uof = f.class;
                                        List obj4 = PatchProxy.applyOneRefs(obj, obj1, e.class, "1");
                                        if (obj4 != PatchProxyResult.class) {
                                           obj3 = obj4;
                                        }else if(p0.s() == JsonReader$Token.BEGIN_OBJECT){
                                           str = 1;
                                        }else {
                                           str = null;
                                        }
                                        if (str) {
                                           p0.c();
                                        }
                                        obj5 = obj1;
                                        obj4 = obj5;
                                        Object obj6 = obj4;
                                        Object obj7 = obj6;
                                        while (p0.g()) {
                                           int i5 = obj.v(e.a);
                                           if (i5) {
                                              if (i5 != i) {
                                                 if (i5 != uoa1) {
                                                    if (i5 != i4) {
                                                       p0.x();
                                                       p0.y();
                                                    label_0152 :
                                                       JsonReader$a uoa2 = null;
                                                    }else {
                                                       obj8 = null;
                                                       List list = PatchProxy.applyOneRefs(obj, obj8, uof, "4");
                                                       if (list != PatchProxyResult.class) {
                                                       }else {
                                                          list = f.a(obj, a.b);
                                                       }
                                                       obj6 = list;
                                                       obj8 = 3;
                                                       continue ;
                                                    }
                                                 }else {
                                                    obj1 = str1;
                                                    obj9 = PatchProxy.applyOneRefs(obj, null, uof, obj1);
                                                    obj7 = (obj9 != PatchProxyResult.class)? obj9: f.a(obj, g.b);
                                                 }
                                              }else {
                                                 obj1 = str1;
                                                 obj5 = PatchProxy.applyOneRefs(obj, null, uof, "1");
                                                 if (obj5 != PatchProxyResult.class) {
                                                 }else {
                                                    obj5 = f.a(obj, h.b);
                                                 }
                                              }
                                           }else {
                                              obj1 = str1;
                                              obj9 = PatchProxy.applyOneRefs(obj, null, uof, "3");
                                              obj4 = (obj9 != PatchProxyResult.class)? obj9: f.a(obj, j.b);
                                           }
                                           str1 = obj1;
                                           uoa1 = 2;
                                           obj8 = 3;
                                           goto label_0152 ;
                                        }
                                        obj1 = str1;
                                        if (str) {
                                           p0.f();
                                        }
                                        obj3 = new b(obj4, obj7, obj6, obj5);
                                        str1 = obj1;
                                     }
                                  }else {
                                     str3 = p0.p();
                                  }
                               }else {
                                  i1 = p0.l();
                               }
                            }else {
                               str2 = p0.p();
                            }
                            obj1 = null;
                         }
                         obj1 = str1;
                         p0.f();
                         a uoa3 = new a(str2, i1, str3, obj3, i2);
                      }
                      a = uoa.a;
                      hashMap.put(a, uoa.e);
                      sparseArray.put(uoa.b, a);
                      if (uoa.a() != -1) {
                         hashMap1.put(a, Integer.valueOf(uoa.a()));
                      }
                      str1 = obj1;
                      obj1 = null;
                   }
                   p0.e();
                   goto label_01ea ;
                }
                break;
              default:
                f1 = f;
                p0.x();
                p0.y();
                goto label_01ea ;
          }
          obj1 = null;
       }
       obj1 = str;
       f1 = f;
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(f1), hashMap, null, b.class, obj1)) {
          Iterator iterator = hashMap.values().iterator();
          while (iterator.hasNext()) {
             obj5 = iterator.next();
             Objects.requireNonNull(obj5);
             uob = b.class;
             if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(f1), obj5, uob, "1")) {
             }else {
                uob = obj5.d;
                float f2 = 1000.00f;
                if (uob != null && !uob.isEmpty()) {
                   iterator1 = obj5.d.iterator();
                   while (iterator1.hasNext()) {
                      obj8 = iterator1.next();
                      f3 = (float)obj8.a() / f1;
                      f3 = f3 * f2;
                      obj8.c((int)f3);
                   }
                }
                f = f1;
                uob = obj5.b;
                if (uob != null && !uob.isEmpty()) {
                   iterator1 = obj5.b.iterator();
                   while (iterator1.hasNext()) {
                      c uoc = iterator1.next();
                      f3 = (float)uoc.a() / f;
                      f3 = f3 * f2;
                      uoc.c((int)f3);
                   }
                }
                uob = obj5.c;
                if (uob != null && !uob.isEmpty()) {
                   iterator1 = obj5.c.iterator();
                   while (iterator1.hasNext()) {
                      a uoa4 = iterator1.next();
                      f3 = (float)uoa4.a() / f;
                      f3 = f3 * f2;
                      uoa4.c((int)f3);
                   }
                }
                uob = obj5.a;
                if (uob != null && !uob.isEmpty()) {
                   Iterator iterator2 = obj5.a.iterator();
                   while (iterator2.hasNext()) {
                      e uoe = iterator2.next();
                      float f4 = (float)uoe.a() / f;
                      f4 = f4 * f2;
                      uoe.c((int)f4);
                   }
                }
                f1 = f;
             }
          }
       }
       f = f1;
       oi.a = f;
       oi.b = hashMap;
       oi.c = sparseArray;
       oi.d = hashMap1;
       return oi;
    }
}
