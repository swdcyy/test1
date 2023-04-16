package com.yxcorp.gifshow.channel.stagger.widget.HotChannelBannerIndicator;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import lnc.a1;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import java.lang.Integer;

public class HotChannelBannerIndicator extends LinearLayout	// class@001074
{
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public void HotChannelBannerIndicator(Context p0){
       super(p0, null, 0);
    }
    public void HotChannelBannerIndicator(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void HotChannelBannerIndicator(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.i1);
       this.d = typedArray.getDimensionPixelOffset(1, a1.e(4.00f));
       this.e = typedArray.getDimensionPixelOffset(4, a1.e(10.00f));
       this.f = typedArray.getDimensionPixelOffset(4, 0);
       this.b = typedArray.getResourceId(0, 0x7f0802e5);
       this.c = typedArray.getResourceId(3, 0x7f0802e6);
       this.setGravity(5);
       this.setOrientation(0);
       typedArray.recycle();
    }
    public final void setDefaultView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotChannelBannerIndicator.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       LinearLayout$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.width = this.d;
       p0.setLayoutParams(layoutParams);
       p0.setBackgroundResource(this.b);
       return;
    }
    public void setItemCount(int p0){
       if (PatchProxy.isSupport(HotChannelBannerIndicator.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HotChannelBannerIndicator.class, "1")) {
          return;
       }
       this.g = 0;
       this.removeAllViews();
       for (int i = 0; i < p0; i = i + 1) {
          LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(this.e, this.d);
          LinearLayout linearLayout = new LinearLayout(this.getContext());
          linearLayout.setLayoutParams(layoutParams);
          linearLayout.setGravity(17);
          View view = new View(this.getContext());
          view.setBackgroundResource(this.b);
          linearLayout.addView(view, new LinearLayout$LayoutParams(this.d, this.d));
          this.addView(linearLayout, layoutParams);
       }
       this.setSelectView(this.getChildAt(0).getChildAt(0));
       return;
    }
    public void setPageIndex(int p0){
       if (PatchProxy.isSupport(HotChannelBannerIndicator.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HotChannelBannerIndicator.class, "2")) {
          return;
       }
       if (p0 != this.g) {
          this.setSelectView(this.getChildAt(p0).getChildAt(0));
          this.setDefaultView(this.getChildAt(this.g).getChildAt(0));
          this.g = p0;
       }
       return;
    }
    public final void setSelectView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotChannelBannerIndicator.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       LinearLayout$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.width = this.e;
       p0.setLayoutParams(layoutParams);
       p0.setBackgroundResource(this.c);
       return;
    }
}
