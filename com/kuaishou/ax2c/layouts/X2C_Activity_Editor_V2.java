package com.kuaishou.ax2c.layouts.X2C_Activity_Editor_V2;
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
import com.kuaishou.ax2c.layouts.X2C_Edit_Tab_Container_Layout;
import com.kuaishou.ax2c.layouts.X2C_Kwai_Title_Edit;
import com.kwai.feature.post.api.flywheel.widget.FlyWheelFrameLayout;
import cw9.c;

public class X2C_Activity_Editor_V2 implements IViewCreator	// class@001087
{

    public void X2C_Activity_Editor_V2(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       RelativeLayout relativeLayo = new RelativeLayout(p0);
       relativeLayo.setId(R.id.editor_activity_root);
       relativeLayo.setBackgroundColor(resources.getColor(R.color.arg_RES_7f0600a6));
       relativeLayo.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       FrameLayout uFrameLayout = new FrameLayout(relativeLayo.getContext());
       uFrameLayout.setId(R.id.container_all);
       uFrameLayout.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       relativeLayo.addView(uFrameLayout);
       View view = new X2C_Edit_Tab_Container_Layout().createView(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams = view.getLayoutParams();
       view.setId(R.id.edit_tab_container);
       layoutParams.addRule(12, -1);
       view.setLayoutParams(layoutParams);
       relativeLayo.addView(view);
       view = new X2C_Kwai_Title_Edit().createView(relativeLayo.getContext());
       view.setId(R.id.title_root);
       view.setLayoutParams(view.getLayoutParams());
       relativeLayo.addView(view);
       FlyWheelFrameLayout uFlyWheelFra = new FlyWheelFrameLayout(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(-1, -1);
       uFlyWheelFra.setId(R.id.edit_guide_floating_view);
       layoutParams.addRule(3, R.id.title_root);
       layoutParams.addRule(12, -1);
       uFlyWheelFra.setTKContainerId(R.id.edit_guide_floating_view);
       uFlyWheelFra.setLayoutParams(layoutParams);
       relativeLayo.addView(uFlyWheelFra);
       view = new View(relativeLayo.getContext());
       view.setId(R.id.edit_player_mask_view);
       view.setBackgroundColor(resources.getColor(R.color.arg_RES_7f06019f));
       view.setVisibility(8);
       view.setLayoutParams(new RelativeLayout$LayoutParams(-1, c.b(resources, R.dimen.arg_RES_7f07053d)));
       relativeLayo.addView(view);
       return relativeLayo;
    }
}
