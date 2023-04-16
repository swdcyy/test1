package com.kuaishou.ax2c.layouts.X2C_List_Item_Magic_Emoji_Mul_Row;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.yxcorp.gifshow.widget.PressedImageView;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
import android.widget.TextView;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.text.TextUtils$TruncateAt;
import androidx.appcompat.widget.AppCompatImageView;
import com.yxcorp.gifshow.magic.ui.widget.AngularRingProgressBar;
import android.util.AttributeSet;
import android.os.Looper;
import java.lang.Thread;
import android.widget.ProgressBar;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Long;
import java.lang.Exception;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.LinearLayout$LayoutParams;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;

public class X2C_List_Item_Magic_Emoji_Mul_Row implements IViewCreator	// class@0010b7
{

    public void X2C_List_Item_Magic_Emoji_Mul_Row(){
       super();
    }
    public View createView(Context p0){
       long id;
       RelativeLayout$LayoutParams layoutParams1;
       AppCompatTextView uAppCompatTe;
       LinearLayout linearLayout;
       KwaiImageView kwaiImageVie;
       LinearLayout$LayoutParams layoutParams2;
       AppCompatTextView uAppCompatTe1;
       LinearLayout$LayoutParams layoutParams3;
       Context uContext = p0;
       Resources resources = p0.getResources();
       RelativeLayout relativeLayo = new RelativeLayout(uContext);
       boolean b = false;
       relativeLayo.setClipChildren(b);
       relativeLayo.setLayoutParams(new ViewGroup$MarginLayoutParams(c.b(resources, R.dimen.arg_RES_7f070a68), c.b(resources, R.dimen.arg_RES_7f070a68)));
       View view = new View(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 58.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 58.00f, c.c(resources)));
       layoutParams.topMargin = (int)TypedValue.applyDimension(1, 2.50f, c.c(resources));
       int i = 14;
       int i1 = -1;
       layoutParams.addRule(i, i1);
       view.setId(R.id.magic_emoji_cover_selected_bg);
       view.setBackgroundResource(R.drawable.arg_RES_7f080268);
       int i2 = 4;
       view.setVisibility(i2);
       view.setLayoutParams(layoutParams);
       relativeLayo.addView(view);
       PressedImageView pressedImage = new PressedImageView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 58.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 58.00f, c.c(resources)));
       layoutParams.topMargin = (int)TypedValue.applyDimension(1, 2.50f, c.c(resources));
       layoutParams.addRule(i, i1);
       int i3 = 0x7f0a29f2;
       pressedImage.setId(i3);
       pressedImage.setScaleType(ImageView$ScaleType.FIT_CENTER);
       pressedImage.setPressedAlpha(0x3f000000);
       pressedImage.setLayoutParams(layoutParams);
       relativeLayo.addView(pressedImage);
       SizeAdjustableTextView sizeAdjustab = new SizeAdjustableTextView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(-2, -2);
       sizeAdjustab.setVisibility(b);
       sizeAdjustab.setId(R.id.magic_emoji_name_tv);
       layoutParams.addRule(3, i3);
       layoutParams.addRule(i, i1);
       float f = 0x3f800000;
       layoutParams.topMargin = (int)TypedValue.applyDimension(1, f, c.c(resources));
       sizeAdjustab.setMaxWidth((int)TypedValue.applyDimension(1, 50.00f, c.c(resources)));
       sizeAdjustab.setTextColor(resources.getColor(R.color.arg_RES_7f0617f0));
       sizeAdjustab.setTextSize(b, (float)c.b(resources, R.dimen.arg_RES_7f07025d));
       sizeAdjustab.setInitTextSize(TypedValue.applyDimension(b, (float)c.b(resources, R.dimen.arg_RES_7f07025d), c.c(resources)));
       sizeAdjustab.setSingleLine(1);
       sizeAdjustab.setEllipsize(TextUtils$TruncateAt.END);
       sizeAdjustab.setMinTextSize(TypedValue.applyDimension(b, (float)c.b(resources, R.dimen.arg_RES_7f07034b), c.c(resources)));
       sizeAdjustab.setTextSizeAdjustable(1);
       sizeAdjustab.setLayoutParams(layoutParams);
       relativeLayo.addView(sizeAdjustab);
       AppCompatImageView uAppCompatIm = new AppCompatImageView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 15.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 15.00f, c.c(resources)));
       uAppCompatIm.setId(R.id.undownload_flag);
       layoutParams.addRule(7, i3);
       layoutParams.addRule(8, i3);
       layoutParams.rightMargin = (int)TypedValue.applyDimension(1, f, c.c(resources));
       layoutParams.bottomMargin = (int)TypedValue.applyDimension(1, f, c.c(resources));
       uAppCompatIm.setVisibility(i2);
       uAppCompatIm.setImageResource(R.drawable.arg_RES_7f080437);
       uAppCompatIm.setLayoutParams(layoutParams);
       relativeLayo.addView(uAppCompatIm);
       AngularRingProgressBar uAngularRing = new AngularRingProgressBar(relativeLayo.getContext(), null);
       id = Looper.getMainLooper().getThread().getId();
       if (id - Thread.currentThread().getId()) {
          try{
             Field declaredFiel = ProgressBar.class.getDeclaredField("mUiThreadId");
             declaredFiel.setAccessible(1);
             declaredFiel.set(uAngularRing, Long.valueOf(id));
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
}
