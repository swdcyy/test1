package com.kuaishou.ax2c.layouts.X2C_Lite_Watching_Count_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.ViewGroup$MarginLayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;

public class X2C_Lite_Watching_Count_Layout implements IViewCreator	// class@0010cb
{

    public void X2C_Lite_Watching_Count_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       AppCompatTextView uAppCompatTe = new AppCompatTextView(p0);
       ViewGroup$MarginLayoutParams marginLayout = new ViewGroup$MarginLayoutParams(-2, (int)TypedValue.applyDimension(1, 20.00f, c.c(resources)));
       uAppCompatTe.setId(R.id.lite_watching_count_view);
       marginLayout.leftMargin = (int)TypedValue.applyDimension(1, -2.00f, c.c(resources));
       uAppCompatTe.setGravity(17);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f0607c6));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070283));
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), uAppCompatTe.getShadowDx(), uAppCompatTe.getShadowDy(), resources.getColor(R.color.arg_RES_7f06019d));
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), uAppCompatTe.getShadowDx(), 0, uAppCompatTe.getShadowColor());
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), 0, uAppCompatTe.getShadowDy(), uAppCompatTe.getShadowColor());
       uAppCompatTe.setShadowLayer(6.00f, uAppCompatTe.getShadowDx(), uAppCompatTe.getShadowDy(), uAppCompatTe.getShadowColor());
       uAppCompatTe.setLayoutParams(marginLayout);
       return uAppCompatTe;
    }
}
