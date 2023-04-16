package com.kwai.feature.post.api.model.GrowthGuideItemConfig$a;
import java.lang.Object;
import nsd.u;
import com.google.gson.JsonElement;
import java.lang.String;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import fg6.a;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import lnc.p3;
import java.lang.Throwable;
import w46.b;

public final class GrowthGuideItemConfig$a	// class@00140d
{

    public void GrowthGuideItemConfig$a(){
       super();
    }
    public void GrowthGuideItemConfig$a(u p0){
       super();
    }
    public final GrowthGuideItemConfig a(JsonElement p0,int p1,String p2,boolean p3){
       String obj;
       GrowthGuideItemConfig growthGuideI;
       if (PatchProxy.isSupport(GrowthGuideItemConfig$a.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, Boolean.valueOf(p3), this, GrowthGuideItemConfig$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "jsonElement");
       obj = "stage";
       try{
          a.p(p2, obj);
          growthGuideI = a.a.c(p0, GrowthGuideItemConfig.class);
          growthGuideI.setOriginInfo(p0.r());
          growthGuideI.setTaskType(p1);
          growthGuideI.stage = p2;
          growthGuideI.setUnlockable(p3);
       }catch(com.google.gson.JsonSyntaxException e9){
          p3.D().e("PostGrowth", "convert2GrowthGuideItemConfig error", e9);
          growthGuideI = null;
       }
       return growthGuideI;
    }
}
