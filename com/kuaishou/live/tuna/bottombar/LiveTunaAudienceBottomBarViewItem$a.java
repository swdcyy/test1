package com.kuaishou.live.tuna.bottombar.LiveTunaAudienceBottomBarViewItem$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.tuna.bottombar.LiveTunaAudienceBottomBarViewItem;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.bottombar.component.widget.d;
import androidx.lifecycle.LiveData;
import z61.b;
import j61.c;

public final class LiveTunaAudienceBottomBarViewItem$a extends m	// class@000f93
{
    public final LiveTunaAudienceBottomBarViewItem c;

    public void LiveTunaAudienceBottomBarViewItem$a(LiveTunaAudienceBottomBarViewItem p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTunaAudienceBottomBarViewItem$a.class, "1")) {
          return;
       }
       d f = this.c.f;
       if (f != null) {
          b value = f.getValue();
          if (value != null) {
             value = value.mFeatureId;
             d i = this.c.i;
             if (i != null) {
                i.a(value);
             }
          }
       }
       return;
    }
}
