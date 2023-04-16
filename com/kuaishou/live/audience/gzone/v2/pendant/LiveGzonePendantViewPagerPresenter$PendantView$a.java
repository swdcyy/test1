package com.kuaishou.live.audience.gzone.v2.pendant.LiveGzonePendantViewPagerPresenter$PendantView$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.audience.gzone.v2.pendant.LiveGzonePendantViewPagerPresenter$PendantView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z31.b;

public class LiveGzonePendantViewPagerPresenter$PendantView$a implements View$OnClickListener	// class@000c34
{
    public final LiveGzonePendantViewPagerPresenter$PendantView b;

    public void LiveGzonePendantViewPagerPresenter$PendantView$a(LiveGzonePendantViewPagerPresenter$PendantView p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzonePendantViewPagerPresenter$PendantView$a.class, "1")) {
          return;
       }
       LiveGzonePendantViewPagerPresenter$PendantView x = this.b.x;
       if (x != null) {
          x.a();
       }
       return;
    }
}
