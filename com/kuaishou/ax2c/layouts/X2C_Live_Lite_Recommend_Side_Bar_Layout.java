package com.kuaishou.ax2c.layouts.X2C_Live_Lite_Recommend_Side_Bar_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.widget.RelativeLayout$LayoutParams;
import cw9.c;

public class X2C_Live_Lite_Recommend_Side_Bar_Layout implements IViewCreator	// class@0010fc
{

    public void X2C_Live_Lite_Recommend_Side_Bar_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       RelativeLayout relativeLayo = new RelativeLayout(p0);
       relativeLayo.setId(R.id.live_lite_recommend_side_bar_layout);
       relativeLayo.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       FrameLayout uFrameLayout = new FrameLayout(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(c.b(resources, 0x7f070591), -1);
       uFrameLayout.setId(R.id.live_lite_recommend_side_bar_content_view);
       layoutParams.addRule(11, -1);
       uFrameLayout.setLayoutParams(layoutParams);
       relativeLayo.addView(uFrameLayout);
       View view = new View(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(-1, c.b(resources, 0x7f070340));
       view.setId(R.id.live_lite_recommend_side_bar_left_empty_placeholder_view);
       layoutParams.addRule(10, -1);
       layoutParams.addRule(0, R.id.live_lite_recommend_side_bar_content_view);
       view.setVisibility(8);
       view.setLayoutParams(layoutParams);
       relativeLayo.addView(view);
       return relativeLayo;
    }
}
