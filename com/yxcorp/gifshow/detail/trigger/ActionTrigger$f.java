package com.yxcorp.gifshow.detail.trigger.ActionTrigger$f;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$b;

public abstract class ActionTrigger$f	// class@001a17
{

    public void ActionTrigger$f(){
       super();
    }
    public abstract List a(QPhoto p0);
    public ActionTrigger$a b(){
       Object obj = PatchProxy.apply(null, this, ActionTrigger$f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ActionTrigger$a();
    }
    public ActionTrigger$b c(ActionTrigger p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ActionTrigger$f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ActionTrigger$b(p0);
    }
}
