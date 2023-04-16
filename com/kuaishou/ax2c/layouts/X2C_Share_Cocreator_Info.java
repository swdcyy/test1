package com.kuaishou.ax2c.layouts.X2C_Share_Cocreator_Info;
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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.graphics.drawable.a;

public class X2C_Share_Cocreator_Info implements IViewCreator	// class@001124
{

    public void X2C_Share_Cocreator_Info(){
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
       int i1 = 15;
       layoutParams.addRule(i1, -1);
       linearLayout.setGravity(16);
       linearLayout.setOrientation(0);
       linearLayout.setLayoutParams(layoutParams);
       relativeLayo.addView(linearLayout);
       KwaiImageView kwaiImageVie = new KwaiImageView(linearLayout.getContext());
       LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(c.b(resources, 0x7f0702cc), c.b(resources, 0x7f0702cc));
       kwaiImageVie.setId(R.id.share_cocreator_icon);
       layoutParams1.setMarginEnd(c.b(resources, R.dimen.arg_RES_7f07034b));
       kwaiImageVie.getHierarchy().G(ContextCompat.getDrawable(p0, R.drawable.arg_RES_7f08097c), t$b.i);
       kwaiImageVie.setLayoutParams(layoutParams1);
       linearLayout.addView(kwaiImageVie);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(linearLayout.getContext());
       uAppCompatTe.setId(R.id.share_cocreator_name);
       uAppCompatTe.setEllipsize(TextUtils$TruncateAt.END);
       uAppCompatTe.setSingleLine(true);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f061f94));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f72));
       uAppCompatTe.setText(R.string.arg_RES_7f10067c);
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
       uAppCompatTe1.setId(R.id.share_cocreator_title);
       uAppCompatTe1.setEllipsize(TextUtils$TruncateAt.END);
       uAppCompatTe1.setGravity(17);
       uAppCompatTe1.setMaxWidth(c.b(resources, R.dimen.arg_RES_7f070268));
       uAppCompatTe1.setSingleLine(true);
       uAppCompatTe1.setTextColor(resources.getColor(R.color.arg_RES_7f0607cf));
       uAppCompatTe1.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f70));
       uAppCompatTe1.setLayoutParams(new LinearLayout$LayoutParams(i, -1));
       linearLayout1.addView(uAppCompatTe1);
       AppCompatImageView uAppCompatIm = new AppCompatImageView(linearLayout1.getContext());
       LinearLayout$LayoutParams layoutParams3 = new LinearLayout$LayoutParams(i, i);
       uAppCompatIm.setId(R.id.share_corcreator_arrow);
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
