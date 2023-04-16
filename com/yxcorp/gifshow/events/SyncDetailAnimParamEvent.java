package com.yxcorp.gifshow.events.SyncDetailAnimParamEvent;
import com.yxcorp.gifshow.events.SyncDetailAnimParamEvent$Mode;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SyncDetailAnimParamEvent	// class@000e85
{
    public final SyncDetailAnimParamEvent$Mode a;
    public final int b;

    public void SyncDetailAnimParamEvent(SyncDetailAnimParamEvent$Mode p0,int p1){
       a.p(p0, "mode");
       super();
       this.a = p0;
       this.b = p1;
    }
    public void SyncDetailAnimParamEvent(SyncDetailAnimParamEvent$Mode p0,int p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = 0;
       }
       super(p0, p1);
       return;
    }
    public final int a(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SyncDetailAnimParamEvent.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SyncDetailAnimParamEvent && (a.g(this.a, p0.a) && this.b == p0.b))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       SyncDetailAnimParamEvent obj = PatchProxy.apply(null, this, SyncDetailAnimParamEvent.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((i * 31) + this.b);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SyncDetailAnimParamEvent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SyncDetailAnimParamEvent\(mode="+this.a+", additionalTransitionY="+this.b+"\)";
    }
}
