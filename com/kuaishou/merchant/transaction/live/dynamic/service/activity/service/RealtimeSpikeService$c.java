package com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeSpikeService$c;
import z1.k;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeSpikeService;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import com.google.gson.JsonObject;
import nj4.a;
import com.google.gson.JsonElement;

public final class RealtimeSpikeService$c implements k	// class@0007c9
{
    public final RealtimeSpikeService b;

    public void RealtimeSpikeService$c(RealtimeSpikeService p0){
       this.b = p0;
       super();
    }
    public Object get(){
       Object[] objArray = null;
       Object[] objArray1 = PatchProxy.apply(objArray, this, RealtimeSpikeService$c.class, "1");
       if (objArray1 != PatchProxyResult.class) {
       }else {
          RealtimeSpikeService a = this.b.A;
          if (a != null) {
             JsonObject jsonObject = a.a();
             if (jsonObject != null) {
                JsonElement jsonElement = jsonObject.e0("reserveStock");
                if (jsonElement != null) {
                   objArray = Integer.valueOf(jsonElement.p());
                }
             }
          }
          objArray1 = objArray;
       }
       return objArray1;
    }
}
