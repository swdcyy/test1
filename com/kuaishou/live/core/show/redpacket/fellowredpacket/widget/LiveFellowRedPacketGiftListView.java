package com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketGiftListView;
import com.kwai.library.widget.recyclerview.CustomFadeEdgeRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.String;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketGiftListView$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import android.view.View$MeasureSpec;
import java.lang.Math;

public class LiveFellowRedPacketGiftListView extends CustomFadeEdgeRecyclerView	// class@000ec6
{
    public int f;
    public String g;
    public int h;
    public LiveFellowRedPacketGiftListView$a i;

    public void LiveFellowRedPacketGiftListView(Context p0){
       super(p0, null);
    }
    public void LiveFellowRedPacketGiftListView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveFellowRedPacketGiftListView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.w2, p2, 0);
       this.f = typedArray.getResourceId(0, 0x7f0d0b09);
       this.g = typedArray.getString(2);
       this.h = typedArray.getDimensionPixelSize(1, -1);
       typedArray.recycle();
       this.setClipChildren(0);
       this.setClipToPadding(0);
       this.setLayoutManager(new LinearLayoutManager(p0, 0, 0));
       LiveFellowRedPacketGiftListView$a uoa = new LiveFellowRedPacketGiftListView$a(this);
       this.i = uoa;
       this.setAdapter(uoa);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiveFellowRedPacketGiftListView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveFellowRedPacketGiftListView.class, "1")) {
          return;
       }
       LiveFellowRedPacketGiftListView th = this.h;
       if (th > null) {
          p0 = View$MeasureSpec.makeMeasureSpec(Math.max(th, View$MeasureSpec.getSize(p0)), Integer.MIN_VALUE);
       }
       super.onMeasure(p0, p1);
       return;
    }
}
