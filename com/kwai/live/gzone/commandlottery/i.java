package com.kwai.live.gzone.commandlottery.i;
import mhc.n0;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.live.gzone.commandlottery.j$a;
import uo7.k;
import rq4.d;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mhc.n1;

public class i extends n0	// class@000c9a
{
    public final j$a c;

    public void i(BaseFeed p0,j$a p1){
       this.c = p1;
       super(p0);
    }
    public void f(k p0,d p1){
       p1.G = "SF_TIGER_COMMON_MOB_LIVEKEY";
    }
    public void p(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "1")) {
          return;
       }
       super.p(p0, p1);
       this.c.a();
       return;
    }
}
