package com.kuaishou.ax2c.layouts.X2C_Share_Custom_Item_V2;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.RelativeLayout$LayoutParams;
import cw9.c;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import r0.a;

public class X2C_Share_Custom_Item_V2 implements IViewCreator	// class@001126
{

    public void X2C_Share_Custom_Item_V2(){
       super();
    }
    public View createView(Context p0){
       Drawable drawable;
       Resources resources = p0.getResources();
       ConstraintLayout uConstraintL = new ConstraintLayout(p0);
       uConstraintL.setPadding(c.b(resources, R.dimen.arg_RES_7f070e70), 0, c.b(resources, R.dimen.arg_RES_7f070e71), 0);
       uConstraintL.setLayoutParams(new RelativeLayout$LayoutParams(-1, c.b(resources, R.dimen.arg_RES_7f070e6d)));
       AppCompatImageView uAppCompatIm = new AppCompatImageView(uConstraintL.getContext());
       int i = -2;
       ConstraintLayout$LayoutParams layoutParams = new ConstraintLayout$LayoutParams(i, i);
       int i1 = 0x7f0a38e0;
       uAppCompatIm.setId(i1);
       layoutParams.k = 0;
       layoutParams.e = 0x7f0a38e1;
       layoutParams.g = 0;
       layoutParams.h = 0;
       uAppCompatIm.setImageResource(R.drawable.arg_RES_7f081ba7);
       drawable = uAppCompatIm.getDrawable();
       if (drawable != null) {
          drawable = a.r(drawable);
          a.n(drawable.mutate(), resources.getColor(R.color.arg_RES_7f061ea6));
          uAppCompatIm.setImageDrawable(drawable);
       }
       layoutParams.c();
       uAppCompatIm.setLayoutParams(layoutParams);
       uConstraintL.addView(uAppCompatIm);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(uConstraintL.getContext());
       layoutParams = new ConstraintLayout$LayoutParams(c.b(resources, 0x7f070253), i);
       uAppCompatTe.setId(R.id.share_custom_tip);
       uAppCompatTe.setGravity(5);
       uAppCompatTe.setText(R.string.arg_RES_7f104030);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f0607e8));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f6e));
       uAppCompatTe.setVisibility(8);
       layoutParams.k = 0;
       layoutParams.e = 0x7f0a38e2;
       layoutParams.f = i1;
       layoutParams.h = 0;
       layoutParams.c();
       uAppCompatTe.setLayoutParams(layoutParams);
       uConstraintL.addView(uAppCompatTe);
       uAppCompatTe = new AppCompatTextView(uConstraintL.getContext());
       layoutParams = new ConstraintLayout$LayoutParams(i, i);
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f72));
       uAppCompatTe.setCompoundDrawablePadding(c.b(resources, R.dimen.arg_RES_7f07034b));
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f061ea7));
       uAppCompatTe.setId(R.id.share_custom_title);
       uAppCompatTe.setText(R.string.arg_RES_7f10402f);
       Drawable[] compoundDraw = uAppCompatTe.getCompoundDrawables();
       uAppCompatTe.setCompoundDrawablesWithIntrinsicBounds(a.d(p0, R.drawable.arg_RES_7f080565), compoundDraw[1], compoundDraw[2], compoundDraw[3]);
       layoutParams.k = 0;
       layoutParams.G = 1;
       layoutParams.d = 0;
       layoutParams.f = 0x7f0a38e1;
       layoutParams.h = 0;
       layoutParams.c();
       uAppCompatTe.setLayoutParams(layoutParams);
       uConstraintL.addView(uAppCompatTe);
       return uConstraintL;
    }
}
