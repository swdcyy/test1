package com.yxcorp.gifshow.growth.framework.GrowthDialog$showGrowthPositiveDialog$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import msd.a;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;

public final class GrowthDialog$showGrowthPositiveDialog$1 extends Lambda implements l	// class@00136e
{
    public final a $onPositiveClick;

    public void GrowthDialog$showGrowthPositiveDialog$1(a p0){
       this.$onPositiveClick = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(GrowthDialog$showGrowthPositiveDialog$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GrowthDialog$showGrowthPositiveDialog$1.class, "1")) {
          return;
       }
       if (p0) {
          this.$onPositiveClick.invoke();
       }
       return;
    }
}
