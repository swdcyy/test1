package com.kuaishou.live.core.show.redpacket.surpriseredpack.widget.LiveSurpriseRedPackGiftListView;
import com.kwai.library.widget.recyclerview.CustomFadeEdgeRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.widget.LiveSurpriseRedPackGiftListView$a;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.widget.LiveSurpriseRedPackGiftListView$b;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.String;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.widget.LiveSurpriseRedPackGiftListView$c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import android.view.View$MeasureSpec;
import java.lang.Math;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$n;

public class LiveSurpriseRedPackGiftListView extends CustomFadeEdgeRecyclerView	// class@000fbd
{
    public final int f;
    public final String g;
    public final int h;
    public final LiveSurpriseRedPackGiftListView$c i;
    public RecyclerView$n j;
    public RecyclerView$n k;

    public void LiveSurpriseRedPackGiftListView(Context p0){
       super(p0, null);
    }
    public void LiveSurpriseRedPackGiftListView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveSurpriseRedPackGiftListView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.j = new LiveSurpriseRedPackGiftListView$a(this);
       this.k = new LiveSurpriseRedPackGiftListView$b(this);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.V2, p2, 0);
       this.f = typedArray.getResourceId(0, 0x7f0d0d81);
       this.g = typedArray.getString(2);
       this.h = typedArray.getDimensionPixelSize(1, -1);
       typedArray.recycle();
       this.setClipChildren(0);
       this.setClipToPadding(0);
       this.setLayoutManager(new LinearLayoutManager(p0, 0, 0));
       LiveSurpriseRedPackGiftListView$c uoc = new LiveSurpriseRedPackGiftListView$c(this);
       this.i = uoc;
       this.setAdapter(uoc);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiveSurpriseRedPackGiftListView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveSurpriseRedPackGiftListView.class, "1")) {
          return;
       }
       LiveSurpriseRedPackGiftListView th = this.h;
       if (th > null) {
          p0 = View$MeasureSpec.makeMeasureSpec(Math.max(th, View$MeasureSpec.getSize(p0)), Integer.MIN_VALUE);
       }
       super.onMeasure(p0, p1);
       return;
    }
    public void y(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSurpriseRedPackGiftListView.class, "2")) {
          return;
       }
       LiveSurpriseRedPackGiftListView ti = this.i;
       ti.e = p0;
       ti.k0();
       if (p0.size() == 2) {
          this.addItemDecoration(this.j);
       }else if(p0.size() == 3){
          this.addItemDecoration(this.k);
       }
       return;
    }
}
