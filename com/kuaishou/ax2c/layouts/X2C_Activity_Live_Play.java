package com.kuaishou.ax2c.layouts.X2C_Activity_Live_Play;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import com.kuaishou.ax2c.layouts.X2C_Live_Play_Side_Bar_Container_Layout;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;

public class X2C_Activity_Live_Play implements IViewCreator	// class@001088
{

    public void X2C_Activity_Live_Play(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setId(R.id.live_play_root_layout);
       uFrameLayout.setBackgroundColor(resources.getColor(R.color.arg_RES_7f06076b));
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       FrameLayout uFrameLayout1 = new FrameLayout(uFrameLayout.getContext());
       uFrameLayout1.setId(R.id.fragment_container);
       uFrameLayout1.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(uFrameLayout1);
       LinearLayout linearLayout = new LinearLayout(uFrameLayout.getContext());
       linearLayout.setId(R.id.top_bar);
       linearLayout.setGravity(21);
       linearLayout.setOrientation(0);
       linearLayout.setLayoutParams(new FrameLayout$LayoutParams(-1, (int)TypedValue.applyDimension(1, 58.00f, c.c(resources))));
       uFrameLayout.addView(linearLayout);
       View view = new X2C_Live_Play_Side_Bar_Container_Layout().createView(uFrameLayout.getContext());
       view.setLayoutParams(view.getLayoutParams());
       uFrameLayout.addView(view);
       AppCompatImageView uAppCompatIm = new AppCompatImageView(uFrameLayout.getContext());
       uAppCompatIm.setId(R.id.live_play_activity_loading_view);
       uAppCompatIm.setScaleType(ImageView$ScaleType.FIT_XY);
       uAppCompatIm.setImageResource(R.drawable.arg_RES_7f0813e1);
       uAppCompatIm.setVisibility(8);
       uAppCompatIm.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(uAppCompatIm);
       return uFrameLayout;
    }
}
