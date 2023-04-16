package com.kwai.framework.model.tuna.log.TunaStatisticModel;
import java.io.Serializable;
import java.lang.Object;
import com.google.gson.JsonObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.yxcorp.utility.Log;

public class TunaStatisticModel implements Serializable	// class@0016d1
{
    public HashMap mExtraParams;
    public static final long serialVersionUID = 0x2be4583d4f533b65;

    public void TunaStatisticModel(){
       super();
    }
    public JsonObject getExtraElementJsonObject(){
       String obj = PatchProxy.apply(null, this, TunaStatisticModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getExtraParamString();
       if (obj != null) {
          return a.a.h(obj, JsonObject.class);
       }
    }
    public String getExtraParamString(){
       TunaStatisticModel obj = PatchProxy.apply(null, this, TunaStatisticModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mExtraParams;
       if (obj != null) {
          return a.a.q(obj);
       }
    }
}
