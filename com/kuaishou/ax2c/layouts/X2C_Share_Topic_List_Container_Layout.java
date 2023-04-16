package com.kuaishou.ax2c.layouts.X2C_Share_Topic_List_Container_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout$LayoutParams;

public class X2C_Share_Topic_List_Container_Layout implements IViewCreator	// class@001131
{

    public void X2C_Share_Topic_List_Container_Layout(){
       super();
    }
    public View createView(Context p0){
       LinearLayout linearLayout = new LinearLayout(p0);
       linearLayout.setId(R.id.implant_panel_container);
       linearLayout.setBackgroundColor(p0.getResources().getColor(R.color.arg_RES_7f06008d));
       linearLayout.setOrientation(1);
       linearLayout.setVisibility(8);
       linearLayout.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       FrameLayout uFrameLayout = new FrameLayout(linearLayout.getContext());
       uFrameLayout.setId(R.id.implant_panel_frame);
       uFrameLayout.setLayoutParams(new LinearLayout$LayoutParams(-1, -1));
       linearLayout.addView(uFrameLayout);
       return linearLayout;
    }
}
