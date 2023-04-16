package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$EditList$a$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$EditList$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
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

public final class GrowthTestViewHolder$EditList$a$a implements Runnable	// class@001560
{
    public final GrowthTestViewHolder$EditList$a b;

    public void GrowthTestViewHolder$EditList$a$a(GrowthTestViewHolder$EditList$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, GrowthTestViewHolder$EditList$a$a.class, "1")) {
          return;
       }
       GrowthTestViewHolder$EditList h = this.b.b.h;
       if (h != null) {
          StringBuilder str = "";
          Iterator iterator = this.b.c.e().invoke().entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             str = str+uEntry.getKey()+" = "+uEntry.getValue()+10;
          }
          h.setText(str);
       }
       return;
    }
}
