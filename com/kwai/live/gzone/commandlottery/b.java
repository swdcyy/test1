package com.kwai.live.gzone.commandlottery.b;
import erd.g;
import com.kwai.live.gzone.commandlottery.a;
import java.lang.Object;
import com.kwai.live.gzone.commandlottery.model.LiveGzoneAudienceCommandLotteryResultResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mkc.b;
import android.view.View;
import mkc.c;
import com.kwai.library.widget.popup.common.c;
import com.kwai.live.gzone.commandlottery.d$b;

public class b implements g	// class@000c91
{
    public final a b;

    public void b(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          b[] uobArray = new b[]{b.d};
          c.d(this.b.I, uobArray);
          this.b.q(0);
          this.b.L.a(p0);
       }
       return;
    }
}
