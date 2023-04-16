package com.kuaishou.ax2c.layouts.X2C_Live_Audience_Bottom_Bar_Guide_Gift_View;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveGuideGiftAnimationView;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.kuaishou.ax2c.XmlAttrHostImpl;
import java.lang.Integer;
import com.kuaishou.ax2c.IAttrHost;
import ald.b;

public class X2C_Live_Audience_Bottom_Bar_Guide_Gift_View implements IViewCreator	// class@0010d2
{

    public void X2C_Live_Audience_Bottom_Bar_Guide_Gift_View(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       RelativeLayout relativeLayo = new RelativeLayout(p0);
       relativeLayo.setClipChildren(false);
       relativeLayo.setClipToPadding(false);
       relativeLayo.setLayoutParams(new ViewGroup$MarginLayoutParams(c.b(resources, R.dimen.arg_RES_7f0702fe), c.b(resources, R.dimen.arg_RES_7f0702fe)));
       View view = new View(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(c.b(resources, 0x7f0702fe), c.b(resources, 0x7f0702fe));
       view.setId(R.id.live_bottom_bar_guide_gift_background_view);
       view.setBackgroundResource(R.drawable.arg_RES_7f0810dd);
       layoutParams.addRule(15, -1);
       view.setLayoutParams(layoutParams);
       relativeLayo.addView(view);
       RelativeLayout relativeLayo1 = new RelativeLayout(relativeLayo.getContext());
       relativeLayo1.setId(R.id.live_bottom_bar_guide_gift_container);
       relativeLayo1.setClipChildren(false);
       relativeLayo1.setClipToPadding(false);
       relativeLayo1.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       relativeLayo.addView(relativeLayo1);
       KwaiImageView kwaiImageVie = new KwaiImageView(relativeLayo1.getContext());
       RelativeLayout$LayoutParams layoutParams1 = new RelativeLayout$LayoutParams(c.b(resources, 0x7f0702fe), c.b(resources, 0x7f0702fe));
       kwaiImageVie.setId(R.id.live_bottom_bar_guide_gift_view);
       layoutParams1.addRule(15, -1);
       kwaiImageVie.setScaleType(ImageView$ScaleType.FIT_XY);
       kwaiImageVie.setPadding(c.b(resources, R.dimen.arg_RES_7f07031b), c.b(resources, R.dimen.arg_RES_7f07031b), c.b(resources, R.dimen.arg_RES_7f07031b), c.b(resources, R.dimen.arg_RES_7f07031b));
       kwaiImageVie.setLayoutParams(layoutParams1);
       relativeLayo1.addView(kwaiImageVie);
       LiveGuideGiftAnimationView liveGuideGif = new LiveGuideGiftAnimationView(relativeLayo1.getContext());
       layoutParams = new RelativeLayout$LayoutParams(c.b(resources, 0x7f0705e4), c.b(resources, 0x7f0705e4));
       liveGuideGif.setId(R.id.live_bottom_bar_guide_gift_combo);
       layoutParams.addRule(13, -1);
       liveGuideGif.setVisibility(8);
       liveGuideGif.setTextSize((float)(int)TypedValue.applyDimension(2, 18.00f, c.c(resources)));
       liveGuideGif.setCircleRadius((float)(int)TypedValue.applyDimension(1, 18.00f, c.c(resources)));
       liveGuideGif.setLayoutParams(layoutParams);
       relativeLayo1.addView(liveGuideGif);
       SelectShapeTextView selectShapeT = new SelectShapeTextView(relativeLayo1.getContext());
       layoutParams = new RelativeLayout$LayoutParams(-2, -2);
       selectShapeT.setId(R.id.live_bottom_bar_guide_gift_label);
       layoutParams.addRule(11, -1);
       layoutParams.rightMargin = (int)TypedValue.applyDimension(1, -4.00f, c.c(resources));
       selectShapeT.setGravity(17);
       selectShapeT.setTextColor(resources.getColor(R.color.arg_RES_7f061ff3));
       selectShapeT.setTextSize(false, (float)c.b(resources, R.dimen.arg_RES_7f070356));
       selectShapeT.setVisibility(8);
       selectShapeT.setPadding(c.b(resources, R.dimen.arg_RES_7f07030a), c.b(resources, R.dimen.arg_RES_7f0702ac), c.b(resources, R.dimen.arg_RES_7f07030a), c.b(resources, R.dimen.arg_RES_7f0702ac));
       XmlAttrHostImpl xmlAttrHostI = new XmlAttrHostImpl();
       xmlAttrHostI.addAttr(26, Integer.valueOf(false));
       xmlAttrHostI.addAttr(29, Integer.valueOf(resources.getColor(R.color.arg_RES_7f060d00)));
       XmlAttrHostImpl xmlAttrHostI1 = new XmlAttrHostImpl();
       xmlAttrHostI1.addAttr(2, Integer.valueOf(c.b(resources, R.dimen.arg_RES_7f07042c)));
       IAttrHost[] iAttrHostArr = new IAttrHost[]{xmlAttrHostI,new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),xmlAttrHostI1};
       selectShapeT.setAttrs(iAttrHostArr);
       selectShapeT.setLayoutParams(layoutParams);
       relativeLayo1.addView(selectShapeT);
       return relativeLayo;
    }
}
