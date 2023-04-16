package com.kuaishou.ax2c.layouts.X2C_Live_Play_Right_Pendant_Container_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import android.widget.RelativeLayout$LayoutParams;
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
import android.text.TextUtils$TruncateAt;
import androidx.appcompat.widget.AppCompatTextView;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.kuaishou.ax2c.XmlAttrHostImpl;
import com.kuaishou.ax2c.IAttrHost;
import ald.b;

public class X2C_Live_Play_Right_Pendant_Container_Layout implements IViewCreator	// class@00110c
{

    public void X2C_Live_Play_Right_Pendant_Container_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       LivePkShimmerLayout livePkShimme = new LivePkShimmerLayout(p0);
       livePkShimme.setId(R.id.live_right_pendant_container);
       livePkShimme.setBackgroundResource(R.drawable.arg_RES_7f081485);
       livePkShimme.setClipChildren(false);
       livePkShimme.setClipToPadding(false);
       livePkShimme.setGravity(16);
       livePkShimme.setOrientation(false);
       livePkShimme.setVisibility(false);
       livePkShimme.setRotateAngle(30);
       livePkShimme.setShimmerBottomLeftRadius(c.b(resources, R.dimen.arg_RES_7f07027a));
       livePkShimme.setShimmerTopLeftRadius(c.b(resources, R.dimen.arg_RES_7f07027a));
       livePkShimme.setLayoutParams(new RelativeLayout$LayoutParams(-2, c.b(resources, R.dimen.arg_RES_7f0708a3)));
       KwaiImageView kwaiImageVie = new KwaiImageView(livePkShimme.getContext());
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(c.b(resources, 0x7f0708a3), c.b(resources, 0x7f0708a3));
       kwaiImageVie.setId(R.id.live_side_bar_pendant_left_icon_view);
       layoutParams.leftMargin = c.b(resources, 0x7f0702e3);
       kwaiImageVie.setImageResource(R.drawable.arg_RES_7f081483);
       kwaiImageVie.setVisibility(8);
       kwaiImageVie.setLayoutParams(layoutParams);
       livePkShimme.addView(kwaiImageVie);
       LiveLottieAnimationView liveLottieAn = new LiveLottieAnimationView(livePkShimme.getContext());
       layoutParams = new LinearLayout$LayoutParams(c.b(resources, 0x7f0702be), c.b(resources, 0x7f0702be));
       liveLottieAn.setId(R.id.live_side_bar_pendant_left_icon_image_view);
       layoutParams.leftMargin = c.b(resources, 0x7f0702e3);
       liveLottieAn.setImageResource(R.drawable.arg_RES_7f081483);
       liveLottieAn.setVisibility(8);
       liveLottieAn.setLayoutParams(layoutParams);
       livePkShimme.addView(liveLottieAn);
       SelectShapeTextView selectShapeT = new SelectShapeTextView(livePkShimme.getContext());
       selectShapeT.setId(R.id.live_side_bar_pendant_text_view);
       selectShapeT.setCompoundDrawablePadding(c.b(resources, R.dimen.arg_RES_7f0702e3));
       selectShapeT.setEllipsize(TextUtils$TruncateAt.END);
       selectShapeT.setGravity(17);
       selectShapeT.setMaxLines(1);
       selectShapeT.setText(R.string.arg_RES_7f101f02);
       selectShapeT.setTextColor(resources.getColor(R.color.arg_RES_7f061fda));
       selectShapeT.setTextSize(1, 12.00f);
       selectShapeT.setCompoundDrawablesWithIntrinsicBounds(null, null, ContextCompat.getDrawable(p0, R.drawable.arg_RES_7f0813cb), null);
       int i = c.b(resources, R.dimen.arg_RES_7f07025d);
       selectShapeT.setPadding(false, false, i, c.b(resources, R.dimen.arg_RES_7f0702ac));
       IAttrHost[] iAttrHostArr = new IAttrHost[]{new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl()};
       selectShapeT.setAttrs(iAttrHostArr);
       selectShapeT.setLayoutParams(new LinearLayout$LayoutParams(-2, c.b(resources, R.dimen.arg_RES_7f0708a3)));
       livePkShimme.addView(selectShapeT);
       return livePkShimme;
    }
}
