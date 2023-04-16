package com.kuaishou.live.core.show.hourlytrank.strengthnotice.a$d;
import ba2.p;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import a2.i0;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;

public class a$d implements p	// class@000c40
{
    public final a a;

    public void a$d(a p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       a$d uod = a$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "1")) {
          return;
       }
       a n = this.a.n;
       if (n != null && i0.X(n)) {
          a$d ta = this.a;
          ta.a(ta.n);
       }
       return;
    }
}
