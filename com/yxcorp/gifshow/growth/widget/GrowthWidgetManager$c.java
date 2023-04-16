package com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import cra.w;
import java.lang.Exception;
import q87.c;

public final class GrowthWidgetManager$c implements Runnable	// class@0015cb
{
    public final GrowthWidgetManager b;

    public void GrowthWidgetManager$c(GrowthWidgetManager p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, GrowthWidgetManager$c.class, "1")) {
          return;
       }
       k1.m(this.b.h);
       GrowthWidgetManager h = this.b.h;
       try{
          k1.r(h, 0x927c0);
          this.b.g();
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[0];
          w.C().t(GrowthWidgetManager.class.getSimpleName(), String.valueOf(e0.getMessage()), objArray);
       }
       return;
    }
}
