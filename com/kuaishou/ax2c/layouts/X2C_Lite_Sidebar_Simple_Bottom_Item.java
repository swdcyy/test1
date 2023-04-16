package com.kuaishou.ax2c.layouts.X2C_Lite_Sidebar_Simple_Bottom_Item;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.kuaishou.live.common.core.basic.widget.LivePressAlphaRelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.widget.ImageView$ScaleType;

public class X2C_Lite_Sidebar_Simple_Bottom_Item implements IViewCreator	// class@0010c5
{

    public void X2C_Lite_Sidebar_Simple_Bottom_Item(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       LivePressAlphaRelativeLayout livePressAlp = new LivePressAlphaRelativeLayout(p0);
       livePressAlp.setLayoutParams(new ViewGroup$MarginLayoutParams(c.b(resources, R.dimen.arg_RES_7f07030d), c.b(resources, R.dimen.arg_RES_7f070319)));
       RelativeLayout relativeLayo = new RelativeLayout(livePressAlp.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(c.b(resources, 0x7f07030d), c.b(resources, 0x7f07030d));
       relativeLayo.setId(R.id.live_sidebar_simple_bottom_item);
       layoutParams.addRule(12, -1);
       relativeLayo.setClipChildren(false);
       relativeLayo.setClipToPadding(false);
       relativeLayo.setLayoutParams(layoutParams);
       livePressAlp.addView(relativeLayo);
       KwaiImageView kwaiImageVie = new KwaiImageView(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams1 = new RelativeLayout$LayoutParams(c.b(resources, 0x7f0702df), c.b(resources, 0x7f0702df));
       kwaiImageVie.setId(R.id.live_sidebar_simple_bottom_item_icon);
       layoutParams1.addRule(13, -1);
       kwaiImageVie.getHierarchy().x(false);
       kwaiImageVie.setLayoutParams(layoutParams1);
       relativeLayo.addView(kwaiImageVie);
       KwaiImageView kwaiImageVie1 = new KwaiImageView(livePressAlp.getContext());
       int i = c.b(resources, R.dimen.arg_RES_7f07030d);
       layoutParams = new RelativeLayout$LayoutParams(i, c.b(resources, 0x7f07030d));
       kwaiImageVie1.setId(R.id.live_sidebar_simple_bottom_item_default_icon_view);
       layoutParams.addRule(12, -1);
       layoutParams.addRule(14, -1);
       kwaiImageVie1.setBackgroundResource(R.drawable.arg_RES_7f08131e);
       kwaiImageVie1.setScaleType(ImageView$ScaleType.FIT_XY);
       kwaiImageVie1.setVisibility(8);
       kwaiImageVie1.getHierarchy().x(false);
       kwaiImageVie1.setLayoutParams(layoutParams);
       livePressAlp.addView(kwaiImageVie1);
       return livePressAlp;
    }
}
