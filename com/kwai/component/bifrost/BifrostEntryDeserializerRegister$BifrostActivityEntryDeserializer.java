package com.kwai.component.bifrost.BifrostEntryDeserializerRegister$BifrostActivityEntryDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.bifrost.BifrostActivityEntry;
import com.google.gson.JsonObject;
import ekd.k0;
import r85.b;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.component.bifrost.BifrostFeatureActivityEntry;
import com.kwai.component.bifrost.BifrostUnknownActivityEntry;
import com.kwai.component.bifrost.BifrostFeatureConfig;

public class BifrostEntryDeserializerRegister$BifrostActivityEntryDeserializer implements b	// class@000a7f
{

    public void BifrostEntryDeserializerRegister$BifrostActivityEntryDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       BifrostActivityEntry uBifrostActi = PatchProxy.applyThreeRefs(p0, p1, p2, this, BifrostEntryDeserializerRegister$BifrostActivityEntryDeserializer.class, "1");
       if (uBifrostActi != PatchProxyResult.class) {
       }else {
          uBifrostActi = new BifrostActivityEntry();
          uBifrostActi.mActivityId = k0.h(p0, "activityId", "");
          uBifrostActi.mActivityType = k0.h(p0, "activityType", "");
          uBifrostActi.mStartTime = k0.g(p0, "startTime", 0);
          uBifrostActi.mEndTime = k0.g(p0, "endTime", 0);
          int i = 0;
          uBifrostActi.mPriority = k0.f(p0, "priority", i);
          uBifrostActi.mPreviewStatus = k0.f(p0, "previewStatus", i);
          Class uClass = b.a.get(uBifrostActi.mActivityType);
          uBifrostActi.mFeatureActivityEntry = (uClass != null)? p2.c(k0.e(p0, "featureActivityEntry"), uClass): new BifrostUnknownActivityEntry();
          p0.mBifrostFeatureConfig = new BifrostFeatureConfig();
          BifrostFeatureActivityEntry mBifrostFeat = uBifrostActi.mFeatureActivityEntry.mBifrostFeatureConfig;
          mBifrostFeat.mActivityId = uBifrostActi.mActivityId;
          mBifrostFeat.mEndTime = uBifrostActi.mEndTime;
          mBifrostFeat.mStartTime = uBifrostActi.mStartTime;
          if (1 == uBifrostActi.mPreviewStatus) {
             i = true;
          }
          mBifrostFeat.mIsPreview = i;
       }
       return uBifrostActi;
    }
}
