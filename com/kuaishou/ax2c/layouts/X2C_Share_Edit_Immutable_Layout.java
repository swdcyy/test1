package com.kuaishou.ax2c.layouts.X2C_Share_Edit_Immutable_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import androidx.core.widget.NestedScrollView;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import com.yxcorp.gifshow.activity.share.widget.CatchedEmojiEditText;
import android.widget.EditText;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Integer;
import com.kwai.library.widget.edittext.SafeEditText;
import com.yxcorp.gifshow.widget.EmojiTextView;

public class X2C_Share_Edit_Immutable_Layout implements IViewCreator	// class@001127
{

    public void X2C_Share_Edit_Immutable_Layout(){
       super();
    }
    public View createView(Context p0){
       int color;
       String str = "mCursorDrawableRes";
       Resources resources = p0.getResources();
       NestedScrollView nestedScroll = new NestedScrollView(p0);
       int i = -1;
       nestedScroll.setId(R.id.edit_wrap);
       int i1 = 1;
       nestedScroll.setPadding(0, 0, 0, (int)TypedValue.applyDimension(i1, 12.00f, c.c(resources)));
       nestedScroll.setLayoutParams(new ViewGroup$MarginLayoutParams(i, i));
       LinearLayout linearLayout = new LinearLayout(nestedScroll.getContext());
       linearLayout.setOrientation(i1);
       linearLayout.setLayoutParams(new FrameLayout$LayoutParams(i, i));
       nestedScroll.addView(linearLayout);
       FrameLayout uFrameLayout = new FrameLayout(linearLayout.getContext());
       uFrameLayout.setId(R.id.editor_container);
       uFrameLayout.setLayoutParams(new LinearLayout$LayoutParams(i, i));
       linearLayout.addView(uFrameLayout);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(uFrameLayout.getContext());
       uAppCompatTe.setId(R.id.bubble_anchor);
       uAppCompatTe.setText(R.string.arg_RES_7f104015);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f060bd3));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f71));
       uAppCompatTe.setVisibility(4);
       uAppCompatTe.setLayoutParams(new FrameLayout$LayoutParams(-2, -2));
       uFrameLayout.addView(uAppCompatTe);
       CatchedEmojiEditText uCatchedEmoj = new CatchedEmojiEditText(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(i, -2);
       uCatchedEmoj.setId(R.id.editor_hint);
       uCatchedEmoj.setBackgroundDrawable(null);
       uCatchedEmoj.setCursorVisible(0);
       uCatchedEmoj.setGravity(51);
       uCatchedEmoj.setIncludeFontPadding(0);
       uCatchedEmoj.setRawInputType(0x20000);
       uCatchedEmoj.setTextColor(resources.getColor(R.color.arg_RES_7f062057));
       try{
          int i2 = 0x7f080f09;
          Field declaredFiel = TextView.class.getDeclaredField(str);
          declaredFiel.setAccessible(i1);
          declaredFiel.set(uCatchedEmoj, Integer.valueOf(i2));
          uCatchedEmoj.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f71));
          uCatchedEmoj.setVisibility(4);
          uCatchedEmoj.setAllowAutoAdjustHintSize(0);
          uCatchedEmoj.setLayoutParams(layoutParams);
          uFrameLayout.addView(uCatchedEmoj);
          CatchedEmojiEditText uCatchedEmoj1 = new CatchedEmojiEditText(uFrameLayout.getContext());
          FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams(i, -2);
          uCatchedEmoj1.setId(R.id.editor);
          uCatchedEmoj1.setBackgroundDrawable(null);
          uCatchedEmoj1.setCursorVisible(0);
          uCatchedEmoj1.setGravity(51);
          uCatchedEmoj1.setHint(R.string.arg_RES_7f104014);
          uCatchedEmoj1.setIncludeFontPadding(0);
          uCatchedEmoj1.setRawInputType(0x20000);
          uCatchedEmoj1.setTextColor(resources.getColor(R.color.arg_RES_7f061f94));
          color = resources.getColor(R.color.arg_RES_7f060bd3);
          try{
             uCatchedEmoj1.setHintTextColor(color);
             Field declaredFiel1 = TextView.class.getDeclaredField(e0);
             declaredFiel1.setAccessible(true);
             declaredFiel1.set(uCatchedEmoj1, Integer.valueOf(i2));
             uCatchedEmoj1.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f71));
             uCatchedEmoj1.setAllowAutoAdjustHintSize(0);
             uCatchedEmoj1.setLayoutParams(layoutParams1);
             uFrameLayout.addView(uCatchedEmoj1);
             EmojiTextView uEmojiTextVi = new EmojiTextView(linearLayout.getContext());
             uEmojiTextVi.setId(R.id.immutable_content);
             uEmojiTextVi.setTextColor(resources.getColor(R.color.arg_RES_7f061fa9));
             uEmojiTextVi.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f71));
             uEmojiTextVi.setLayoutParams(new LinearLayout$LayoutParams(i, -2));
             linearLayout.addView(uEmojiTextVi);
             return nestedScroll;
          }catch(java.lang.Exception e0){
          }
       }catch(java.lang.Exception e0){
       }
    }
}
