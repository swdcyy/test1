package com.kuaishou.ax2c.layouts.X2C_Live_Lite_Anchor_Info_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.LinearLayout$LayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import android.graphics.Typeface;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;

public class X2C_Live_Lite_Anchor_Info_Layout implements IViewCreator	// class@0010e9
{

    public void X2C_Live_Lite_Anchor_Info_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       LinearLayout linearLayout = new LinearLayout(p0);
       linearLayout.setId(R.id.live_lite_anchor_info_container);
       linearLayout.setGravity(16);
       linearLayout.setOrientation(0);
       linearLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-2, -2));
       AppCompatTextView uAppCompatTe = new AppCompatTextView(linearLayout.getContext());
       uAppCompatTe.setId(R.id.live_lite_anchor_info_name_text_view);
       uAppCompatTe.setSingleLine(1);
       uAppCompatTe.setEllipsize(TextUtils$TruncateAt.END);
       uAppCompatTe.setMaxLines(1);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f0607c6));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f0702a4));
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), uAppCompatTe.getShadowDx(), uAppCompatTe.getShadowDy(), resources.getColor(R.color.arg_RES_7f06019d));
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), uAppCompatTe.getShadowDx(), 0, uAppCompatTe.getShadowColor());
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), 0, uAppCompatTe.getShadowDy(), uAppCompatTe.getShadowColor());
       uAppCompatTe.setTypeface(null, 1);
       uAppCompatTe.setShadowLayer(6.00f, uAppCompatTe.getShadowDx(), uAppCompatTe.getShadowDy(), uAppCompatTe.getShadowColor());
       uAppCompatTe.setTag("compressible-view");
       uAppCompatTe.setLayoutParams(new LinearLayout$LayoutParams(-2, (int)TypedValue.applyDimension(1, 26.00f, c.c(resources))));
       linearLayout.addView(uAppCompatTe);
       KwaiImageView kwaiImageVie = new KwaiImageView(linearLayout.getContext());
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(c.b(resources, 0x7f070295), c.b(resources, 0x7f070295));
       kwaiImageVie.setId(R.id.live_lite_anchor_info_verified_image_view);
       layoutParams.leftMargin = c.b(resources, 0x7f07031b);
       kwaiImageVie.setLayoutParams(layoutParams);
       linearLayout.addView(kwaiImageVie);
       return linearLayout;
    }
}
