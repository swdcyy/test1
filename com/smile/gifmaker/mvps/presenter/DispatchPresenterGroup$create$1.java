package com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup$create$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup;
import android.view.View;
import java.lang.Object;
import qrd.l1;
import java.lang.Runnable;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import java.lang.StringBuilder;
import jh5.a;
import java.lang.String;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import ih5.o;
import com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup$create$1$$special$$inlined$forEach$lambda$1;
import eh5.j;

public final class DispatchPresenterGroup$create$1 extends Lambda implements a	// class@000bf1
{
    public final View $view;
    public final DispatchPresenterGroup this$0;

    public void DispatchPresenterGroup$create$1(DispatchPresenterGroup p0,View p1){
       this.this$0 = p0;
       this.$view = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Iterator iterator;
       PresenterV2 presenterV2;
       DispatchPresenterGroup f = this.this$0.f;
       if (f != null) {
          f.run();
       }
       this.this$0.f = null;
       DispatchLogger.d.j("DispatchPresenterGroup", this.this$0.i.a()+" [CreateMain]group_create count="+this.this$0.d.size()+", hashcode="+this.this$0.hashCode());
       if (this.this$0.i.f()) {
          iterator = this.this$0.d.iterator();
          while (iterator.hasNext()) {
             presenterV2 = iterator.next();
             DispatchLogger.d.j("DispatchPresenterGroup", this.this$0.i.a()+" [one level create], "+presenterV2.getClass().getSimpleName()+'_'+presenterV2.hashCode()+"_CreateMain");
             presenterV2.f(this.$view);
          }
       }else {
          iterator = this.this$0.d.iterator();
          while (iterator.hasNext()) {
             presenterV2 = iterator.next();
             if (!this.this$0.c(o.a, "presenter2_"+presenterV2.getClass().getSimpleName()+'_'+presenterV2.hashCode(), "presenter2_"+presenterV2.getClass().getSimpleName()+'_'+presenterV2.hashCode()+"_CreateMain", new DispatchPresenterGroup$create$1$$special$$inlined$forEach$lambda$1(presenterV2, this))) {
                DispatchLogger.d.j("DispatchPresenterGroup", this.this$0.i.a()+" [presenter2_dispatch fail], "+presenterV2.getClass().getSimpleName()+'_'+presenterV2.hashCode()+"_CreateMain");
                presenterV2.f(this.$view);
             }
          }
       }
       return;
    }
}
