package com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$FileInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;

public final class JSSelectFileAndUploadOptions$FileInfo implements Serializable	// class@001322
{
    public long duration;
    public String mime;
    public String name;
    public long size;

    public void JSSelectFileAndUploadOptions$FileInfo(){
       super();
    }
    public final long getDuration(){
       return this.duration;
    }
    public final String getMime(){
       return this.mime;
    }
    public final String getName(){
       return this.name;
    }
    public final long getSize(){
       return this.size;
    }
    public final void setDuration(long p0){
       this.duration = p0;
    }
    public final void setMime(String p0){
       this.mime = p0;
    }
    public final void setName(String p0){
       this.name = p0;
    }
    public final void setSize(long p0){
       this.size = p0;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, JSSelectFileAndUploadOptions$FileInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Gson().q(this);
       a.o(obj, "Gson\(\).toJson\(this\)");
       return obj;
    }
}
