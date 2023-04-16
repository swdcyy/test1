package com.kuaishou.ax2c.layouts.X2C_Live_Lite_Comment_Item_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;

public class X2C_Live_Lite_Comment_Item_Layout implements IViewCreator	// class@0010ec
{

    public void X2C_Live_Lite_Comment_Item_Layout(){
       super();
    }
    public View createView(Context p0){
       p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setId(R.id.live_lite_comment_item_container);
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -2));
       return uFrameLayout;
    }
}
