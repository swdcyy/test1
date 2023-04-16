package com.kuaishou.ax2c.layouts.X2C_Share_Business_Link_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.widget.FrameLayout$LayoutParams;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.LinearLayout$LayoutParams;
import android.widget.ImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import xb.t$b;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import android.graphics.Typeface;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.graphics.drawable.a;

public class X2C_Share_Business_Link_Layout implements IViewCreator	// class@001123
{

    public void X2C_Share_Business_Link_Layout(){
       super();
    }
    public View createView(Context p0){
       Drawable drawable;
       Resources resources = p0.getResources();
       RelativeLayout relativeLayo = new RelativeLayout(p0);
       relativeLayo.setLayoutParams(new FrameLayout$LayoutParams(-1, c.b(resources, R.dimen.arg_RES_7f070e6d)));
       LinearLayout linearLayout = new LinearLayout(relativeLayo.getContext());
       int i = -2;
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(i, i);
       linearLayout.setId(R.id.share_business_left_area);
       int i1 = 15;
       layoutParams.addRule(i1, -1);
       linearLayout.setGravity(16);
       linearLayout.setOrientation(0);
       linearLayout.setLayoutParams(layoutParams);
       relativeLayo.addView(linearLayout);
       KwaiImageView kwaiImageVie = new KwaiImageView(linearLayout.getContext());
       LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(c.b(resources, 0x7f0702cc), c.b(resources, 0x7f0702cc));
       kwaiImageVie.setId(R.id.share_business_left_icon);
       layoutParams1.setMarginEnd(c.b(resources, R.dimen.arg_RES_7f07034b));
       kwaiImageVie.setVisibility(8);
       kwaiImageVie.getHierarchy().G(ContextCompat.getDrawable(p0, R.drawable.arg_RES_7f081cba), t$b.i);
       kwaiImageVie.setLayoutParams(layoutParams1);
       linearLayout.addView(kwaiImageVie);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(linearLayout.getContext());
       uAppCompatTe.setId(R.id.share_business_link_name);
       uAppCompatTe.setEllipsize(TextUtils$TruncateAt.MARQUEE);
       uAppCompatTe.setMarqueeRepeatLimit(-1);
       uAppCompatTe.setSingleLine(true);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f061f94));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f71));
       uAppCompatTe.setTypeface(null, true);
       uAppCompatTe.setLayoutParams(new LinearLayout$LayoutParams(i, i));
       linearLayout.addView(uAppCompatTe);
       LinearLayout linearLayout1 = new LinearLayout(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams2 = new RelativeLayout$LayoutParams(i, i);
       layoutParams2.addRule(21, -1);
       layoutParams2.addRule(i1, -1);
       linearLayout1.setGravity(16);
       linearLayout1.setOrientation(0);
       linearLayout1.setLayoutParams(layoutParams2);
       relativeLayo.addView(linearLayout1);
       AppCompatTextView uAppCompatTe1 = new AppCompatTextView(linearLayout1.getContext());
       uAppCompatTe1.setId(R.id.share_business_link_value);
       uAppCompatTe1.setEllipsize(TextUtils$TruncateAt.END);
       uAppCompatTe1.setGravity(17);
       uAppCompatTe1.setMaxWidth(c.b(resources, R.dimen.arg_RES_7f070268));
       uAppCompatTe1.setSingleLine(true);
       uAppCompatTe1.setTextColor(resources.getColor(R.color.arg_RES_7f0616a7));
       uAppCompatTe1.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f6e));
       uAppCompatTe1.setLayoutParams(new LinearLayout$LayoutParams(i, -1));
       linearLayout1.addView(uAppCompatTe1);
       AppCompatImageView uAppCompatIm = new AppCompatImageView(linearLayout1.getContext());
       LinearLayout$LayoutParams layoutParams3 = new LinearLayout$LayoutParams(i, i);
       uAppCompatIm.setId(R.id.share_business_link_arrow);
       layoutParams3.setMarginStart(c.b(resources, R.dimen.arg_RES_7f07031b));
       uAppCompatIm.setImageResource(R.drawable.arg_RES_7f081ba7);
       drawable = uAppCompatIm.getDrawable();
       if (drawable != null) {
          drawable = a.r(drawable);
          a.n(drawable.mutate(), resources.getColor(R.color.arg_RES_7f0606b9));
          uAppCompatIm.setImageDrawable(drawable);
       }
       uAppCompatIm.setLayoutParams(layoutParams3);
       linearLayout1.addView(uAppCompatIm);
       return relativeLayo;
    }
}
