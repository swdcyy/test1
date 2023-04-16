package com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicBridgeCenterRequestData;
import java.io.Serializable;
import java.lang.String;
import com.google.gson.JsonObject;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class MagicBridgeCenterRequestData implements Serializable	// class@000e2b
{
    public final String methodName;
    public final String nameSpace;
    public final JsonObject params;

    public void MagicBridgeCenterRequestData(String p0,String p1,JsonObject p2){
       a.p(p0, "nameSpace");
       a.p(p1, "methodName");
       super();
       this.nameSpace = p0;
       this.methodName = p1;
       this.params = p2;
    }
    public final String getMethodName(){
       return this.methodName;
    }
    public final String getNameSpace(){
       return this.nameSpace;
    }
    public final JsonObject getParams(){
       return this.params;
    }
}
