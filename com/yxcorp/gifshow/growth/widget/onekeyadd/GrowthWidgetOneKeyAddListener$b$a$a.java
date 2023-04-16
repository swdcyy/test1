package com.yxcorp.gifshow.growth.widget.onekeyadd.GrowthWidgetOneKeyAddListener$b$a$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.growth.widget.onekeyadd.GrowthWidgetOneKeyAddListener$b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.widget.onekeyadd.GrowthWidgetOneKeyAddListener$b;
import com.yxcorp.gifshow.growth.widget.onekeyadd.GrowthWidgetOneKeyAddListener;

public final class GrowthWidgetOneKeyAddListener$b$a$a implements Runnable	// class@0015e5
{
    public final GrowthWidgetOneKeyAddListener$b$a b;

    public void GrowthWidgetOneKeyAddListener$b$a$a(GrowthWidgetOneKeyAddListener$b$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, GrowthWidgetOneKeyAddListener$b$a$a.class, "1")) {
          return;
       }
       this.b.b.b.onInterceptBackPressEvent();
       return;
    }
}
