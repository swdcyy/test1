package com.kuaishou.ax2c.layouts.X2C_Live_Play_New_Right_Pendant_Container_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.widget.LinearLayout;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.LinearLayout$LayoutParams;
import android.widget.ImageView;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import androidx.appcompat.widget.AppCompatTextView;
import android.text.TextUtils$TruncateAt;
import androidx.core.content.ContextCompat;
import com.kuaishou.ax2c.XmlAttrHostImpl;
import com.kuaishou.ax2c.IAttrHost;
import ald.b;

public class X2C_Live_Play_New_Right_Pendant_Container_Layout implements IViewCreator	// class@00110a
{

    public void X2C_Live_Play_New_Right_Pendant_Container_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       LivePkShimmerLayout livePkShimme = new LivePkShimmerLayout(p0);
       livePkShimme.setId(R.id.live_right_pendant_container);
       livePkShimme.setBackgroundResource(R.drawable.arg_RES_7f0813b0);
       livePkShimme.setClipChildren(false);
       livePkShimme.setClipToPadding(false);
       livePkShimme.setGravity(16);
       livePkShimme.setOrientation(false);
       livePkShimme.setVisibility(false);
       livePkShimme.setRotateAngle(30);
       livePkShimme.setShimmerBottomLeftRadius(c.b(resources, R.dimen.arg_RES_7f07027a));
       livePkShimme.setShimmerTopLeftRadius(c.b(resources, R.dimen.arg_RES_7f07027a));
       livePkShimme.setLayoutParams(new ViewGroup$MarginLayoutParams(-2, c.b(resources, R.dimen.arg_RES_7f0708a3)));
       KwaiImageView kwaiImageVie = new KwaiImageView(livePkShimme.getContext());
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(c.b(resources, 0x7f0708a3), c.b(resources, 0x7f0708a3));
       kwaiImageVie.setId(R.id.live_side_bar_pendant_left_icon_view);
       layoutParams.leftMargin = c.b(resources, 0x7f0702e3);
       int i = 0x7f081483;
       kwaiImageVie.setImageResource(i);
       int i1 = 8;
       kwaiImageVie.setVisibility(i1);
       kwaiImageVie.setLayoutParams(layoutParams);
       livePkShimme.addView(kwaiImageVie);
       LiveLottieAnimationView liveLottieAn = new LiveLottieAnimationView(livePkShimme.getContext());
       layoutParams = new LinearLayout$LayoutParams(c.b(resources, 0x7f0708a3), c.b(resources, 0x7f0708a3));
       liveLottieAn.setId(R.id.live_side_bar_pendant_left_icon_image_view);
       layoutParams.leftMargin = c.b(resources, 0x7f0702e3);
       liveLottieAn.setImageResource(i);
       liveLottieAn.setVisibility(i1);
       liveLottieAn.setLayoutParams(layoutParams);
       livePkShimme.addView(liveLottieAn);
       SelectShapeTextView selectShapeT = new SelectShapeTextView(livePkShimme.getContext());
       layoutParams = new LinearLayout$LayoutParams(-2, c.b(resources, 0x7f0708a3));
       selectShapeT.setId(R.id.live_side_bar_pendant_text_view);
       Drawable[] compoundDraw = selectShapeT.getCompoundDrawables();
       int i2 = 0;
       object oobject = 4;
       while (i2 < oobject) {
          if (compoundDraw[i2] != null) {
             compoundDraw[i2] = a.r(compoundDraw[i2]);
             a.n(compoundDraw[i2].mutate(), resources.getColor(R.color.arg_RES_7f060801));
          }
          i2 = i2 + 1;
       }
       selectShapeT.setCompoundDrawablesWithIntrinsicBounds(compoundDraw[0], compoundDraw[1], compoundDraw[2], compoundDraw[3]);
       selectShapeT.setEllipsize(TextUtils$TruncateAt.END);
       selectShapeT.setGravity(17);
       selectShapeT.setMaxLines(1);
       selectShapeT.setText(R.string.arg_RES_7f101f02);
       selectShapeT.setTextColor(resources.getColor(R.color.arg_RES_7f060874));
       selectShapeT.setTextSize(1, 12.00f);
       selectShapeT.setCompoundDrawablesWithIntrinsicBounds(null, null, ContextCompat.getDrawable(p0, R.drawable.arg_RES_7f08134b), null);
       selectShapeT.setPadding(false, false, c.b(resources, R.dimen.pv), false);
       IAttrHost[] iAttrHostArr = new IAttrHost[]{new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl()};
       selectShapeT.setAttrs(iAttrHostArr);
       selectShapeT.setLayoutParams(layoutParams);
       livePkShimme.addView(selectShapeT);
       return livePkShimme;
    }
}
