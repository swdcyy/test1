package azb.f;
import erd.o;
import azb.e$b;
import java.util.List;
import java.lang.Object;
import com.google.gson.JsonObject;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.yxcorp.gifshow.post.growth.GrowthGuideConfigCacheHelper;
import azb.e;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Boolean;
import java.lang.Integer;
import r46.d;
import java.lang.Long;
import rq.a;
import java.lang.System;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;

public final class f implements o	// class@00036e
{
    public final e$b b;
    public final List c;

    public void f(e$b p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       Object obj3;
       JsonElement obj4;
       d a;
       Iterator iterator1;
       Iterator iterator2;
       Integer integer1;
       JsonElement jsonElement3;
       int b4;
       PatchProxyResult patchProxyRe1;
       JsonElement jsonElement4;
       String str3;
       JsonElement jsonElement5;
       Object obj = this;
       d obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj2 = PatchProxy.applyOneRefs(obj1, obj, f.class, "1");
       if (obj2 != patchProxyRe) {
          obj1 = obj2;
       }else {
          obj2 = "it";
          a.p(obj1, obj2);
          JsonElement jsonElement = obj1.e0("data");
          JsonArray jsonArray = (jsonElement != null)? jsonElement.q(): new JsonArray();
          JsonElement jsonElement1 = obj1.e0("version");
          long l = (jsonElement1 != null)? jsonElement1.t(): 0;
          GrowthGuideConfigCacheHelper e = GrowthGuideConfigCacheHelper.e;
          e b = e.b;
          f c = obj.c;
          a.o(c, "validateTasks");
          Objects.requireNonNull(b);
          e uoe = e.class;
          JsonArray jsonArray1 = PatchProxy.applyTwoRefs(c, jsonArray, b, uoe, "2");
          if (jsonArray1 != patchProxyRe) {
             obj3 = obj1;
          }else {
             jsonArray1 = new JsonArray();
             ArrayList uArrayList = new ArrayList();
             uArrayList.addAll(c);
             Iterator iterator = c.iterator();
             boolean b1 = true;
             while (iterator.hasNext()) {
                JsonObject jsonObject = iterator.next();
                e b2 = e.b;
                Objects.requireNonNull(b2);
                Iterator obj5 = PatchProxy.applyTwoRefs(jsonObject, jsonArray, b2, uoe, "4");
                if (obj5 != patchProxyRe) {
                   b1 = obj5.booleanValue();
                   obj3 = obj1;
                   iterator1 = iterator;
                }else {
                   obj5 = jsonArray.iterator();
                   while (true) {
                      if (obj5.hasNext()) {
                         obj3 = obj1;
                         obj4 = obj5.next();
                         iterator1 = iterator;
                         String str = "taskType";
                         JsonElement jsonElement2 = jsonObject.e0(str);
                         Integer integer = null;
                         if (jsonElement2 != null) {
                            iterator2 = obj5;
                            integer1 = Integer.valueOf(jsonElement2.p());
                         }else {
                            iterator2 = obj5;
                            integer1 = integer;
                         }
                         if (integer1 != null) {
                            a.o(obj4, obj2);
                            obj4 = obj4.r().e0(str);
                            if (obj4 != null) {
                               integer = Integer.valueOf(obj4.p());
                            }
                            if (!a.g(integer, integer1)) {
                            label_00e5 :
                               iterator = iterator1;
                               obj1 = obj3;
                               obj5 = iterator2;
                            }
                         }else {
                            goto label_00e5 ;
                         }
                      }else {
                         obj3 = obj1;
                         iterator1 = iterator;
                         b1 = false;
                      }
                   }
                }
                if (b1) {
                   uArrayList.remove(jsonObject);
                }
                iterator = iterator1;
                obj4 = obj3;
             }
             obj3 = obj1;
             JsonArray jsonArray2 = new JsonArray();
             Iterator iterator3 = jsonArray.iterator();
             while (iterator3.hasNext()) {
                jsonElement3 = iterator3.next();
                e b3 = e.b;
                a.o(jsonElement3, obj2);
                JsonObject jsonObject1 = jsonElement3.r();
                Objects.requireNonNull(b3);
                String str1 = obj2;
                JsonElement obj6 = PatchProxy.applyOneRefs(jsonObject1, b3, uoe, "3");
                if (obj6 != patchProxyRe) {
                   b4 = obj6.booleanValue();
                   patchProxyRe1 = patchProxyRe;
                }else {
                   obj2 = "publishConfigs";
                   if (jsonObject1.e0(obj2) != null) {
                      jsonElement4 = jsonObject1.e0(obj2);
                      patchProxyRe1 = patchProxyRe;
                      String str2 = "item.get\(STAGE_PUBLISH\)";
                      a.o(jsonElement4, str2);
                      if (!jsonElement4.D()) {
                         obj6 = jsonObject1.e0(obj2);
                         a.o(obj6, str2);
                         if (obj6.q().size() <= 0) {
                         label_0161 :
                            str2 = "editConfigs";
                            if (jsonObject1.e0(str2) != null) {
                               obj6 = jsonObject1.e0(str2);
                               str3 = "item.get\(STAGE_EDIT\)";
                               a.o(obj6, str3);
                               if (!obj6.D()) {
                                  jsonElement5 = jsonObject1.e0(str2);
                                  a.o(jsonElement5, str3);
                                  if (jsonElement5.q().size() > 0) {
                                  label_01d9 :
                                     b4 = true;
                                  }
                               }
                            }
                            str2 = "shootConfigs";
                            if (jsonObject1.e0(str2) != null) {
                               obj6 = jsonObject1.e0(str2);
                               str3 = "item.get\(STAGE_SHOOT\)";
                               a.o(obj6, str3);
                               if (!obj6.D()) {
                                  jsonElement5 = jsonObject1.e0(str2);
                                  a.o(jsonElement5, str3);
                                  if (jsonElement5.q().size() > 0) {
                                  }
                               }
                            }
                            str2 = "uploadConfigs";
                            if (jsonObject1.e0(str2) != null) {
                               obj6 = jsonObject1.e0(str2);
                               str3 = "item.get\(STAGE_UPLOADED\)";
                               a.o(obj6, str3);
                               if (!obj6.D()) {
                                  jsonElement5 = jsonObject1.e0(str2);
                                  a.o(jsonElement5, str3);
                                  if (jsonElement5.q().size() > 0) {
                                     goto label_01d9 ;
                                  }
                               }
                            }
                            b4 = false;
                         }else {
                            goto label_01d9 ;
                         }
                      }else {
                         goto label_0161 ;
                      }
                   }else {
                      patchProxyRe1 = patchProxyRe;
                      goto label_0161 ;
                   }
                }
                if (b4) {
                   jsonArray2.G(jsonElement3);
                }
                obj2 = str1;
                patchProxyRe = patchProxyRe1;
             }
             int i = 0;
             b4 = 0;
             while (i < uArrayList.size() || b4 < jsonArray2.size()) {
                if (i < uArrayList.size() && b4 < jsonArray2.size()) {
                   jsonElement3 = jsonArray2.e0(b4);
                   a.o(jsonElement3, "validateUpdateTasks[updateIndex]");
                   JsonObject jsonObject2 = jsonElement3.r();
                   jsonElement4 = uArrayList.get(i).e0("priority");
                   long l1 = (jsonElement4 != null)? jsonElement4.t(): 0;
                   jsonElement3 = jsonObject2.e0("priority");
                   long l2 = (jsonElement3 != null)? jsonElement3.t(): null;
                   if (l1 - l2 > 0) {
                      jsonArray1.G(uArrayList.get(i));
                   label_02cb :
                      i = i + 1;
                   }else {
                      jsonArray1.G(jsonArray2.e0(b4));
                   }
                }else if(i < uArrayList.size()){
                   jsonArray1.G(uArrayList.get(i));
                   goto label_02cb ;
                }else {
                   jsonArray1.G(jsonArray2.e0(b4));
                }
                b4 = b4 + 1;
             }
          }
          Objects.requireNonNull(e);
          obj1 = d.class;
          GrowthGuideConfigCacheHelper growthGuideC = GrowthGuideConfigCacheHelper.class;
          if (!PatchProxy.isSupport(growthGuideC) || !PatchProxy.applyVoidTwoRefs(jsonArray1, Long.valueOf(l), e, growthGuideC, "13")) {
             a.p(jsonArray1, "dataList");
             a = d.a;
             Objects.requireNonNull(a);
             if (!PatchProxy.isSupport(obj1) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), a, obj1, "4")) {
                a.T(l);
             }
             if (!PatchProxy.applyVoidOneRefs(jsonArray1, a, obj1, "2")) {
                a.p(jsonArray1, "configJsonArray");
                a.S(jsonArray1);
             }
             e.g(jsonArray1);
          }
          Object[] objArray = new Object[0];
          p3.D().w("PostGrowth", "GrowthGuideInfoRepo updateGuideConfig, cost "+(System.currentTimeMillis() - obj.b.d), objArray);
          obj4 = obj3;
       }
       return obj1;
    }
}
