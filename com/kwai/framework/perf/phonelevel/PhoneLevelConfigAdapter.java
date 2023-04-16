package com.kwai.framework.perf.phonelevel.PhoneLevelConfigAdapter;
import com.google.gson.b;
import zk.i;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.perf.phonelevel.PhoneLevelConfig;
import com.google.gson.JsonObject;
import ekd.k0;
import zk.h;
import java.lang.Integer;
import java.lang.Number;

public class PhoneLevelConfigAdapter implements b, i	// class@000c5c
{

    public void PhoneLevelConfigAdapter(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       PhoneLevelConfig phoneLevelCo = PatchProxy.applyThreeRefs(p0, p1, p2, this, PhoneLevelConfigAdapter.class, "1");
       if (phoneLevelCo != PatchProxyResult.class) {
       }else {
          phoneLevelCo = new PhoneLevelConfig();
          phoneLevelCo.mCommonPerf = k0.h(p0, "common_perf", "");
          phoneLevelCo.mRenderPerf = k0.h(p0, "render_perf", "");
          phoneLevelCo.mStatus = k0.f(p0, "status", 0);
       }
       return phoneLevelCo;
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       JsonObject jsonObject = PatchProxy.applyThreeRefs(p0, p1, p2, this, PhoneLevelConfigAdapter.class, "2");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          jsonObject = new JsonObject();
          jsonObject.c0("common_perf", p0.mCommonPerf);
          jsonObject.c0("render_perf", p0.mRenderPerf);
          jsonObject.a0("status", Integer.valueOf(p0.mStatus));
       }
       return jsonObject;
    }
}
