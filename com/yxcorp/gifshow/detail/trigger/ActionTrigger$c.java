package com.yxcorp.gifshow.detail.trigger.ActionTrigger$c;
import java.lang.Object;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public abstract class ActionTrigger$c	// class@001a14
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    public void ActionTrigger$c(){
       super();
    }
    public boolean a(ActionTrigger$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ActionTrigger$c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!this.b()) {
          return b;
       }
       if (p0.a - this.b() < 0) {
          b = false;
       }
       return b;
    }
    public long b(){
       return 0;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, ActionTrigger$c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.b())? true: false;
       return b;
    }
}
