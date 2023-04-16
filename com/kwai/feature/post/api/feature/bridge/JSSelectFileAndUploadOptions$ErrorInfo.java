package com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$ErrorInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;

public final class JSSelectFileAndUploadOptions$ErrorInfo implements Serializable	// class@001321
{
    public String extraInfo;
    public String type;

    public void JSSelectFileAndUploadOptions$ErrorInfo(){
       super();
    }
    public void JSSelectFileAndUploadOptions$ErrorInfo(String p0,String p1){
       super();
       this.extraInfo = p0;
       this.type = p1;
    }
    public final String getExtraInfo(){
       return this.extraInfo;
    }
    public final String getType(){
       return this.type;
    }
    public final void setExtraInfo(String p0){
       this.extraInfo = p0;
    }
    public final void setType(String p0){
       this.type = p0;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, JSSelectFileAndUploadOptions$ErrorInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Gson().q(this);
       a.o(obj, "Gson\(\).toJson\(this\)");
       return obj;
    }
}
