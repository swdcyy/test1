package com.kuaishou.ax2c.layouts.X2C_Lite_Sidebar_Avatar_Item;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.kuaishou.live.lite.util.viewupdater.LiteTouchEventConsumeAwareLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.FrameLayout$LayoutParams;
import cw9.c;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.RelativeLayout$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.facebook.drawee.generic.RoundingParams;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import com.kwai.library.widget.textview.StrokedTextView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.graphics.Typeface;

public class X2C_Lite_Sidebar_Avatar_Item implements IViewCreator	// class@0010c2
{

    public void X2C_Lite_Sidebar_Avatar_Item(){
       super();
    }
    public View createView(Context p0){
       Context uContext = p0;
       Resources resources = p0.getResources();
       LiteTouchEventConsumeAwareLayout liteTouchEve = new LiteTouchEventConsumeAwareLayout(uContext);
       int i = -2;
       liteTouchEve.setLayoutParams(new ViewGroup$MarginLayoutParams(i, i));
       RelativeLayout relativeLayo = new RelativeLayout(liteTouchEve.getContext());
       relativeLayo.setClipChildren(false);
       relativeLayo.setClipToPadding(false);
       relativeLayo.setLayoutParams(new FrameLayout$LayoutParams(c.b(resources, R.dimen.arg_RES_7f07032a), (int)TypedValue.applyDimension(1, 73.00f, c.c(resources))));
       liteTouchEve.addView(relativeLayo);
       RelativeLayout relativeLayo1 = new RelativeLayout(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(c.b(resources, 0x7f07032a), c.b(resources, 0x7f07032a));
       int i1 = 14;
       layoutParams.addRule(i1, -1);
       relativeLayo1.setLayoutParams(layoutParams);
       relativeLayo.addView(relativeLayo1);
       KwaiImageView kwaiImageVie = new KwaiImageView(relativeLayo1.getContext());
       RelativeLayout$LayoutParams layoutParams1 = new RelativeLayout$LayoutParams(c.b(resources, 0x7f070319), c.b(resources, 0x7f070319));
       kwaiImageVie.setId(R.id.live_lite_anchor_avatar_image_view);
       layoutParams1.addRule(13, -1);
       t$b i2 = t$b.i;
       kwaiImageVie.getHierarchy().u(i2);
       kwaiImageVie.getHierarchy().x(false);
       kwaiImageVie.getHierarchy().G(ContextCompat.getDrawable(uContext, R.drawable.detail_avatar_secret), i2);
       kwaiImageVie.getHierarchy().L(RoundingParams.a());
       if (kwaiImageVie.getHierarchy().n() == null) {
          kwaiImageVie.getHierarchy().L(new RoundingParams());
       }
       kwaiImageVie.getHierarchy().n().k(resources.getColor(R.color.arg_RES_7f060874));
       if (kwaiImageVie.getHierarchy().n() == null) {
          kwaiImageVie.getHierarchy().L(new RoundingParams());
       }
       kwaiImageVie.getHierarchy().n().l((float)(int)TypedValue.applyDimension(1, 2.00f, c.c(resources)));
       kwaiImageVie.setLayoutParams(layoutParams1);
       relativeLayo1.addView(kwaiImageVie);
       KwaiImageView kwaiImageVie1 = new KwaiImageView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(c.b(resources, 0x7f07030d), c.b(resources, 0x7f0702d2));
       kwaiImageVie1.setId(R.id.live_lite_anchor_avatar_follow_image_view);
       layoutParams.addRule(12, -1);
       layoutParams.addRule(i1, -1);
       layoutParams.bottomMargin = c.b(resources, 0x7f07033f);
       kwaiImageVie1.setBackgroundResource(R.drawable.arg_RES_7f080e9b);
       kwaiImageVie1.setLayoutParams(layoutParams);
       relativeLayo.addView(kwaiImageVie1);
       KwaiLottieAnimationView kwaiLottieAn = new KwaiLottieAnimationView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(c.b(resources, 0x7f07030d), c.b(resources, 0x7f0702d2));
       kwaiLottieAn.setId(R.id.live_lite_anchor_avatar_follow_lottie_view);
       layoutParams.addRule(12, -1);
       layoutParams.addRule(i1, -1);
       layoutParams.bottomMargin = c.b(resources, 0x7f07033f);
       kwaiLottieAn.setVisibility(8);
       kwaiLottieAn.setLayoutParams(layoutParams);
       relativeLayo.addView(kwaiLottieAn);
       FrameLayout uFrameLayout = new FrameLayout(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(c.b(resources, 0x7f070310), c.b(resources, 0x7f0702ef));
       uFrameLayout.setId(R.id.live_lite_anchor_avatar_fans_group_container);
       layoutParams.bottomMargin = c.b(resources, 0x7f07030a);
       layoutParams.addRule(12, -1);
       layoutParams.addRule(i1, -1);
       uFrameLayout.setVisibility(8);
       uFrameLayout.setLayoutParams(layoutParams);
       relativeLayo.addView(uFrameLayout);
       KwaiImageView kwaiImageVie2 = new KwaiImageView(uFrameLayout.getContext());
       kwaiImageVie2.setId(R.id.live_lite_anchor_avatar_fans_group_join_icon);
       kwaiImageVie2.setVisibility(8);
       kwaiImageVie2.getHierarchy().F(ContextCompat.getDrawable(uContext, R.drawable.arg_RES_7f080a81));
       kwaiImageVie2.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(kwaiImageVie2);
       FrameLayout uFrameLayout1 = new FrameLayout(uFrameLayout.getContext());
       uFrameLayout1.setId(R.id.live_lite_anchor_avatar_fans_group_level_container);
       uFrameLayout1.setVisibility(8);
       uFrameLayout1.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(uFrameLayout1);
       KwaiCDNImageView kwaiCDNImage = new KwaiCDNImageView(uFrameLayout1.getContext());
       kwaiCDNImage.setId(R.id.live_lite_anchor_avatar_fans_group_level_icon_image_view);
       kwaiCDNImage.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout1.addView(kwaiCDNImage);
       StrokedTextView strokedTextV = new StrokedTextView(uFrameLayout1.getContext());
       FrameLayout$LayoutParams layoutParams2 = new FrameLayout$LayoutParams(i, i);
       strokedTextV.setId(R.id.live_lite_anchor_avatar_fans_group_level_text_view);
       layoutParams2.gravity = 17;
       strokedTextV.setGravity(17);
       layoutParams2.leftMargin = c.b(resources, 0x7f0702ac);
       strokedTextV.setTextSize(false, (float)c.b(resources, R.dimen.pv));
       strokedTextV.setTypeface(null, 1);
       strokedTextV.setLayoutParams(layoutParams2);
       uFrameLayout1.addView(strokedTextV);
       return liteTouchEve;
    }
}
