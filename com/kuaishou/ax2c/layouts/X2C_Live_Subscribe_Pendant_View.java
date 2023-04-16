package com.kuaishou.ax2c.layouts.X2C_Live_Subscribe_Pendant_View;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.kuaishou.live.core.show.subscribe.pendant.LiveSubscribePendantView;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.core.basic.widget.LiveCustomViewFlipper;
import androidx.appcompat.widget.LinearLayoutCompat$LayoutParams;
import cw9.c;
import android.widget.ViewFlipper;

public class X2C_Live_Subscribe_Pendant_View implements IViewCreator	// class@001112
{

    public void X2C_Live_Subscribe_Pendant_View(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       LiveSubscribePendantView liveSubscrib = new LiveSubscribePendantView(p0);
       liveSubscrib.setId(R.id.live_subscribe_pendant_view);
       liveSubscrib.setGravity(17);
       liveSubscrib.setOrientation(1);
       liveSubscrib.setLayoutParams(new ViewGroup$MarginLayoutParams(-2, -2));
       LiveCustomViewFlipper liveCustomVi = new LiveCustomViewFlipper(liveSubscrib.getContext());
       int i = c.b(resources, R.dimen.arg_RES_7f07025c);
       liveCustomVi.setId(R.id.live_subscribe_pendant_flipper);
       liveCustomVi.setLayoutParams(new LinearLayoutCompat$LayoutParams(i, c.b(resources, R.dimen.arg_RES_7f07030d)));
       liveSubscrib.addView(liveCustomVi);
       LinearLayoutCompat linearLayout = new LinearLayoutCompat(liveSubscrib.getContext());
       linearLayout.setId(R.id.live_subscribe_pendant_indicator_layout);
       linearLayout.setLayoutParams(new LinearLayoutCompat$LayoutParams(-2, -2));
       liveSubscrib.addView(linearLayout);
       liveSubscrib.onFinishInflate();
       return liveSubscrib;
    }
}
