package com.yxcorp.gifshow.ad.award.flow.model.NeoPopupInfoDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$BasePopUpInfo;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;
import ekd.k0;
import com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$SkyDropPopUpInfo;
import com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$TaskCenterPopUpInfo;
import com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$ContentToastPopUpInfo;
import com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$ExtraPopUpInfo;
import fg6.a;
import com.google.gson.Gson;

public final class NeoPopupInfoDeserializer implements b	// class@00103a
{

    public void NeoPopupInfoDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       NeoTaskStatusResponse$BasePopUpInfo uBasePopUpIn;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, NeoPopupInfoDeserializer.class, "1");
       if (p2 != PatchProxyResult.class) {
       }else {
          a.p(p0, "json");
          a.p(p1, "typeOfT");
          int i = k0.f(p0.r(), "type", 0);
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   if (i != 4) {
                      uBasePopUpIn = (i != 5)? NeoTaskStatusResponse$BasePopUpInfo.class: NeoTaskStatusResponse$SkyDropPopUpInfo.class;
                   }else {
                      uBasePopUpIn = NeoTaskStatusResponse$TaskCenterPopUpInfo.class;
                   }
                }else {
                label_0043 :
                   uBasePopUpIn = NeoTaskStatusResponse$ExtraPopUpInfo.class;
                }
             }else {
                uBasePopUpIn = NeoTaskStatusResponse$ContentToastPopUpInfo.class;
             }
          }else {
             goto label_0043 ;
          }
          p0 = a.a.c(p0, uBasePopUpIn);
          a.o(p0, "Gsons.KWAI_GSON.fromJson\(json, modelClass\)");
          p2 = p0;
       }
       return p2;
    }
}
