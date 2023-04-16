package com.kwai.feature.post.api.startup.PostPluginPredictStatus;
import java.io.Serializable;
import com.kwai.feature.post.api.startup.PredictStatus;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.Gson;

public final class PostPluginPredictStatus implements Serializable	// class@001438
{
    public final boolean isPctrActive;
    public final PredictStatus status;
    public final long timeDuringLaunch;

    public void PostPluginPredictStatus(PredictStatus p0,boolean p1,long p2){
       a.p(p0, "status");
       super();
       this.status = p0;
       this.isPctrActive = p1;
       this.timeDuringLaunch = p2;
    }
    public final PredictStatus getStatus(){
       return this.status;
    }
    public final long getTimeDuringLaunch(){
       return this.timeDuringLaunch;
    }
    public final boolean isPctrActive(){
       return this.isPctrActive;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, PostPluginPredictStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Gson().q(this);
       a.o(obj, "Gson\(\).toJson\(this\)");
       return obj;
    }
}
