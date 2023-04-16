package com.kuaishou.live.core.show.hourlytrank.strengthnotice.i$a;
import java.lang.Runnable;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;
import p91.m;

public class i$a implements Runnable	// class@000c4c
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, i$a.class, "1")) {
          return;
       }
       i o = this.b.o;
       if (o != null && (o.isShown() && this.b.o.getStatus() == 1)) {
          i$a tb = this.b;
          if ((this.b.b.s() - tb.q) - tb.m > 0) {
             tb.o.l(true);
          }
       }
       return;
    }
}
