package com.kuaishou.ax2c.layouts.X2C_Lite_Square_Notice_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.LinearLayout$LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.facebook.drawee.generic.RoundingParams;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.yxcorp.gifshow.widget.EmojiTextView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatImageView;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;

public class X2C_Lite_Square_Notice_Layout implements IViewCreator	// class@0010c8
{

    public void X2C_Lite_Square_Notice_Layout(){
       super();
    }
    public View createView(Context p0){
       Drawable drawable;
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setPadding(0, 0, c.b(resources, R.dimen.pv), 0);
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-2, -2));
       LivePkShimmerLayout livePkShimme = new LivePkShimmerLayout(uFrameLayout.getContext());
       livePkShimme.setId(R.id.live_play_sidebar_square_notice_layout);
       livePkShimme.setGravity(16);
       livePkShimme.setBackgroundResource(R.drawable.arg_RES_7f08109f);
       livePkShimme.setVisibility(8);
       livePkShimme.setClipChildren(0);
       livePkShimme.setClipToPadding(0);
       livePkShimme.setShimmerBottomLeftRadius(c.b(resources, R.dimen.arg_RES_7f07025d));
       livePkShimme.setShimmerTopLeftRadius(c.b(resources, R.dimen.arg_RES_7f07025d));
       livePkShimme.setShimmerBottomRightRadius(c.b(resources, R.dimen.arg_RES_7f07025d));
       livePkShimme.setShimmerTopRightRadius(c.b(resources, R.dimen.arg_RES_7f07025d));
       livePkShimme.setLayoutParams(new FrameLayout$LayoutParams(-2, c.b(resources, R.dimen.arg_RES_7f0702b8)));
       uFrameLayout.addView(livePkShimme);
       KwaiImageView kwaiImageVie = new KwaiImageView(livePkShimme.getContext());
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(c.b(resources, 0x7f0702a4), c.b(resources, 0x7f0702a4));
       kwaiImageVie.setId(R.id.live_play_sidebar_square_avatar_view);
       kwaiImageVie.setScaleType(ImageView$ScaleType.FIT_XY);
       kwaiImageVie.setImageResource(R.drawable.detail_avatar_secret);
       layoutParams.leftMargin = (int)TypedValue.applyDimension(1, 0x3f800000, c.c(resources));
       kwaiImageVie.getHierarchy().L(RoundingParams.a());
       kwaiImageVie.setLayoutParams(layoutParams);
       livePkShimme.addView(kwaiImageVie);
       EmojiTextView uEmojiTextVi = new EmojiTextView(livePkShimme.getContext());
       layoutParams = new LinearLayout$LayoutParams(-2, -2);
       uEmojiTextVi.setId(R.id.live_play_sidebar_square_notice_content);
       uEmojiTextVi.setSingleLine(1);
       uEmojiTextVi.setIncludeFontPadding(0);
       layoutParams.leftMargin = (int)TypedValue.applyDimension(1, 6.00f, c.c(resources));
       int i = 0x7f0604ba;
       uEmojiTextVi.setTextColor(resources.getColor(i));
       uEmojiTextVi.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070271));
       uEmojiTextVi.setText(R.string.arg_RES_7f102085);
       uEmojiTextVi.setPadding(0, 0, 0, (int)TypedValue.applyDimension(1, 0x3f800000, c.c(resources)));
       uEmojiTextVi.setLayoutParams(layoutParams);
       livePkShimme.addView(uEmojiTextVi);
       AppCompatImageView uAppCompatIm = new AppCompatImageView(livePkShimme.getContext());
       LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 12.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 12.00f, c.c(resources)));
       uAppCompatIm.setId(R.id.live_play_sidebar_square_notice_icon);
       uAppCompatIm.setImageResource(R.drawable.arg_RES_7f08054c);
       drawable = uAppCompatIm.getDrawable();
       if (drawable != null) {
          drawable = a.r(drawable);
          a.n(drawable.mutate(), resources.getColor(i));
          uAppCompatIm.setImageDrawable(drawable);
       }
       layoutParams1.rightMargin = c.b(resources, 0x7f070334);
       uAppCompatIm.setLayoutParams(layoutParams1);
       livePkShimme.addView(uAppCompatIm);
       return uFrameLayout;
    }
}
