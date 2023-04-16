package com.yxcorp.gifshow.growth.widgetmiui.NBAWidgetProviderManager$b;
import erd.g;
import java.lang.Object;
import ora.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.widgetmiui.model.NBAWidgetBean;
import java.lang.Integer;
import com.yxcorp.gifshow.growth.widgetmiui.NBAWidgetProviderManager;

public final class NBAWidgetProviderManager$b implements g	// class@001615
{
    public final int[] b;

    public void NBAWidgetProviderManager$b(int[] p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NBAWidgetProviderManager$b.class, "1")) {
       }else {
          NBAWidgetBean nBAWidgetBea = p0.a();
          Integer integer = (nBAWidgetBea != null)? Integer.valueOf(nBAWidgetBea.b()): null;
          if (integer != null) {
             int i = 1;
             if (integer.intValue() == i) {
                NBAWidgetProviderManager.b.d(this.b, p0.a(), i);
             }
          }
          NBAWidgetProviderManager.b.d(this.b, p0.a(), 0);
       }
       return;
    }
}
