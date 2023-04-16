package com.kuaishou.live.core.show.hourlytrank.strengthnotice.a$e;
import oq5.c;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.a;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;

public class a$e implements c	// class@000c41
{
    public final a b;

    public void a$e(a p0){
       this.b = p0;
       super();
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
          return;
       }
       int i = (p0 != null && p0.orientation == 2)? 1: 0;
       a$e tb = this.b;
       if (tb.k != null) {
          a n = tb.n;
          if (n != null) {
             if (i) {
                n.setVisibility(8);
             }else {
                n.setVisibility(0);
             }
          }
       }
       return;
    }
}
