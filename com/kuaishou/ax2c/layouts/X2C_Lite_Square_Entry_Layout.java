package com.kuaishou.ax2c.layouts.X2C_Lite_Square_Entry_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import android.widget.FrameLayout$LayoutParams;
import cw9.c;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.LinearLayout$LayoutParams;
import android.widget.ImageView;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.facebook.drawee.generic.RoundingParams;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatTextView;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import com.kuaishou.ax2c.XmlAttrHostImpl;
import com.kuaishou.ax2c.IAttrHost;
import ald.b;

public class X2C_Lite_Square_Entry_Layout implements IViewCreator	// class@0010c7
{

    public void X2C_Lite_Square_Entry_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-2, -2));
       LivePkShimmerLayout livePkShimme = new LivePkShimmerLayout(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, c.b(resources, 0x7f0708a3));
       livePkShimme.setId(R.id.live_right_pendant_container);
       layoutParams.gravity = 21;
       livePkShimme.setBackgroundResource(R.drawable.arg_RES_7f08109c);
       livePkShimme.setClipChildren(false);
       livePkShimme.setClipToPadding(false);
       livePkShimme.setGravity(16);
       livePkShimme.setOrientation(false);
       livePkShimme.setVisibility(false);
       livePkShimme.setRotateAngle(30);
       livePkShimme.setShimmerBottomLeftRadius(c.b(resources, R.dimen.arg_RES_7f07025d));
       livePkShimme.setShimmerTopLeftRadius(c.b(resources, R.dimen.arg_RES_7f07025d));
       livePkShimme.setShimmerBottomRightRadius(c.b(resources, R.dimen.arg_RES_7f07025d));
       livePkShimme.setShimmerTopRightRadius(c.b(resources, R.dimen.arg_RES_7f07025d));
       livePkShimme.setLayoutParams(layoutParams);
       uFrameLayout.addView(livePkShimme);
       KwaiImageView kwaiImageVie = new KwaiImageView(livePkShimme.getContext());
       LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(c.b(resources, 0x7f070295), c.b(resources, 0x7f070295));
       kwaiImageVie.setId(R.id.live_side_bar_pendant_left_icon_view);
       int i = 0x7f07031b;
       layoutParams1.leftMargin = c.b(resources, i);
       layoutParams1.rightMargin = (int)TypedValue.applyDimension(1, 2.00f, c.c(resources));
       int i1 = 0x7f081483;
       kwaiImageVie.setImageResource(i1);
       int i2 = 8;
       kwaiImageVie.setVisibility(i2);
       kwaiImageVie.getHierarchy().L(RoundingParams.a());
       kwaiImageVie.setLayoutParams(layoutParams1);
       livePkShimme.addView(kwaiImageVie);
       LiveLottieAnimationView liveLottieAn = new LiveLottieAnimationView(livePkShimme.getContext());
       layoutParams1 = new LinearLayout$LayoutParams(c.b(resources, 0x7f070295), c.b(resources, 0x7f070295));
       liveLottieAn.setId(R.id.live_side_bar_pendant_left_icon_image_view);
       layoutParams1.leftMargin = c.b(resources, i);
       layoutParams1.rightMargin = c.b(resources, 0x7f0702e3);
       liveLottieAn.setImageResource(i1);
       liveLottieAn.setVisibility(i2);
       liveLottieAn.setLayoutParams(layoutParams1);
       livePkShimme.addView(liveLottieAn);
       SelectShapeTextView selectShapeT = new SelectShapeTextView(livePkShimme.getContext());
       layoutParams1 = new LinearLayout$LayoutParams(-2, c.b(resources, 0x7f0708a3));
       selectShapeT.setId(R.id.live_side_bar_pendant_text_view);
       selectShapeT.setEllipsize(TextUtils$TruncateAt.END);
       selectShapeT.setGravity(17);
       selectShapeT.setMaxLines(1);
       selectShapeT.setText("¸ü¶àÖ±²¥");
       selectShapeT.setTextColor(resources.getColor(R.color.arg_RES_7f060874));
       selectShapeT.setTextSize(1, 12.00f);
       Drawable[] compoundDraw = selectShapeT.getCompoundDrawables();
       int i3 = 0;
       object oobject = 4;
       while (i3 < oobject) {
          if (compoundDraw[i3] != null) {
             compoundDraw[i3] = a.r(compoundDraw[i3]);
             a.n(compoundDraw[i3].mutate(), resources.getColor(R.color.arg_RES_7f060801));
          }
          i3 = i3 + 1;
       }
       selectShapeT.setCompoundDrawablesWithIntrinsicBounds(compoundDraw[0], compoundDraw[1], compoundDraw[2], compoundDraw[3]);
       selectShapeT.setPadding(false, false, c.b(resources, R.dimen.arg_RES_7f070334), false);
       IAttrHost[] iAttrHostArr = new IAttrHost[]{new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl()};
       selectShapeT.setAttrs(iAttrHostArr);
       selectShapeT.setLayoutParams(layoutParams1);
       livePkShimme.addView(selectShapeT);
       return uFrameLayout;
    }
}
