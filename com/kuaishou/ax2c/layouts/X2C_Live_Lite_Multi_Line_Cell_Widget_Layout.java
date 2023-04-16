package com.kuaishou.ax2c.layouts.X2C_Live_Lite_Multi_Line_Cell_Widget_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import android.widget.FrameLayout$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.LinearLayout$LayoutParams;
import android.widget.ImageView;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import android.content.res.ColorStateList;
import e2.d;
import com.facebook.drawee.view.SimpleDraweeView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;

public class X2C_Live_Lite_Multi_Line_Cell_Widget_Layout implements IViewCreator	// class@0010f8
{

    public void X2C_Live_Lite_Multi_Line_Cell_Widget_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setPadding(c.b(resources, R.dimen.arg_RES_7f070334), 0, c.b(resources, R.dimen.arg_RES_7f070334), 0);
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       LinearLayout linearLayout = new LinearLayout(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, c.b(resources, 0x7f070851));
       linearLayout.setId(R.id.multi_line_peer_info_layout);
       linearLayout.setGravity(21);
       layoutParams.gravity = 85;
       linearLayout.setOrientation(0);
       layoutParams.bottomMargin = c.b(resources, 0x7f070846);
       linearLayout.setBackgroundResource(R.drawable.arg_RES_7f0813ab);
       linearLayout.setLayoutParams(layoutParams);
       uFrameLayout.addView(linearLayout);
       KwaiImageView kwaiImageVie = new KwaiImageView(linearLayout.getContext());
       LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(c.b(resources, 0x7f070850), c.b(resources, 0x7f070850));
       kwaiImageVie.setId(R.id.multi_line_mute_icon);
       layoutParams1.leftMargin = c.b(resources, 0x7f0702e3);
       layoutParams1.rightMargin = (int)TypedValue.applyDimension(1, -2.00f, c.c(resources));
       layoutParams1.gravity = 16;
       kwaiImageVie.setVisibility(0);
       d.c(kwaiImageVie, ColorStateList.valueOf(ContextCompat.getColor(p0, R.color.arg_RES_7f060634)));
       kwaiImageVie.setActualImageResource(R.drawable.arg_RES_7f0805ab);
       kwaiImageVie.getHierarchy().u(t$b.h);
       kwaiImageVie.setLayoutParams(layoutParams1);
       linearLayout.addView(kwaiImageVie);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(linearLayout.getContext());
       LinearLayout$LayoutParams layoutParams2 = new LinearLayout$LayoutParams(-2, c.b(resources, 0x7f0702b8));
       uAppCompatTe.setId(R.id.multi_line_peer_name);
       layoutParams2.gravity = 16;
       layoutParams2.leftMargin = c.b(resources, 0x7f07031b);
       layoutParams2.rightMargin = c.b(resources, 0x7f07031b);
       uAppCompatTe.setEllipsize(TextUtils$TruncateAt.END);
       uAppCompatTe.setGravity(17);
       uAppCompatTe.setMaxLines(1);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f06060a));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.pv));
       uAppCompatTe.setLayoutParams(layoutParams2);
       linearLayout.addView(uAppCompatTe);
       return uFrameLayout;
    }
}
