package com.kuaishou.live.core.show.wishlist.h;
import java.lang.Runnable;
import com.kuaishou.live.core.show.wishlist.i;
import android.widget.ViewFlipper;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;
import nn2.p0;
import ekd.k1;

public final class h implements Runnable	// class@0012db
{
    public final i b;
    public final ViewFlipper c;

    public void h(i p0,ViewFlipper p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       int i;
       h tb = this.b;
       h tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, i.class, "11")) {
       }else {
          ViewFlipper viewFlipper = tb.W8();
          if (viewFlipper != null && viewFlipper.getCurrentView() != null) {
             ViewGroup$LayoutParams layoutParams = tb.v.getLayoutParams();
             ViewGroup$LayoutParams layoutParams1 = tb.w.getLayoutParams();
             View view = viewFlipper.getCurrentView().findViewById(R.id.live_wish_list_gift_container);
             int[] ointArray = new int[2];
             viewFlipper.getLocationOnScreen(ointArray);
             i = ointArray[0];
             if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                layoutParams.leftMargin = i;
                layoutParams.height = viewFlipper.getHeight();
                if (view != null) {
                   layoutParams.width = Math.max(view.getWidth(), tb.v.getWidth());
                }
             }
             if (view != null) {
                layoutParams1.width = view.getWidth();
             }
             layoutParams1.height = viewFlipper.getHeight();
             tb.w.requestLayout();
          }
       }
       k1.p(new p0(tb, tc), tb);
       return;
    }
}
