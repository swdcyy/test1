package com.kuaishou.ax2c.layouts.X2C_Photo_Feed_Side_Bar_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout$LayoutParams;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.AppCompatTextView;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;

public class X2C_Photo_Feed_Side_Bar_Layout implements IViewCreator	// class@00111d
{

    public void X2C_Photo_Feed_Side_Bar_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       RelativeLayout relativeLayo = new RelativeLayout(p0);
       relativeLayo.setId(R.id.photo_feed_side_bar_layout);
       relativeLayo.setTranslationX((float)c.b(resources, R.dimen.arg_RES_7f070c56));
       relativeLayo.setLayoutParams(new RelativeLayout$LayoutParams(c.b(resources, R.dimen.arg_RES_7f070c56), -1));
       View view = new View(relativeLayo.getContext());
       view.setBackgroundColor(resources.getColor(R.color.arg_RES_7f060759));
       view.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       relativeLayo.addView(view);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 66.00f, c.c(resources)), -2);
       uAppCompatTe.setId(R.id.photo_feed_side_bar_place_holder_text_view);
       layoutParams.addRule(13, -1);
       uAppCompatTe.setGravity(17);
       uAppCompatTe.setText(R.string.arg_RES_7f101f03);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f061c32));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f6e));
       uAppCompatTe.setVisibility(8);
       uAppCompatTe.setLayoutParams(layoutParams);
       relativeLayo.addView(uAppCompatTe);
       uAppCompatTe = new AppCompatTextView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 66.00f, c.c(resources)), -2);
       uAppCompatTe.setId(R.id.photo_feed_side_bar_title_text_view);
       layoutParams.addRule(10, -1);
       layoutParams.addRule(14, -1);
       layoutParams.topMargin = c.b(resources, 0x7f070295);
       uAppCompatTe.setGravity(17);
       uAppCompatTe.setMaxLines(1);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f0607c7));
       uAppCompatTe.setTextSize(1, 16.00f);
       uAppCompatTe.setVisibility(8);
       uAppCompatTe.setLayoutParams(layoutParams);
       relativeLayo.addView(uAppCompatTe);
       RecyclerView recyclerView = new RecyclerView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(-1, -1);
       recyclerView.setId(R.id.photo_feed_side_bar_recycler_view);
       layoutParams.leftMargin = c.b(resources, 0x7f0701dc);
       layoutParams.topMargin = c.b(resources, 0x7f070c55);
       layoutParams.rightMargin = c.b(resources, 0x7f0701dc);
       layoutParams.bottomMargin = c.b(resources, 0x7f070c54);
       recyclerView.setLayoutParams(layoutParams);
       relativeLayo.addView(recyclerView);
       return relativeLayo;
    }
}
