package com.kuaishou.ax2c.layouts.X2C_Lite_Watching_Count_Layout_V2;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.widget.TextView;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup$LayoutParams;

public class X2C_Lite_Watching_Count_Layout_V2 implements IViewCreator	// class@0010cc
{

    public void X2C_Lite_Watching_Count_Layout_V2(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       AppCompatTextView uAppCompatTe = new AppCompatTextView(p0);
       ViewGroup$MarginLayoutParams marginLayout = new ViewGroup$MarginLayoutParams(-2, c.b(resources, 0x7f0702cc));
       uAppCompatTe.setId(R.id.lite_watching_count_view);
       marginLayout.leftMargin = (int)TypedValue.applyDimension(1, -2.00f, c.c(resources));
       uAppCompatTe.setBackgroundResource(R.drawable.arg_RES_7f08022e);
       uAppCompatTe.setGravity(17);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f0607e1));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070271));
       uAppCompatTe.setLayoutParams(marginLayout);
       return uAppCompatTe;
    }
}
