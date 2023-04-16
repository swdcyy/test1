package com.kuaishou.ax2c.layouts.X2C_Live_Multi_Chat_Interactive_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView;
import android.widget.FrameLayout$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup;

public class X2C_Live_Multi_Chat_Interactive_Layout implements IViewCreator	// class@0010ff
{

    public void X2C_Live_Multi_Chat_Interactive_Layout(){
       super();
    }
    public View createView(Context p0){
       p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setId(R.id.live_multi_chat_container_layout);
       uFrameLayout.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       RenderAreaView renderAreaVi = new RenderAreaView(uFrameLayout.getContext());
       renderAreaVi.setId(R.id.live_stage_multi_chat_render_area);
       renderAreaVi.setVisibility(8);
       renderAreaVi.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(renderAreaVi);
       FrameLayout uFrameLayout1 = new FrameLayout(uFrameLayout.getContext());
       uFrameLayout1.setId(R.id.live_multi_chat_render_ui_layout);
       uFrameLayout1.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(uFrameLayout1);
       return uFrameLayout;
    }
}
