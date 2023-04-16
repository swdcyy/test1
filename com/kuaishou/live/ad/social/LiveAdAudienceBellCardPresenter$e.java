package com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter$e;
import oq5.c;
import com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import am0.b;
import android.view.View;
import oq5.a;

public final class LiveAdAudienceBellCardPresenter$e implements c	// class@0009f1
{
    public final LiveAdAudienceBellCardPresenter b;

    public void LiveAdAudienceBellCardPresenter$e(LiveAdAudienceBellCardPresenter p0){
       this.b = p0;
       super();
    }
    public final void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAdAudienceBellCardPresenter$e.class, "1")) {
          return;
       }
       View view = this.b.R8().c();
       if (view != null) {
          LiveAdAudienceBellCardPresenter x = this.b.x;
          int i = (x != null && x.H2() == true)? 8: 0;
          view.setVisibility(i);
       }
       return;
    }
}
