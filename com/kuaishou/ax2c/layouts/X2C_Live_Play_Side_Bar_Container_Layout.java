package com.kuaishou.ax2c.layouts.X2C_Live_Play_Side_Bar_Container_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import android.widget.RelativeLayout;
import com.kuaishou.ax2c.layouts.X2C_Photo_Feed_Side_Bar_Layout;
import android.widget.RelativeLayout$LayoutParams;
import com.kuaishou.ax2c.layouts.X2C_Live_Square_Side_Bar_Layout;
import android.view.ViewStub;
import androidx.appcompat.widget.AppCompatImageView;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;

public class X2C_Live_Play_Side_Bar_Container_Layout implements IViewCreator	// class@00110d
{

    public void X2C_Live_Play_Side_Bar_Container_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       KwaiImageView kwaiImageVie = new KwaiImageView(uFrameLayout.getContext());
       kwaiImageVie.setId(R.id.photo_feed_side_bar_cover_view);
       kwaiImageVie.setScaleType(ImageView$ScaleType.CENTER_CROP);
       kwaiImageVie.setVisibility(8);
       kwaiImageVie.getHierarchy().x(0);
       kwaiImageVie.getHierarchy().F(ContextCompat.getDrawable(p0, R.color.arg_RES_7f06203d));
       kwaiImageVie.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(kwaiImageVie);
       RelativeLayout relativeLayo = new RelativeLayout(uFrameLayout.getContext());
       relativeLayo.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(relativeLayo);
       View view = new X2C_Photo_Feed_Side_Bar_Layout().createView(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams = view.getLayoutParams();
       view.setId(R.id.photo_feed_side_bar_layout);
       layoutParams.addRule(11, -1);
       view.setLayoutParams(layoutParams);
       relativeLayo.addView(view);
       view = new X2C_Live_Square_Side_Bar_Layout().createView(relativeLayo.getContext());
       layoutParams = view.getLayoutParams();
       layoutParams.addRule(11, -1);
       view.setLayoutParams(layoutParams);
       relativeLayo.addView(view);
       ViewStub viewStub = new ViewStub(relativeLayo.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.merchant_photo_feed_side_bar_layout_stub);
       viewStub.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       relativeLayo.addView(viewStub);
       AppCompatImageView uAppCompatIm = new AppCompatImageView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 24.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 34.00f, c.c(resources)));
       uAppCompatIm.setId(R.id.photo_feed_side_bar_close_view);
       layoutParams.topMargin = (int)TypedValue.applyDimension(1, 41.00f, c.c(resources));
       layoutParams.addRule(11, -1);
       uAppCompatIm.setImageResource(R.drawable.arg_RES_7f081a9c);
       uAppCompatIm.setVisibility(8);
       uAppCompatIm.setLayoutParams(layoutParams);
       relativeLayo.addView(uAppCompatIm);
       return uFrameLayout;
    }
}
