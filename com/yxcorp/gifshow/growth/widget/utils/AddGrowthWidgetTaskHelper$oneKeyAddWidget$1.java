package com.yxcorp.gifshow.growth.widget.utils.AddGrowthWidgetTaskHelper$oneKeyAddWidget$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import f55.g;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.i3;
import java.lang.Boolean;

public final class AddGrowthWidgetTaskHelper$oneKeyAddWidget$1 extends Lambda implements a	// class@00160a
{
    public final g $callback;

    public void AddGrowthWidgetTaskHelper$oneKeyAddWidget$1(g p0){
       this.$callback = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, AddGrowthWidgetTaskHelper$oneKeyAddWidget$1.class, "1")) {
          return;
       }
       i3 oi3 = i3.f();
       Boolean tRUE = Boolean.TRUE;
       oi3.a("addGrowthWidgetSuccess", tRUE);
       oi3.a("oneKeyAddGrowthWidget", tRUE);
       this.$callback.onSuccess(oi3.e());
       return;
    }
}
