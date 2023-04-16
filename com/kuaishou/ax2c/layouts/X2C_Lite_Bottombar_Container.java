package com.kuaishou.ax2c.layouts.X2C_Lite_Bottombar_Container;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import android.view.ViewGroup$LayoutParams;

public class X2C_Lite_Bottombar_Container implements IViewCreator	// class@0010ba
{

    public void X2C_Lite_Bottombar_Container(){
       super();
    }
    public View createView(Context p0){
       LinearLayout linearLayout = new LinearLayout(p0);
       linearLayout.setId(R.id.live_lite_bottom_container_view);
       linearLayout.setShowDividers(2);
       linearLayout.setClipChildren(false);
       linearLayout.setDividerDrawable(ContextCompat.getDrawable(p0, R.drawable.arg_RES_7f081094));
       linearLayout.setOrientation(false);
       linearLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, c.b(p0.getResources(), R.dimen.arg_RES_7f07030d)));
       return linearLayout;
    }
}
