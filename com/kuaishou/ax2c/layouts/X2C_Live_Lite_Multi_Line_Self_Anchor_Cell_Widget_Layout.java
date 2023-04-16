package com.kuaishou.ax2c.layouts.X2C_Live_Lite_Multi_Line_Self_Anchor_Cell_Widget_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.FrameLayout$LayoutParams;
import cw9.c;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import java.lang.CharSequence;

public class X2C_Live_Lite_Multi_Line_Self_Anchor_Cell_Widget_Layout implements IViewCreator	// class@0010fa
{

    public void X2C_Live_Lite_Multi_Line_Self_Anchor_Cell_Widget_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setId(R.id.live_audience_multi_line_widget_container);
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       AppCompatTextView uAppCompatTe = new AppCompatTextView(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, c.b(resources, 0x7f0702b8));
       uAppCompatTe.setId(R.id.live_audience_multi_line_self_anchor_tag);
       layoutParams.bottomMargin = c.b(resources, 0x7f070334);
       layoutParams.setMarginEnd(c.b(resources, R.dimen.arg_RES_7f070334));
       uAppCompatTe.setEllipsize(TextUtils$TruncateAt.END);
       uAppCompatTe.setGravity(17);
       uAppCompatTe.setMaxLines(1);
       uAppCompatTe.setBackgroundResource(R.drawable.arg_RES_7f0813ab);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f06060a));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.pv));
       uAppCompatTe.setText("Ö÷²¥");
       layoutParams.gravity = 85;
       int i = c.b(resources, R.dimen.arg_RES_7f07031b);
       uAppCompatTe.setPadding(i, 0, c.b(resources, R.dimen.arg_RES_7f07031b), 0);
       uAppCompatTe.setLayoutParams(layoutParams);
       uFrameLayout.addView(uAppCompatTe);
       return uFrameLayout;
    }
}
