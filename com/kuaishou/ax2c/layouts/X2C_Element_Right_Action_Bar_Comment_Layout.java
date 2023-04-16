package com.kuaishou.ax2c.layouts.X2C_Element_Right_Action_Bar_Comment_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import com.kwai.slide.play.detail.rightactionbar.view.UnClickAreaView;
import android.widget.FrameLayout$LayoutParams;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.ImageView;
import java.lang.CharSequence;
import android.widget.ImageView$ScaleType;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import android.widget.TextView;
import android.util.DisplayMetrics;
import android.util.TypedValue;

public class X2C_Element_Right_Action_Bar_Comment_Layout implements IViewCreator	// class@0010a8
{

    public void X2C_Element_Right_Action_Bar_Comment_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setId(R.id.comment_button);
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, c.b(resources, R.dimen.arg_RES_7f070335)));
       UnClickAreaView unClickAreaV = new UnClickAreaView(uFrameLayout.getContext());
       unClickAreaV.setId(R.id.click_area);
       unClickAreaV.setLayoutParams(new FrameLayout$LayoutParams(-1, c.b(resources, R.dimen.arg_RES_7f070be5)));
       uFrameLayout.addView(unClickAreaV);
       View view = new View(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(c.b(resources, 0x7f070bea), c.b(resources, 0x7f070bea));
       view.setId(R.id.comment_icon);
       layoutParams.gravity = 1;
       view.setLayoutParams(layoutParams);
       uFrameLayout.addView(view);
       AppCompatImageView uAppCompatIm = new AppCompatImageView(uFrameLayout.getContext());
       layoutParams = new FrameLayout$LayoutParams(c.b(resources, 0x7f070bea), c.b(resources, 0x7f070bea));
       uAppCompatIm.setId(R.id.emoji_icon);
       layoutParams.gravity = 1;
       uAppCompatIm.setContentDescription("emotion");
       uAppCompatIm.setVisibility(8);
       uAppCompatIm.setScaleType(ImageView$ScaleType.FIT_XY);
       uAppCompatIm.setPadding(c.b(resources, R.dimen.pv), c.b(resources, R.dimen.pv), c.b(resources, R.dimen.pv), c.b(resources, R.dimen.pv));
       uAppCompatIm.setLayoutParams(layoutParams);
       uFrameLayout.addView(uAppCompatIm);
       KwaiSizeAdjustableTextView kwaiSizeAdju = new KwaiSizeAdjustableTextView(uFrameLayout.getContext());
       layoutParams = new FrameLayout$LayoutParams(-2, -2);
       kwaiSizeAdju.setId(R.id.comment_count_view);
       layoutParams.gravity = 1;
       layoutParams.topMargin = c.b(resources, 0x7f070be8);
       kwaiSizeAdju.setIncludeFontPadding(false);
       kwaiSizeAdju.setGravity(17);
       kwaiSizeAdju.setTextColor(resources.getColor(R.color.arg_RES_7f061c32));
       kwaiSizeAdju.setInitTextSize(TypedValue.applyDimension(false, (float)c.b(resources, R.dimen.arg_RES_7f070284), c.c(resources)));
       kwaiSizeAdju.setMinTextSize(TypedValue.applyDimension(false, (float)c.b(resources, R.dimen.arg_RES_7f07025e), c.c(resources)));
       kwaiSizeAdju.setTextSizeAdjustable(1);
       kwaiSizeAdju.setLayoutParams(layoutParams);
       uFrameLayout.addView(kwaiSizeAdju);
       kwaiSizeAdju = new KwaiSizeAdjustableTextView(uFrameLayout.getContext());
       layoutParams = new FrameLayout$LayoutParams(-2, -2);
       kwaiSizeAdju.setId(R.id.comment_exposure_text);
       layoutParams.gravity = 1;
       layoutParams.topMargin = c.b(resources, 0x7f070be8);
       kwaiSizeAdju.setMaxLines(1);
       kwaiSizeAdju.setTextColor(resources.getColor(R.color.arg_RES_7f061c32));
       kwaiSizeAdju.setVisibility(8);
       kwaiSizeAdju.setInitTextSize(TypedValue.applyDimension(false, (float)c.b(resources, R.dimen.arg_RES_7f070272), c.c(resources)));
       kwaiSizeAdju.setMinTextSize(TypedValue.applyDimension(false, (float)c.b(resources, R.dimen.arg_RES_7f07025e), c.c(resources)));
       kwaiSizeAdju.setTextSizeAdjustable(1);
       kwaiSizeAdju.setLayoutParams(layoutParams);
       uFrameLayout.addView(kwaiSizeAdju);
       view = new View(uFrameLayout.getContext());
       layoutParams = new FrameLayout$LayoutParams(c.b(resources, 0x7f0702c5), c.b(resources, 0x7f070271));
       view.setId(R.id.featured_god_comment_tip);
       layoutParams.gravity = 0x800005;
       layoutParams.setMarginEnd(c.b(resources, R.dimen.arg_RES_7f07025d));
       layoutParams.topMargin = c.b(resources, 0x7f07025d);
       view.setAlpha(0);
       view.setBackgroundResource(R.drawable.arg_RES_7f08091a);
       view.setLayoutParams(layoutParams);
       uFrameLayout.addView(view);
       return uFrameLayout;
    }
}
