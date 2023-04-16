package com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup$bind$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup;
import com.smile.gifshow.annotation.provider.v2.a;
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
import java.util.LinkedList;
import ih5.m;
import com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup$bind$1$$special$$inlined$forEach$lambda$1;
import eh5.j;

public final class DispatchPresenterGroup$bind$1 extends Lambda implements a	// class@000bee
{
    public final a $accessorWrapper;
    public final DispatchPresenterGroup this$0;

    public void DispatchPresenterGroup$bind$1(DispatchPresenterGroup p0,a p1){
       this.this$0 = p0;
       this.$accessorWrapper = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Iterator iterator;
       PresenterV2 presenterV2;
       Object[] objArray;
       DispatchLogger.d.j("DispatchPresenterGroup", this.this$0.i.a()+" [BindMain]group_bind count="+this.this$0.d.size()+", hashcode="+this.this$0.hashCode());
       if (this.this$0.i.f()) {
          iterator = this.this$0.d.iterator();
          while (iterator.hasNext()) {
             presenterV2 = iterator.next();
             DispatchLogger.d.j("DispatchPresenterGroup", this.this$0.i.a()+" [one level bind], "+presenterV2.getClass().getSimpleName()+'_'+presenterV2.hashCode()+"_BindMain");
             objArray = new Object[]{this.$accessorWrapper};
             presenterV2.i(objArray);
             if (this.this$0.i.b()) {
                this.this$0.e.add(presenterV2);
             }
          }
       }else {
          iterator = this.this$0.d.iterator();
          while (iterator.hasNext()) {
             presenterV2 = iterator.next();
             if (!this.this$0.c(m.a, "presenter2_"+presenterV2.getClass().getSimpleName()+'_'+presenterV2.hashCode(), "presenter2_"+presenterV2.getClass().getSimpleName()+'_'+presenterV2.hashCode()+"_BindMain", new DispatchPresenterGroup$bind$1$$special$$inlined$forEach$lambda$1(presenterV2, this))) {
                DispatchLogger.d.j("DispatchPresenterGroup", this.this$0.i.a()+" [presenter2_dispatch fail], "+presenterV2.getClass().getSimpleName()+'_'+presenterV2.hashCode()+"_BindMain");
                objArray = new Object[]{this.$accessorWrapper};
                presenterV2.i(objArray);
                if (this.this$0.i.b()) {
                   this.this$0.e.add(presenterV2);
                }
             }
          }
       }
       return;
    }
}
