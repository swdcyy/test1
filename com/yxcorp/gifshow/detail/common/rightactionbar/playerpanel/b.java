package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.b;
import erd.g;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$5$1$a;
import java.lang.Object;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$5$1;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$5;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;
import sz9.u;
import k3a.j;
import java.lang.Boolean;
import msd.l;

public final class b implements g	// class@0014f1
{
    public final SlidePlayerPanelManager$createPlayerPanel$1$5$1$a b;

    public void b(SlidePlayerPanelManager$createPlayerPanel$1$5$1$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b.class, "1")) {
       }else {
          p0 = this.b.b;
          p0.$this_collectDislike.g(p0.this$0.this$0.this$0.r.c());
          p0 = this.b;
          p0.c.invoke(Boolean.valueOf(p0.b.this$0.this$0.this$0.r.c()));
          PatchProxy.onMethodExit(b.class, "1");
       }
       return;
    }
}
