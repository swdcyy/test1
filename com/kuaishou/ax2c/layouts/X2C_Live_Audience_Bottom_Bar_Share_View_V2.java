package com.kuaishou.ax2c.layouts.X2C_Live_Audience_Bottom_Bar_Share_View_V2;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.widget.LinearLayout$LayoutParams;
import com.kuaishou.live.bottombar.component.widget.view.PressableFixedSimpleKwaiImageView;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationViewCopy;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.facebook.drawee.generic.RoundingParams;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;

public class X2C_Live_Audience_Bottom_Bar_Share_View_V2 implements IViewCreator	// class@0010d3
{

    public void X2C_Live_Audience_Bottom_Bar_Share_View_V2(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       LinearLayout linearLayout = new LinearLayout(p0);
       linearLayout.setGravity(17);
       linearLayout.setOrientation(0);
       linearLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(c.b(resources, R.dimen.arg_RES_7f0705e4), c.b(resources, R.dimen.arg_RES_7f0705e4)));
       RelativeLayout relativeLayo = new RelativeLayout(linearLayout.getContext());
       relativeLayo.setId(R.id.live_share_forward_normal_container);
       relativeLayo.setBackgroundResource(R.drawable.arg_RES_7f0810dd);
       relativeLayo.setLayoutParams(new LinearLayout$LayoutParams(c.b(resources, R.dimen.arg_RES_7f0705e4), c.b(resources, R.dimen.arg_RES_7f0705e4)));
       linearLayout.addView(relativeLayo);
       PressableFixedSimpleKwaiImageView pressableFix = new PressableFixedSimpleKwaiImageView(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(c.b(resources, 0x7f0705e1), c.b(resources, 0x7f0705e1));
       pressableFix.setId(R.id.live_share_forward_button);
       layoutParams.addRule(13, -1);
       pressableFix.setLayoutParams(layoutParams);
       relativeLayo.addView(pressableFix);
       LottieAnimationViewCopy lottieAnimat = new LottieAnimationViewCopy(linearLayout.getContext());
       lottieAnimat.setId(R.id.live_share_forward_button_lottie);
       lottieAnimat.setContentDescription(resources.getString(R.string.arg_RES_7f101059));
       lottieAnimat.setVisibility(8);
       lottieAnimat.setLayoutParams(new LinearLayout$LayoutParams(c.b(resources, R.dimen.arg_RES_7f0705e4), c.b(resources, R.dimen.arg_RES_7f0705e4)));
       linearLayout.addView(lottieAnimat);
       lottieAnimat = new LottieAnimationViewCopy(linearLayout.getContext());
       lottieAnimat.setId(R.id.live_share_forward_button_lottie_loop);
       lottieAnimat.setVisibility(8);
       lottieAnimat.setLayoutParams(new LinearLayout$LayoutParams(c.b(resources, R.dimen.arg_RES_7f0705e4), c.b(resources, R.dimen.arg_RES_7f0705e4)));
       linearLayout.addView(lottieAnimat);
       KwaiImageView kwaiImageVie = new KwaiImageView(linearLayout.getContext());
       int i = c.b(resources, R.dimen.arg_RES_7f0705e4);
       kwaiImageVie.setId(R.id.live_share_forward_button_guiding_avatar);
       kwaiImageVie.getHierarchy().L(RoundingParams.a());
       kwaiImageVie.setVisibility(8);
       kwaiImageVie.setLayoutParams(new LinearLayout$LayoutParams(i, c.b(resources, R.dimen.arg_RES_7f0705e4)));
       linearLayout.addView(kwaiImageVie);
       return linearLayout;
    }
}
