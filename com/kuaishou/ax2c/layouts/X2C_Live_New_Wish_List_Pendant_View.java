package com.kuaishou.ax2c.layouts.X2C_Live_New_Wish_List_Pendant_View;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.widget.selector.view.SelectShapeRelativeLayout;
import android.widget.FrameLayout$LayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import com.kuaishou.ax2c.XmlAttrHostImpl;
import com.kuaishou.ax2c.IAttrHost;
import ald.b;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import android.text.TextUtils$TruncateAt;
import android.widget.ProgressBar;
import android.view.ContextThemeWrapper;
import android.util.AttributeSet;
import android.os.Looper;
import java.lang.Thread;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Long;
import java.lang.Exception;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.kuaishou.ax2c.layouts.X2C_Live_Wish_List_Complete_User_Pendant_View;

public class X2C_Live_New_Wish_List_Pendant_View implements IViewCreator	// class@001104
{

    public void X2C_Live_New_Wish_List_Pendant_View(){
       super();
    }
    public View createView(Context p0){
       long id;
       RelativeLayout$LayoutParams layoutParams1;
       View view;
       Context uContext = p0;
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(uContext);
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-2, -2));
       SelectShapeRelativeLayout selectShapeR = new SelectShapeRelativeLayout(uFrameLayout.getContext());
       selectShapeR.setId(R.id.live_wish_list_gift_container);
       selectShapeR.setBackgroundResource(R.drawable.arg_RES_7f081493);
       IAttrHost[] iAttrHostArr = new IAttrHost[]{new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl()};
       selectShapeR.setAttrs(iAttrHostArr);
       selectShapeR.setLayoutParams(new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 48.00f, c.c(resources)), c.b(resources, R.dimen.arg_RES_7f070977)));
       uFrameLayout.addView(selectShapeR);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(selectShapeR.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-2, c.b(resources, 0x7f07027a));
       uAppCompatTe.setId(R.id.live_wish_list_name_text_view);
       uAppCompatTe.setGravity(16);
       layoutParams.leftMargin = c.b(resources, 0x7f070334);
       layoutParams.topMargin = (int)TypedValue.applyDimension(1, 4.00f, c.c(resources));
       uAppCompatTe.setIncludeFontPadding(0);
       uAppCompatTe.setText(R.string.arg_RES_7f102f46);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f061c32));
       uAppCompatTe.setTextSize(1, 9.00f);
       uAppCompatTe.setLayoutParams(layoutParams);
       selectShapeR.addView(uAppCompatTe);
       KwaiImageView kwaiImageVie = new KwaiImageView(selectShapeR.getContext());
       layoutParams = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 14.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 14.00f, c.c(resources)));
       kwaiImageVie.setId(R.id.live_wish_list_gift_image_view);
       layoutParams.addRule(11, -1);
       layoutParams.topMargin = (int)TypedValue.applyDimension(1, 3.00f, c.c(resources));
       layoutParams.rightMargin = (int)TypedValue.applyDimension(1, 6.00f, c.c(resources));
       kwaiImageVie.getHierarchy().u(t$b.e);
       kwaiImageVie.setLayoutParams(layoutParams);
       selectShapeR.addView(kwaiImageVie);
       RelativeLayout relativeLayo = new RelativeLayout(selectShapeR.getContext());
       layoutParams = new RelativeLayout$LayoutParams(-1, c.b(resources, 0x7f070283));
       layoutParams.addRule(2, R.id.live_wish_list_progress_bar);
       layoutParams.addRule(3, R.id.live_wish_list_gift_image_view);
       layoutParams.leftMargin = (int)TypedValue.applyDimension(1, 6.00f, c.c(resources));
       layoutParams.topMargin = (int)TypedValue.applyDimension(1, 0x3f800000, c.c(resources));
       layoutParams.rightMargin = (int)TypedValue.applyDimension(1, 4.00f, c.c(resources));
       float f = 2.00f;
       layoutParams.bottomMargin = (int)TypedValue.applyDimension(1, f, c.c(resources));
       relativeLayo.setLayoutParams(layoutParams);
       selectShapeR.addView(relativeLayo);
       AppCompatTextView uAppCompatTe1 = new AppCompatTextView(relativeLayo.getContext());
       uAppCompatTe1.setId(R.id.live_wish_list_destination_text_view);
       uAppCompatTe1.setEllipsize(TextUtils$TruncateAt.END);
       uAppCompatTe1.setGravity(16);
       uAppCompatTe1.setIncludeFontPadding(false);
       uAppCompatTe1.setMaxLines(1);
       uAppCompatTe1.setTextColor(resources.getColor(R.color.arg_RES_7f061c32));
       uAppCompatTe1.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       relativeLayo.addView(uAppCompatTe1);
       uAppCompatTe1 = new AppCompatTextView(relativeLayo.getContext());
       uAppCompatTe1.setId(R.id.live_wish_list_achieve_text_view);
       uAppCompatTe1.setEllipsize(TextUtils$TruncateAt.END);
       uAppCompatTe1.setGravity(16);
       uAppCompatTe1.setMaxLines(1);
       uAppCompatTe1.setText(R.string.arg_RES_7f102f22);
       uAppCompatTe1.setTextColor(resources.getColor(R.color.arg_RES_7f061c32));
       uAppCompatTe1.setVisibility(8);
       uAppCompatTe1.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       relativeLayo.addView(uAppCompatTe1);
       ProgressBar progressBar = new ProgressBar(new ContextThemeWrapper(selectShapeR.getContext(), 0x1010078), null, 0);
       id = Looper.getMainLooper().getThread().getId();
       if (id - Thread.currentThread().getId()) {
          try{
             Field declaredFiel = ProgressBar.class.getDeclaredField("mUiThreadId");
             declaredFiel.setAccessible(1);
             declaredFiel.set(progressBar, Long.valueOf(id));
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
}
