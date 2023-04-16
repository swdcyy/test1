package com.kwai.feature.plc.api.model.PlcRecoSignalInfo;
import java.io.Serializable;
import java.lang.Object;
import com.google.gson.JsonObject;

public final class PlcRecoSignalInfo implements Serializable	// class@0012c4
{
    public int mBizType;
    public JsonObject mExtra;
    public int mSource;

    public void PlcRecoSignalInfo(){
       super();
       this.mExtra = new JsonObject();
    }
}
