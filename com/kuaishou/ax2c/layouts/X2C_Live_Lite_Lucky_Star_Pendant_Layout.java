package com.kuaishou.ax2c.layouts.X2C_Live_Lite_Lucky_Star_Pendant_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.widget.LinearLayout;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.LinearLayout$LayoutParams;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;

public class X2C_Live_Lite_Lucky_Star_Pendant_Layout implements IViewCreator	// class@0010f7
{

    public void X2C_Live_Lite_Lucky_Star_Pendant_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       LivePkShimmerLayout livePkShimme = new LivePkShimmerLayout(p0);
       livePkShimme.setOrientation(0);
       livePkShimme.setId(R.id.lite_lucky_star_simmer_view);
       livePkShimme.setRotateAngle(30);
       livePkShimme.setShimmerBottomLeftRadius((int)TypedValue.applyDimension(1, 12.50f, c.c(resources)));
       livePkShimme.setShimmerBottomRightRadius((int)TypedValue.applyDimension(1, 12.50f, c.c(resources)));
       livePkShimme.setShimmerTopLeftRadius((int)TypedValue.applyDimension(1, 12.50f, c.c(resources)));
       livePkShimme.setShimmerTopRightRadius((int)TypedValue.applyDimension(1, 12.50f, c.c(resources)));
       livePkShimme.setLayoutParams(new ViewGroup$MarginLayoutParams(-2, c.b(resources, R.dimen.arg_RES_7f070594)));
       KwaiImageView kwaiImageVie = new KwaiImageView(livePkShimme.getContext());
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(c.b(resources, 0x7f070295), c.b(resources, 0x7f070295));
       kwaiImageVie.setId(R.id.lite_lucky_star_icon_image_view);
       layoutParams.gravity = 16;
       layoutParams.leftMargin = c.b(resources, 0x7f07031b);
       kwaiImageVie.setLayoutParams(layoutParams);
       livePkShimme.addView(kwaiImageVie);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(livePkShimme.getContext());
       layoutParams = new LinearLayout$LayoutParams(-2, -2);
       uAppCompatTe.setId(R.id.lite_lucky_star_content_text_view);
       layoutParams.gravity = 16;
       layoutParams.leftMargin = c.b(resources, 0x7f0702e3);
       layoutParams.rightMargin = c.b(resources, 0x7f070334);
       uAppCompatTe.setGravity(3);
       uAppCompatTe.setMinWidth(c.b(resources, R.dimen.arg_RES_7f0702f3));
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f060874));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070271));
       uAppCompatTe.setLayoutParams(layoutParams);
       livePkShimme.addView(uAppCompatTe);
       return livePkShimme;
    }
}
