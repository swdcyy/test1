package com.kuaishou.ax2c.layouts.X2C_Edit_Prompt_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.yxcorp.gifshow.widget.PromptView;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.FrameLayout;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import android.widget.FrameLayout$LayoutParams;
import com.kwai.library.widget.specific.misc.KwaiLoadingCircle;
import android.widget.LinearLayout$LayoutParams;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import java.lang.String;
import android.graphics.Color;
import java.lang.CharSequence;

public class X2C_Edit_Prompt_Layout implements IViewCreator	// class@0010a4
{

    public void X2C_Edit_Prompt_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       PromptView promptView = new PromptView(p0);
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-1, -2);
       promptView.setId(R.id.edit_prompt_view);
       layoutParams.topMargin = (int)TypedValue.applyDimension(1, 27.00f, c.c(resources));
       promptView.setVisibility(4);
       promptView.setLayoutParams(layoutParams);
       LinearLayout linearLayout = new LinearLayout(promptView.getContext());
       FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams(-2, (int)TypedValue.applyDimension(1, 0x41f00000, c.c(resources)));
       layoutParams1.gravity = 1;
       linearLayout.setBackgroundResource(R.drawable.arg_RES_7f0808b8);
       linearLayout.setGravity(16);
       linearLayout.setOrientation(0);
       linearLayout.setPadding((int)TypedValue.applyDimension(1, 10.00f, c.c(resources)), 0, (int)TypedValue.applyDimension(1, 10.00f, c.c(resources)), 0);
       linearLayout.setLayoutParams(layoutParams1);
       promptView.addView(linearLayout);
       KwaiLoadingCircle kwaiLoadingC = new KwaiLoadingCircle(linearLayout.getContext());
       LinearLayout$LayoutParams layoutParams2 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 11.52f, c.c(resources)), (int)TypedValue.applyDimension(1, 11.52f, c.c(resources)));
       kwaiLoadingC.setId(R.id.edit_loading_view);
       kwaiLoadingC.setProgressWidth((int)TypedValue.applyDimension(1, 0x3fa3d70a, c.c(resources)));
       kwaiLoadingC.setProgressColor(resources.getColor(R.color.arg_RES_7f0606da));
       layoutParams2.gravity = 16;
       kwaiLoadingC.setLayoutParams(layoutParams2);
       linearLayout.addView(kwaiLoadingC);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(linearLayout.getContext());
       LinearLayout$LayoutParams layoutParams3 = new LinearLayout$LayoutParams(-2, -2);
       uAppCompatTe.setId(R.id.edit_prompt_txt);
       layoutParams3.setMarginStart((int)TypedValue.applyDimension(1, 5.00f, c.c(resources)));
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), uAppCompatTe.getShadowDx(), uAppCompatTe.getShadowDy(), Color.parseColor("#0F000000"));
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), 0, uAppCompatTe.getShadowDy(), uAppCompatTe.getShadowColor());
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), uAppCompatTe.getShadowDx(), 0x3f800000, uAppCompatTe.getShadowColor());
       uAppCompatTe.setShadowLayer(8.00f, uAppCompatTe.getShadowDx(), uAppCompatTe.getShadowDy(), uAppCompatTe.getShadowColor());
       uAppCompatTe.setText("");
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f061ff3));
       uAppCompatTe.setTextSize(2, 13.00f);
       uAppCompatTe.setLayoutParams(layoutParams3);
       linearLayout.addView(uAppCompatTe);
       return promptView;
    }
}
