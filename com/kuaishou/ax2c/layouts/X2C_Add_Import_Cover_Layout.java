package com.kuaishou.ax2c.layouts.X2C_Add_Import_Cover_Layout;
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
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.util.DisplayMetrics;
import android.util.TypedValue;

public class X2C_Add_Import_Cover_Layout implements IViewCreator	// class@001089
{

    public void X2C_Add_Import_Cover_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       RelativeLayout relativeLayo = new RelativeLayout(p0);
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(c.b(resources, 0x7f070307), c.b(resources, 0x7f07031d));
       relativeLayo.setId(R.id.add_import_cover_rl);
       layoutParams.setMargins(c.b(resources, R.dimen.arg_RES_7f07030a), c.b(resources, R.dimen.arg_RES_7f07030a), c.b(resources, R.dimen.arg_RES_7f07030a), c.b(resources, R.dimen.arg_RES_7f07030a));
       relativeLayo.setBackgroundResource(R.drawable.arg_RES_7f0800cc);
       relativeLayo.setLayoutParams(layoutParams);
       KwaiImageView kwaiImageVie = new KwaiImageView(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams1 = new RelativeLayout$LayoutParams(c.b(resources, 0x7f070295), c.b(resources, 0x7f070295));
       kwaiImageVie.setId(R.id.add_import_cover_icon);
       layoutParams1.addRule(14, -1);
       layoutParams1.topMargin = c.b(resources, 0x7f07025d);
       kwaiImageVie.getHierarchy().F(ContextCompat.getDrawable(p0, R.drawable.arg_RES_7f080f32));
       kwaiImageVie.setLayoutParams(layoutParams1);
       relativeLayo.addView(kwaiImageVie);
       KwaiSizeAdjustableTextView kwaiSizeAdju = new KwaiSizeAdjustableTextView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(-2, -2);
       layoutParams.addRule(3, R.id.add_import_cover_icon);
       layoutParams.addRule(14, -1);
       layoutParams.topMargin = c.b(resources, 0x7f0702e3);
       kwaiSizeAdju.setGravity(17);
       kwaiSizeAdju.setText(R.string.arg_RES_7f10164d);
       kwaiSizeAdju.setTextColor(resources.getColor(R.color.arg_RES_7f061ff3));
       kwaiSizeAdju.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070356));
       kwaiSizeAdju.setInitTextSize(TypedValue.applyDimension(0, (float)c.b(resources, R.dimen.arg_RES_7f070356), c.c(resources)));
       kwaiSizeAdju.setLayoutParams(layoutParams);
       relativeLayo.addView(kwaiSizeAdju);
       return relativeLayo;
    }
}
