package com.kwai.feature.plc.api.model.PlcRecoSignalInfo$a;
import java.lang.Object;
import com.kwai.feature.plc.api.model.PlcRecoSignalInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.google.gson.JsonObject;

public class PlcRecoSignalInfo$a	// class@0012c3
{
    public final PlcRecoSignalInfo a;

    public void PlcRecoSignalInfo$a(){
       super();
       this.a = new PlcRecoSignalInfo();
    }
    public PlcRecoSignalInfo a(){
       return this.a;
    }
    public PlcRecoSignalInfo$a b(int p0){
       this.a.mBizType = p0;
       return this;
    }
    public PlcRecoSignalInfo$a c(long p0){
       PlcRecoSignalInfo$a uoa = PlcRecoSignalInfo$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.a.mExtra.a0("duration", Long.valueOf(p0));
       return this;
    }
    public PlcRecoSignalInfo$a d(int p0){
       this.a.mSource = p0;
       return this;
    }
}
