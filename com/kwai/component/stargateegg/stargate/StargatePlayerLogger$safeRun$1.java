package com.kwai.component.stargateegg.stargate.StargatePlayerLogger$safeRun$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class StargatePlayerLogger$safeRun$1 extends Lambda implements a	// class@000b47
{
    public final a $action;

    public void StargatePlayerLogger$safeRun$1(a p0){
       this.$action = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, StargatePlayerLogger$safeRun$1.class, "1")) {
          return;
       }
       this.$action.invoke();
       return;
    }
}
