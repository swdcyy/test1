package com.kuaishou.ax2c.layouts.X2C_Lite_Sidebar_Simple_Item;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.kuaishou.live.common.core.basic.widget.LivePressAlphaRelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import androidx.appcompat.widget.AppCompatTextView;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import android.graphics.Typeface;

public class X2C_Lite_Sidebar_Simple_Item implements IViewCreator	// class@0010c6
{

    public void X2C_Lite_Sidebar_Simple_Item(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       LivePressAlphaRelativeLayout livePressAlp = new LivePressAlphaRelativeLayout(p0);
       livePressAlp.setMinimumWidth(c.b(resources, R.dimen.arg_RES_7f07032a));
       livePressAlp.setMinimumHeight(c.b(resources, R.dimen.arg_RES_7f070335));
       livePressAlp.setGravity(17);
       livePressAlp.setLayoutParams(new ViewGroup$MarginLayoutParams(c.b(resources, R.dimen.arg_RES_7f07032a), c.b(resources, R.dimen.arg_RES_7f070335)));
       KwaiImageView kwaiImageVie = new KwaiImageView(livePressAlp.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(c.b(resources, 0x7f070325), c.b(resources, 0x7f070325));
       kwaiImageVie.setId(R.id.live_side_bar_simple_item_default_icon_view);
       layoutParams.addRule(14, -1);
       kwaiImageVie.setBackgroundResource(R.drawable.arg_RES_7f081318);
       kwaiImageVie.setScaleType(ImageView$ScaleType.FIT_XY);
       kwaiImageVie.setVisibility(8);
       kwaiImageVie.getHierarchy().x(0);
       kwaiImageVie.setLayoutParams(layoutParams);
       livePressAlp.addView(kwaiImageVie);
       kwaiImageVie = new KwaiImageView(livePressAlp.getContext());
       layoutParams = new RelativeLayout$LayoutParams(c.b(resources, 0x7f070325), c.b(resources, 0x7f070325));
       kwaiImageVie.setId(R.id.live_sidebar_item_icon);
       layoutParams.addRule(14, -1);
       kwaiImageVie.getHierarchy().x(0);
       kwaiImageVie.setLayoutParams(layoutParams);
       livePressAlp.addView(kwaiImageVie);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(livePressAlp.getContext());
       layoutParams = new RelativeLayout$LayoutParams(-2, (int)TypedValue.applyDimension(1, 16.00f, c.c(resources)));
       uAppCompatTe.setId(R.id.live_sidebar_item_text);
       layoutParams.addRule(12, -1);
       layoutParams.addRule(14, -1);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f0620c7));
       uAppCompatTe.setGravity(17);
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070271));
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), uAppCompatTe.getShadowDx(), uAppCompatTe.getShadowDy(), resources.getColor(R.color.arg_RES_7f0601e4));
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), 0x3f800000, uAppCompatTe.getShadowDy(), uAppCompatTe.getShadowColor());
       uAppCompatTe.setShadowLayer(0x3f800000, uAppCompatTe.getShadowDx(), uAppCompatTe.getShadowDy(), uAppCompatTe.getShadowColor());
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), uAppCompatTe.getShadowDx(), 0x3f800000, uAppCompatTe.getShadowColor());
       uAppCompatTe.setTypeface(null, 1);
       layoutParams.bottomMargin = c.b(resources, 0x7f070334);
       uAppCompatTe.setLayoutParams(layoutParams);
       livePressAlp.addView(uAppCompatTe);
       return livePressAlp;
    }
}
