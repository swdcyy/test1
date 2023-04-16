package com.kuaishou.merchant.live.cart.onsale.audience.component.dynamic.DynamicEmptyView;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;

public final class DynamicEmptyView extends FrameLayout	// class@001933
{
    public HashMap b;

    public void DynamicEmptyView(Context p0){
       super(p0);
       this.setLayoutParams(new ViewGroup$LayoutParams(-1, 0));
    }
}
