package azb.e$a;
import io.reactivex.g;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.post.growth.GrowthGuideConfigCacheHelper;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import r46.d;
import lnc.p3;
import q87.c;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.google.gson.JsonArray;
import java.util.ArrayList;
import java.util.Iterator;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.System;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import brd.g;

public final class e$a implements g	// class@000369
{
    public static final e$a b;

    static {
       e$a.b = new e$a();
    }
    public void e$a(){
       super();
    }
    public final void subscribe(v p0){
       d a;
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       a.p(p0, "it");
       GrowthGuideConfigCacheHelper e = GrowthGuideConfigCacheHelper.e;
       Objects.requireNonNull(e);
       String str = "element.asJsonObject";
       Object[] objArray = null;
       List list = PatchProxy.apply(objArray, e, GrowthGuideConfigCacheHelper.class, "4");
       if (list != PatchProxyResult.class) {
       }else {
          a = d.a;
          if (a.b() - 1) {
             Object[] objArray1 = new Object[0];
             p3.D().w("PostGrowth", "GrowthGuideConfigManager version not match", objArray1);
             list = CollectionsKt__CollectionsKt.E();
          }else {
             JsonArray jsonArray = a.a();
             if (jsonArray != null) {
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = jsonArray.iterator();
                while (iterator.hasNext()) {
                   JsonElement jsonElement = iterator.next();
                   try{
                      a.o(jsonElement, "element");
                      long l = -1;
                      if (jsonElement.E()) {
                         JsonElement jsonElement1 = jsonElement.r().e0("cacheExpireTime");
                         if (jsonElement1 != null) {
                            l = jsonElement1.t();
                         }
                      }
                      if (jsonElement.E()) {
                         JsonObject jsonObject = jsonElement.r();
                         a.o(jsonObject, str);
                         if (GrowthGuideConfigCacheHelper.e.b(jsonObject, objArray, objArray) && l - System.currentTimeMillis() > 0) {
                            JsonObject jsonObject1 = jsonElement.r();
                            a.o(jsonObject1, str);
                            uArrayList.add(jsonObject1);
                         }
                      }
                   }catch(java.lang.Exception e4){
                      PostUtils.D("GrowthGuideConfigManager", "getValidTaskInfo_json_failure", e4);
                      goto label_0057 ;
                   }
                }
                list = uArrayList;
             }else {
                list = CollectionsKt__CollectionsKt.E();
             }
          }
       }
       p0.onNext(list);
       p0.onComplete();
       return;
    }
}
