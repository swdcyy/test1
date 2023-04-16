package com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class LiveLitePrePlayStateMachine$g	// class@000a7a
{
    public final boolean a;
    public final boolean b;

    public void LiveLitePrePlayStateMachine$g(boolean p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof LiveLitePrePlayStateMachine$g && (this.a == p0.a && this.b == p0.b))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveLitePrePlayStateMachine$g ta = this.a;
       int i = 1;
       if (ta != null) {
          ta = 1;
       }
       int i1 = ta * 31;
       LiveLitePrePlayStateMachine$g tb = this.b;
       if (tb == null) {
          i = tb;
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveLitePrePlayStateMachine$g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CancelParam\(cancelTiming="+this.a+", cancelPlay="+this.b+"\)";
    }
}
