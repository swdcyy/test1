package com.kuaishou.live.core.show.redpacket.surpriseredpack.widget.LiveSurpriseRedPackGiftListView$b;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.widget.LiveSurpriseRedPackGiftListView;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import lnc.a1;

public class LiveSurpriseRedPackGiftListView$b extends RecyclerView$n	// class@000fba
{
    public final LiveSurpriseRedPackGiftListView a;

    public void LiveSurpriseRedPackGiftListView$b(LiveSurpriseRedPackGiftListView p0){
       this.a = p0;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, LiveSurpriseRedPackGiftListView$b.class, "1")) {
          return;
       }
       if (p2.getLayoutManager() != null && p2.getLayoutManager().getPosition(p1) != 2) {
          p0.right = a1.d(0x7f0702cc);
       }
       return;
    }
}
