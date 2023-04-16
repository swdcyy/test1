package com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketGiftRecyclerView$b;
import ml8.d;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import z12.a0;
import java.lang.String;
import java.lang.Class;
import z12.x;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;

public class LiveFellowRedPacketGiftRecyclerView$b extends RecyclerView$ViewHolder implements d	// class@000ec8
{
    public KwaiImageView b;
    public TextView c;
    public a0 d;

    public void LiveFellowRedPacketGiftRecyclerView$b(View p0,a0 p1){
       super(p0);
       x.e(p0, LiveFellowRedPacketGiftRecyclerView$b.class.getCanonicalName());
       this.d = p1;
       this.doBindView(p0);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFellowRedPacketGiftRecyclerView$b.class, "2")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a1d43);
       this.c = m1.f(p0, 0x7f0a1d51);
       return;
    }
}
