package com.kuaishou.ax2c.layouts.X2C_Lite_Anchor_Info_Area_Container;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.lite.anchorinfo.widget.LiteAnchorInfoRootLayout;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.LinearLayout;
import cw9.c;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;

public class X2C_Lite_Anchor_Info_Area_Container implements IViewCreator	// class@0010b8
{

    public void X2C_Lite_Anchor_Info_Area_Container(){
       super();
    }
    public View createView(Context p0){
       RelativeLayout relativeLayo = new RelativeLayout(p0);
       relativeLayo.setId(R.id.lite_anchor_info_container_view);
       relativeLayo.setClipChildren(false);
       relativeLayo.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -2));
       LiteAnchorInfoRootLayout liteAnchorIn = new LiteAnchorInfoRootLayout(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-2, -2);
       liteAnchorIn.setGravity(16);
       liteAnchorIn.setId(R.id.lite_anchor_info_left_container);
       layoutParams.addRule(16, R.id.lite_anchor_info_right_container);
       layoutParams.setMarginEnd(c.b(p0.getResources(), R.dimen.arg_RES_7f07034b));
       layoutParams.addRule(15, -1);
       layoutParams.addRule(20, -1);
       liteAnchorIn.setShowDividers(2);
       liteAnchorIn.setDividerDrawable(ContextCompat.getDrawable(p0, R.drawable.arg_RES_7f081092));
       liteAnchorIn.setLayoutParams(layoutParams);
       relativeLayo.addView(liteAnchorIn);
       LinearLayout linearLayout = new LinearLayout(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams1 = new RelativeLayout$LayoutParams(-2, -2);
       linearLayout.setGravity(21);
       linearLayout.setId(R.id.lite_anchor_info_right_container);
       linearLayout.setOrientation(false);
       layoutParams1.addRule(21, -1);
       layoutParams1.addRule(15, -1);
       linearLayout.setClipChildren(false);
       linearLayout.setLayoutParams(layoutParams1);
       relativeLayo.addView(linearLayout);
       return relativeLayo;
    }
}
