package com.google.android.material.tabs.CustomTabView;
import android.widget.LinearLayout;
import android.content.Context;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import android.widget.LinearLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;

public class CustomTabView extends LinearLayout	// class@0016b3
{
    public final TextView b;

    public void CustomTabView(Context p0){
       super(p0);
       TextView textView = new TextView(p0);
       this.b = textView;
       textView.setId(0x1020014);
       textView.setEllipsize(TextUtils$TruncateAt.END);
       textView.setMaxLines(1);
       textView.setGravity(17);
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -1);
       layoutParams.gravity = 17;
       this.addView(textView, layoutParams);
       this.setOrientation(1);
       this.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
    }
    public TextView getTextView(){
       return this.b;
    }
}
