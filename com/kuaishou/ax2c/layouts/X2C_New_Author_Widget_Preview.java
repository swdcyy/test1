package com.kuaishou.ax2c.layouts.X2C_New_Author_Widget_Preview;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.widget.TextView;
import cw9.c;
import android.view.ViewGroup$MarginLayoutParams;
import android.text.TextUtils$TruncateAt;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.facebook.drawee.generic.RoundingParams;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;

public class X2C_New_Author_Widget_Preview implements IViewCreator	// class@00111a
{

    public void X2C_New_Author_Widget_Preview(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       ConstraintLayout uConstraintL = new ConstraintLayout(p0);
       uConstraintL.setLayoutParams(new RelativeLayout$LayoutParams(-2, -2));
       AppCompatTextView uAppCompatTe = new AppCompatTextView(uConstraintL.getContext());
       ConstraintLayout$LayoutParams layoutParams = new ConstraintLayout$LayoutParams(-2, -2);
       uAppCompatTe.setId(R.id.new_author_widget_title);
       layoutParams.leftMargin = c.b(resources, 0x7f07025d);
       layoutParams.topMargin = c.b(resources, 0x7f07025d);
       uAppCompatTe.setEllipsize(TextUtils$TruncateAt.END);
       uAppCompatTe.setMaxLines(1);
       uAppCompatTe.setText(R.string.arg_RES_7f100d9c);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f0606da));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070295));
       layoutParams.p = 0x7f0a2d9d;
       layoutParams.h = 0x7f0a2d9d;
       layoutParams.c();
       uAppCompatTe.setLayoutParams(layoutParams);
       uConstraintL.addView(uAppCompatTe);
       uAppCompatTe = new AppCompatTextView(uConstraintL.getContext());
       layoutParams = new ConstraintLayout$LayoutParams(-2, -2);
       uAppCompatTe.setId(R.id.new_author_widget_tag);
       layoutParams.topMargin = c.b(resources, 0x7f07031b);
       uAppCompatTe.setEllipsize(TextUtils$TruncateAt.END);
       uAppCompatTe.setMaxLines(1);
       uAppCompatTe.setText(R.string.arg_RES_7f1037eb);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f061bfa));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070271));
       layoutParams.q = 0x7f0a2da1;
       layoutParams.i = 0x7f0a2da1;
       layoutParams.c();
       uAppCompatTe.setLayoutParams(layoutParams);
       uConstraintL.addView(uAppCompatTe);
       KwaiImageView kwaiImageVie = new KwaiImageView(uConstraintL.getContext());
       ConstraintLayout$LayoutParams layoutParams1 = new ConstraintLayout$LayoutParams(c.b(resources, 0x7f07030d), c.b(resources, 0x7f07030d));
       kwaiImageVie.setId(R.id.avatar);
       layoutParams1.bottomMargin = c.b(resources, 0x7f0702ac);
       layoutParams1.k = 0x7f0a2d9d;
       layoutParams1.s = 0x7f0a2d9d;
       layoutParams1.q = 0x7f0a2d9d;
       kwaiImageVie.getHierarchy().L(RoundingParams.a());
       layoutParams1.c();
       kwaiImageVie.setLayoutParams(layoutParams1);
       uConstraintL.addView(kwaiImageVie);
       kwaiImageVie = new KwaiImageView(uConstraintL.getContext());
       layoutParams1 = new ConstraintLayout$LayoutParams(c.b(resources, 0x7f07031d), c.b(resources, 0x7f07031d));
       kwaiImageVie.setId(R.id.new_author_widget);
       layoutParams1.leftMargin = c.b(resources, 0x7f0702ab);
       kwaiImageVie.setBackgroundResource(R.drawable.arg_RES_7f081a12);
       layoutParams1.q = 0;
       layoutParams1.h = 0;
       layoutParams1.c();
       kwaiImageVie.setLayoutParams(layoutParams1);
       uConstraintL.addView(kwaiImageVie);
       return uConstraintL;
    }
}
