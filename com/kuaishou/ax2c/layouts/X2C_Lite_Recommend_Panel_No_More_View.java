package com.kuaishou.ax2c.layouts.X2C_Lite_Recommend_Panel_No_More_View;
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
import cw9.c;
import android.widget.TextView;

public class X2C_Lite_Recommend_Panel_No_More_View implements IViewCreator	// class@0010c1
{

    public void X2C_Lite_Recommend_Panel_No_More_View(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       LinearLayout linearLayout = new LinearLayout(p0);
       linearLayout.setGravity(17);
       linearLayout.setOrientation(1);
       linearLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -2));
       AppCompatTextView uAppCompatTe = new AppCompatTextView(linearLayout.getContext());
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -2);
       layoutParams.topMargin = c.b(resources, 0x7f0702ab);
       layoutParams.bottomMargin = c.b(resources, 0x7f070283);
       uAppCompatTe.setText(R.string.arg_RES_7f103973);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f060186));
       uAppCompatTe.setTextSize(1, 10.00f);
       uAppCompatTe.setLayoutParams(layoutParams);
       linearLayout.addView(uAppCompatTe);
       return linearLayout;
    }
}
