package com.kuaishou.ax2c.layouts.X2C_Live_Audience_Bottom_Bar_Wish_Light_Gift_Entry_Layout_Container;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.kuaishou.live.core.show.wishlight.spring.view.LiveBottomBarWishLightGiftView;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;

public class X2C_Live_Audience_Bottom_Bar_Wish_Light_Gift_Entry_Layout_Container implements IViewCreator	// class@0010d7
{

    public void X2C_Live_Audience_Bottom_Bar_Wish_Light_Gift_Entry_Layout_Container(){
       super();
    }
    public View createView(Context p0){
       p0.getResources();
       LiveBottomBarWishLightGiftView liveBottomBa = new LiveBottomBarWishLightGiftView(p0);
       liveBottomBa.setLayoutParams(new ViewGroup$MarginLayoutParams(-2, -2));
       return liveBottomBa;
    }
}
