package com.kuaishou.ax2c.layouts.X2C_Camera_Container_Activity_V2;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.yxcorp.gifshow.camera.record.widget.CameraRootFrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewStub;
import android.widget.RelativeLayout$LayoutParams;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.camera.record.widget.AdjustableCameraView;
import com.kuaishou.ax2c.layouts.X2C_Camera_Scale_Layout;
import cw9.c;
import com.kuaishou.ax2c.layouts.X2C_Camera_Scroll_Tab_With_Indicator_Layout;

public class X2C_Camera_Container_Activity_V2 implements IViewCreator	// class@001093
{

    public void X2C_Camera_Container_Activity_V2(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       CameraRootFrameLayout uCameraRootF = new CameraRootFrameLayout(p0);
       uCameraRootF.setId(R.id.root_layout);
       uCameraRootF.setBackgroundColor(resources.getColor(R.color.arg_RES_7f060073));
       uCameraRootF.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       RelativeLayout relativeLayo = new RelativeLayout(uCameraRootF.getContext());
       relativeLayo.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uCameraRootF.addView(relativeLayo);
       ViewStub viewStub = new ViewStub(relativeLayo.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.background_sample_video_view);
       viewStub.setBackgroundDrawable(null);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d164a);
       viewStub.setLayoutParams(new RelativeLayout$LayoutParams(-1, -2));
       relativeLayo.addView(viewStub);
       AdjustableCameraView uAdjustableC = new AdjustableCameraView(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-1, -2);
       uAdjustableC.setId(R.id.camera_preview_layout);
       layoutParams.addRule(14, -1);
       uAdjustableC.setClipChildren(false);
       uAdjustableC.setLayoutParams(layoutParams);
       relativeLayo.addView(uAdjustableC);
       uAdjustableC.onFinishInflate();
       View view = new X2C_Camera_Scale_Layout().createView(uCameraRootF.getContext());
       view.setLayoutParams(view.getLayoutParams());
       uCameraRootF.addView(view);
       FrameLayout uFrameLayout = new FrameLayout(uCameraRootF.getContext());
       uFrameLayout.setId(R.id.container_layout);
       uFrameLayout.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uCameraRootF.addView(uFrameLayout);
       ViewStub viewStub1 = new ViewStub(uCameraRootF.getContext());
       viewStub1.setInflatedId(-1);
       FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams(-1, c.b(resources, 0x7f070141));
       viewStub1.setId(R.id.camera_scroll_snapshot_tab_stub);
       layoutParams1.gravity = 81;
       layoutParams1.bottomMargin = c.b(resources, 0x7f070145);
       viewStub1.setInflatedId(R.id.camera_scroll_snapshot_tab_container);
       viewStub1.setLayoutResource(R.layout.arg_RES_7f0d019b);
       viewStub1.setLayoutParams(layoutParams1);
       uCameraRootF.addView(viewStub1);
       view = new X2C_Camera_Scroll_Tab_With_Indicator_Layout().createView(uCameraRootF.getContext());
       FrameLayout$LayoutParams layoutParams2 = view.getLayoutParams();
       layoutParams2.gravity = 80;
       view.setLayoutParams(layoutParams2);
       uCameraRootF.addView(view);
       uFrameLayout = new FrameLayout(uCameraRootF.getContext());
       uFrameLayout.setId(R.id.full_screen_fragment_container);
       uFrameLayout.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uCameraRootF.addView(uFrameLayout);
       viewStub1 = new ViewStub(uCameraRootF.getContext());
       viewStub1.setInflatedId(-1);
       layoutParams2 = new FrameLayout$LayoutParams(-1, -1);
       viewStub1.setId(R.id.snapshot_guide_background_stub);
       layoutParams2.gravity = 17;
       viewStub1.setLayoutResource(R.layout.arg_RES_7f0d155d);
       viewStub1.setLayoutParams(layoutParams2);
       uCameraRootF.addView(viewStub1);
       uFrameLayout = new FrameLayout(uCameraRootF.getContext());
       layoutParams2 = new FrameLayout$LayoutParams(-1, -2);
       uFrameLayout.setId(R.id.music_panel_container);
       layoutParams2.gravity = 80;
       uFrameLayout.setLayoutParams(layoutParams2);
       uCameraRootF.addView(uFrameLayout);
       return uCameraRootF;
    }
}
