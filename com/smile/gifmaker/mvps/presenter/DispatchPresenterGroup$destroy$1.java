package com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup$destroy$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup;
import java.lang.Object;
import qrd.l1;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import java.lang.StringBuilder;
import jh5.a;
import java.lang.String;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import ih5.r;
import com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup$destroy$1$2$presenterDispatchSuccess$1;
import eh5.j;

public final class DispatchPresenterGroup$destroy$1 extends Lambda implements a	// class@000bf3
{
    public final DispatchPresenterGroup this$0;

    public void DispatchPresenterGroup$destroy$1(DispatchPresenterGroup p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Iterator iterator;
       PresenterV2 presenterV2;
       DispatchLogger.d.j("DispatchPresenterGroup", this.this$0.i.a()+" [UnBindMain]group_destroy count="+this.this$0.d.size()+", hashcode="+this.this$0.hashCode());
       if (this.this$0.i.f()) {
          iterator = this.this$0.d.iterator();
          while (iterator.hasNext()) {
             presenterV2 = iterator.next();
             DispatchLogger.d.j("DispatchPresenterGroup", this.this$0.i.a()+" [one level destroy], "+presenterV2.getClass().getSimpleName()+'_'+presenterV2.hashCode()+"_DestroyMain");
             presenterV2.destroy();
          }
       }else {
          iterator = this.this$0.d.iterator();
          while (iterator.hasNext()) {
             presenterV2 = iterator.next();
             if (!this.this$0.c(r.a, "presenter2_"+presenterV2.getClass().getSimpleName()+'_'+presenterV2.hashCode(), "presenter2_"+presenterV2.getClass().getSimpleName()+'_'+presenterV2.hashCode()+"_DestroyMain", new DispatchPresenterGroup$destroy$1$2$presenterDispatchSuccess$1(presenterV2))) {
                DispatchLogger.d.j("DispatchPresenterGroup", this.this$0.i.a()+" [presenter2_dispatch fail], "+presenterV2.getClass().getSimpleName()+'_'+presenterV2.hashCode()+"_DestroyMain");
                presenterV2.destroy();
             }
          }
       }
       return;
    }
}
