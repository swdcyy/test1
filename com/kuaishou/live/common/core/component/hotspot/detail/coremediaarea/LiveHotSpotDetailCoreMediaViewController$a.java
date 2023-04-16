package com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaViewController$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaViewController;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class LiveHotSpotDetailCoreMediaViewController$a extends RecyclerView$r	// class@001383
{
    public final LiveHotSpotDetailCoreMediaViewController a;

    public void LiveHotSpotDetailCoreMediaViewController$a(LiveHotSpotDetailCoreMediaViewController p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       LiveHotSpotDetailCoreMediaViewController$a uoa = LiveHotSpotDetailCoreMediaViewController$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (!p1) {
          this.a.V2();
       }
       return;
    }
}
