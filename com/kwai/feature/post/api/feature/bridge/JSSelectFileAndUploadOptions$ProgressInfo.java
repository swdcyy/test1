package com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$ProgressInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;

public final class JSSelectFileAndUploadOptions$ProgressInfo implements Serializable	// class@001324
{
    public int percent;

    public void JSSelectFileAndUploadOptions$ProgressInfo(int p0){
       super();
       this.percent = p0;
    }
    public final int getPercent(){
       return this.percent;
    }
    public final void setPercent(int p0){
       this.percent = p0;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, JSSelectFileAndUploadOptions$ProgressInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Gson().q(this);
       a.o(obj, "Gson\(\).toJson\(this\)");
       return obj;
    }
}
