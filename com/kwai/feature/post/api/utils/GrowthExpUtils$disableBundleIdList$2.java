package com.kwai.feature.post.api.utils.GrowthExpUtils$disableBundleIdList$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import com.google.gson.JsonArray;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.google.gson.JsonElement;
import kotlin.jvm.internal.a;

public final class GrowthExpUtils$disableBundleIdList$2 extends Lambda implements a	// class@001465
{
    public static final GrowthExpUtils$disableBundleIdList$2 INSTANCE;

    static {
       GrowthExpUtils$disableBundleIdList$2.INSTANCE = new GrowthExpUtils$disableBundleIdList$2();
    }
    public void GrowthExpUtils$disableBundleIdList$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       Object[] objArray = null;
       JsonArray obj = PatchProxy.apply(objArray, this, GrowthExpUtils$disableBundleIdList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.t().getValue("disablePostEntranceTKBubbleBundleIdList", JsonArray.class, objArray);
       ArrayList uArrayList = new ArrayList();
       if (obj != null) {
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             JsonElement jsonElement = iterator.next();
             a.o(jsonElement, "it");
             String str = jsonElement.w();
             a.o(str, "it.asString");
             uArrayList.add(str);
          }
       }
       return uArrayList;
    }
}
