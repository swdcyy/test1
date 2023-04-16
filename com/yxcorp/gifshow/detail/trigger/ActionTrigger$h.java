package com.yxcorp.gifshow.detail.trigger.ActionTrigger$h;
import java.lang.Runnable;
import java.util.List;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$c;
import java.util.Iterator;

public class ActionTrigger$h implements Runnable	// class@001a19
{
    public List b;
    public ActionTrigger$g c;

    public void ActionTrigger$h(List p0,ActionTrigger$g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, ActionTrigger$h.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.get(0).b;
    }
    public final void b(boolean p0){
       if (PatchProxy.isSupport(ActionTrigger$h.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ActionTrigger$h.class, "1")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().g = p0;
       }
       return;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ActionTrigger$h.class, "4")) {
          return;
       }
       this.b(false);
       ActionTrigger$h oh = 1;
       if (!PatchProxy.isSupport(ActionTrigger$h.class) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, this, ActionTrigger$h.class, "2")) {
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             iterator.next().b = oh;
          }
       }
       oh = this.c;
       if (oh != null) {
          oh.a(this.b);
       }
       return;
    }
}
