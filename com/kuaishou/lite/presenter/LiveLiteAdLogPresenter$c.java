package com.kuaishou.lite.presenter.LiveLiteAdLogPresenter$c;
import mq5.h;
import com.kuaishou.lite.presenter.LiveLiteAdLogPresenter;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mxb.h;
import com.kuaishou.lite.presenter.LiveLiteAdLogPresenter$c$a;
import com.kuaishou.lite.presenter.LiveLiteBaseAdLogPresenter;
import z1.a;

public final class LiveLiteAdLogPresenter$c implements h	// class@000936
{
    public final LiveLiteAdLogPresenter b;

    public void LiveLiteAdLogPresenter$c(LiveLiteAdLogPresenter p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, LiveLiteAdLogPresenter$c.class, "1")) {
          return;
       }
       LiveLiteBaseAdLogPresenter.s9(this.b, 66, new LiveLiteAdLogPresenter$c$a(this.b.C9().b()), null, 4, null);
       LiveLiteBaseAdLogPresenter.B9(this.b, false, false, 3, null);
       return;
    }
}
