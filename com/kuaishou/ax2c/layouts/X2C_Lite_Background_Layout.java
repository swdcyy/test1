package com.kuaishou.ax2c.layouts.X2C_Lite_Background_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import java.lang.String;
import android.graphics.Color;
import android.view.ViewStub;

public class X2C_Lite_Background_Layout implements IViewCreator	// class@0010b9
{

    public void X2C_Lite_Background_Layout(){
       super();
    }
    public View createView(Context p0){
       RelativeLayout relativeLayo = new RelativeLayout(p0);
       relativeLayo.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       View view = new View(relativeLayo.getContext());
       view.setId(R.id.lite_chat_black_background_image_view);
       view.setBackgroundColor(p0.getResources().getColor(R.color.arg_RES_7f0601a7));
       view.setVisibility(8);
       view.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       relativeLayo.addView(view);
       view = new View(relativeLayo.getContext());
       view.setId(R.id.lite_portrait_background_image_view);
       view.setBackgroundColor(Color.parseColor("#1D1B38"));
       view.setVisibility(8);
       view.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       relativeLayo.addView(view);
       view = new View(relativeLayo.getContext());
       view.setId(R.id.lite_landscape_background_image_view);
       view.setBackgroundColor(Color.parseColor("#1D1B38"));
       view.setVisibility(8);
       view.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       relativeLayo.addView(view);
       ViewStub viewStub = new ViewStub(relativeLayo.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.live_lite_landscape_stream_atmosphere_background_view_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d0c44);
       viewStub.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       relativeLayo.addView(viewStub);
       return relativeLayo;
    }
}
