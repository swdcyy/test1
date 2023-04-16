package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$EditList$onBind$3$2$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$EditList$onBind$3$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$EditList$onBind$3;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$EditList;
import java.lang.StringBuilder;
import zqa.b$d;
import msd.a;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import qrd.l1;
import java.lang.CharSequence;
import android.widget.TextView;

public final class GrowthTestViewHolder$EditList$onBind$3$2$a implements Runnable	// class@001562
{
    public final GrowthTestViewHolder$EditList$onBind$3$2 b;

    public void GrowthTestViewHolder$EditList$onBind$3$2$a(GrowthTestViewHolder$EditList$onBind$3$2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, GrowthTestViewHolder$EditList$onBind$3$2$a.class, "1")) {
          return;
       }
       GrowthTestViewHolder$EditList h = this.b.this$0.b.h;
       if (h != null) {
          StringBuilder str = "";
          Iterator iterator = this.b.this$0.c.e().invoke().entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             str = str+uEntry.getKey()+" = "+uEntry.getValue()+10;
          }
          h.setText(str);
       }
       return;
    }
}
