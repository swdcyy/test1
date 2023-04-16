package com.kuaishou.ax2c.layouts.X2C_Live_Audience_Left_Top_Pendant_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.ax2c.layouts.X2C_Live_Guest_Activity_Top_List_Pendant_Layout;
import android.widget.LinearLayout$LayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.view.ViewStub;

public class X2C_Live_Audience_Left_Top_Pendant_Layout implements IViewCreator	// class@0010da
{

    public void X2C_Live_Audience_Left_Top_Pendant_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       LinearLayout linearLayout = new LinearLayout(p0);
       linearLayout.setId(R.id.live_left_top_pendant);
       linearLayout.setOrientation(1);
       linearLayout.setLayoutParams(new RelativeLayout$LayoutParams(-2, -2));
       View view = new X2C_Live_Guest_Activity_Top_List_Pendant_Layout().createView(linearLayout.getContext());
       view.setId(R.id.live_guest_activity_top_list_pendant_container);
       view.setLayoutParams(view.getLayoutParams());
       linearLayout.addView(view);
       LinearLayout linearLayout1 = new LinearLayout(linearLayout.getContext());
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -2);
       linearLayout1.setId(R.id.live_left_top_pendant_horizontal_bar);
       layoutParams.bottomMargin = (int)TypedValue.applyDimension(1, 8.00f, c.c(resources));
       layoutParams.leftMargin = c.b(resources, 0x7f0708f7);
       linearLayout1.setOrientation(0);
       linearLayout1.setLayoutParams(layoutParams);
       linearLayout.addView(linearLayout1);
       ViewStub viewStub = new ViewStub(linearLayout1.getContext());
       viewStub.setInflatedId(-1);
       LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(-2, c.b(resources, 0x7f0702d2));
       viewStub.setId(R.id.live_hourly_rank_pendant_view_stub);
       layoutParams1.rightMargin = c.b(resources, 0x7f07034b);
       viewStub.setInflatedId(R.id.live_hourly_rank_pendant_container);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d0c37);
       viewStub.setLayoutParams(layoutParams1);
       linearLayout1.addView(viewStub);
       viewStub = new ViewStub(linearLayout1.getContext());
       viewStub.setInflatedId(-1);
       layoutParams1 = new LinearLayout$LayoutParams(-2, c.b(resources, 0x7f0702d2));
       viewStub.setId(R.id.live_merchant_hourly_rank_pendant_view_stub);
       layoutParams1.setMarginEnd(c.b(resources, R.dimen.arg_RES_7f070334));
       viewStub.setInflatedId(R.id.live_district_rank_pendant_view);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d0c2d);
       viewStub.setLayoutParams(layoutParams1);
       linearLayout1.addView(viewStub);
       ViewStub viewStub1 = new ViewStub(linearLayout1.getContext());
       viewStub1.setInflatedId(-1);
       viewStub1.setId(R.id.live_wish_list_pendant_container_view_stub);
       viewStub1.setInflatedId(R.id.live_wish_list_pendant_container);
       viewStub1.setLayoutResource(R.layout.arg_RES_7f0d0e90);
       viewStub1.setLayoutParams(new LinearLayout$LayoutParams(-2, -2));
       linearLayout1.addView(viewStub1);
       return linearLayout;
    }
}
