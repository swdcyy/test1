package com.kuaishou.ax2c.layouts.X2C_Live_Audience_Basic_Play_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.kuaishou.live.core.show.perf.LivePlayRootViewRelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.kuaishou.ax2c.layouts.X2C_Live_Audience_Loading_View_Container;
import cw9.c;

public class X2C_Live_Audience_Basic_Play_Layout implements IViewCreator	// class@0010cd
{

    public void X2C_Live_Audience_Basic_Play_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       LivePlayRootViewRelativeLayout livePlayRoot = new LivePlayRootViewRelativeLayout(p0);
       livePlayRoot.setId(R.id.live_play_root_container);
       livePlayRoot.setClipChildren(false);
       livePlayRoot.setClipToPadding(false);
       livePlayRoot.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       KwaiImageView kwaiImageVie = new KwaiImageView(livePlayRoot.getContext());
       kwaiImageVie.setId(R.id.bg_view);
       kwaiImageVie.setScaleType(ImageView$ScaleType.CENTER_CROP);
       kwaiImageVie.setVisibility(8);
       kwaiImageVie.setForegroundDrawable(new ColorDrawable(resources.getColor(R.color.arg_RES_7f060c93)));
       kwaiImageVie.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       livePlayRoot.addView(kwaiImageVie);
       ViewStub viewStub = new ViewStub(livePlayRoot.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.live_landscape_stream_atmosphere_background_view_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d0c44);
       viewStub.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       livePlayRoot.addView(viewStub);
       FrameLayout uFrameLayout = new FrameLayout(livePlayRoot.getContext());
       uFrameLayout.setId(R.id.voice_party_background);
       uFrameLayout.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       livePlayRoot.addView(uFrameLayout);
       RelativeLayout relativeLayo = new RelativeLayout(livePlayRoot.getContext());
       relativeLayo.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       livePlayRoot.addView(relativeLayo);
       View view = new View(relativeLayo.getContext());
       view.setId(R.id.live_multi_interact_container_background);
       view.setBackgroundColor(resources.getColor(R.color.arg_RES_7f060182));
       view.setVisibility(8);
       view.setLayoutParams(new RelativeLayout$LayoutParams(-1, -2));
       relativeLayo.addView(view);
       ViewStub viewStub1 = new ViewStub(relativeLayo.getContext());
       viewStub1.setInflatedId(-1);
       viewStub1.setId(R.id.live_audience_play_view_stub);
       viewStub1.setLayoutResource(R.layout.arg_RES_7f0d0a40);
       viewStub1.setLayoutParams(new RelativeLayout$LayoutParams(-2, -2));
       relativeLayo.addView(viewStub1);
       View view1 = new X2C_Live_Audience_Loading_View_Container().createView(livePlayRoot.getContext());
       view1.setLayoutParams(view1.getLayoutParams());
       livePlayRoot.addView(view1);
       view1 = new View(livePlayRoot.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-1, c.b(resources, 0x7f07025f));
       view1.setId(R.id.slide_top_shadow);
       layoutParams.addRule(10, -1);
       view1.setVisibility(8);
       view1.setLayoutParams(layoutParams);
       livePlayRoot.addView(view1);
       viewStub = new ViewStub(livePlayRoot.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.live_debug_info_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d07ef);
       viewStub.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       livePlayRoot.addView(viewStub);
       relativeLayo = new RelativeLayout(livePlayRoot.getContext());
       relativeLayo.setId(R.id.live_biz_container);
       relativeLayo.setClipChildren(false);
       relativeLayo.setClipToPadding(false);
       relativeLayo.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       livePlayRoot.addView(relativeLayo);
       viewStub = new ViewStub(livePlayRoot.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.live_play_front_loading_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d0d17);
       viewStub.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       livePlayRoot.addView(viewStub);
       return livePlayRoot;
    }
}
