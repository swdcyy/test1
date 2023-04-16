package com.kuaishou.ax2c.layouts.X2C_Share_Mini_Program_Layout;
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
import com.yxcorp.gifshow.image.KwaiImageView;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.widget.selector.view.SelectShapeImageButton;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;
import com.kuaishou.ax2c.XmlAttrHostImpl;
import com.kuaishou.ax2c.IAttrHost;
import ald.b;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.text.TextUtils$TruncateAt;

public class X2C_Share_Mini_Program_Layout implements IViewCreator	// class@00112a
{

    public void X2C_Share_Mini_Program_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       ConstraintLayout uConstraintL = new ConstraintLayout(p0);
       uConstraintL.setPadding(c.b(resources, R.dimen.arg_RES_7f070295), 0, c.b(resources, R.dimen.arg_RES_7f070271), 0);
       uConstraintL.setLayoutParams(new RelativeLayout$LayoutParams(-1, c.b(resources, R.dimen.arg_RES_7f070325)));
       KwaiImageView kwaiImageVie = new KwaiImageView(uConstraintL.getContext());
       ConstraintLayout$LayoutParams layoutParams = new ConstraintLayout$LayoutParams(c.b(resources, 0x7f0702cc), c.b(resources, 0x7f0702cc));
       kwaiImageVie.setId(R.id.iv_mini_program);
       kwaiImageVie.setBackgroundResource(R.drawable.arg_RES_7f081ffb);
       layoutParams.d = 0;
       layoutParams.h = 0;
       layoutParams.k = 0;
       layoutParams.c();
       kwaiImageVie.setLayoutParams(layoutParams);
       uConstraintL.addView(kwaiImageVie);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(uConstraintL.getContext());
       layoutParams = new ConstraintLayout$LayoutParams(-2, -2);
       uAppCompatTe.setId(R.id.title_mini_program_new);
       layoutParams.leftMargin = c.b(resources, 0x7f07034b);
       uAppCompatTe.setGravity(16);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f061641));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f72));
       uAppCompatTe.setText(R.string.arg_RES_7f101ccf);
       layoutParams.e = 0x7f0a155a;
       layoutParams.h = 0;
       layoutParams.k = 0;
       layoutParams.c();
       uAppCompatTe.setLayoutParams(layoutParams);
       uConstraintL.addView(uAppCompatTe);
       SelectShapeImageButton selectShapeI = new SelectShapeImageButton(uConstraintL.getContext(), null, 0);
       layoutParams = new ConstraintLayout$LayoutParams(c.b(resources, 0x7f0702b8), c.b(resources, 0x7f0702b8));
       selectShapeI.setId(R.id.btn_remove_mini_program);
       selectShapeI.setBackgroundResource(R.drawable.arg_RES_7f080e74);
       layoutParams.g = 0;
       layoutParams.h = 0;
       layoutParams.k = 0;
       layoutParams.c();
       IAttrHost[] iAttrHostArr = new IAttrHost[]{new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl()};
       selectShapeI.setAttrs(iAttrHostArr);
       selectShapeI.setLayoutParams(layoutParams);
       uConstraintL.addView(selectShapeI);
       uAppCompatTe = new AppCompatTextView(uConstraintL.getContext());
       layoutParams = new ConstraintLayout$LayoutParams((int)TypedValue.applyDimension(1, 0, c.c(resources)), -2);
       uAppCompatTe.setId(R.id.tv_mini_program);
       uAppCompatTe.setGravity(0x800015);
       layoutParams.setMarginEnd(c.b(resources, R.dimen.arg_RES_7f070329));
       layoutParams.setMarginStart(c.b(resources, R.dimen.arg_RES_7f07025d));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f6e));
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f06168c));
       uAppCompatTe.setMaxLines(1);
       uAppCompatTe.setEllipsize(TextUtils$TruncateAt.END);
       layoutParams.e = 0x7f0a3f5e;
       layoutParams.f = 0x7f0a0562;
       layoutParams.h = 0;
       layoutParams.k = 0;
       layoutParams.c();
       uAppCompatTe.setLayoutParams(layoutParams);
       uConstraintL.addView(uAppCompatTe);
       return uConstraintL;
    }
}
