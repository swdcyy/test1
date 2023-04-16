package com.kuaishou.live.core.show.hourlytrank.strengthnotice.a$a;
import java.lang.Runnable;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;
import p91.m;

public class a$a implements Runnable	// class@000c3d
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       a n = this.b.n;
       if (n != null && (n.isShown() && this.b.n.getStatus() == 1)) {
          a$a tb = this.b;
          if ((this.b.b.s() - tb.p) - tb.l > 0) {
             tb.n.l(true);
          }
       }
       return;
    }
}
