package com.kuaishou.ax2c.layouts.X2C_Element_Right_Action_Bar_Collect_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import com.kwai.slide.play.detail.rightactionbar.view.UnClickAreaView;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import com.kwai.slide.play.detail.rightactionbar.collect.CollectLottieAnimationView;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;

public class X2C_Element_Right_Action_Bar_Collect_Layout implements IViewCreator	// class@0010a7
{

    public void X2C_Element_Right_Action_Bar_Collect_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       ConstraintLayout uConstraintL = new ConstraintLayout(p0);
       uConstraintL.setId(R.id.collect_button);
       uConstraintL.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, c.b(resources, R.dimen.arg_RES_7f070335)));
       UnClickAreaView unClickAreaV = new UnClickAreaView(uConstraintL.getContext());
       unClickAreaV.setId(R.id.click_area);
       unClickAreaV.setLayoutParams(new ConstraintLayout$LayoutParams(-1, c.b(resources, R.dimen.arg_RES_7f070be5)));
       uConstraintL.addView(unClickAreaV);
       CollectLottieAnimationView uCollectLott = new CollectLottieAnimationView(uConstraintL.getContext());
       ConstraintLayout$LayoutParams layoutParams = new ConstraintLayout$LayoutParams(c.b(resources, 0x7f070bea), c.b(resources, 0x7f070bea));
       uCollectLott.setId(R.id.collection_anim_view);
       uCollectLott.setVisibility(8);
       layoutParams.d = 0x7f0a07d0;
       layoutParams.h = 0x7f0a07d0;
       layoutParams.k = 0x7f0a07d0;
       layoutParams.g = 0x7f0a07d0;
       layoutParams.c();
       uCollectLott.setLayoutParams(layoutParams);
       uConstraintL.addView(uCollectLott);
       View view = new View(uConstraintL.getContext());
       layoutParams = new ConstraintLayout$LayoutParams(c.b(resources, 0x7f070bea), c.b(resources, 0x7f070bea));
       view.setId(R.id.collect_icon);
       view.setBackgroundResource(R.drawable.arg_RES_7f081995);
       layoutParams.d = 0;
       layoutParams.h = 0;
       layoutParams.g = 0;
       layoutParams.c();
       view.setLayoutParams(layoutParams);
       uConstraintL.addView(view);
       LottieAnimationView lottieAnimat = new LottieAnimationView(uConstraintL.getContext());
       layoutParams = new ConstraintLayout$LayoutParams(c.b(resources, 0x7f070bea), c.b(resources, 0x7f070bea));
       lottieAnimat.setId(R.id.collect_anim_beat_view);
       layoutParams.d = 0x7f0a07d0;
       layoutParams.h = 0x7f0a07d0;
       layoutParams.k = 0x7f0a07d0;
       layoutParams.g = 0x7f0a07d0;
       lottieAnimat.setVisibility(8);
       lottieAnimat.setRepeatCount(2);
       lottieAnimat.setAutoPlay(0);
       lottieAnimat.setClickable(0);
       layoutParams.c();
       lottieAnimat.setLayoutParams(layoutParams);
       uConstraintL.addView(lottieAnimat);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(uConstraintL.getContext());
       layoutParams = new ConstraintLayout$LayoutParams(-2, -2);
       uAppCompatTe.setId(R.id.collect_text);
       layoutParams.topMargin = c.b(resources, 0x7f070be8);
       uAppCompatTe.setIncludeFontPadding(0);
       uAppCompatTe.setText(R.string.arg_RES_7f100729);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f061c32));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f6e));
       layoutParams.u = c.b(resources, 0x7f070be8);
       layoutParams.d = 0;
       layoutParams.g = 0;
       layoutParams.h = 0x7f0a07d0;
       layoutParams.c();
       uAppCompatTe.setLayoutParams(layoutParams);
       uConstraintL.addView(uAppCompatTe);
       return uConstraintL;
    }
}
