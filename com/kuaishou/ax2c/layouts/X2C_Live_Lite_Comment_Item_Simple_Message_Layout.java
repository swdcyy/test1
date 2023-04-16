package com.kuaishou.ax2c.layouts.X2C_Live_Lite_Comment_Item_Simple_Message_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import com.yxcorp.gifshow.widget.EmojiTextView;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

public class X2C_Live_Lite_Comment_Item_Simple_Message_Layout implements IViewCreator	// class@0010ed
{

    public void X2C_Live_Lite_Comment_Item_Simple_Message_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       ConstraintLayout uConstraintL = new ConstraintLayout(p0);
       ViewGroup$MarginLayoutParams marginLayout = new ViewGroup$MarginLayoutParams(-1, -2);
       marginLayout.topMargin = (int)TypedValue.applyDimension(1, 2.00f, c.c(resources));
       uConstraintL.setLayoutParams(marginLayout);
       EmojiTextView uEmojiTextVi = new EmojiTextView(uConstraintL.getContext());
       ConstraintLayout$LayoutParams layoutParams = new ConstraintLayout$LayoutParams(-2, -2);
       uEmojiTextVi.setId(R.id.live_lite_comment_item_simple_message_text);
       uEmojiTextVi.setGravity(51);
       uEmojiTextVi.setBackgroundResource(R.drawable.arg_RES_7f081319);
       uEmojiTextVi.setTextSize(1, 14.00f);
       uEmojiTextVi.setIncludeFontPadding(1);
       layoutParams.h = 0;
       layoutParams.d = 0;
       layoutParams.T = true;
       layoutParams.U = true;
       uEmojiTextVi.setPadding((int)TypedValue.applyDimension(1, 8.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 0x3f800000, c.c(resources)), (int)TypedValue.applyDimension(1, 8.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 0x3f800000, c.c(resources)));
       layoutParams.c();
       uEmojiTextVi.setLayoutParams(layoutParams);
       uConstraintL.addView(uEmojiTextVi);
       return uConstraintL;
    }
}
