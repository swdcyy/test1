package com.kuaishou.ax2c.layouts.X2C_Live_Lite_Interactive_Message_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.widget.EmojiTextView;
import android.widget.FrameLayout$LayoutParams;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.text.TextUtils$TruncateAt;

public class X2C_Live_Lite_Interactive_Message_Layout implements IViewCreator	// class@0010f3
{

    public void X2C_Live_Lite_Interactive_Message_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setId(R.id.live_lite_interactive_message_container);
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, (int)TypedValue.applyDimension(1, 0, c.c(resources))));
       EmojiTextView uEmojiTextVi = new EmojiTextView(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
       uEmojiTextVi.setId(R.id.live_lite_interactive_message_first_text_view);
       uEmojiTextVi.setGravity(19);
       uEmojiTextVi.setBackgroundResource(R.drawable.arg_RES_7f081319);
       uEmojiTextVi.setTextSize(1, 14.00f);
       uEmojiTextVi.setIncludeFontPadding(1);
       uEmojiTextVi.setEllipsize(TextUtils$TruncateAt.END);
       layoutParams.topMargin = (int)TypedValue.applyDimension(1, 2.00f, c.c(resources));
       uEmojiTextVi.setPadding((int)TypedValue.applyDimension(1, 8.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 0x3f800000, c.c(resources)), (int)TypedValue.applyDimension(1, 8.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 0x3f800000, c.c(resources)));
       uEmojiTextVi.setLayoutParams(layoutParams);
       uFrameLayout.addView(uEmojiTextVi);
       uEmojiTextVi = new EmojiTextView(uFrameLayout.getContext());
       layoutParams = new FrameLayout$LayoutParams(-2, -2);
       uEmojiTextVi.setId(R.id.live_lite_interactive_message_second_text_view);
       uEmojiTextVi.setEllipsize(TextUtils$TruncateAt.END);
       uEmojiTextVi.setGravity(19);
       uEmojiTextVi.setBackgroundResource(R.drawable.arg_RES_7f081319);
       uEmojiTextVi.setTextSize(1, 14.00f);
       uEmojiTextVi.setIncludeFontPadding(1);
       layoutParams.topMargin = (int)TypedValue.applyDimension(1, 2.00f, c.c(resources));
       uEmojiTextVi.setVisibility(8);
       uEmojiTextVi.setPadding((int)TypedValue.applyDimension(1, 8.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 0x3f800000, c.c(resources)), (int)TypedValue.applyDimension(1, 8.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 0x3f800000, c.c(resources)));
       uEmojiTextVi.setLayoutParams(layoutParams);
       uFrameLayout.addView(uEmojiTextVi);
       return uFrameLayout;
    }
}
