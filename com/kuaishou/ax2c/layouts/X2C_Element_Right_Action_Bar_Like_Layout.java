package com.kuaishou.ax2c.layouts.X2C_Element_Right_Action_Bar_Like_Layout;
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
import com.kwai.slide.play.detail.rightactionbar.view.FixLottieAnimationView;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;

public class X2C_Element_Right_Action_Bar_Like_Layout implements IViewCreator	// class@0010a9
{

    public void X2C_Element_Right_Action_Bar_Like_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setId(R.id.like_button);
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, c.b(resources, R.dimen.arg_RES_7f070335)));
       UnClickAreaView unClickAreaV = new UnClickAreaView(uFrameLayout.getContext());
       unClickAreaV.setId(R.id.click_area);
       unClickAreaV.setLayoutParams(new FrameLayout$LayoutParams(-1, c.b(resources, R.dimen.arg_RES_7f070be5)));
       uFrameLayout.addView(unClickAreaV);
       FixLottieAnimationView uFixLottieAn = new FixLottieAnimationView(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, c.b(resources, 0x7f070bea));
       uFixLottieAn.setId(R.id.like_anim_view);
       layoutParams.gravity = 1;
       uFixLottieAn.setVisibility(8);
       uFixLottieAn.setLayoutParams(layoutParams);
       uFrameLayout.addView(uFixLottieAn);
       View view = new View(uFrameLayout.getContext());
       layoutParams = new FrameLayout$LayoutParams(c.b(resources, 0x7f070bea), c.b(resources, 0x7f070bea));
       view.setId(R.id.like_icon);
       layoutParams.gravity = 1;
       view.setBackgroundResource(R.drawable.arg_RES_7f08091f);
       view.setLayoutParams(layoutParams);
       uFrameLayout.addView(view);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(uFrameLayout.getContext());
       layoutParams = new FrameLayout$LayoutParams(-2, -2);
       uAppCompatTe.setId(R.id.like_count_view);
       uAppCompatTe.setGravity(17);
       layoutParams.gravity = 1;
       layoutParams.topMargin = c.b(resources, 0x7f070be8);
       uAppCompatTe.setIncludeFontPadding(false);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f061c32));
       uAppCompatTe.setTextSize(false, (float)c.b(resources, R.dimen.arg_RES_7f070f70));
       uAppCompatTe.setLayoutParams(layoutParams);
       uFrameLayout.addView(uAppCompatTe);
       return uFrameLayout;
    }
}
