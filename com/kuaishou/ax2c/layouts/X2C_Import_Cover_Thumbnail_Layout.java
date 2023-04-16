package com.kuaishou.ax2c.layouts.X2C_Import_Cover_Thumbnail_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout$LayoutParams;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.util.DisplayMetrics;
import android.util.TypedValue;

public class X2C_Import_Cover_Thumbnail_Layout implements IViewCreator	// class@0010af
{

    public void X2C_Import_Cover_Thumbnail_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       RelativeLayout relativeLayo = new RelativeLayout(p0);
       relativeLayo.setId(R.id.import_cover_thumbnail_rl);
       relativeLayo.setLayoutParams(new RelativeLayout$LayoutParams(c.b(resources, R.dimen.arg_RES_7f070313), c.b(resources, R.dimen.arg_RES_7f070325)));
       KwaiImageView kwaiImageVie = new KwaiImageView(relativeLayo.getContext());
       int i = -1;
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(i, i);
       kwaiImageVie.setId(R.id.imported_cover_thumbnail);
       int i1 = 0x7f07030a;
       layoutParams.setMargins(c.b(resources, i1), c.b(resources, i1), c.b(resources, i1), c.b(resources, i1));
       layoutParams.addRule(15, i);
       kwaiImageVie.setScaleType(ImageView$ScaleType.FIT_CENTER);
       kwaiImageVie.setAlpha(0x3f000000);
       if (kwaiImageVie.getHierarchy().n() == null) {
          kwaiImageVie.getHierarchy().L(new RoundingParams());
       }
       kwaiImageVie.getHierarchy().n().n((float)c.b(resources, R.dimen.arg_RES_7f070426));
       kwaiImageVie.setLayoutParams(layoutParams);
       relativeLayo.addView(kwaiImageVie);
       kwaiImageVie = new KwaiImageView(relativeLayo.getContext());
       kwaiImageVie.setId(R.id.imported_cover_thumbnail_selection);
       kwaiImageVie.setAlpha(0x3f800000);
       kwaiImageVie.setVisibility(8);
       kwaiImageVie.setBackgroundResource(R.drawable.arg_RES_7f082451);
       kwaiImageVie.setLayoutParams(new RelativeLayout$LayoutParams(i, i));
       relativeLayo.addView(kwaiImageVie);
       KwaiSizeAdjustableTextView kwaiSizeAdju = new KwaiSizeAdjustableTextView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(i, i);
       kwaiSizeAdju.setId(R.id.imported_cover_text);
       layoutParams.setMargins(c.b(resources, i1), c.b(resources, i1), c.b(resources, i1), c.b(resources, i1));
       kwaiSizeAdju.setText(R.string.arg_RES_7f10164c);
       kwaiSizeAdju.setGravity(17);
       kwaiSizeAdju.setTextColor(resources.getColor(R.color.arg_RES_7f061ff3));
       kwaiSizeAdju.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f07025d));
       kwaiSizeAdju.setInitTextSize(TypedValue.applyDimension(0, (float)c.b(resources, R.dimen.arg_RES_7f07025d), c.c(resources)));
       kwaiSizeAdju.setShadowLayer(kwaiSizeAdju.getShadowRadius(), 0, kwaiSizeAdju.getShadowDy(), kwaiSizeAdju.getShadowColor());
       kwaiSizeAdju.setShadowLayer(kwaiSizeAdju.getShadowRadius(), kwaiSizeAdju.getShadowDx(), 0, kwaiSizeAdju.getShadowColor());
       kwaiSizeAdju.setShadowLayer(5.00f, kwaiSizeAdju.getShadowDx(), kwaiSizeAdju.getShadowDy(), kwaiSizeAdju.getShadowColor());
       kwaiSizeAdju.setShadowLayer(kwaiSizeAdju.getShadowRadius(), kwaiSizeAdju.getShadowDx(), kwaiSizeAdju.getShadowDy(), resources.getColor(R.color.arg_RES_7f061c15));
       kwaiSizeAdju.setLayoutParams(layoutParams);
       relativeLayo.addView(kwaiSizeAdju);
       return relativeLayo;
    }
}
