package com.kuaishou.live.core.show.redpacket.surpriseredpack.widget.LiveSurpriseRedPackGiftListView$a;
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

public class LiveSurpriseRedPackGiftListView$a extends RecyclerView$n	// class@000fb9
{
    public final LiveSurpriseRedPackGiftListView a;

    public void LiveSurpriseRedPackGiftListView$a(LiveSurpriseRedPackGiftListView p0){
       this.a = p0;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, LiveSurpriseRedPackGiftListView$a.class, "1")) {
          return;
       }
       if (p2.getLayoutManager() != null && p2.getLayoutManager().getPosition(p1) != 1) {
          p0.right = a1.d(0x7f07031d);
       }
       return;
    }
}
