package com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainLinkItemViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import un1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainLinkItemViewController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainLinkItemViewController$b;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailExplainData$HotSpotLinkData;
import java.lang.Boolean;
import fn1.a;
import fn1.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainLinkItemViewController$logEvent$1;
import msd.l;

public final class LiveHotSpotDetailExplainLinkItemViewController extends ViewController	// class@0013a3
{
    public final LiveData j;
    public final k k;

    public void LiveHotSpotDetailExplainLinkItemViewController(LiveData p0,k p1){
       a.p(p0, "dataProvider");
       a.p(p1, "detailMainVCDelegate");
       super();
       this.j = p0;
       this.k = p1;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailExplainLinkItemViewController.class, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0c1a);
       this.j.observe(this, new LiveHotSpotDetailExplainLinkItemViewController$a(this.A2(R.id.live_hot_spot_detail_explain_link_text)));
       this.P2().setOnClickListener(new LiveHotSpotDetailExplainLinkItemViewController$b(this));
       return;
    }
    public void M2(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailExplainLinkItemViewController.class, "2")) {
          return;
       }
       LiveHotSpotDetailExplainData$HotSpotLinkData value = this.j.getValue();
       if (value != null && value.mHasReportShowEvent == null) {
          a.o(value, "it");
          this.V2(false, value);
          value.mHasReportShowEvent = true;
       }
       return;
    }
    public final void V2(boolean p0,LiveHotSpotDetailExplainData$HotSpotLinkData p1){
       LiveHotSpotDetailExplainLinkItemViewController liveHotSpotD = LiveHotSpotDetailExplainLinkItemViewController.class;
       if (PatchProxy.isSupport(liveHotSpotD) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, liveHotSpotD, "3")) {
          return;
       }
       a.a.c(p0, "LIVE_HOTSPOT_DATAIL_RELATED_HOT", this.k.E0(), this.k.a(), new LiveHotSpotDetailExplainLinkItemViewController$logEvent$1(p1));
       return;
    }
}
