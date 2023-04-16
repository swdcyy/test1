package com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup$bind$$inlined$forEach$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup;
import com.smile.gifshow.annotation.provider.v2.a;
import java.lang.Object;
import qrd.l1;
import jh5.a;
import java.util.LinkedList;

public final class DispatchPresenterGroup$bind$$inlined$forEach$lambda$1 extends Lambda implements a	// class@000bec
{
    public final a $accessorWrapper$inlined;
    public final PresenterV2 $presenterV2;
    public final DispatchPresenterGroup this$0;

    public void DispatchPresenterGroup$bind$$inlined$forEach$lambda$1(PresenterV2 p0,DispatchPresenterGroup p1,a p2){
       this.$presenterV2 = p0;
       this.this$0 = p1;
       this.$accessorWrapper$inlined = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = new Object[]{this.$accessorWrapper$inlined};
       this.$presenterV2.i(objArray);
       if (this.this$0.i.b()) {
          this.this$0.e.add(this.$presenterV2);
       }
       return;
    }
}
