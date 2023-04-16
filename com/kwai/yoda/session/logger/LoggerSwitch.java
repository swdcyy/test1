package com.kwai.yoda.session.logger.LoggerSwitch;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class LoggerSwitch	// class@0012d3
{
    public Map nativeBatchMap;
    public boolean sampleSummarized;

    public void LoggerSwitch(){
       super();
       this.sampleSummarized = true;
       this.nativeBatchMap = new ConcurrentHashMap();
    }
    public final Map a(){
       return this.nativeBatchMap;
    }
    public final boolean b(){
       return this.sampleSummarized;
    }
    public final boolean c(String p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, LoggerSwitch.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          Boolean uBoolean = this.nativeBatchMap.get(p0);
          if (uBoolean != null) {
             b = uBoolean.booleanValue();
          label_0025 :
             return b;
          }
       }
       b = false;
       goto label_0025 ;
    }
}
