package com.kuaishou.live.audience.component.topbar.LiveAudienceTopBarPresenter$a;
import oq5.c;
import com.kuaishou.live.audience.component.topbar.LiveAudienceTopBarPresenter;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.UserVerifiedDetail;
import android.widget.ImageView;
import d61.i0;

public class LiveAudienceTopBarPresenter$a implements c	// class@000bdf
{
    public final LiveAudienceTopBarPresenter b;

    public void LiveAudienceTopBarPresenter$a(LiveAudienceTopBarPresenter p0){
       this.b = p0;
       super();
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceTopBarPresenter$a.class, "1")) {
          return;
       }
       this.b.c9();
       boolean b = true;
       i0.a(this.b.b9(), this.b.M, b);
       LiveAudienceTopBarPresenter$a tb = this.b;
       if (p0.orientation != 2) {
          b = false;
       }
       tb.d9(b);
       return;
    }
}
