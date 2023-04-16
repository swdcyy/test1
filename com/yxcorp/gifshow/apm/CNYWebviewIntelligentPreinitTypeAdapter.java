package com.yxcorp.gifshow.apm.CNYWebviewIntelligentPreinitTypeAdapter;
import zk.i;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.kswebview.CNYWebviewIntelligentPreinit$CNYWebviewLoadRuleModel;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import ekd.k0;
import java.lang.Integer;
import java.lang.Number;
import zk.g;
import java.lang.Double;
import java.lang.Long;
import zk.h;

public class CNYWebviewIntelligentPreinitTypeAdapter implements i, b	// class@001b86
{

    public void CNYWebviewIntelligentPreinitTypeAdapter(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CNYWebviewIntelligentPreinit$CNYWebviewLoadRuleModel uCNYWebviewL = PatchProxy.applyThreeRefs(p0, p1, p2, this, CNYWebviewIntelligentPreinitTypeAdapter.class, "3");
       if (uCNYWebviewL != patchProxyRe) {
       }else {
          uCNYWebviewL = new CNYWebviewIntelligentPreinit$CNYWebviewLoadRuleModel();
          new Gson().p(p0);
          uCNYWebviewL.mId = k0.h(p0, "id", "unset");
          String str = "loadRule";
          if (PatchProxy.isSupport(CNYWebviewIntelligentPreinitTypeAdapter.class)) {
             Object obj = PatchProxy.applyThreeRefs(p0, str, Integer.valueOf(-1), null, CNYWebviewIntelligentPreinitTypeAdapter.class, "2");
             if (obj != patchProxyRe) {
                i = obj.intValue();
             }else {
             label_0050 :
                JsonElement jsonElement = p0.e0(str);
                if (jsonElement != null && (jsonElement.F() && jsonElement.N())) {
                   int i1 = jsonElement.p();
                   if (!Double.compare(jsonElement.m(), (double)i1)) {
                      i = i1;
                   }
                }
                i = -1;
             }
          }else {
             goto label_0050 ;
          }
          uCNYWebviewL.mLoadRule = i;
          uCNYWebviewL.mStartTime = Long.valueOf(k0.g(p0, "startTime", -1));
          uCNYWebviewL.mEndTime = Long.valueOf(k0.g(p0, "endTime", -1));
          uCNYWebviewL.mFrequency = k0.f(p0, "frequency", -1);
       }
       return uCNYWebviewL;
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       JsonObject jsonObject = PatchProxy.applyThreeRefs(p0, p1, p2, this, CNYWebviewIntelligentPreinitTypeAdapter.class, "4");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          jsonObject = new JsonObject();
          jsonObject.c0("id", p0.mId);
          jsonObject.a0("loadRule", Integer.valueOf(p0.mLoadRule));
          jsonObject.a0("startTime", p0.mStartTime);
          jsonObject.a0("endTime", p0.mEndTime);
          jsonObject.a0("frequency", Integer.valueOf(p0.mFrequency));
       }
       return jsonObject;
    }
}
