package com.yxcorp.gifshow.detail.trigger.ActionTrigger$d;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$f;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$a;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$b;

public class ActionTrigger$d extends ActionTrigger$f	// class@001a15
{

    public void ActionTrigger$d(){
       super();
    }
    public List a(QPhoto p0){
       p0 = PatchProxy.applyOneRefs(p0, this, ActionTrigger$d.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new ArrayList();
    }
    public ActionTrigger$a b(){
       Object obj = PatchProxy.apply(null, this, ActionTrigger$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ActionTrigger$a();
    }
    public ActionTrigger$b c(ActionTrigger p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ActionTrigger$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ActionTrigger$b(p0);
    }
}
