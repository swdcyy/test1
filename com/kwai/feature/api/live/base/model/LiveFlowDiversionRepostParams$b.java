package com.kwai.feature.api.live.base.model.LiveFlowDiversionRepostParams$b;
import java.lang.Object;
import com.kwai.feature.api.live.base.model.LiveFlowDiversionRepostParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.live.base.model.LiveFlowDiversionRepostParams$a;
import com.kwai.feature.api.live.base.model.LiveFlowDiversionRepostParams$FlowDiversionSourceType;

public class LiveFlowDiversionRepostParams$b	// class@000f87
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public long f;
    public LiveFlowDiversionRepostParams$FlowDiversionSourceType g;

    public void LiveFlowDiversionRepostParams$b(){
       super();
    }
    public LiveFlowDiversionRepostParams a(){
       Object obj = PatchProxy.apply(null, this, LiveFlowDiversionRepostParams$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveFlowDiversionRepostParams(this, null);
    }
    public LiveFlowDiversionRepostParams$b b(LiveFlowDiversionRepostParams$FlowDiversionSourceType p0){
       this.g = p0;
       return this;
    }
    public LiveFlowDiversionRepostParams$b c(String p0){
       this.a = p0;
       return this;
    }
    public LiveFlowDiversionRepostParams$b d(String p0){
       this.b = p0;
       return this;
    }
    public LiveFlowDiversionRepostParams$b e(String p0){
       this.e = p0;
       return this;
    }
    public LiveFlowDiversionRepostParams$b f(String p0){
       this.c = p0;
       return this;
    }
}
