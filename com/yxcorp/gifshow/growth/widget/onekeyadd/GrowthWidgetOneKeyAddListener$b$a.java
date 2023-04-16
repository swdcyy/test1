package com.yxcorp.gifshow.growth.widget.onekeyadd.GrowthWidgetOneKeyAddListener$b$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.growth.widget.onekeyadd.GrowthWidgetOneKeyAddListener$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.yxcorp.gifshow.growth.widget.onekeyadd.GrowthWidgetOneKeyAddListener;
import ira.e;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.growth.widget.onekeyadd.GrowthWidgetOneKeyAddListener$b$a$a;
import ekd.k1;

public final class GrowthWidgetOneKeyAddListener$b$a implements Runnable	// class@0015e6
{
    public final GrowthWidgetOneKeyAddListener$b b;

    public void GrowthWidgetOneKeyAddListener$b$a(GrowthWidgetOneKeyAddListener$b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, GrowthWidgetOneKeyAddListener$b$a.class, "1")) {
          return;
       }
       boolean b = GrowthWidgetOneKeyAddListener.b(this.b.b).a();
       Object[] objArray = new Object[0];
       w.C().w("GrowthWidgetOneKeyAddListener", "canTrigger spend time\(ms\): "+(System.currentTimeMillis() - System.currentTimeMillis()), objArray);
       Object[] objArray1 = new Object[0];
       w.C().w("GrowthWidgetOneKeyAddListener", "canTrigger: "+b, objArray1);
       if (b) {
          k1.o(new GrowthWidgetOneKeyAddListener$b$a$a(this));
       }
       return;
    }
}
