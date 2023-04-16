package com.kwai.feature.post.api.startup.PostPluginPreloadStatus;
import java.io.Serializable;
import com.kwai.feature.post.api.startup.PreloadStatus;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.Gson;

public final class PostPluginPreloadStatus implements Serializable	// class@00143b
{
    public final boolean isPctrActive;
    public final PreloadStatus status;
    public final long timeDuringLaunch;

    public void PostPluginPreloadStatus(PreloadStatus p0,boolean p1,long p2){
       a.p(p0, "status");
       super();
       this.status = p0;
       this.isPctrActive = p1;
       this.timeDuringLaunch = p2;
    }
    public final PreloadStatus getStatus(){
       return this.status;
    }
    public final long getTimeDuringLaunch(){
       return this.timeDuringLaunch;
    }
    public final boolean isPctrActive(){
       return this.isPctrActive;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, PostPluginPreloadStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Gson().q(this);
       a.o(obj, "Gson\(\).toJson\(this\)");
       return obj;
    }
}
