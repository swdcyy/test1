package com.kuaishou.ax2c.layouts.X2C_Share_Un_Match_Topic_Tips_Wrap;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.widget.LinearLayout$LayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.RelativeLayout$LayoutParams;
import android.text.TextUtils$TruncateAt;
import android.widget.TextView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.ImageView;

public class X2C_Share_Un_Match_Topic_Tips_Wrap implements IViewCreator	// class@001132
{

    public void X2C_Share_Un_Match_Topic_Tips_Wrap(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       RelativeLayout relativeLayo = new RelativeLayout(p0);
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-1, (int)TypedValue.applyDimension(1, 0x41f00000, c.c(resources)));
       relativeLayo.setId(R.id.share_unmatch_topic_tips);
       layoutParams.bottomMargin = c.b(resources, 0x7f07025d);
       relativeLayo.setBackgroundColor(resources.getColor(R.color.arg_RES_7f0616ab));
       relativeLayo.setVisibility(8);
       relativeLayo.setPadding(c.b(resources, R.dimen.arg_RES_7f070cb5), 0, c.b(resources, R.dimen.arg_RES_7f070356), 0);
       relativeLayo.setLayoutParams(layoutParams);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams1 = new RelativeLayout$LayoutParams(-1, -1);
       layoutParams1.addRule(9, -1);
       layoutParams1.addRule(15, -1);
       layoutParams1.addRule(0, R.id.share_topic_tips_close_btn);
       uAppCompatTe.setEllipsize(TextUtils$TruncateAt.END);
       uAppCompatTe.setGravity(16);
       uAppCompatTe.setSingleLine(1);
       uAppCompatTe.setText(R.string.arg_RES_7f104021);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f0617cc));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f70));
       uAppCompatTe.setLayoutParams(layoutParams1);
       relativeLayo.addView(uAppCompatTe);
       LinearLayout linearLayout = new LinearLayout(relativeLayo.getContext());
       layoutParams1 = new RelativeLayout$LayoutParams(c.b(resources, 0x7f0702e8), c.b(resources, 0x7f0702e8));
       linearLayout.setId(R.id.share_topic_tips_close_btn);
       layoutParams1.addRule(11, -1);
       layoutParams1.addRule(15, -1);
       linearLayout.setGravity(17);
       linearLayout.setLayoutParams(layoutParams1);
       relativeLayo.addView(linearLayout);
       AppCompatImageView uAppCompatIm = new AppCompatImageView(linearLayout.getContext());
       int i = c.b(resources, R.dimen.arg_RES_7f070295);
       uAppCompatIm.setImageResource(R.drawable.arg_RES_7f081dc7);
       uAppCompatIm.setLayoutParams(new LinearLayout$LayoutParams(i, c.b(resources, R.dimen.arg_RES_7f070295)));
       linearLayout.addView(uAppCompatIm);
       return relativeLayo;
    }
}
