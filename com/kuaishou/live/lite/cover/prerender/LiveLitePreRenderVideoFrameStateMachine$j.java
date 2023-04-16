package com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$j;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class LiveLitePreRenderVideoFrameStateMachine$j	// class@0008c9
{
    public final boolean a;
    public final boolean b;

    public void LiveLitePreRenderVideoFrameStateMachine$j(boolean p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof LiveLitePreRenderVideoFrameStateMachine$j && (this.a == p0.a && this.b == p0.b))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveLitePreRenderVideoFrameStateMachine$j ta = this.a;
       int i = 1;
       if (ta != null) {
          ta = 1;
       }
       int i1 = ta * 31;
       LiveLitePreRenderVideoFrameStateMachine$j tb = this.b;
       if (tb == null) {
          i = tb;
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveLitePreRenderVideoFrameStateMachine$j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EndParam\(stopTiming="+this.a+", cancelRendering="+this.b+"\)";
    }
}
