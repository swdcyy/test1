package com.kuaishou.live.core.show.hourlytrank.strengthnotice.i$d;
import ba2.p;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import a2.i0;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;

public class i$d implements p	// class@000c4f
{
    public final i a;

    public void i$d(i p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       i$d uod = i$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "1")) {
          return;
       }
       i o = this.a.o;
       if (o != null && i0.X(o)) {
          i$d ta = this.a;
          ta.a(ta.o);
       }
       return;
    }
}
