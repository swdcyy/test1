package com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketGiftRecyclerView;
import com.kwai.library.widget.recyclerview.CustomFadeEdgeRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketGiftRecyclerView$a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import z8c.e;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.List;
import z12.a0;

public class LiveFellowRedPacketGiftRecyclerView extends CustomFadeEdgeRecyclerView	// class@000ec9
{
    public LiveFellowRedPacketGiftRecyclerView$a f;

    public void LiveFellowRedPacketGiftRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveFellowRedPacketGiftRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = new LiveFellowRedPacketGiftRecyclerView$a();
       this.setLayoutManager(new LinearLayoutManager(p0, 0, 0));
       this.addItemDecoration(new e(0, a1.e(8.00f), 0));
       this.setAdapter(this.f);
    }
    public void setLayoutResId(int p0){
       if (PatchProxy.isSupport(LiveFellowRedPacketGiftRecyclerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveFellowRedPacketGiftRecyclerView.class, "2")) {
          return;
       }
       LiveFellowRedPacketGiftRecyclerView tf = this.f;
       Objects.requireNonNull(tf);
       LiveFellowRedPacketGiftRecyclerView$a uoa = LiveFellowRedPacketGiftRecyclerView$a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), tf, uoa, "5")) {
          tf.e = p0;
          tf.k0();
       }
       return;
    }
    public void y(List p0,a0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveFellowRedPacketGiftRecyclerView.class, "1")) {
          return;
       }
       LiveFellowRedPacketGiftRecyclerView tf = this.f;
       tf.g = p1;
       if (!PatchProxy.applyVoidOneRefs(p0, tf, LiveFellowRedPacketGiftRecyclerView$a.class, "4")) {
          tf.f = p0;
          tf.k0();
       }
       return;
    }
}
