package com.yxcorp.gifshow.growth.widget.onekeyadd.GrowthWidgetOneKeyAddListener$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.growth.widget.onekeyadd.GrowthWidgetOneKeyAddListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hra.c;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager;
import ira.e;
import com.yxcorp.gifshow.growth.widget.WidgetType;
import hra.c$a;
import lnc.u1;

public final class GrowthWidgetOneKeyAddListener$c implements Runnable	// class@0015e8
{
    public final GrowthWidgetOneKeyAddListener b;

    public void GrowthWidgetOneKeyAddListener$c(GrowthWidgetOneKeyAddListener p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, GrowthWidgetOneKeyAddListener$c.class, "1")) {
          return;
       }
       c.a.d(GrowthWidgetOneKeyAddListener.a(this.b).c, GrowthWidgetOneKeyAddListener.b(this.b).d(), "", GrowthWidgetOneKeyAddListener.b(this.b).b());
       u1.b(this.b);
       PatchProxy.onMethodExit(GrowthWidgetOneKeyAddListener$c.class, "1");
       return;
    }
}
