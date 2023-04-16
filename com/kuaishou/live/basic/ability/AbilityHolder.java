package com.kuaishou.live.basic.ability.AbilityHolder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import lp3.e;

public abstract class AbilityHolder	// class@000c4b
{
    public Object data;
    public e serviceManager;

    public void AbilityHolder(){
       super();
    }
    public abstract Object create();
    public final Object get(){
       AbilityHolder obj = PatchProxy.apply(null, this, AbilityHolder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.data == null) {
          this.data = this.create();
       }
       obj = this.data;
       a.m(obj);
       return obj;
    }
    public final Object getOptional(){
       return this.data;
    }
    public final e getServiceManager(){
       AbilityHolder obj = PatchProxy.apply(null, this, AbilityHolder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.serviceManager;
       if (obj == null) {
          a.S("serviceManager");
       }
       return obj;
    }
    public final void setServiceManager(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbilityHolder.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.serviceManager = p0;
       return;
    }
}
