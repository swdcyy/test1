package com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainLinkItemViewController$b;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainLinkItemViewController;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailExplainData$HotSpotLinkData;
import kotlin.jvm.internal.a;
import un1.k;

public final class LiveHotSpotDetailExplainLinkItemViewController$b implements View$OnClickListener	// class@0013a1
{
    public final LiveHotSpotDetailExplainLinkItemViewController b;

    public void LiveHotSpotDetailExplainLinkItemViewController$b(LiveHotSpotDetailExplainLinkItemViewController p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHotSpotDetailExplainLinkItemViewController$b.class, "1")) {
          return;
       }
       LiveHotSpotDetailExplainData$HotSpotLinkData value = this.b.j.getValue();
       if (value != null) {
          LiveHotSpotDetailExplainData$HotSpotLinkData mHotSpotId = value.mHotSpotId;
          a.o(mHotSpotId, "it.mHotSpotId");
          this.b.k.k0(mHotSpotId, 10);
          a.o(value, "it");
          this.b.V2(true, value);
       }
       return;
    }
}
