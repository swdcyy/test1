package com.kuaishou.live.core.show.hourlytrank.strengthnotice.i$e;
import oq5.c;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.i;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;

public class i$e implements c	// class@000c50
{
    public final i b;

    public void i$e(i p0){
       this.b = p0;
       super();
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$e.class, "1")) {
          return;
       }
       int i = (p0 != null && p0.orientation == 2)? 1: 0;
       i$e tb = this.b;
       if (tb.l != null) {
          i o = tb.o;
          if (o != null) {
             if (i) {
                o.setVisibility(8);
             }else {
                o.setVisibility(0);
             }
          }
       }
       return;
    }
}
