package com.kuaishou.ax2c.layouts.X2C_Live_Audience_Basic_Play_Layout_Perf;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.FrameLayout$LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewStub;
import com.kuaishou.ax2c.layouts.X2C_Live_Voice_Party_Bg_Layout_Perf;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout$LayoutParams;
import com.kuaishou.ax2c.layouts.X2C_Live_Audience_Loading_View_Container_Perf;
import cw9.c;

public class X2C_Live_Audience_Basic_Play_Layout_Perf implements IViewCreator	// class@0010ce
{

    public void X2C_Live_Audience_Basic_Play_Layout_Perf(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setId(R.id.live_play_root_container);
       uFrameLayout.setClipChildren(false);
       uFrameLayout.setClipToPadding(false);
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       KwaiImageView kwaiImageVie = new KwaiImageView(uFrameLayout.getContext());
       kwaiImageVie.setId(R.id.bg_view);
       kwaiImageVie.setScaleType(ImageView$ScaleType.CENTER_CROP);
       kwaiImageVie.setVisibility(8);
       kwaiImageVie.setForegroundDrawable(new ColorDrawable(resources.getColor(R.color.arg_RES_7f060c93)));
       kwaiImageVie.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(kwaiImageVie);
       ViewStub viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.live_landscape_stream_atmosphere_background_view_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d0c44);
       viewStub.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(viewStub);
       View view = new X2C_Live_Voice_Party_Bg_Layout_Perf().createView(uFrameLayout.getContext());
       view.setLayoutParams(view.getLayoutParams());
       uFrameLayout.addView(view);
       RelativeLayout relativeLayo = new RelativeLayout(uFrameLayout.getContext());
       relativeLayo.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(relativeLayo);
       View view1 = new View(relativeLayo.getContext());
       view1.setId(R.id.live_multi_interact_container_background);
       view1.setBackgroundColor(resources.getColor(R.color.arg_RES_7f060182));
       view1.setVisibility(8);
       view1.setLayoutParams(new RelativeLayout$LayoutParams(-1, -2));
       relativeLayo.addView(view1);
       ViewStub viewStub1 = new ViewStub(relativeLayo.getContext());
       viewStub1.setInflatedId(-1);
       viewStub1.setId(R.id.live_audience_play_view_stub);
       viewStub1.setLayoutResource(R.layout.arg_RES_7f0d0a40);
       viewStub1.setLayoutParams(new RelativeLayout$LayoutParams(-2, -2));
       relativeLayo.addView(viewStub1);
       view = new X2C_Live_Audience_Loading_View_Container_Perf().createView(uFrameLayout.getContext());
       view.setLayoutParams(view.getLayoutParams());
       uFrameLayout.addView(view);
       view = new View(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, c.b(resources, 0x7f07025f));
       view.setId(R.id.slide_top_shadow);
       layoutParams.gravity = 48;
       view.setVisibility(8);
       view.setLayoutParams(layoutParams);
       uFrameLayout.addView(view);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.live_debug_info_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d07ef);
       viewStub.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(viewStub);
       relativeLayo = new RelativeLayout(uFrameLayout.getContext());
       relativeLayo.setId(R.id.live_biz_container);
       relativeLayo.setClipChildren(false);
       relativeLayo.setClipToPadding(false);
       relativeLayo.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(relativeLayo);
       viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.live_play_front_loading_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d0d17);
       viewStub.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(viewStub);
       return uFrameLayout;
    }
}
