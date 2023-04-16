package com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.LiveHotSpotDetailRelatedAnchorsViewController$a;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.LiveHotSpotDetailRelatedAnchorsViewController;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.a1;

public final class LiveHotSpotDetailRelatedAnchorsViewController$a extends RecyclerView$n	// class@0013f0
{
    public final LiveHotSpotDetailRelatedAnchorsViewController a;

    public void LiveHotSpotDetailRelatedAnchorsViewController$a(LiveHotSpotDetailRelatedAnchorsViewController p0){
       this.a = p0;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, LiveHotSpotDetailRelatedAnchorsViewController$a.class, "1")) {
          return;
       }
       a.p(p0, "outRect");
       a.p(p1, "view");
       a.p(p2, "parent");
       a.p(p3, "state");
       super.c(p0, p1, p2, p3);
       if (p2.getChildAdapterPosition(p1)) {
          p0.left = a1.d(0x7f0702cc);
       }
       return;
    }
}
