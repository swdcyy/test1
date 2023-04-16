package com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketGiftListView$b;
import ml8.d;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketGiftListView;
import android.view.View;
import java.lang.String;
import java.lang.Class;
import z12.x;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;

public class LiveFellowRedPacketGiftListView$b extends RecyclerView$ViewHolder implements d	// class@000ec5
{
    public KwaiImageView b;
    public TextView c;
    public final LiveFellowRedPacketGiftListView d;

    public void LiveFellowRedPacketGiftListView$b(LiveFellowRedPacketGiftListView p0,View p1){
       this.d = p0;
       super(p1);
       x.e(p1, LiveFellowRedPacketGiftListView$b.class.getCanonicalName());
       this.doBindView(p1);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFellowRedPacketGiftListView$b.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a1ca2);
       this.c = m1.f(p0, 0x7f0a1ca1);
       return;
    }
}
