package gb6.c;
import erd.o;
import java.lang.Object;
import gb6.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;
import gb6.b;
import com.yxcorp.utility.Log;
import java.util.Set;
import java.util.Collection;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Map;
import trd.t0;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.StringBuilder;
import com.google.gson.JsonElement;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import kotlin.Pair;
import java.lang.Iterable;
import java.lang.Throwable;
import ob6.m;

public abstract class c implements o	// class@0026a7
{

    public void c(){
       super();
    }
    public abstract a a();
    public Object apply(Object p0){
       Class obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "data");
       obj = this.getClass();
       _monitor_enter(obj);
       _monitor_exit(obj);
       return this.d(p0);
    }
    public abstract JsonObject b();
    public abstract String c();
    public final Object d(Object p0){
       b b;
       int i3;
       String str1;
       JsonObject jsonObject3;
       String key;
       String value;
       Iterator iterator;
       Map map1;
       JsonObject jsonObject4;
       JsonObject jsonObject6;
       boolean b4;
       JsonObject jsonObject7;
       JsonObject obj6;
       JsonObject obj7;
       Object obj = this;
       Object obj1 = p0;
       b uob = b.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       JsonObject obj2 = PatchProxy.applyOneRefs(obj1, obj, c.class, "2");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       Log.g(this.c(), "start apply");
       obj2 = this.e(p0);
       b = b.b;
       JsonObject jsonObject = b.b(obj2);
       if (jsonObject != null) {
          Set set = jsonObject.w0();
          boolean i = 0;
          int i1 = 1;
          int b1 = (set == null || set.isEmpty())? true: false;
          if (!b1) {
             JsonObject jsonObject1 = this.b();
             String str = "-1";
             JsonObject jsonObject2 = null;
             if (jsonObject1 != null) {
                boolean b2 = this.f();
                int i2 = this.h();
                Objects.requireNonNull(b);
                if (PatchProxy.isSupport(uob)) {
                   i3 = i2;
                   str1 = str;
                   Map obj3 = PatchProxy.applyFourRefs(jsonObject1, obj2, Boolean.valueOf(b2), Integer.valueOf(i2), b, b.class, "6");
                   if (obj3 != patchProxyRe) {
                      jsonObject2 = obj3;
                   }else {
                   label_007e :
                      a.p(jsonObject1, "oldJsonObject");
                      a.p(obj2, "newJsonObject");
                      jsonObject2 = (b2)? obj2: obj2.d0();
                      jsonObject = b.b(jsonObject1);
                      if (jsonObject != null) {
                         obj3 = b.d(jsonObject);
                         if (obj3 != null) {
                         label_00a2 :
                            obj2 = b.b(obj2);
                            if (obj2 != null) {
                               Map map = b.d(obj2);
                               if (map.isEmpty()) {
                                  Log.g(b.a, "diffInfo content is empty");
                               }else {
                                  a.o(jsonObject2, "mergedJsonObject");
                                  int i4 = 2;
                                  if (PatchProxy.isSupport(uob)) {
                                     Object[] objArray = new Object[]{jsonObject1,obj3,jsonObject2,map,Integer.valueOf(i3)};
                                     Iterator obj4 = PatchProxy.apply(objArray, b, uob, "11");
                                     if (obj4 != patchProxyRe) {
                                        i = obj4.booleanValue();
                                        jsonObject3 = jsonObject2;
                                        i4 = 0;
                                     }else {
                                     label_00ed :
                                        obj4 = map.entrySet().iterator();
                                        while (true) {
                                           if (obj4.hasNext()) {
                                              Map$Entry uEntry = obj4.next();
                                              key = uEntry.getKey();
                                              value = uEntry.getValue();
                                              String str2 = obj3.get(key);
                                              str = b.a;
                                              Log.g(str, key+" oldVersion="+str2+" newVersion="+value);
                                              String str3 = str1;
                                              i = a.g(value, str3) ^ i1;
                                              if (i) {
                                                 i = a.g(value, str2) ^ i1;
                                                 if (i) {
                                                    if (!obj3.containsKey(key)) {
                                                       i = i3;
                                                       if (!b.b.a(jsonObject2, key, i)) {
                                                       label_0192 :
                                                          jsonObject3 = jsonObject2;
                                                          str3 = 0;
                                                       label_02b0 :
                                                          i = false;
                                                       }
                                                    }else {
                                                       i = i3;
                                                    }
                                                    Log.g(str, key+" use new data");
                                                    iterator = obj4;
                                                    map1 = obj3;
                                                    str1 = str3;
                                                    jsonObject3 = jsonObject2;
                                                    jsonObject4 = jsonObject1;
                                                    str3 = 0;
                                                 label_02c8 :
                                                    i3 = i;
                                                    obj4 = iterator;
                                                    obj3 = map1;
                                                    jsonObject1 = jsonObject4;
                                                    jsonObject2 = jsonObject3;
                                                    i1 = 1;
                                                 }
                                              }
                                              i = i3;
                                              if (a.g(value, str3)) {
                                                 JsonObject jsonObject5 = jsonObject2.m0("diffInfo");
                                                 if (jsonObject5 != null) {
                                                    if (str2 == null) {
                                                       jsonObject5.z0(key);
                                                    }else {
                                                       jsonObject5.c0(key, str2);
                                                    }
                                                 }else {
                                                    goto label_0192 ;
                                                 }
                                              }
                                              b b3 = b.b;
                                              Objects.requireNonNull(b3);
                                              if (PatchProxy.isSupport(uob)) {
                                                 jsonObject6 = jsonObject1;
                                                 Pair obj5 = PatchProxy.applyFourRefs(key, jsonObject6, jsonObject2, Integer.valueOf(i), b3, b.class, "13");
                                                 if (obj5 != patchProxyRe) {
                                                    b4 = obj5.booleanValue();
                                                    iterator = obj4;
                                                    map1 = obj3;
                                                    str1 = str3;
                                                    jsonObject4 = jsonObject6;
                                                    jsonObject3 = jsonObject2;
                                                    str3 = 0;
                                                 }else {
                                                 label_01cc :
                                                    iterator = obj4;
                                                    map1 = obj3;
                                                    if (!i) {
                                                       str1 = str3;
                                                       str = key;
                                                       jsonObject1 = jsonObject6;
                                                       jsonObject4 = jsonObject1;
                                                       jsonObject7 = jsonObject2;
                                                       jsonObject3 = jsonObject7;
                                                       str3 = 0;
                                                    }else {
                                                       str = key;
                                                       jsonObject1 = jsonObject6;
                                                       jsonObject7 = jsonObject2;
                                                       i1 = 0;
                                                       while (true) {
                                                          str1 = str3;
                                                          jsonObject4 = jsonObject6;
                                                          jsonObject3 = jsonObject2;
                                                          obj6 = null;
                                                          if (StringsKt__StringsKt.N2(str, '-', false, 2, obj6)) {
                                                             b1 = i1 + 1;
                                                             if (i1 < i) {
                                                                obj5 = b3.e(str);
                                                                String first = obj5.getFirst();
                                                                str = obj5.getSecond();
                                                                if (str == null) {
                                                                   str = "";
                                                                }
                                                                JsonElement jsonElement = jsonObject7.e0(first);
                                                                String str4 = " is not JsonObject";
                                                                if (jsonElement == null) {
                                                                   jsonElement = new JsonObject();
                                                                   jsonObject7.G(first, jsonElement);
                                                                }else if(!jsonElement instanceof JsonObject){
                                                                   Log.g(b.a, key+" : for new data, "+first+str4);
                                                                label_02a4 :
                                                                   b4 = false;
                                                                   break ;
                                                                }
                                                                jsonObject7 = jsonElement;
                                                                jsonElement = jsonObject1.e0(first);
                                                                if (jsonElement == null || !jsonElement instanceof JsonObject) {
                                                                   Log.g(b.a, key+" : for old data, "+first+" is null or "+first+str4);
                                                                   goto label_02a4 ;
                                                                }else {
                                                                   JsonElement jsonElement1 = jsonElement;
                                                                   i1 = b1;
                                                                   jsonObject6 = jsonObject4;
                                                                   jsonObject2 = jsonObject3;
                                                                   str3 = str1;
                                                                }
                                                             }
                                                          }
                                                       }
                                                    }
                                                    if (!jsonObject1.w0().contains(str)) {
                                                       Log.g(b.a, key+" : for old data, key\("+str+"\) not found");
                                                       goto label_02a4 ;
                                                    }else {
                                                       jsonObject7.G(str, jsonObject1.e0(str));
                                                       b4 = true;
                                                    }
                                                 }
                                              }else {
                                                 jsonObject6 = jsonObject1;
                                                 goto label_01cc ;
                                              }
                                              if (!b4) {
                                                 goto label_02b0 ;
                                              }else {
                                                 Log.g(b.a, key+" keep old data");
                                                 goto label_02c8 ;
                                              }
                                           }else {
                                              jsonObject3 = jsonObject2;
                                              obj6 = 0;
                                              Log.g(b.a, "diffInfo size="+map.size()+", copyFromOldJsonObjectByDiffInfo success");
                                              i = true;
                                           }
                                        }
                                     }
                                  }else {
                                     goto label_00ed ;
                                  }
                                  if (i) {
                                     jsonObject2 = jsonObject3;
                                  }else {
                                     jsonObject2 = i4;
                                  }
                               }
                            }else {
                               jsonObject3 = jsonObject2;
                            }
                         }
                      }
                      obj3 = t0.z();
                      goto label_00a2 ;
                   }
                }else {
                   i3 = i2;
                   str1 = str;
                   goto label_007e ;
                }
                return obj.g(obj1, jsonObject2);
             }else {
                obj6 = jsonObject2;
                str1 = str;
                b1 = this.h();
                Objects.requireNonNull(b);
                if (PatchProxy.isSupport(uob)) {
                   obj7 = PatchProxy.applyTwoRefs(obj2, Integer.valueOf(b1), b, uob, "5");
                   if (obj7 != patchProxyRe) {
                      i = obj7.booleanValue();
                   }else {
                   label_032c :
                      a.p(obj2, "jsonObject");
                      obj7 = b.b(obj2);
                      if (obj7 != null) {
                         Set set1 = obj7.entrySet();
                         a.o(set1, "diffInfoObject.entrySet\(\)");
                         Iterator iterator1 = set1.iterator();
                         while (true) {
                            if (iterator1.hasNext()) {
                               Map$Entry uEntry1 = iterator1.next();
                               Object value1 = uEntry1.getValue();
                               a.o(value1, "entry.value");
                               value = str1;
                               if (a.g(value1.w(), value)) {
                                  Log.g(b.a, "check full data: "+uEntry1.getKey()+" version == -1");
                               }else {
                                  Object key1 = uEntry1.getKey();
                                  a.o(key1, "entry.key");
                                  if (b.b.a(obj2, key1, b1)) {
                                     str1 = value;
                                  }
                               }
                               i = false;
                            }
                         }
                      }
                      i = true;
                   }
                }else {
                   goto label_032c ;
                }
                if (i) {
                   Log.g(this.c(), "old data is null, use new data");
                   obj7 = obj.g(obj1, obj2);
                }else {
                   Log.g(this.c(), "diffInfo isn\'t empty, but old data is null and new data is incomplete");
                   obj7 = obj.g(obj1, obj6);
                }
                return obj7;
             }
          }
       }
       Log.g(this.c(), "diffInfo is null or empty");
       return obj.g(obj1, obj2);
    }
    public abstract JsonObject e(Object p0);
    public boolean f(){
       return this instanceof m;
    }
    public abstract Object g(Object p0,JsonObject p1);
    public abstract int h();
}
